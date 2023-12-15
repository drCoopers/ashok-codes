package com.sanketd.multiDbConfig.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sanketd.multiDbConfig.model.order.Orders;
@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {
}