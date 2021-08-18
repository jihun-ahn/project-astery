package astery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MainController {
	@RequestMapping("/")
	public String mainForm(HttpServletRequest request) {
	
		HttpSession session = request.getSession(); 
		
		session.setAttribute("code", "100001");
		
		return "main"; 
	}
	
}
