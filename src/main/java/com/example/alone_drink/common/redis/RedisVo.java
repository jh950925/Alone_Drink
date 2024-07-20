package com.example.alone_drink.common.redis;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@NoArgsConstructor
@ToString
@RedisHash(value = "userAuthCode", timeToLive = 120)
public class RedisVo {

    @Id
    private String id;          // 사용자가 보낼 이메일
    private String authCode;    // 인증코드

    public RedisVo(String id, String authCode) {
        this.id = id;
        this.authCode = authCode;
    }

}
