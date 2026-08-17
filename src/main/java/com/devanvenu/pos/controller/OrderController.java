package com.devanvenu.pos.controller;
import com.devanvenu.pos.entity.Order;
import com.devanvenu.pos.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController{
  private final OrderService service;
  public OrderController(OrderService s){this.service=s;}
  @PostMapping public Order create(@RequestBody Order o){return service.create(o);}
  @GetMapping public List<Order> all(){return service.all();}
}
