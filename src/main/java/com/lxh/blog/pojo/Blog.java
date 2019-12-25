package com.lxh.blog.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Blog {
	private int id;
	private String title;
	private Category category;
	private String text_content;
	private String content;
	private List<TagItem> tagItems;
	public List<TagItem> getTagItems() {
		return tagItems;
	}
	public void setTagItems(List<TagItem> tagItems) {
		this.tagItems = tagItems;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date createtime;
	public String getText_content() {
		return text_content;
	}
	public void setText_content(String text_content) {
		this.text_content = text_content;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
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
		return "Blog [id=" + id + ", title=" + title + ", category=" + category + ", text_content=" + text_content
				+ ", content=" + content + ", tagItems=" + tagItems + ", createtime=" + createtime + "]";
	}
}
