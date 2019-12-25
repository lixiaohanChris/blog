package com.lxh.blog.service;

import java.util.List;

import com.lxh.blog.pojo.TagItem;

public interface TagItemService {
    public int add(TagItem tagItem);
    
    public void delete(int id);
         
    public TagItem get(int id);
                
    public List<TagItem> list(int bid);
}