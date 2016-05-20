package com.hispring;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HispringController {
	Logger log = Logger.getLogger(this.getClass());

	@RequestMapping(value = "/login.do")
	public String login(Model model) {
		model.addAttribute("hispring", "hispring");
		log.debug("HispringController say: hi spring");
		return "index";
	}

}
