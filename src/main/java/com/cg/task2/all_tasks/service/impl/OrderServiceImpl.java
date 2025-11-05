package com.cg.task2.all_tasks.service.impl;

import org.springframework.stereotype.Service;

import com.cg.task2.all_tasks.dto.OrderSummaryDTO;
import com.cg.task2.all_tasks.repository.OrderRepository;
import com.cg.task2.all_tasks.service.OrderService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderSummaryDTO> getOrdersByCustomerNumber(Integer customerNumber) {
        return orderRepository.findByCustomerCustomerNumber(customerNumber).stream()
            .map(order -> new OrderSummaryDTO(
                order.getOrderNumber(),
                order.getOrderDate(),
                order.getStatus()))
            .collect(Collectors.toList());
    }

}
