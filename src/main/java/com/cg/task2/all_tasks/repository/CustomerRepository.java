package com.cg.task2.all_tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.task2.all_tasks.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
}
