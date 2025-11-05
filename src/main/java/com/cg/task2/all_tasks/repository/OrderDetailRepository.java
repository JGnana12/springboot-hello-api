package com.cg.task2.all_tasks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.task2.all_tasks.entity.OrderDetail;
import com.cg.task2.all_tasks.entity.OrderDetailId;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
    List<OrderDetail> findByOrderOrderNumber(Integer orderNumber);
}