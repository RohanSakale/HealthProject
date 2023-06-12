package com.app.pojo;

import javax.persistence.*;

@Entity
public class HealthInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hid;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cid")
	private CustomerInfo customerInfo;

	private double pulse;
	private double bloodPressur;
	private int sugarRange;
	
	@OneToOne(mappedBy = "healthInfo",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private MedicineInfo medicineInfo;

	public HealthInfo() {
		super();
	}

	public HealthInfo(int id, double pulse, double bloodPressur, int sugarRange) {
		super();
		this.hid = id;
		this.pulse = pulse;
		this.bloodPressur = bloodPressur;
		this.sugarRange = sugarRange;
	}

	public int getId() {
		return hid;
	}

	public void setId(int id) {
		this.hid = id;
	}

	public double getPulse() {
		return pulse;
	}

	public void setPulse(double pulse) {
		this.pulse = pulse;
	}

	public double getBloodPressur() {
		return bloodPressur;
	}

	public void setBloodPressur(double bloodPressur) {
		this.bloodPressur = bloodPressur;
	}

	public int getSugarRange() {
		return sugarRange;
	}

	public void setSugarRange(int sugarRange) {
		this.sugarRange = sugarRange;
	}

	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	@Override
	public String toString() {
		return "HealthInfo [id=" + hid + ", pulse=" + pulse + ", bloodPressur=" + bloodPressur + ", sugarRange="
				+ sugarRange + "]";
	}

}
