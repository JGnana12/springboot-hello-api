package com.cg.task2.all_tasks.service;

import java.util.List;
import com.cg.task2.all_tasks.dto.OrderSummaryDTO;

//@Service
public interface OrderService {
    List<OrderSummaryDTO> getOrdersByCustomerNumber(Integer customerNumber);
}
