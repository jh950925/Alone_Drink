package com.example.alone_drink.controller.user;

import com.example.alone_drink.common.pageUrl.PageUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final String VIEW_PATH = PageUrl.PATH_VIEW_USER;

    /**
     * 회원가입 화면이동
     * @return String
     */
    @GetMapping("/add/view")
    public String mvUserAddView() {
        return VIEW_PATH + "/userAdd";
    }

    /**
     * 회원 ID 찾기 화면이동
     * @return String
     */
    @GetMapping("/search/id/view")
    public String mvUserSearchIdView() {
        return VIEW_PATH + "/userSearchId";
    }

    /**
     * 회원 PASS 찾기 화면이동
     * @return String
     */
    @GetMapping("/search/pass/view")
    public String mvUserSearchPassView() {
        return VIEW_PATH + "/userSearchPass";
    }
}
