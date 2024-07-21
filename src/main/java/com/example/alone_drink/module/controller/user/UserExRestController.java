package com.example.alone_drink.module.controller.user;

import com.example.alone_drink.common.annotation.ResponseApiCode;
import com.example.alone_drink.config.api.ApiResponse;
import com.example.alone_drink.module.serviceImpl.user.MailServiceImpl;
import com.example.alone_drink.module.vo.dto.user.UserMailDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 사이트 외부 RestController
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user/ex")
public class UserExRestController {

    private final MailServiceImpl mailService;

    /**
     * 인증 메일 보내기
     * @param userMailDto
     */
    @Operation(summary = "메일"
            , description = "인증 메일 보내기"
            , tags = "외부 Rest Api"
    )
    @ResponseApiCode
    @PostMapping("/sendEmailCode")
    public void sendEmailCode(@RequestBody UserMailDto userMailDto){
        log.info("send Mail");
        mailService.sendAuthCodeToEmail(userMailDto.getUserEmail());
    }

    /**
     * 인증메일 확인하기
     * @param userMailDto
     * @return
     */
    @Operation(summary = "메일"
            , description = "인증 메일 확인하기"
            , tags = "외부 Rest Api"
    )
    @ResponseApiCode
    @PostMapping("/chkEmailCode")
    public ResponseEntity<ApiResponse<Map<String,Object>>> chkEmailCode(@RequestBody UserMailDto userMailDto){
        Map<String, Object> map = new HashMap<>();
        map.put("chkEmailCode", mailService.verifyCode(userMailDto.getUserEmail(), userMailDto.getAuthCd()));

        return ResponseEntity.ok(ApiResponse.sucess(map));
    }

}
