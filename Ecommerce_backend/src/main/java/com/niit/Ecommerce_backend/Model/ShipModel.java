package com.niit.Ecommerce_backend.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity	
@Table(name="SHIPMODEL")

public class ShipModel implements Serializable
{
	
	
	private static final long serialVersionUID = 1L;
	
	/*@ManyToOne
	private UserModel um;
	
	@ManyToOne
	private ProductModel pm;
	
	@ManyToOne
	private CategoryModel cm;

	@ManyToOne
	private CartModel Cm;
	
	
	
	
	public UserModel getUm() {
		return um;
	}
	public void setUm(UserModel um) {
		this.um = um;
	}
	public ProductModel getPm() {
		return pm;
	}
	public void setPm(ProductModel pm) {
		this.pm = pm;
	}
	public CategoryModel getCategorym() {
		return cm;
	}
	public void setCategorym(CategoryModel cm) {
		this.cm = cm;
	}
	public CartModel getCm() {
		return Cm;
	}
	public void setCm(CartModel cm) {
		Cm = cm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}*/
	@Id
	@Column(name="cusid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cusid;
   	@Column(name="cusname")//defining the database column
	private String cusname;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	@Column(name="phone")
	private String phone;
	@Column(name="pay")
	private String pay;
	
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}

	public ShipModel() {
		super();
	}
	public ShipModel(String cusname, String email, String address, String phone, String pay) {
		super();
		this.cusname = cusname;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.pay = pay;
	}
	
		
	}
	

