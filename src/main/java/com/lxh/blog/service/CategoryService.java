package com.lxh.blog.service;

import java.util.List;

import com.lxh.blog.pojo.Category;

public interface CategoryService{
	
    public int add(Category category);
    
    public void delete(int id);
         
    public Category get(int id);   
       
    public int update(Category category); 
         
    public List<Category> list();
    
}
