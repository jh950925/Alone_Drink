package com.example.alone_drink.controller.user;

import com.example.alone_drink.service.user.UserServiceImpl;
import com.example.alone_drink.vo.user.vo.UserVo;
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

    private final UserServiceImpl userService;

    /**
     * 회원 가입
     * @return ResponseEntity
     */
    @PostMapping("/join")
    public ResponseEntity<Map<String, Object>> joinUser(UserVo userVo){
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
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> deleteUser(@PathVariable String id) {
        Map<String, Object> data = new HashMap<>();
        int result = userService.deleteUser(id);
        if (result > 0)
            data.put("msg", id + "님의 회원 탈퇴가 완료 됐습니다..");

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
