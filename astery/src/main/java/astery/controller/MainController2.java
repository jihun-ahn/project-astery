package astery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import astery.DTO.UserDTO;
import astery.service.UserServiceImpl;

@Controller
public class MainController2 {

	@Autowired
	UserServiceImpl userService;
	
//	public void setUserService(UserServiceImpl userService) {
//		this.userService = userService;
//	}

	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public String Main() {
		return "home";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/signUp")
	public String signUp(UserDTO dto, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("회원가입 신호");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("passWord");
		String name = request.getParameter("name");
		
		System.out.println("id : " + id);
		System.out.println("pwd : " + pwd);
		System.out.println("name : " + name);
		
//		dto.setId(id);
//		dto.setPassWord(pwd);
//		dto.setName(name);
		if (userService != null) {
			userService.SignUp(dto);
		} else {
			System.out.println("객체 없음");
		}
		
		
		return "login/login";
	}
	
	
	
	
	
	
}
