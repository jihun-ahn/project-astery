package astery.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import astery.DTO.UserDTO;
import astery.dao.PostDAO;
import astery.service.MemberService;
import astery.vo.Post;

@Controller
public class MemberController {
	// 로깅을 위한 변수
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	private PostDAO p_dao;

	public void setP_dao(PostDAO p_dao) {
		this.p_dao = p_dao;
	}
	@Inject
	MemberService memberService;
	
	// 01. 로그인 화면
	@RequestMapping(method = RequestMethod.GET, value = "/login/login")
	public String login() {
		System.out.println("로그인 화면 출력");
		return "login/login";
	}
	
	// 02. 로그인 처리
	@RequestMapping(method = RequestMethod.POST, value = "/login/login.do")
	public ModelAndView loginCheck(@ModelAttribute UserDTO dto, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		boolean result = memberService.loginCheck(dto, session);
		System.out.println("****로그인 체크 시작");
		String id = request.getParameter("id");
		String pwd = request.getParameter("passWord");
		String name = request.getParameter("name");
		
		System.out.println("id : " + dto.getId());
		System.out.println("pwd : " + dto.getPassWord());
		System.out.println("name : " + dto.getName());
		ModelAndView mav = new ModelAndView();
		
		if (result == true) { // 로그인 성공
			// 메인으로 이동
	
			System.out.println("로그인 성공");
			int usercode = 100001;
			session.setAttribute("code", usercode);
			List<Post> posts = p_dao.selectPostForLoginMember(usercode);
			mav.addObject("posts", posts); 
			mav.setViewName("main"); // 어떤 페이지를 보여줄것인지
			mav.addObject("msg", "success"); // key와 value로 mav에 담음(msg라는 변수에 success라는 값을 넣음)
		} else { // 로그인 실패
			// 로그인 페이지로 이동
			System.out.println("로그인 실패");
			mav.setViewName("/login/login"); // 어떤 페이지를 보여줄것인지
			mav.addObject("msg", "failure"); // key와 value로 mav에 담음(msg라는 변수에 success라는 값을 넣음)
		}
		
		
		return mav;
	}
	
	// 로그아웃 처리
	@RequestMapping(method = RequestMethod.GET, value = "/logout.do")
	public ModelAndView logout(HttpSession session) {
		memberService.logout(session);
		ModelAndView mav = new ModelAndView();
		System.out.println("로그아웃");
		mav.setViewName("/login/login");
		mav.addObject("msg", "logout");
		
		return mav;
	}
	
}
