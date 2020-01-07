package com.lxh.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxh.blog.mapper.TagMapper;
import com.lxh.blog.pojo.Tag;
import com.lxh.blog.service.TagService;

@Service
public class TagServiceImpl implements TagService {

	@Autowired TagMapper tagMapper;
	
	@Override
	public int add(Tag tag) {
		return tagMapper.add(tag);
	}

	@Override
	public void delete(int id) {
		tagMapper.delete(id);
	}

	@Override
	public Tag get(int id) {
		return tagMapper.get(id);
	}

	@Override
	public int update(Tag tag) {
		return tagMapper.update(tag);
	}

	@Override
	public List<Tag> list() {
		return tagMapper.list();
	}

}
