package com.infosys.nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.nc.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
