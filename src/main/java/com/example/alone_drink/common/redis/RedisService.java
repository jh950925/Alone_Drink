package com.example.alone_drink.common.redis;

import java.util.Optional;

public interface RedisService {

    /**
     * 데이터 Redis에 저장하기
     * @param redisVo
     */
    public void setData(RedisVo redisVo);

    /**
     * Redis에 있는 값 가져오기
     * @param id
     * @return
     */
    public Optional<RedisVo> getData(String id);

    /**
     * Redis 삭제하기
     * @param redisVo
     * @return
     */
    public void deleteData(RedisVo redisVo);

    /**
     * Redis 데이터 존재여부 확인학
     * @param userEmail
     * @return
     */
    public boolean booleanRedisData(String userEmail);
}
