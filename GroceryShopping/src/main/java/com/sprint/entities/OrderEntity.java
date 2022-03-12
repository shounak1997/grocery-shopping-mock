package com.sprint.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class OrderEntity {
    
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	@Column(name="order_date")
	private LocalDate date;
	
	@ManyToMany
	@JoinColumn(name="product_id")
	private List<ProductEntity> products = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="login_id")
	private UserEntity user;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private AddressEntity address;
	
	public OrderEntity() {
		
	}

	public OrderEntity(List<ProductEntity> products, UserEntity user, AddressEntity address) {
		this.products = products;
		this.user = user;
		this.address = address;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}
}
