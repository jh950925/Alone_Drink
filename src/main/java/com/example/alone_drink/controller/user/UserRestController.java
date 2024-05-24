package com.example.alone_drink.controller.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserRestController {

    /**
     *  회원가입
     */
    @Operation(summary = "회원가입 요청"
            , description = "회원 정보가 저장됩니다."
            , tags = "User Api Controller"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    @PostMapping("/add/data")
    public void userAdd(){

    }

    /**
     *  ID찾기
     */
    @Operation(summary = "유저 ID 찾기"
            , description = "사용자의 ID를 찾습니다.."
            , tags = "User Api Controller"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    @PostMapping("/search/id/data")
    public void userSearchId(){

    }

    /**
     * PASS찾기
     */
    @Operation(summary = "유저 PassWord 찾기"
            , description = "사용자의 PassWord를 찾습니다."
            , tags = "User Api Controller"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    @PostMapping("/search/pass/data")
    public void userSearchPass(){

    }

    /**
     * 로그인
     */
    @Operation(summary = "로그인 요청"
            , description = "로그인 하기."
            , tags = "User LogIn / LogOut"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    @PostMapping("/login/data")
    public void logIn(){

    }

    /**
     * 로그아웃
     */
    @Operation(summary = "로그아웃"
            , description = "로그아웃 하기"
            , tags = "User LogIn / LogOut"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    @PostMapping("/logout/data")
    public void logout(){

    }

}
