package com.example.alone_drink.module.serviceImpl.user.mail;

import com.example.alone_drink.common.mail.MailUtil;
import com.example.alone_drink.common.redis.RedisRepository;
import com.example.alone_drink.common.redis.RedisVo;
import com.example.alone_drink.common.util.RandomCode;
import com.example.alone_drink.module.service.user.mail.MailService;
import com.example.alone_drink.module.vo.dto.user.UserInfoDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MailServiceImpl implements MailService {

    // 인증메일 Util
    private final MailUtil mailMessage;
    // Redis Util
    private final RedisRepository redisRepository;

    @Override
    public void sendAuthCodeToEmail(String email) {
        RandomCode randomCode = new RandomCode();
        String subject = "인증 CODE";
        // 메세지 보내기
        mailMessage.sendEmail(email, subject,randomCode.toString());
    }

    @Override
    public void setStoreAuthCodeByEmail() {
        RandomCode randomCode = new RandomCode();
        RedisVo vo = new RedisVo("jh950925", randomCode.createCode());
        // 저장
        redisRepository.save(vo);
    }

    @Override
    public void getStoreAuthCodeByEmail(UserInfoDto userINfoDto) {
        RedisVo redisVO = new RedisVo();
        redisVO.setId(userINfoDto.getUserId());
    }

    @Override
    public boolean verifyCode(String email, String redisAuthCode) {

        return false;
    }
}
