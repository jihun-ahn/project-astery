package astery.dao;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import astery.DTO.UserDTO;

@Repository // 현재 클래스를 스프링에서 관리하는 dao bean으로 등록
public class MemberDAOImpl implements MemberDAO2{

	@Inject
	private SqlSession sqlsession; // mybatis 실행 객체
	
	
	// 01_01. 회원 로그인 체크
	@Override
	public boolean loginCheck(UserDTO dto) {
		System.out.println("로그인 체크 시작");
		String name = sqlsession.selectOne("userMapper.loginCheck", dto);
		System.out.println("로그인 체크 완료");
		return (name == null) ? false : true;
	}
	
	// 01_02. 회원 로그인 정보
	@Override
	public UserDTO viewMember(UserDTO dto) {
		System.out.println("로그인 정보");
		return sqlsession.selectOne("userMapper.viewMember", dto);
	}
	
	// 02. 회원 로그아웃
	@Override
	public void logout(HttpSession session) {
		System.out.println("로그아웃");
	}

}
