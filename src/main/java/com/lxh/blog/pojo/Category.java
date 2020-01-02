package com.lxh.blog.pojo;

public class Category {
	private int id;
	private String name;
	private int count;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    @Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", count=" + count + "]";
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
