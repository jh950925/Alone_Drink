package com.example.alone_drink.controller.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@Slf4j
@RequiredArgsConstructor
public class UserApiController {


    /**
     * 회원 가입
     * @return ResponseEntity
     */
    @PostMapping("/join")
    public ResponseEntity<Map<String, Object>> joinUser(){
        Map<String, Object> data = new HashMap<>();

        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

    /**
     * 회원 수정
     * @param id
     * @return ResponseEntity
     */
    @PutMapping("/update/{id}")
    public ResponseEntity<Map<String, Object>> updateUser(@PathVariable String id) {
        Map<String, Object> data = new HashMap<>();

        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

    /**
     * 회원 탈퇴
     * @param id
     * @return ResponseEntity
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> deleteUser(@PathVariable String id) {
        Map<String, Object> data = new HashMap<>();

        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

    /**
     * 로그인
     * @param id
     * @return ResponseEntity
     */
    @GetMapping("/login/{id}")
    public ResponseEntity<Map<String, Object>> loginUser(@PathVariable String id) {
        Map<String, Object> data = new HashMap<>();

        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

    /**
     * 로그아웃
     * @param id
     * @return ResponseEntity
     */
    @GetMapping("/logout/{id}")
    public ResponseEntity<Map<String, Object>> logoutUser(@PathVariable String id) {
        Map<String, Object> data = new HashMap<>();

        return ResponseEntity.status(HttpStatus.OK).body(data);
    }
}
