package com.lxh.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lxh.blog.pojo.Tag;

@Mapper
public interface TagMapper {
    public int add(Tag tag);
    
    public void delete(int id);
         
    public Tag get(int id);    
       
    public int update(Tag tag); 
         
    public List<Tag> list();
}
