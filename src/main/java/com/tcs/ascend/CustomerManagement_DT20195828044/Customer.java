package com.tcs.ascend.CustomerManagement_DT20195828044;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CUSTOMER")
public class Customer {

	@Id
	private int customerId;

	@Column(name = "ssn_id")
	private String ssnId;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "age")
	private int age;

	@Column(name = "address")
	private String address;

	@Column(name = "state")
	private String state;

	@Column(name = "city")
	private String city;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getSsnId() {
		return ssnId;
	}

	public void setSsnId(String ssnId) {
		this.ssnId = ssnId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
