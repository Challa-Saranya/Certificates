package com.cg.ums.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@TableGenerator(name="canteen", initialValue = 0,allocationSize = 100)
public class Canteen {
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "canteen")
	@Id
	private Integer id;
	private String itemName;
	private Double itemPrice;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Canteen(Integer id, String itemName, Double itemPrice, Date date) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.date = date;
	}
	public Canteen() {
		super();
	}
	@Override
	public String toString() {
		return "Canteen [id=" + id + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", date=" + date + "]";
	}
	

}
