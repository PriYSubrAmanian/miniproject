package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Inventorymanagement")

public class InventoryManagement 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Product_no")
	int Product_no;
	@Column(name="Product_name")
	String Product_name;
	@Column(name="noofproducts")
	int noofproducts;
	@Column(name="costperproduct")
	int costperproduct;
	public InventoryManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InventoryManagement(int product_no, String product_name, int noofproducts, int costperproduct) {
		super();
		Product_no = product_no;
		Product_name = product_name;
		this.noofproducts = noofproducts;
		this.costperproduct = costperproduct;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public int getNoofproducts() {
		return noofproducts;
	}
	public void setNoofproducts(int noofproducts) {
		this.noofproducts = noofproducts;
	}
	public int getCostperproduct() {
		return costperproduct;
	}
	public void setCostperproduct(int costperproduct) {
		this.costperproduct = costperproduct;
	}
	
	
	
	

}
