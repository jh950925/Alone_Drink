package com.example.alone_drink.module.serviceImpl.user;

import com.example.alone_drink.common.mail.MailUtil;
import com.example.alone_drink.common.redis.RedisService;
import com.example.alone_drink.common.redis.RedisVo;
import com.example.alone_drink.common.util.RandomCode;
import com.example.alone_drink.module.service.user.MailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MailServiceImpl implements MailService {

    // 인증메일
    private final MailUtil mailMessage;
    // redis
    private final RedisService redisService;


    /**
     * 인증메일코드 발송
     * @param email 
     */
    @Override
    public void sendAuthCodeToEmail(String email) {

        RandomCode randomCode = new RandomCode();
        String authCode = randomCode.createCode();
        String subject = "인증 CODE";

        mailMessage.sendEmail(email, subject, authCode);

        RedisVo redisVo = new RedisVo();
        redisVo.setId(email);
        redisVo.setAuthCode(authCode);
        redisService.setData(redisVo);
    }

    /**
     * 인증메일코드 확인
     * @param email 
     * @param redisAuthCode
     * @return
     */
    @Override
    public boolean verifyCode(String email, String redisAuthCode) {
        if(redisService.booleanRedisData(email)){
            return true;
        }
        return false;
    }
}
