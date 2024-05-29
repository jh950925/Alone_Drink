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

    public void sendEmail(String userEmail) {
        SimpleMailMessage message = new SimpleMailMessage();
        RandomCode randomCode = new RandomCode();

        String subject = "인증 CODE";

        message.setFrom("보내는사람 Email");
        message.setTo(userEmail);
        message.setSubject(subject);
        message.setText(randomCode.toString());

        mailSender.send(message);
    }

}
