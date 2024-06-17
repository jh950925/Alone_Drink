package com.example.alone_drink.config.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Value("${spring.data.redis.host}")
    private String host;

    @Value("${spring.data.redis.port}")
    private int port;

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        return new LettuceConnectionFactory(host, port);
    }

    // RedisTemplate 빈을 정의합니다.
    // RedisTemplate은 Redis와의 데이터 작업을 위한 중심 클래스로, 여러 가지 데이터 조작 메서드를 제공합니다.
    @Bean
    public RedisTemplate<byte[], byte[]> redisTemplate() {
        // RedisTemplate 객체를 생성합니다. 이 객체는 Redis와의 상호작용을 수행합니다.
        RedisTemplate<byte[], byte[]> redisTemplate = new RedisTemplate<>();

        // 생성된 RedisTemplate 객체에 RedisConnectionFactory를 설정합니다.
        // 이를 통해 RedisTemplate은 Lettuce 클라이언트를 사용하여 Redis와 연결을 관리합니다.
        redisTemplate.setConnectionFactory(redisConnectionFactory());

        // 키 직렬화를 위한 StringRedisSerializer를 설정합니다.
        // 이를 통해 Redis에 저장되는 모든 키는 문자열로 직렬화됩니다.
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        // RedisTemplate 빈을 반환합니다.
        return redisTemplate;
    }
}
