package astery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping(value = "/main/upload")
	public String upload(){

		return "/main/upload";
	}
	
	@RequestMapping(value = "main/post/{id}")
	public String post(@PathVariable("id") int id, Model model) throws Exception {
		String userId = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userService.findByUserId(userId);

		model.addAttribute("postuserid", postService.findById(id).getUser().getId());
		model.addAttribute("p", postService.findById(id));
		model.addAttribute("img", piService.findBypostId(id));

		return "main/post";
	}
	
}
