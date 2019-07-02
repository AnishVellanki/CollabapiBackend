package com.ani.CollabapiBackend.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ani.CollabapiBackend.dao.BlogsDao;
import com.ani.CollabapiBackend.model.Blog;


@Component
public class BlogDaoImpl implements BlogsDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addBlog(Blog blog) {
		
		
System.out.println("SessionFactory------  "+sessionFactory);
		
		Session session=sessionFactory.openSession();
		
		session.save(blog);
		Transaction transaction=session.beginTransaction();
		try {
			transaction.commit();
			return true;
		}
		catch(Exception e)
		{
			return false;	
		}
		finally
		{
			session.close();
		}
	}


	@Override
	public boolean editBlog(int blogId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Blog> getAllBlogs() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Blog");
		List<Blog> bloglist=query.list();
				session.close();
	return  bloglist;
	
	}


	@Override
	public boolean getBlog(int blogId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBlog(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

}
