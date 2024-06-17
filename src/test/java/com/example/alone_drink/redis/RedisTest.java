package com.example.alone_drink.redis;

import com.example.alone_drink.common.redis.RedisRepository;
import com.example.alone_drink.common.redis.RedisVo;
import com.example.alone_drink.common.util.RandomCode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
class RedisTest {

    @Autowired
    private RedisRepository repo;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    @DisplayName("JPA 사용 테스트 코드")
    void redisTest() {
        RandomCode randomCode = new RandomCode();
        log.info("random={}", randomCode.createCode());
        RedisVo vo = new RedisVo("jh950925", randomCode.createCode());
        log.info("=============================================================");
        log.info("vo={}",vo.toString());

        // 저장
        repo.save(vo);
        log.info("repo={}",repo);

        // Id값 가져옴
        repo.findById(vo.getId());
        log.info("repo.findById={}",repo);
        
        // vo안의 @RedisHash에 정의되어 있는 키의 갯수를 구함
        repo.count();
        log.info("=============================================================");

        // 삭제
        repo.delete(vo);
    }

    @Test
    @DisplayName("redisTemplate 사용 테스트 코드")
    public void testRedisTemplate() {
        // ValueOperations 객체를 통해 Redis와 상호작용
        ValueOperations<String, String> valueOps = redisTemplate.opsForValue();

        // Redis에 데이터 저장
        String key = "testKey";
        String value = "testValue";
        valueOps.set(key, value);

        // 데이터 조회
        String retrievedValue = valueOps.get(key);
        assertThat(retrievedValue).isEqualTo(value);

        log.info("retrievedValue = {}", retrievedValue);

        // 데이터 삭제
        redisTemplate.delete(key);
        String deletedValue = valueOps.get(key);
        assertThat(deletedValue).isNull();
    }

}
