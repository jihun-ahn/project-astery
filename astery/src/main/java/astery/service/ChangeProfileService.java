package astery.service;

import org.springframework.transaction.annotation.Transactional;

import astery.dao.MemberDAO;
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
		
//		Member selectid = dao.selectById(changeProfileCommand.getId());
//		
//		Member selectnickname = dao.selectByNickName(changeProfileCommand.getNickname());
		
		member.changeId(member.getId(), changeProfileCommand.getId());
		member.changeNickname(member.getNickname(), changeProfileCommand.getNickname());
		member.changeName(member.getName(), changeProfileCommand.getName());
		member.changeTel(member.getTel(), changeProfileCommand.getTel());
		member.changeAddress(member.getAddress(), changeProfileCommand.getAddress());
		member.changeIntro(member.getIntro(), changeProfileCommand.getIntro());
		System.out.println("2");
		dao.updateMember(member);
	}
}
