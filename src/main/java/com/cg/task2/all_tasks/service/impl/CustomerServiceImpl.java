package com.cg.task2.all_tasks.service.impl;

import org.springframework.stereotype.Service;

import com.cg.task2.all_tasks.dto.CustomerSummaryDTO;
import com.cg.task2.all_tasks.repository.CustomerRepository;
import com.cg.task2.all_tasks.service.CustomerService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerSummaryDTO> getAllCustomers() {
    	 return customerRepository.findAll().stream()
    	            .map(c -> new CustomerSummaryDTO(
    	                c.getCustomerNumber(),
    	                c.getCustomerName(),
    	                c.getCountry()))
    	            .collect(Collectors.toList());

    }
}
