package com.devanvenu.pos.repository;
import com.devanvenu.pos.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order,String>{}
