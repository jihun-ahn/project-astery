package astery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	CommentService commentService;

	@RequestMapping("/insert")
	@ResponseBody
	private int c_insert(@RequestParam int pid, @RequestParam String content, @RequestParam int uid) throws Exception {

		commentService.save(pid, uid, content);
		return 1;
	}
	
	@RequestMapping("/list")
	@ResponseBody
	private List<Comment> comment_list(Model model, int id) throws Exception {
		
		return commentService.findByPostId(id);
	}
	
	@RequestMapping("/delete/{id}")
	@ResponseBody
	private int comment_delete(@PathVariable int id) throws Exception {
		
		return commentService.deleteById(id);
	}
}