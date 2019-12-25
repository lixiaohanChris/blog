package com.lxh.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxh.blog.mapper.BlogMapper;
import com.lxh.blog.mapper.TagItemMapper;
import com.lxh.blog.pojo.Blog;
import com.lxh.blog.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService{
     
    @Autowired BlogMapper blogMapper;
    @Autowired TagItemMapper tagItemMapper;
 
    @Override
    public void delete(int id) {
        blogMapper.delete(id);
    }
 
    @Override
    public int update(Blog blog) {
        return blogMapper.update(blog);
    }
 
    @Override
    public List<Blog> list() {
    	List<Blog> listBlog = blogMapper.list();
    	for(Blog b:listBlog){
    		b.setTagItems(tagItemMapper.list(b.getId()));
    	}
    	return listBlog;
    }

	@Override
	public int add(Blog blog) {
		// TODO Auto-generated method stub
		return blogMapper.add(blog);
	}

	@Override
	public Blog get(int id) {
		// TODO Auto-generated method stub
		Blog b = blogMapper.get(id);
		b.setTagItems(tagItemMapper.list(b.getId()));
		
		return b;
	}
	
	@Override
	public Blog getContent(int id) {
		// TODO Auto-generated method stub
		Blog b = blogMapper.getContent(id);
		return b;
	}
 
}
