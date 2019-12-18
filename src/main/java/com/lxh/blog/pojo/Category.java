package com.lxh.blog.pojo;

public class Category {
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }
}
