package astery.service;

import org.springframework.transaction.annotation.Transactional;

import astery.dao.MemberDAO;
import astery.exception.InputException;
import astery.vo.Member;

public class ChangeOfficialAccountService {
	private MemberDAO dao;
	
	public ChangeOfficialAccountService(MemberDAO dao) {
		this.dao = dao;
	}
	
	@Transactional
	public void changeOfficialAccount(String usercode, char official) {
		Member member = dao.selectMember(usercode);
		
		if(!(official=='a' || official=='b')) {
			throw new InputException();
		}
		
		member.changeOfficial(official);
		dao.updateOfficial(member);
		
	}
}
