package astery.service;

import java.util.ArrayList;
import java.util.List;

import astery.dao.MemberDAO;
import astery.dao.PostDAO;
import astery.vo.Member;
import astery.vo.Post;
import astery.vo.SearchMemberInfo;
import astery.vo.SearchPostInfo;

public class SearchService {
	
	private MemberDAO dao;
	private PostDAO p_dao;
	
	public SearchService(PostDAO p_dao, MemberDAO dao) {
		this.p_dao = p_dao;
		this.dao = dao;
	}
	
	public List<SearchMemberInfo> searchMember(String search) {
		List<Member> memberList = dao.searchMember(search);
		List<SearchMemberInfo> memberInfoList = new ArrayList<>();
		for(Member member:memberList) {
			SearchMemberInfo memberInfo = new SearchMemberInfo();
			memberInfo.setProfilephoto(member.getProfilephoto());
			memberInfo.setNickname(member.getNickname());
			memberInfo.setIntro(member.getIntro());
			memberInfoList.add(memberInfo);
		}		
		return memberInfoList;
		
	}
	public List<SearchPostInfo> searchPost(String search) {
		List<Post> postList = p_dao.searchPost(search);
		List<SearchPostInfo> postInfoList = new ArrayList<>();
		for(Post post:postList) {
			SearchPostInfo searchPostInfo = new SearchPostInfo();
			Member member = dao.selectMember(post.getUsercode());
			searchPostInfo.setProfilephoto(member.getProfilephoto());
			searchPostInfo.setNickname(member.getNickname());
			searchPostInfo.setPicture(post.getPicture());
			searchPostInfo.setContent(post.getContent());
			postInfoList.add(searchPostInfo);
		}
		return postInfoList;
	}
}
