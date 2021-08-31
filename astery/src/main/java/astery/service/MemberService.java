package astery.service;

import javax.servlet.http.HttpSession;

import astery.DTO.UserDTO;

public interface MemberService {
	// 01_01. 회원 로그인 체크
	public boolean loginCheck(UserDTO dto, HttpSession session);
	// 01_02. 회원 로그인 정보
	public UserDTO viewMember(UserDTO dto);
	// 02. 회원 로그아웃
	public void logout(HttpSession session);
	
	
}
