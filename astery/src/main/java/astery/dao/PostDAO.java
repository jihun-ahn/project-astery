package astery.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import astery.vo.Post;

public class PostDAO {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public List<Post> selectPostForLoginMember(int usercode) {
		List<Post> posts = sqlSession.selectList("mybatis.mapper.post.selectPostForLoginMember", usercode);		
		return posts;
	}
	// 게시글 검색
	public List<Post> searchPost(String search){
		List<Post> posts = sqlSession.selectList("mybatis.mapper.post.selectPostForSearch", search);
		return posts;
	}
}
