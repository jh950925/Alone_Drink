package com.example.alone_drink.controller.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    /**
     * 회원 가입 페이지 이동
     * @return String
     */
    @GetMapping("/joinPage")
    public String joinPage() {

        return "";
    }

    /**
     * 회원 정보 수정 페이지 이동
     * @param id
     * @return String
     */
    @GetMapping("/updatePage/{id}")
    public String updatePage(@PathVariable String id) {

        return "";
    }

    /**
     * 로그인 페이지 이동
     * @return String
     */
    @GetMapping("/loginPage")
    public String loginPage() {

        return "";
    }
}
