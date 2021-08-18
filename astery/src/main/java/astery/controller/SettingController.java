package astery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import astery.dao.MemberDAO;
import astery.vo.Member;

@Controller
@RequestMapping("/settings")
public class SettingController {
	
	private MemberDAO dao;
	
	public void setDao(MemberDAO dao){
		this.dao = dao;
	}
	
	
	@RequestMapping("/settingForm")
	public String settingForm() {
		return "settings/settings";
	}

}
