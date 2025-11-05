package com.cg.task2.all_tasks.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.task2.all_tasks.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByCustomerCustomerNumber(Integer customerNumber);
}
