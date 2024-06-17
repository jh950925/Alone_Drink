package com.example.alone_drink.module.serviceImpl.user.mail;

import com.example.alone_drink.module.service.user.mail.MailService;
import com.example.alone_drink.common.mail.MailUtil;
import com.example.alone_drink.common.util.RandomCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MailServiceImpl implements MailService {

    private final MailUtil mailMessage;

    @Override
    public void sendAuthCodeToEmail(String email) {
        RandomCode randomCode = new RandomCode();
        String subject = "인증 CODE";
        log.info("========================================");
        log.info("UserEmail 발송");
        // 메세지 보내기
        mailMessage.sendEmail(email, subject,randomCode.toString());
        log.info("========================================");
    }

    @Override
    public void setStoreAuthCodeByEmail() {

    }

    @Override
    public void getStoreAuthCodeByEmail() {

    }

    @Override
    public boolean verifyCode(String email, String redisAuthCode) {
        return false;
    }
}
