package com.sliit.msc.restmicroservice.controller;

import com.sliit.msc.restmicroservice.entity.Order;
import com.sliit.msc.restmicroservice.repository.OrderDao;
import com.sliit.msc.restmicroservice.subscriber.Consumers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author ashan on 2021-12-06
 */
@RestController
@RequestMapping("/api/order")
public class OrderController {
    Logger logger = LoggerFactory.getLogger(Consumers.class);

    @Autowired
    private OrderDao orderDao;

    @PostMapping
    public Order save(@RequestBody Order order) {
        logger.info("gateway received new order request {}",order);
        return orderDao.save(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        logger.info("requesting all orders");
        return orderDao.findAll();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderDao.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable UUID id) {
        return orderDao.deleteProduct(id);
    }

}
