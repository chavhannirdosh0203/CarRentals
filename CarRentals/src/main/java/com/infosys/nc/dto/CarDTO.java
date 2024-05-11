package com.infosys.nc.dto;

import java.time.LocalDate;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
	private int carId;
	private String carName;
	private String carType;
	private String carNumber;
	private byte[] carImage;
	private Double rentPerDay;
	private LocalDate bookingStartDate;
	private LocalDate bookingEndDate;
	private String bookingStatus;
	private CustomerDTO customer;
	

}
