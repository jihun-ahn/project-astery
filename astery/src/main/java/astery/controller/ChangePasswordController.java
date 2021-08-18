package astery.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import astery.exception.NotMatchingException;
import astery.service.ChangePasswordService;
import astery.vo.ChangePasswordCommand;

@Controller
@RequestMapping("/settings/edit/password")
public class ChangePasswordController {
	
	private ChangePasswordService changePasswordService;

	public void setChangePasswordService(ChangePasswordService changePasswordService) {
		this.changePasswordService = changePasswordService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(ChangePasswordCommand changePasswordCommand) {
		
		return "settings/edit/password";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(ChangePasswordCommand changePasswordCommand,Errors errors,HttpSession session) {
		
		if(errors.hasErrors()) {
			return "settings/edit/password";
		}
		String usercode = (String)session.getAttribute("code");
		try {
			changePasswordService.changePassword(usercode, changePasswordCommand);
			System.out.println("1");
			return "settings/edit/password";
		}catch(NotMatchingException e) {
			System.out.println("오류 발생");
			errors.rejectValue("currentPassword", "duplicate");
			return "settings/edit/password";
		}
		
	}
}
