package com.cg.task2.all_tasks.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.task2.all_tasks.dto.ProductSummaryDTO;
import com.cg.task2.all_tasks.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/customer/{customerNumber}")
    public ResponseEntity<List<ProductSummaryDTO>> getProductsByCustomer(@PathVariable Integer customerNumber) {
        List<ProductSummaryDTO> products = productService.getProductsByCustomerNumber(customerNumber);
        return ResponseEntity.ok(products);
    }

}