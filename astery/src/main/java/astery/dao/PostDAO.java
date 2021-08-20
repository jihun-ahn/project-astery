package astery.dao;

import org.apache.ibatis.session.SqlSession;

import astery.vo.Member;

public class PostDAO {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public Member selectMember(String code) {
		Member member = sqlSession.selectOne("mybatis.mapper.member.selectLogInMember", code);
		return member;
	}
}
