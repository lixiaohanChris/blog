package com.lxh.blog.service;

import java.util.List;

import com.lxh.blog.pojo.Tag;

public interface TagService {
	
    public int add(Tag tag);
    
    public void delete(int id);
         
    public Tag get(int id);   
       
    public int update(Tag tag); 
         
    public List<Tag> list();
    
}
