package com.lxh.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxh.blog.mapper.CategoryMapper;
import com.lxh.blog.pojo.Category;
import com.lxh.blog.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired CategoryMapper categoryMapper;
    
    @Override
    public int add(Category hero) {
        return categoryMapper.add(hero);
    }
 
    @Override
    public void delete(int id) {
    	categoryMapper.delete(id);
    }
 
    @Override
    public Category get(int id) {
        return categoryMapper.get(id);
    }
 
    @Override
    public int update(Category hero) {
        return categoryMapper.update(hero);
    }
 
    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }
 
}
