package com.sliit.msc.restmicroservice.utils;

import lombok.Data;
import lombok.ToString;

import java.util.UUID;

/**
 * @author ashan on 2021-12-06
 */
@Data
@ToString
public class DynamicMsg {
    private UUID uuid;
    private long initiatedTime;

    public DynamicMsg() {
        uuid = UUID.randomUUID();
        initiatedTime = TimeUtils.currentTimeMillis();
    }

    public UUID getUuid() {
        return uuid;
    }

    public long getInitiatedTime() {
        return initiatedTime;
    }
}
