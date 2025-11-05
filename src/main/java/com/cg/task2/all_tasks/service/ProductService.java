package com.cg.task2.all_tasks.service;

import java.util.List;

import com.cg.task2.all_tasks.dto.ProductSummaryDTO;

public interface ProductService {
    List<ProductSummaryDTO> getProductsByCustomerNumber(Integer customerNumber);
}