package com.jsp.flipzon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.flipzon.entity.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, String> {

}
