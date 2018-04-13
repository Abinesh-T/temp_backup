package com.niit.Ecommerce_backend.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Ecommerce_backend.DAO.CartDAO;
import com.niit.Ecommerce_backend.Model.CartModel;


@Repository
public class CartDAOImpl implements CartDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void save(CartModel cart1)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(cart1);
		s.getTransaction().commit();
		s.close();
		
	}

	public CartModel getId(int id) 
	{
		
		return null;
	}

	public void update(CartModel cart) {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.update(cart);
		s.getTransaction().commit();
		s.close();
		
	}

	public void delete(CartModel p)
	{
		
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.delete(p);
		s.getTransaction().commit();
		s.close();

	}  
	
	@SuppressWarnings("unchecked")
	public List<CartModel> getAll() 
	{
		CartModel cd=new CartModel();
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		int cartid=cd.getCartid();
		Query query =s.createQuery("from CartModel where cartid = :cartid").setParameter("cartId", cartid);        
		List<CartModel> list=query.list();
		System.out.println(list);
		s.getTransaction().commit();
		return list;
		
	}
	public CartModel findById(int id) 
	{
		return (CartModel)sessionFactory.openSession().get(CartModel.class,id);
	}

	public List<CartModel> check(int productid)
	{
		   Session s=sessionFactory.openSession();		
	       Query query =s.createQuery("from CartModel where productid = :productid").setParameter("productid", productid);		
		   @SuppressWarnings("unchecked")
		List<CartModel> results=query.list();
	       s.close();
		   return results;
	}

	

	
}