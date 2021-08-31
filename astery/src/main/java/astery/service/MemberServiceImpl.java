package astery.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import astery.DTO.UserDTO;
import astery.dao.MemberDAOImpl;

@Service
@Repository // 현재 클래스를 스프링에서 관리하는 dao bean으로 등록
public class MemberServiceImpl implements MemberService{

	@Inject
	MemberDAOImpl memberDao;
	
	
	// 01_01. 회원 로그인 체크
	@Override
	public boolean loginCheck(UserDTO dto, HttpSession session) {
		boolean result = memberDao.loginCheck(dto);
		if (result) { // true일 경우 세션에 등록
			UserDTO dto2 = viewMember(dto);
			System.out.println("세션 등록 시작");
			
			// 세션 변수 등록
			session.setAttribute("userId", dto2.getId());
			session.setAttribute("userPassword", dto2.getPassWord());
			session.setAttribute("userName", dto2.getName());
			System.out.println("세션 등록 완료");
			
		}
		
		
		return result;
	}
	
	
	// 01_02. 회원 로그인 정보
	@Override
	public UserDTO viewMember(UserDTO dto) {
		System.out.println("회원 로그인 정보 출력");
		return memberDao.viewMember(dto);
	}

	// 02. 회원 로그아웃
	@Override
	public void logout(HttpSession session) {
		// 세션 변수 개별 삭제
		// session.removeAttribute("userId");
		// 세션 정보를 초기화 시킴
		System.out.println("로그아웃 시작");
		session.invalidate();
		
	}

}
