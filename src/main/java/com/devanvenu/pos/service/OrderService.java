package com.devanvenu.pos.service;
import com.devanvenu.pos.entity.Order;
import com.devanvenu.pos.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OrderService{
  private final OrderRepository repo;
  public OrderService(OrderRepository r){this.repo=r;}
  public Order create(Order o){return repo.save(o);}
  public List<Order> all(){return repo.findAll();}
}
