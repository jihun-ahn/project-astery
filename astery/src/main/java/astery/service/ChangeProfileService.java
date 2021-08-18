package astery.service;

import org.springframework.transaction.annotation.Transactional;

import astery.dao.MemberDAO;
import astery.exception.AlreadyExistionIdException;
import astery.exception.AlreadyExistionMemberException;
import astery.exception.AlreadyExistionNicknameException;
import astery.vo.ChangeProfileCommand;
import astery.vo.Member;

public class ChangeProfileService {
	
	private MemberDAO dao;

	public ChangeProfileService(MemberDAO dao) {
		this.dao = dao;
	}
	
	@Transactional
	public void changeProfile(String usercode, ChangeProfileCommand changeProfileCommand) {
		Member member = dao.selectMember(usercode);
		
		Member chkId = dao.selectById(changeProfileCommand.getId());
		Member chkNickname = dao.selectByNickName(changeProfileCommand.getNickname());
		
		if(chkId!=null && !member.getId().equals(changeProfileCommand.getId())) {
			throw new AlreadyExistionIdException();
		}
		
		if(chkNickname!=null && !member.getNickname().equals(changeProfileCommand.getNickname())) {
			throw new AlreadyExistionNicknameException();
		}
		member.changeId(member.getId(), changeProfileCommand.getId());
		member.changeNickname(member.getNickname(), changeProfileCommand.getNickname());
		member.changeName(member.getName(), changeProfileCommand.getName());
		member.changeTel(member.getTel(), changeProfileCommand.getTel());
		member.changeAddress(member.getAddress(), changeProfileCommand.getAddress());
		member.changeIntro(member.getIntro(), changeProfileCommand.getIntro());
		dao.updateMember(member);
	}
}
