package astery.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import astery.dao.MemberDAO;
import astery.exception.InputException;
import astery.service.ChangeOfficialAccountService;
import astery.validator.ChangeOfficialAccountCommandValidator;
import astery.vo.ChangeOfficialAccountCommand;
import astery.vo.Member;

@Controller
@RequestMapping("/settings/official")
public class ChangeOfficialAccountController {
	
	private ChangeOfficialAccountService changeOfficialAccountService;
	private MemberDAO dao;
	
	
	public void setChangeOfficialAccountService(ChangeOfficialAccountService changeOfficialAccountService) {
		this.changeOfficialAccountService = changeOfficialAccountService;
	}
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(ChangeOfficialAccountCommand changeOfficialAccountCommand, HttpSession session) {
		int usercode = (int)session.getAttribute("code");
		Member member = dao.selectMember(usercode);
		if(member.getOfficial()=='F') {
			return "settings/edit/official";
		}
		return "settings/edit/personal";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(ChangeOfficialAccountCommand changeOfficialAccountCommand, Errors errors, HttpSession session) {
		
		new ChangeOfficialAccountCommandValidator().validate(changeOfficialAccountCommand, errors);
		
		if(errors.hasErrors()) {
			return "settings/edit/official";
		}
		
		int usercode = (int)session.getAttribute("code");
		
		try {
			changeOfficialAccountService.changeOfficialAccount(usercode, changeOfficialAccountCommand.getOfficial());
			return "settings/edit/editComplete";
		}catch(InputException e) {
			System.out.println("잘못된 문자 입력"+changeOfficialAccountCommand.getOfficial());
			errors.rejectValue("official", "inputerror");
			Member member = dao.selectMember(usercode);
			if(member.getOfficial()=='F') {
				return "settings/edit/official";
			}
			return "settings/edit/personal";
		}		
	}
}
