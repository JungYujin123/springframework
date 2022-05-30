package com.spring.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {

	// /a시 requst 옴, 어뎁터는 FlashAttribute 심은 후  redirect로 먼저 나가고, 
	//-> 새로운 requestAttribute 요청올 때 한번만! 심음
	
	
	
	@RequestMapping(value = "/a")
	public String a(RedirectAttributes rttr) {
		String url = "redirect:receive";
		
		//rttr.addAttribute("name","kim");
		//rttr.addAttribute("message","good day!");
		
		rttr.addFlashAttribute("name","kim");
		
		return url;
	}

	@RequestMapping(value = "/receive")
		public void receive() { //String name, Model model
			//model.addAttribute("name", name);
		}
}
