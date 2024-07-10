package com.example.alone_drink.module.controller.user;

import com.example.alone_drink.common.annotation.ResponseApiCode;
import com.example.alone_drink.config.api.ApiResponse;
import com.example.alone_drink.module.serviceImpl.user.UserServiceImp;
import com.example.alone_drink.module.vo.dto.user.UserInfoDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 사이트 내부 RestController
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserRestController {

    private final UserServiceImp userService;

    /**
     * 회원가입
     */
    @Operation(summary = "회원가입 요청"
            , description = "회원 정보가 저장됩니다."
            , tags = "User Api Controller"
    )
    @ResponseApiCode
    @PostMapping("/add/data")
    public ResponseEntity<ApiResponse<UserInfoDto>> userAdd(UserInfoDto userInfoDto) {
        return ResponseEntity.ok(ApiResponse.sucess(userService.registerUser(userInfoDto)));
    }

    /**
     *  ID찾기
     */
    @Operation(summary = "유저 ID 찾기"
            , description = "사용자의 ID를 찾습니다.."
            , tags = "User Api Controller"
    )
    @ResponseApiCode
    @PostMapping("/search/id/data")
    public ResponseEntity<ApiResponse<UserInfoDto>> userSearchId(UserInfoDto userInfoDto){

        return null;
    }

    /**
     * PASS찾기
     */
    @Operation(summary = "유저 PassWord 찾기"
            , description = "사용자의 PassWord를 찾습니다."
            , tags = "User Api Controller"
    )
    @ResponseApiCode
    @PostMapping("/search/pass/data")
    public ResponseEntity<ApiResponse<UserInfoDto>> userSearchPass(UserInfoDto userInfoDto){

        return null;
    }

    /**
     * 로그인
     */
    @Operation(summary = "로그인 요청"
            , description = "로그인 하기."
            , tags = "User LogIn / LogOut"
    )
    @ResponseApiCode
    @GetMapping("/login/data")
    public ResponseEntity<ApiResponse<UserInfoDto>> logIn(@ModelAttribute UserInfoDto userInfoDto) {
        log.info("===================================");
        log.info("Login request received with username: {}", userInfoDto.getUserId());
        log.info("===================================");

        return null;
    }

    /**
     * 로그아웃
     */
    @Operation(summary = "로그아웃"
            , description = "로그아웃 하기"
            , tags = "User LogIn / LogOut"
    )
    @ResponseApiCode
    @PostMapping("/logout/data")
    public ResponseEntity<ApiResponse<UserInfoDto>> logout(@RequestBody UserInfoDto userInfoDto){
        log.info("login");
        log.info("UserInfoDto={}",userInfoDto);

        return null;
    }

}
