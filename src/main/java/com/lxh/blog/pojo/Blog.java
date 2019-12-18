package com.lxh.blog.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Blog {
	private int id;
	private String title;
	private Category category;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date createtime;

	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", category=" + category + ", createtime=" + createtime + "]";
	}
}
