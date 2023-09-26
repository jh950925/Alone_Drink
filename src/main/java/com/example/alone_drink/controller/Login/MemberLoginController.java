package com.example.alone_drink.controller.Login;

import com.example.alone_drink.service.login.MemberLoginServuce;
import com.example.alone_drink.vo.login.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@Slf4j
public class MemberLoginController {

    private final MemberLoginServuce memberLoginServuce;

    @GetMapping("/login")
    public void login(String id, String password){
        log.info("login");
    }

    @GetMapping("/logout")
    public void logout(String id){
        log.info("logout");
    }

    @PostMapping("/joinMember")
    public void joinMember(MemberVO memberVO){
        log.info("joinMember");

        //회원가입 서비스 호출
        memberLoginServuce.joinMember(memberVO);
        
    }

    @PutMapping("/updateMember")
    public void updateMember(String id, String password){
        log.info("updateMember");
    }


    @DeleteMapping("/deleteMember")
    public void deleteMember(String id, String password) {
        log.info("deleteMember");
    }
}
