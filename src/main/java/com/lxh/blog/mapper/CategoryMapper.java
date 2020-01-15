package com.lxh.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lxh.blog.pojo.Category;

@Mapper
public interface CategoryMapper {
    public int add(Category category);
    
    public void delete(int id);
         
    public Category get(int id);    
       
    public int update(Category category); 
         
    public List<Category> list();
    
    public List<Category> listPlus();
}