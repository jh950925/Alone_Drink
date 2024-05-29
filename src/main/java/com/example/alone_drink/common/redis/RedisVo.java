package com.example.alone_drink.common.redis;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

@Getter
@ToString
@RedisHash(value = "userAuthCode", timeToLive = 120)
public class RedisVo {

    @Id
    private String id;
    private String authCode;

    public RedisVo(String id, String authCode) {
        this.id = id;
        this.authCode = authCode;
    }
}
