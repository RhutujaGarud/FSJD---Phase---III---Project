package com.webapp.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.webapp.model.Admin;

@SuppressWarnings("deprecation")
public class Repo {

	private HibernateTemplate hibernateTemplate1;
	
	public HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate1() {
		return hibernateTemplate1;
	}

	public void setHibernateTemplate1(HibernateTemplate hibernateTemplate1) {
		this.hibernateTemplate1 = hibernateTemplate1;
	}
	public boolean forgotPassword(String email,String password) {
		Session session=hibernateTemplate.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();  
		@SuppressWarnings("unchecked")
		Query<Admin> q = session.createQuery("update Admin set password=:p where email=:e");
		q.setParameter("e",email);  
		q.setParameter("p",password);  
		  
		int status=q.executeUpdate();  
		System.out.println(status);  
		tx.commit();  
		return status>0?true:false;
	}
	
	
}
