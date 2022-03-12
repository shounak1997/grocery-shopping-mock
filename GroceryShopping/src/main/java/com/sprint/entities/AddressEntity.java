package com.sprint.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address_details")
public class AddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	
	@Column(name="address_country")
	private String country;
	
	@Column(name="address_state")
	private String state;
	
	@Column(name="address_district")
	private String district;
	
	@Column(name="address_pincode")
	private String pinCode;
	
	public AddressEntity() {
		
	}
	
	public AddressEntity(int addressId, String country, String state, String district, String pinCode) {
		this.addressId = addressId;
		this.country = country;
		this.state = state;
		this.district = district;
		this.pinCode = pinCode;
	}
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String city) {
		this.state = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode= pinCode;
	}
	public int getPk() {
		return addressId;
	}
}