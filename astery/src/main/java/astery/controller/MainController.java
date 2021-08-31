package astery.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import astery.dao.PostDAO;
import astery.vo.Post;

@Controller
public class MainController {
	private PostDAO p_dao;

	public void setP_dao(PostDAO p_dao) {
		this.p_dao = p_dao;
	}
	
	 @RequestMapping("/") 
	 public ModelAndView mainForm(HttpServletRequest request){
		 
		 HttpSession session = request.getSession();
		 int usercode = 100001;
		 session.setAttribute("code", usercode); 
		 ModelAndView mav = new ModelAndView();
		 
		 List<Post> posts = p_dao.selectPostForLoginMember(usercode);
		 
		 mav.setViewName("main"); 
		 mav.addObject("posts", posts); 
		 return mav; 
	 }
}
