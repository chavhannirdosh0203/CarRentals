package com.infosys.nc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
	private int customerId;
	private String customerName;
	private String emailId;
	private long mobileNumber;
	private int age;
	private String drivingLicenceNumber;
	private String address;
	private long aadharNumber;
}
