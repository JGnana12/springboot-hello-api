package com.cg.task2.all_tasks.dto;

public class CustomerSummaryDTO {
    private Integer customerNumber;
    private String customerName;
    private String country;

    public CustomerSummaryDTO(Integer customerNumber, String customerName, String country) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.country = country;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCountry() {
        return country;
    }
}