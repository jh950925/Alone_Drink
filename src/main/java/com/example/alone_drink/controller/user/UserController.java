package com.example.alone_drink.controller.user;

import com.example.alone_drink.config.utils.CalendarUtil;
import com.example.alone_drink.service.user.UserServiceImpl;
import com.example.alone_drink.vo.user.vo.UserVo;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;


    /**
     * 회원 가입 페이지 이동
     * @return String
     */
    @GetMapping("/joinPage")
    public String joinPage(Model model) {
        log.info("회원가입 페이지 이동");

        model.addAttribute("years", CalendarUtil.getYears());
        model.addAttribute("months", CalendarUtil.getMonths());
        model.addAttribute("days", CalendarUtil.getDays());

        return "user/joinUser";
    }

    /**
     * 회원 정보 수정 페이지 이동
     * @param id
     * @return String
     */
    @GetMapping("/updatePage/{id}")
    public String updatePage(@PathVariable String id) {
        return "user/updateUser";
    }

    /**
     * 로그인
     * @param userVo
     * @return String
     */
    @Operation(summary = "로그인", description = "회원로그인")
    @PostMapping("/login")
    public String loginUser(HttpServletRequest request, UserVo userVo) {
        int result = userService.login(userVo);

        // 회원가입 실패 동작
        if (result < 1) { return "login"; }
        
        // 세션 생성 (default -> true -> 새로운 세션 생성)
        HttpSession session = request.getSession();
        session.setAttribute("Userid", userVo.getUserId());

        return "main";
    }

    /**
     * 로그아웃
     * @param request
     * @return String
     */
    @Operation(summary = "로그아웃", description = "회원 로그아웃")
    @GetMapping("/logout")
    public String logoutUser(HttpServletRequest request) {
        HttpSession session = request.getSession(false);

        log.info("logout");

        if (session != null) {
            session.invalidate();
        }

        return "login";
    }
}
