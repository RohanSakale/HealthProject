package com.app.pojo;

import javax.persistence.*;



@Entity
public class MedicineInfo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mid;
    private String medicineName;
    private String dosageInfo;
    private String test;
    
    @ManyToOne
	@JoinColumn(name = "cid")
	private CustomerInfo customerData;

    @OneToOne
    @JoinColumn(name="hid")
    private HealthInfo healthInfo;
    
    public MedicineInfo() {
		super();
	}
    
	public MedicineInfo(int id, String medicineName, String dosageInfo, String test) {
		super();
		this.mid = id;
		this.medicineName = medicineName;
		this.dosageInfo = dosageInfo;
		this.test = test;
	}
    
	public int getId() {
		return mid;
	}
	
	
	public void setId(int id) {
		this.mid = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getDosageInfo() {
		return dosageInfo;
	}
	public void setDosageInfo(String dosageInfo) {
		this.dosageInfo = dosageInfo;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	
	
	public CustomerInfo getCustomerInfo() {
		return customerData;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerData = customerInfo;
	}

	@Override
	public String toString() {
		return "MedicineInfo [id=" + mid + ", medicineName=" + medicineName + ", DosageInfo=" + dosageInfo + ", test="
				+ test + "]";
	}

	
    
    

}
