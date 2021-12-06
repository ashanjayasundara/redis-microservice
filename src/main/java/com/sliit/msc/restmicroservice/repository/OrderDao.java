package com.sliit.msc.restmicroservice.repository;

import com.sliit.msc.restmicroservice.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * @author ashan on 2021-12-06
 */
@Repository
public class OrderDao {
    @Autowired
    private RedisTemplate redisTemplate;
    private static final String HASH_KEY = Order.class.getSimpleName();

    @Autowired
    private ChannelTopic topic;
    @Value("${topic.publisher}")
    private String streamKey;

    public Order save(Order order) {
        redisTemplate.convertAndSend(topic.getTopic(), order);
        return order;
    }

    public List<Order> findAll() {
        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public Order findProductById(int id) {
        return (Order) redisTemplate.opsForHash().get(HASH_KEY, id);
    }

    public String deleteProduct(UUID id) {
        redisTemplate.opsForHash().delete(HASH_KEY, id);
        return "order has been deleted " + id;
    }
}
