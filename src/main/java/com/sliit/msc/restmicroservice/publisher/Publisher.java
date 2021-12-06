package com.sliit.msc.restmicroservice.publisher;

import com.sliit.msc.restmicroservice.entity.Order;
import com.sliit.msc.restmicroservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ashan on 2021-11-27
 */
@RestController
public class Publisher {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private ChannelTopic topic;
    @Value("${topic.publisher}")
    private String streamKey;

    @PostMapping("/publish")
    public String publish(@RequestBody Product product) {
        redisTemplate.convertAndSend(topic.getTopic(), product);
        return "Event has been published";
    }

    @PostMapping("/placeOrder")
    public String newOrderRequest(@RequestBody Order order) {
        redisTemplate.convertAndSend(topic.getTopic(), order);
        return "Your order has been placed";
    }
}
