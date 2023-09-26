package com.example.alone_drink.service.login;

import com.example.alone_drink.vo.login.MemberVO;

public interface MemberLoginServuce {

    /**
     * 로그인
     **/
    public String login(String id, String password);

    /**
     * 로그아웃
     **/
    public String logout(String id);

    /**
     * 회원가입
     **/
    public void joinMember(MemberVO memberVO);

    /**
     * 회원탈퇴
     **/
    public String deleteMember(String id, String password);
}
