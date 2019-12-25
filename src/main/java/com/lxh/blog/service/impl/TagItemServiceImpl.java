package com.lxh.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxh.blog.mapper.TagItemMapper;
import com.lxh.blog.pojo.TagItem;
import com.lxh.blog.service.TagItemService;

@Service
public class TagItemServiceImpl implements TagItemService{
     
    @Autowired TagItemMapper tagItemMapper;
 
    @Override
    public void delete(int id) {
    	tagItemMapper.delete(id);
    }
 
    @Override
    public List<TagItem> list(int bid) {
        return tagItemMapper.list(bid);
    }

	@Override
	public int add(TagItem tagItem) {
		// TODO Auto-generated method stub
		return tagItemMapper.add(tagItem);
	}

	@Override
	public TagItem get(int id) {
		// TODO Auto-generated method stub
		return tagItemMapper.get(id);
	}
 
}
