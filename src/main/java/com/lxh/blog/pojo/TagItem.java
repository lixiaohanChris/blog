package com.lxh.blog.pojo;

public class TagItem {
	
	private int id;
	private Blog blog;
	private Tag tag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "TagItem [id=" + id + ", blog=" + blog + ", tag=" + tag + "]";
	}
}
