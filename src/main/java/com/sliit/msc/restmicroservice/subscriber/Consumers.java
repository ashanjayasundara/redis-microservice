package com.sliit.msc.restmicroservice.subscriber;

import com.sliit.msc.restmicroservice.entity.Order;
import com.sliit.msc.restmicroservice.entity.Product;
import com.sliit.msc.restmicroservice.utils.DynamicMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.SerializationUtils;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ashan on 2021-11-27
 */
public class Consumers implements MessageListener {
    Logger logger = LoggerFactory.getLogger(Consumers.class);
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    @Scheduled(fixedRateString = "${publish.rate}", initialDelayString = "${publish.delay}")
    public void onMessage(Message message, byte[] bytes) {
        DynamicMsg deserialize = (DynamicMsg) SerializationUtils.deserialize(message.getBody());
        atomicInteger.incrementAndGet();
        logger.info("Consumed event {}", deserialize);
        process(deserialize);

    }

    @Scheduled(fixedRateString = "${publish.rate}")
    public void process(DynamicMsg msg) {
        if (msg instanceof Order) {
            Order order = (Order) msg;
            logger.info("User New Order Message Received process:{}-{}-{}", atomicInteger.get(), order, order.getUuid());
        } else if (msg instanceof Product) {
            Product product = (Product) msg;
            logger.info("New Product Message Received process:{}-{}-{}", atomicInteger.get(), product, product.getUuid());
        } else {
            logger.info("New Message Received process:{}-{}-{}", atomicInteger.get(), msg, msg.getUuid());
        }

    }
}
