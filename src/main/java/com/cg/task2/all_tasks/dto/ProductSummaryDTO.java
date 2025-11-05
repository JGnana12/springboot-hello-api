package com.cg.task2.all_tasks.dto;

import java.math.BigDecimal;

public class ProductSummaryDTO {
    private String productCode;
    private String productName;
    private BigDecimal buyPrice;

    public ProductSummaryDTO(String productCode, String productName, BigDecimal buyPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.buyPrice = buyPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }
}