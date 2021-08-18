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
	
	public Member selectByCode(Long code) {
		Member m = sqlSession.selectOne("mybatis.mapper.member.selectbyId",code);
		return m;
	}
	
	/*
	 * public int insertMember(Member member) { int result =
	 * sqlSession.insert("mybatis.mapper.member.insertMember",member);
	 * sqlSession.commit(); return result; //삽입,변경, 삭제된 데이터의 개수 }
	 */
	
	public int updateMember(Member member) {
		int result = sqlSession.update("mybatis.mapper.member.updateMember",member);
		System.out.println("3");
		return result; //삽입,변경, 삭제된 데이터의 개수
	}
	
	public int updatePassword(Member member) {
		int result = sqlSession.update("mybatis.mapper.member.updatePassword",member);
		return result;
	}
	/*
	 * public int deleteMember(String email) { int result =
	 * sqlSession.delete("mybatis.mapper.member.deleteMember",email);
	 * sqlSession.commit(); return result; //삽입,변경, 삭제된 데이터의 개수 }
	 */
}
