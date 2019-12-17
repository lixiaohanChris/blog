package com.lxh.blog.service;

import java.util.List;

import com.lxh.blog.pojo.Blog;

public interface BlogService {
    public int add(Blog hero);
    
    public void delete(int id);
         
    public Blog get(int id);
       
    public int update(Blog hero); 
         
    public List<Blog> list();
}
