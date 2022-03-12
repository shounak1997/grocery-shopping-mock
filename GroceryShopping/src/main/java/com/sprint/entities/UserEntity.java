package com.sprint.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email_id")
	private String emailId;
	
	@OneToMany(mappedBy = "user",cascade=CascadeType.ALL)
	private Set<OrderEntity> orders = new HashSet<>();
	
	
	public UserEntity() {
		
	}
	
	public UserEntity(String firstName, String lastName, String loginId, String password, String mobileNo,
			String emailId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getKey() {
		 return mobileNo ;
	}
}