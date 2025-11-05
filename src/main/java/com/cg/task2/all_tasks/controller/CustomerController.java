package com.cg.task2.all_tasks.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cg.task2.all_tasks.dto.CustomerSummaryDTO;
import com.cg.task2.all_tasks.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin("*")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

//    @GetMapping
//    public List<Customer> getAllCustomers() {
//        return customerService.getAllCustomers();
//    }
    @GetMapping
    public ResponseEntity<List<CustomerSummaryDTO>> getAllCustomers() {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

}
