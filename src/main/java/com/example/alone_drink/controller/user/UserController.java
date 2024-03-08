package com.example.alone_drink.controller.user;

import com.example.alone_drink.common.pageUrl.PageUrl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/auth")
public class UserController {

    /**
     * 회원가입 페이지 이동
     * @return String View
     */
    @GetMapping("/joinPage")
    public String mvCreateUser(){
        return PageUrl.PATH_VIEW_USER + "/create";
    }

    /**
     * 로그인 페이지 이동
     * @return String View
     */
    @GetMapping("/loginPage")
    public String mvLoginUser() {
        return PageUrl.PATH_VIEW_USER + "/login";
    }

    /**
     * 회원 수정 페이지 이동
     * @param userId - 사용자 아이디
     * @return String View
     */
    @GetMapping("/updatePage/{userId}")
    public ModelAndView mvModifyUser(@PathVariable("userId") String userId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(PageUrl.PATH_VIEW_USER + "/modify");
        modelAndView.addObject("userId", userId);
        return modelAndView;
    }

}
