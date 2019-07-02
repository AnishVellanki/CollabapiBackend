package com.ani.CollabapiBackend.dao;

import java.util.List;

import com.ani.CollabapiBackend.model.Blog;

public interface BlogsDao {

	boolean addBlog(Blog blog);;
	boolean editBlog(int blogId);
	List<Blog> getAllBlogs();
	boolean getBlog(int blogId);
	boolean deleteBlog(Blog blog);
	

	

}
