package com.cg.task2.all_tasks.dto;

public class OrderSummaryDTO {
    private Integer orderNumber;
    private java.sql.Date orderDate;
    private String status;

    public OrderSummaryDTO(Integer orderNumber, java.sql.Date orderDate, String status) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.status = status;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public java.sql.Date getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }
}