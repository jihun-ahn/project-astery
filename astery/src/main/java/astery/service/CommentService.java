package astery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import astery.dao.PostDAO;

public class CommentService {
	@Service
	@Autowired
	CommentRepository commentRepository;
	@Autowired
	PostService postService;
	@Autowired
	UserService userService;
	
	public void save(int pid, int uid, String s) {
		Comment c = new Comment();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		c.setContent(s);
		c.setWritetime(timestamp);
		c.setPost(postService.findById(pid));
		c.setUser(userService.findById(uid));
		
		commentRepository.save(c);
	}

	public List<Comment> findByPostId(int pid){
		return commentRepository.findByPostId(pid);
	}
	
	public int deleteById(int id) {
		commentRepository.deleteById(id);
		return 1;
	}
}