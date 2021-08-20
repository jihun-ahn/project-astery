package astery.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import astery.exception.InputException;
import astery.service.ChangeOfficialAccountService;
import astery.validator.ChangeOfficialAccountCommandValidator;
import astery.vo.ChangeOfficialAccountCommand;

@Controller
@RequestMapping("/settings/official")
public class ChangeOfficialAccountController {
	
	private ChangeOfficialAccountService changeOfficialAccountService;
	
	public void setChangeOfficialAccountService(ChangeOfficialAccountService changeOfficialAccountService) {
		this.changeOfficialAccountService = changeOfficialAccountService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(ChangeOfficialAccountCommand changeOfficialAccountCommand) {
		
		return "settings/official";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(ChangeOfficialAccountCommand changeOfficialAccountCommand, Errors errors, HttpSession session) {
		
		new ChangeOfficialAccountCommandValidator().validate(changeOfficialAccountCommand, errors);
		
		if(errors.hasErrors()) {
			return "settings/official";
		}
		
		String usercode = (String)session.getAttribute("code");
		
		try {
			changeOfficialAccountService.changeOfficialAccount(usercode, changeOfficialAccountCommand.getOfficial());
			return "main";
		}catch(InputException e) {
			System.out.println("잘못된 문자 입력"+changeOfficialAccountCommand.getOfficial());
			errors.rejectValue("official", "inputerror");
			return "settings/official";
		}		
	}
}
