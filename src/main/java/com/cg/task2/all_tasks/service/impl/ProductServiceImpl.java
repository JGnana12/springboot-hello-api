package com.cg.task2.all_tasks.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cg.task2.all_tasks.entity.Order;
import com.cg.task2.all_tasks.entity.OrderDetail;
import com.cg.task2.all_tasks.entity.Product;
import com.cg.task2.all_tasks.repository.OrderDetailRepository;
import com.cg.task2.all_tasks.repository.OrderRepository;
import com.cg.task2.all_tasks.service.ProductService;
import com.cg.task2.all_tasks.dto.ProductSummaryDTO;

@Service
public class ProductServiceImpl implements ProductService {

    private final OrderRepository orderRepository;
    private final OrderDetailRepository orderDetailRepository;

    public ProductServiceImpl(OrderRepository orderRepository, OrderDetailRepository orderDetailRepository) {
        this.orderRepository = orderRepository;
        this.orderDetailRepository = orderDetailRepository;
    }

    @Override
    public List<ProductSummaryDTO> getProductsByCustomerNumber(Integer customerNumber) {
        List<Order> orders = orderRepository.findByCustomerCustomerNumber(customerNumber);

        Set<Product> products = new HashSet<>();
        for (Order order : orders) {
            List<OrderDetail> details = orderDetailRepository.findByOrderOrderNumber(order.getOrderNumber());
            for (OrderDetail detail : details) {
                products.add(detail.getProduct());
            }
        }

        return products.stream()
                .map(p -> new ProductSummaryDTO(p.getProductCode(), p.getProductName(), p.getBuyPrice()))
                .collect(Collectors.toList());
    }
}