package astery.service;

import org.springframework.transaction.annotation.Transactional;

import astery.dao.PostDAO;

public class SearchService {
	
	private PostDAO p_dao;
	
	public SearchService(PostDAO p_dao) {
		this.p_dao = p_dao;
	}
	
//	@Transactional
}
