package com.lxh.blog.service;

import java.util.List;

import com.lxh.blog.pojo.Blog;

public interface BlogService {
    public int add(Blog blog);
    
    public void delete(int id);
         
    public Blog get(int id);   
       
    public int update(Blog blog); 
         
    public List<Blog> list();
}
