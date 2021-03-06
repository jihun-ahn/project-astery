package astery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import astery.dao.MemberDAO;
import astery.exception.AlreadyExistionIdException;
import astery.exception.AlreadyExistionNicknameException;
import astery.service.ChangeProfileService;
import astery.validator.ChangeProfileCommandValidator;
import astery.vo.ChangeProfileCommand;
import astery.vo.Member;

@Controller
@RequestMapping("/settings/edit/profile")
public class ChangeProfileController {
	
	private ChangeProfileService changeProfileService;	
	private MemberDAO dao;
	
	public void setChangeProfileService(ChangeProfileService changeProfileService) {
		this.changeProfileService = changeProfileService;
	}
	
	public void setDao(MemberDAO dao) { 
		this.dao = dao; 
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView editProfileForm(HttpServletRequest request, ChangeProfileCommand changeProfileCommand) {
		
		HttpSession session = request.getSession();
		int usercode = (int)session.getAttribute("code");
		
		ModelAndView mav = new ModelAndView();
		
		Member member = dao.selectMember(usercode);
		
		mav.addObject("member", member);
		mav.setViewName("settings/edit/profile");
		
		return mav;
	}	
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(ChangeProfileCommand changeProfileCommand,Errors errors,HttpSession session) {
		
		new ChangeProfileCommandValidator().validate(changeProfileCommand, errors);
		
		if(errors.hasErrors()) {
			return "edit/profile";
		}
		
		int usercode = (int)session.getAttribute("code");
		
		try {
			changeProfileService.changeProfile(
					usercode,
					changeProfileCommand);
			return "settings/edit/editComplete";
		}catch(AlreadyExistionIdException e) {
			System.out.println("????????? ?????? ?????? ??????");
			errors.rejectValue("id", "duplicate");
			return "settings/edit/profile";
		}catch(AlreadyExistionNicknameException e2) {
			System.out.println("????????? ?????? ?????? ??????");
			errors.rejectValue("nickname", "duplicate");
			return "settings/edit/profile";
		}
	}
}
