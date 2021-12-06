package com.sliit.msc.restmicroservice.entity;

import com.sliit.msc.restmicroservice.utils.DynamicMsg;
import com.sliit.msc.restmicroservice.utils.ExecType;
import com.sliit.msc.restmicroservice.utils.OrderSide;
import com.sliit.msc.restmicroservice.utils.TimeInForce;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author ashan on 2021-12-06
 */

@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Order")
public class Order extends DynamicMsg implements Serializable {
    private OrderSide side;
    private BigDecimal orderQty;
    private String instID;
    private BigDecimal price;
    private TimeInForce timeInForce;
    private String execID;
    private String accountID;
    private ExecType execType;
}
