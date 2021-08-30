package astery.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import astery.service.SearchService;
import astery.vo.SearchMemberInfo;
import astery.vo.SearchPostInfo;

@Controller
@RequestMapping("/search")
public class SearchController {
		
	private SearchService searchService;
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView searchForm(@RequestParam String search) {
		
		ModelAndView mav = new ModelAndView();
		List<SearchMemberInfo> memberList = searchService.searchMember(search);
		List<SearchPostInfo> postList = searchService.searchPost(search);	
		
		mav.addObject("memberList", memberList);
		mav.addObject("postList", postList);
		mav.addObject("search", search);
		mav.setViewName("search/searching");
		return mav;
	}
	
}
