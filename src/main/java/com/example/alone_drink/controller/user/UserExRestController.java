package com.example.alone_drink.controller.user;

import com.example.alone_drink.common.annotation.ResponseApiCode;
import com.example.alone_drink.serviceImpl.common.mail.Mailservice;
import com.example.alone_drink.serviceImpl.user.UserExRestApi;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 사이트 외부 RestController
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user/ex")
public class UserExRestController {

    private final UserExRestApi userExRestApi;
    private final Mailservice mailservice;

    /**
     * 인증 메일 보내기
     */
    @Operation(summary = "메일"
            , description = "인증 메일 보내기"
            , tags = "외부 Rest Api"
    )
    @ResponseApiCode
    @PostMapping("/sendMail")
    public void sendEmailCode(){
        log.info("send Mail");
        mailservice.sendEmail();
    }
    
}
