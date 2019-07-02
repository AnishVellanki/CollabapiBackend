package com.ani.CollabapiBackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {

	@Id
	private String blogName;
	private String blogTitle;
	private String blogOwner;
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogOwner() {
		return blogOwner;
	}
	public void setBlogOwner(String blogOwner) {
		this.blogOwner = blogOwner;
	}

	
}
