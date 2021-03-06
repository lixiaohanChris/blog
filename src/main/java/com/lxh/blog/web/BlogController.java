package com.lxh.blog.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxh.blog.pojo.Blog;
import com.lxh.blog.service.BlogService;
import com.lxh.blog.service.CategoryService;

@RestController
public class BlogController {
	@Autowired BlogService blogService;

    /*页面跳转 部分*/
    @RequestMapping(value="/listBlog", method=RequestMethod.GET)
    public ModelAndView listBlog(){
        ModelAndView mv = new ModelAndView("/personal/home");
        return mv;
    }
    @RequestMapping(value="/textBlog", method=RequestMethod.GET)
    public ModelAndView textBlog(){
        ModelAndView mv = new ModelAndView("/personal/blogText");
        return mv;
    }
    
    /*restful 部分*/
    @GetMapping("/blogs")
    public PageInfo<Blog> list(@RequestParam(value = "start", defaultValue = "1") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        PageHelper.startPage(start,size,"id desc");
        List<Blog> bs=blogService.list();
        for(Blog b:bs){
        	System.out.println(b);
        }
        System.out.println(bs.size()); 
        PageInfo<Blog> page = new PageInfo<>(bs,5); //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样 
        return page;
    }
    
    @GetMapping("/blogs/{id}")
    public Blog get(@PathVariable("id") int id) throws Exception {
        System.out.println(id);
        Blog b=blogService.get(id);
        System.out.println(b);
        return b;
    }
}
