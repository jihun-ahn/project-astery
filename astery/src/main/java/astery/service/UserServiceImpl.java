package astery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import astery.DTO.UserDTO;
import astery.dao.UserDAOImpl;

@Service
@Repository
public class UserServiceImpl implements IUserService{
	
	@Autowired
	UserDAOImpl userDAO;
	
	

//	public void setUserDAO(UserDAOImpl userDAO) {
//		this.userDAO = userDAO;
//	}



	@Override
	public void SignUp(UserDTO dto) {
		System.out.println("회원가입 서비스 시작");
		userDAO.signUp(dto);
		System.out.println("회원가입 서비스 끝");
		
	}

}
