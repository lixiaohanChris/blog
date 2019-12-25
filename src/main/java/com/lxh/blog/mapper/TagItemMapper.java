package com.lxh.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lxh.blog.pojo.TagItem;

@Mapper
public interface TagItemMapper {
    public int add(TagItem tagItem);
    
    public void delete(int id);
         
    public TagItem get(int id);
                
    public List<TagItem> list(int bid);
}
