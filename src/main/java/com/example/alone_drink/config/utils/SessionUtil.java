package com.example.alone_drink.config.utils;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class SessionUtil {

    public static final String USER_COOKIE = "userCookie";
    private Map<String, Object> sessionStore = new ConcurrentHashMap<>();

    /**
     * 세션 생성
     * @param value 
     * @param response
     */
    public void createSession(Object value, HttpServletResponse response) {
        String uuid = UUID.randomUUID().toString();
        sessionStore.put(uuid, value);

        // 쿠키 생성
        Cookie cookie = new Cookie(USER_COOKIE, uuid);
        response.addCookie(cookie);
    }

    /**
     * 세션 조회
     * @param request 
     * @return
     */
    public Object getSession(HttpServletRequest request) {
        Cookie sessionCookie = findCookie(request, USER_COOKIE);

        if(sessionCookie == null)
            return null;

        return sessionStore.get(sessionCookie.getValue());
    }

    /**
     * 쿠키 조회
     * @param request 
     * @param cookieName
     * @return
     */
    public Cookie findCookie(HttpServletRequest request, String cookieName) {
        if (request.getCookies() == null) {
            return null;
        }

        return Arrays.stream(request.getCookies())
                .filter(cookie -> cookie.getName().equals(cookieName))
                .findAny()
                .orElse(null);
    }

    public void DeleteSession(HttpServletRequest request) {
        Cookie sessionCookie = findCookie(request, USER_COOKIE);
        if (sessionCookie != null) {
            sessionStore.remove(sessionCookie.getValue());
        }
    }

}
