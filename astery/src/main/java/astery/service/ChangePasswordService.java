package astery.service;

import org.springframework.transaction.annotation.Transactional;

import astery.dao.MemberDAO;
import astery.exception.NotMatchingConfirmException;
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
		if(!changePasswordCommand.getNewPassword().equals(changePasswordCommand.getConfirmNewPassword())) {
			throw new NotMatchingConfirmException();
		}
		member.changePassword(changePasswordCommand.getOldPassword(), changePasswordCommand.getNewPassword());
		dao.updatePassword(member);
	}
	
}
