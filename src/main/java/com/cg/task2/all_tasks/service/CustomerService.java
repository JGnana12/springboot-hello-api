package com.cg.task2.all_tasks.service;

import java.util.List;
import com.cg.task2.all_tasks.dto.CustomerSummaryDTO;

public interface CustomerService {
    List<CustomerSummaryDTO> getAllCustomers();
}
