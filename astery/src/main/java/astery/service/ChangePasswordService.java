package astery.service;

import org.springframework.transaction.annotation.Transactional;

import astery.dao.MemberDAO;
import astery.vo.ChangePasswordCommand;
import astery.vo.Member;

public class ChangePasswordService {
	private MemberDAO dao;

	public ChangePasswordService(MemberDAO dao) {
		this.dao = dao;
	}
	@Transactional
	public void changePassword(String usercode, ChangePasswordCommand changePasswordCommand) {
		Member member = dao.selectMember(usercode);
		
		member.changePassword(changePasswordCommand.getOldPassword(), changePasswordCommand.getNewPassword());
		dao.updatePassword(member);
	}
	
}
