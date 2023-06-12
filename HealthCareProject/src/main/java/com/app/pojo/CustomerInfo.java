package com.app.pojo;

import java.util.List;

import javax.persistence.*;

@Entity
public class CustomerInfo {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private String password;
	private int age;
	private String address;
	private String mobileNo;

	@OneToOne(mappedBy = "customerInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private HealthInfo healthinfo;
	
	
	@OneToMany(mappedBy = "customerData")
	private List<MedicineInfo> medicineInfo;

	public CustomerInfo() {

	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public CustomerInfo(int id, String name, String password, int age, String address, String mobileno) {
		super();
		this.cid = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.address = address;
		this.mobileNo = mobileno;
	}

	public CustomerInfo(String name, String password, int age, String address, String mobileno) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.address = address;
		this.mobileNo = mobileno;
	}

	public int getId() {
		return cid;
	}

	public void setId(int id) {
		this.cid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "CustomerInfo [id=" + cid + ", name=" + name + ", password=" + password + ", age=" + age + ", address="
				+ address + ", mobileno=" + mobileNo + "]";
	}

}
