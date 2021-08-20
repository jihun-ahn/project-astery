package astery.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import astery.vo.ListCommand;
import astery.vo.Member;

public class MemberDAO {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public Member selectMember(String code) {
		Member member = sqlSession.selectOne("mybatis.mapper.member.selectLogInMember", code);
		return member;
	}
	
	public Member selectById(String id) {
		Member member = sqlSession.selectOne("mybatis.mapper.member.selectId", id);
		return member;		
	}
	public Member selectByNickName(String nickname) {
		Member member = sqlSession.selectOne("mybatis.mapper.member.selectNickname", nickname);
		return member;		
	}
	
	public List<Member> selectAll() {
		List<Member> lists = sqlSession.selectList("mybatis.mapper.member.selectAll");
		return lists;
	}
	
	public int count() {
		return sqlSession.selectOne("mybatis.mapper.member.selectCount");
	}
	
	public List<Member> selectByRegDate(ListCommand searchDate) {
		List<Member> lists = sqlSession.selectList("mybatis.mapper.member.selectByRegdate",searchDate);
		return lists;
	}
	
	public int updateMember(Member member) {
		int result = sqlSession.update("mybatis.mapper.member.updateMember",member);
		return result;
	}
	
	public int updatePassword(Member member) {
		int result = sqlSession.update("mybatis.mapper.member.updatePassword",member);
		return result;
	}
	public int updateOfficial(Member member) {
		int result = sqlSession.update("mybatis.mapper.member.updateOfficial", member);
		return result;
	}
}
