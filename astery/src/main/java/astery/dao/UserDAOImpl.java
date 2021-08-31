package astery.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import astery.DTO.UserDTO;

@Repository
public class UserDAOImpl implements IUserDAO{
	
	@Inject
	private SqlSession sqlsession;
	
	@Override
	public void signUp(UserDTO dto) {
		System.out.println("회원가입 dao 시작");
		sqlsession.insert("userMapper.signUp", dto);
//		sqlsession.commit();
		System.out.println("회원가입 dao 끝");
		
	}

}
