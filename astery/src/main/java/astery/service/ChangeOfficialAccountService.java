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
		
		if(!(official=='A' || official=='B' || official=='F')) {
			throw new InputException();
		}
		
		member.changeOfficial(official);
		dao.updateOfficial(member);
		
	}
	
}
