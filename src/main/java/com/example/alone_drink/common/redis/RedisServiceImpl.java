package com.example.alone_drink.common.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService{

    private final RedisRepository redisRepository;

    /**
     * Redis 데이터 저장
     * @param redisVo 
     */
    @Override
    public void setData(RedisVo redisVo) {
        redisRepository.save(redisVo);
    }

    /**
     * Redis 데이터 가져오기
     * @param id
     * @return
     */
    @Override
    public Optional<RedisVo> getData(String id) {
        return redisRepository.findById(id);
    }

    /**
     * Redis 데이터 삭제
     * @param redisVo
     */
    @Override
    public void deleteData(RedisVo redisVo) {
        redisRepository.deleteById(redisVo.getId());
    }

    /**
     * Redis 데이터 Id 기준 존재 여부
     * @param userEmail
     * @return boolean
     */
    @Override
    public boolean booleanRedisData(String userEmail) {
        Optional<RedisVo> data = redisRepository.findById(userEmail);
        if(!data.isEmpty() && data.isPresent()) {
            return true;
        }
        return false;
    }
}
