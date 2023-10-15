package org.infinite.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Product")
@Table(name = "Product")
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productid")
	private int Pid;
	@Column(name = "productname")
	private String Pname;
	@Column(name = "Price")
	private int Price;

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

}
