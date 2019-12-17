package com.lxh.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxh.blog.mapper.BlogMapper;
import com.lxh.blog.pojo.Blog;
import com.lxh.blog.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService{
     
    @Autowired BlogMapper blogMapper;
 
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
        return blogMapper.list();
    }

	@Override
	public int add(Blog hero) {
		// TODO Auto-generated method stub
		return blogMapper.add(hero);
	}

	@Override
	public Blog get(int id) {
		// TODO Auto-generated method stub
		return blogMapper.get(id);
	}
 
}
