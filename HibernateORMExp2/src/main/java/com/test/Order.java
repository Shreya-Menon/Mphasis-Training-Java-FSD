package com.test;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity
@Table(name="orders")
@NamedQueries({
	@NamedQuery(name="customquery",query="from Order o where o_name=:name "),
	@NamedQuery(name="pricequery",query="from Order o where o_price=:price ")
})
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public Order(String o_name,int o_quantity,int o_price) {
		this.o_name=o_name;
		this.o_quantity=o_quantity;
		this.o_price=o_price;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public int getO_quantity() {
		return o_quantity;
	}
	public void setO_quantity(int o_quantity) {
		this.o_quantity = o_quantity;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", o_name=" + o_name + ", o_quantity=" + o_quantity + ", o_price=" + o_price + "]";
	}
	public int getO_price() {
		return o_price;
	}
	public void setO_price(int o_price) {
		this.o_price = o_price;
	}
	private String o_name;
	private int o_quantity;
	private int o_price;
}
