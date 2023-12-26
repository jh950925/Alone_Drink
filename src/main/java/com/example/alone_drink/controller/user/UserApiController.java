package com.example.alone_drink.controller.user;

import com.example.alone_drink.service.user.UserServiceImpl;
import com.example.alone_drink.vo.user.vo.UserVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Tag(name = "UserApi",description = "유저 API Document")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class UserApiController {

    private final UserServiceImpl userService;


    /**
     * 회원 가입
     * @return ResponseEntity
     */

    @PostMapping("/join")
    @Operation(summary = "회원가입", description = "받아온 회원정보로 회원가입 실행")
    public ResponseEntity<Map<String, Object>> joinUser(@RequestBody UserVo userVo){
        System.out.println("회원가입");
        
        Map<String, Object> result = userService.joingUser(userVo);

        result.put("user", result.get("user"));
        result.put("userInfo", result.get("userInfo"));

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    /**
     * 회원 수정
     * @param id
     * @return ResponseEntity
     */
    @Operation(summary = "회원수정", description = "받아온 Id 기준해서 회원정보 수정")
    @PutMapping("/update/{id}")
    public ResponseEntity<Map<String, Object>> updateUser(@PathVariable("id") String id, UserVo userVo) {
        Map<String, Object> data = new HashMap<>();

        int result = userService.updateUser(id, userVo);
        data.put("userInfo", "UPDATE SUCCESS");

        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

    /**
     * 회원 탈퇴
     * @param id
     * @return ResponseEntity
     */
    @Operation(summary = "회원탈퇴", description = "ID기준 회원 탈퇴")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> deleteUser(@PathVariable String id) {
        Map<String, Object> data = new HashMap<>();
        int result = userService.deleteUser(id);
        if (result > 0)
            data.put("msg", id + "님의 회원 탈퇴가 완료 됐습니다..");

        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

}

