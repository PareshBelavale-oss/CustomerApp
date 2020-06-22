package com.emc.facmas.aution.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CUSTOMER_DETAILS")
public class CustomerDetails {

	@Id
	@Column(name = "CUSTOMER_ID", nullable = false, updatable = false, insertable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long customerId;
	
	@Column(name = "CUSTOMER_NAME")
	String customerName;
	
	@Column(name = "CUSTOMER_TYPE")
	String customerType;
	
	@Column(name = "CUSTOMER_RESULT")
	String customerResult;
	
	@Column(name = "CUSTOMER_STATUS")
	String customerStatus;
	
	
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerResult() {
		return customerResult;
	}

	public void setCustomerResult(String customerResult) {
		this.customerResult = customerResult;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}

	
		
	}



