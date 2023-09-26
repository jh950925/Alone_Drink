package com.example.alone_drink.serviceImpl.login;

import com.example.alone_drink.service.login.MemberLoginServuce;
import com.example.alone_drink.vo.login.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemberServiceImpl implements MemberLoginServuce {


    @Override
    public String login(String id, String password) {
        return null;
    }

    @Override
    public String logout(String id) {
        return null;
    }

    @Override
    public void joinMember(MemberVO memberVO) {
        log.info("joinMember Service");
        log.info("memberVo = {}" , memberVO);
    }

    @Override
    public String deleteMember(String id, String password) {
        return null;
    }
}
