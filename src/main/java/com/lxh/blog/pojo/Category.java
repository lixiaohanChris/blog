package com.lxh.blog.pojo;

import java.util.List;

public class Category {
	private int id;
	private String name;
	private int count;
	private List<Blog> blogs;
	public List<Blog> getBlogs() {
		return blogs;
	}
	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    @Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", count=" + count + ", blogs=" + blogs + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
