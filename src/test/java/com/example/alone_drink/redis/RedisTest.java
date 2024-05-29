package com.example.alone_drink.redis;

import com.example.alone_drink.common.redis.RedisRepository;
import com.example.alone_drink.common.redis.RedisVo;
import com.example.alone_drink.common.util.RandomCode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
@Slf4j
class RedisTest {

    @Autowired
    private RedisRepository repo;

    @Test
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
//        repo.delete(vo);
    }

    @Test
    void getRedis() {

        String ip = "172.27.74.48";
        int port = 6379;

        Jedis jedis = new Jedis(ip, port);

        try {
            String response = jedis.ping();

            System.out.println("redis 서버 응답 : " + response);

            String test = jedis.get("Test");
            System.out.println("-----------------------\n");
            System.out.println("test = " + test);
            System.out.println("\n-----------------------");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }

    }

}
