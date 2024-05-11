package com.infosys.nc.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	private String carName;
	private String carType;
	private String carNumber;
	@Lob
	private byte[] carImage;
	private Double rentPerDay;
	private LocalDate bookingStartDate;
	private LocalDate bookingEndDate;
	private String bookingStatus;
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	
	

}
