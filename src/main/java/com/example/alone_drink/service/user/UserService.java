package com.example.alone_drink.service.user;

import com.example.alone_drink.vo.user.vo.UserVo;

import java.util.Map;

public interface UserService {

    /**
     * 회원 가입
     * @return UserEntity
     */
    public Map<String,Object> joingUser(UserVo userVo);

    /**
     * 회원 수정
     * @param id
     * @return UserEntity
     */
    public int updateUser(String id, UserVo userVo);

    /**
     * 회원 탈퇴
     * @param id
     * @return int
     */
    public int deleteUser(String id);

    /**
     * 로그인
     * @param userVo
     * @return UserEntity
     */
    public int login(UserVo userVo);

    /**
     * 로그 아웃
     * @param userVo
     * @return UserEntity
     */
    public int logout(UserVo userVo);

}
