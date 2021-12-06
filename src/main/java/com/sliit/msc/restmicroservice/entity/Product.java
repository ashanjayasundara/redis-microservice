package com.sliit.msc.restmicroservice.entity;

import com.sliit.msc.restmicroservice.utils.DynamicMsg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

/**
 * @author ashan on 2021-11-27
 */
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")
public class Product extends DynamicMsg implements Serializable {
    @Id
    private int id;
    private String name;
    private int qty;
    private double price;
}
