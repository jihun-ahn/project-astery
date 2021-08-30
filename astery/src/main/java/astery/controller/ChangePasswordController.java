package astery.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import astery.exception.NotMatchingConfirmException;
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
		int usercode = (int)session.getAttribute("code");
		try {
			changePasswordService.changePassword(usercode, changePasswordCommand);
			return "settings/edit/editComplete";
		}catch(NotMatchingException e) {
			System.out.println("현재 비밀번호 오류 발생");
			errors.rejectValue("oldPassword", "notMatching");
			return "settings/edit/password";
		}catch(NotMatchingConfirmException e2) {
			System.out.println("확인 비밀번호 오류 발생");
			errors.rejectValue("confirmNewPassword", "notMatching");
			return "settings/edit/password";
		}
		
	}
}
