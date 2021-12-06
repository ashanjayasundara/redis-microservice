package com.sliit.msc.restmicroservice.repository;

import com.sliit.msc.restmicroservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ashan on 2021-11-27
 */
@Repository
public class ProductDao {
    @Autowired
    private RedisTemplate redisTemplate;
    private static final String HASH_KEY = Product.class.getSimpleName();
    @Autowired
    private ChannelTopic topic;
    @Value("${topic.publisher}")
    private String streamKey;

    public Product save(Product product) {
        redisTemplate.convertAndSend(topic.getTopic(), product);
//        redisTemplate.opsForHash().put(HASH_KEY, product.getId(), product);
        return product;
    }

    public List<Product> findAll() {
        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public Product findProductById(int id) {
        return (Product) redisTemplate.opsForHash().get(HASH_KEY, id);
    }

    public String deleteProduct(int id) {
        redisTemplate.opsForHash().delete(HASH_KEY, id);
        return "product deleted " + id;
    }
}
