package com.example.alone_drink.serviceImpl.common.mail;

import com.example.alone_drink.common.util.RandomCode;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Mailservice {

    private final JavaMailSender mailSender;
    private final MessageSource messageSource;

    public void sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        RandomCode randomCode = new RandomCode();
        message.setFrom("jh950925@naver.com");
        message.setTo("jh950925@gmail.com");
        message.setSubject("제목테스트");
        message.setText(randomCode.toString());

        mailSender.send(message);
    }

}
