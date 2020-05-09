package com.lxh.blog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lxh.blog.pojo.Category;
import com.lxh.blog.service.BlogService;
import com.lxh.blog.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired CategoryService categoryService;
	
    @RequestMapping(value="/listCategory", method=RequestMethod.GET)
    public ModelAndView listBlog(){
        ModelAndView mv = new ModelAndView("/personal/category");
        return mv;
    }
	
    @GetMapping("/categorys")
    public List<Category> list() throws Exception {
        List<Category> cs=categoryService.list();
        for(Category c:cs){
        	System.out.println(c);
        }
        return cs;
    }
    @GetMapping("/categorysPlus")
    public List<Category> listPlus() throws Exception {
        List<Category> cs=categoryService.listPlus();
        for(Category c:cs){
        	System.out.println(c);
        }
        return cs;
    }
}
