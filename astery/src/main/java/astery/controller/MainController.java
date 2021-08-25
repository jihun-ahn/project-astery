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
	public ModelAndView mainForm(HttpServletRequest request) {
	
		HttpSession session = request.getSession();
		String usercode = "100001";
		session.setAttribute("code", usercode);
		ModelAndView mav = new ModelAndView();
		
		List<Post> posts = p_dao.selectPostForLoginMember(usercode);
		Post post = new Post();
		post.setPostNum(1);
		post.setUsercode(100001);
		post.setPicture("1");
		post.setContent("2");
		post.setPostDate(new Date());
		post.setGroupChk('F');
		
		if(posts==null) {
			posts.add(post);
		}
		mav.addObject("posts", posts);
		mav.setViewName("main");
		
		return mav; 
	}
	
}
