package com.example.alone_drink.module.controller.user;

import com.example.alone_drink.common.annotation.ResponseApiCode;
import com.example.alone_drink.module.serviceImpl.user.MailServiceImpl;
import com.example.alone_drink.module.vo.dto.user.UserInfoDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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

    private final MailServiceImpl mailService;

    /**
     * 인증 메일 보내기
     */
    @Operation(summary = "메일"
            , description = "인증 메일 보내기"
            , tags = "외부 Rest Api"
    )
    @ResponseApiCode
    @GetMapping("/sendMail")
    public void sendEmailCode(UserInfoDto userInfoDto){
        log.info("send Mail");
        mailService.sendAuthCodeToEmail(userInfoDto.getUserEmail());
    }

    /**
     * 인증메일 확인하기
     * @param userInfoDto
     */
//    @Operation(summary = "메일"
//            , description = "인증 메일 보내기"
//            , tags = "외부 Rest Api"
//    )
//    @ResponseApiCode
//    @GetMapping("/sendMail")
//    public ResponseEntity<ApiResponse<RedisVo>> authEmailCode(UserInfoDto userInfoDto){
//        return null;
//    }

}
