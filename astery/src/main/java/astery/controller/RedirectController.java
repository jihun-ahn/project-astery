package astery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("redirect:")
public class RedirectController {
	
	public String redirectErrorPage() {
		return "redirect";
	}
}
