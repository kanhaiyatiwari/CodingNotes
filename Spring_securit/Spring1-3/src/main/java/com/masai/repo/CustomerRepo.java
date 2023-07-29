package com.masai.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.modles.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	public Optional<Customer> findByEmail(String name);
}
