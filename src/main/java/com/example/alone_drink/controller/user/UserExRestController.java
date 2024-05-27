package com.example.alone_drink.controller.user;

import com.example.alone_drink.service.user.UserExRestApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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

    private final UserExRestApi userExRestApi;

}
