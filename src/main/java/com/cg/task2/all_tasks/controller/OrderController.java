package com.cg.task2.all_tasks.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.task2.all_tasks.dto.OrderSummaryDTO;
import com.cg.task2.all_tasks.service.OrderService;


@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/customer/{customerNumber}")
    public ResponseEntity<List<OrderSummaryDTO>> getOrdersByCustomer(@PathVariable Integer customerNumber) {
        return ResponseEntity.ok(orderService.getOrdersByCustomerNumber(customerNumber));
    }

}