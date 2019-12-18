package com.lxh.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalPageController {
	@GetMapping(value="/personal")
	public String personal(){
		return "redirect:personal_home";
	}
	@GetMapping(value="/personal_home")
	public String home(){
		return "redirect:listBlog";
	}
	
}
