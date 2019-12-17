package com.lxh.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lxh.blog.pojo.Blog;

@Mapper
public interface BlogMapper {
    public int add(Blog blog);
    
    public void delete(int id);
         
    public Blog get(int id);
       
    public int update(Blog blog); 
         
    public List<Blog> list();
}
