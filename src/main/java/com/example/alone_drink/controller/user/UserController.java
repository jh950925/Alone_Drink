package com.example.alone_drink.controller.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Tag(name = "회원API", description = "회원 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")

public class UserController {

        @Operation(summary = "회원가입 페이지 이동", description = "회원가입 페이지로 이동합니다..")
        @GetMapping("joinPage")
        public String joinPage() {

            return "";
        }

        @Operation(summary = "회원가입", description = "회원가입 실행")
        @PostMapping("/join")
        public void join() {

        }

        @Operation(summary = "회원수정 페이지", description = "회원 수정 페이지로 이동")
        @GetMapping("/updatePage")
        public void updatePage() {

        }

        @Operation(summary = "회원수정", description = "회원 수정 이후 메인화면으로 이동")
        @PostMapping("/update")
        public void update() {

        }

        @Operation(summary = "로그인 페이지", description = "로그인 페이지로 이동")
        @GetMapping("/loginPage")
        public void loginPage() {

        }

        @Operation(summary = "로그아웃", description = "로그아웃 후 메인 페이지로 이동")
        @PostMapping("/logout")
        public void logout() {

        }

}

