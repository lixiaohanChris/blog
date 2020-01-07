package com.lxh.blog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxh.blog.pojo.Tag;
import com.lxh.blog.service.TagService;

@RestController
public class TagController {
	
	@Autowired TagService tagService;
	
    @GetMapping("/tags")
    public List<Tag> list() throws Exception {
        List<Tag> ts=tagService.list();
        for(Tag t:ts){
        	System.out.println(t);
        }
        return ts;
    }
}
