package com.example.alone_drink.service.user;

import com.example.alone_drink.vo.user.entity.UserEntity;
import com.example.alone_drink.vo.user.entity.UserInfoEntity;
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
    public UserInfoEntity updateUser(String id, UserVo userVo);

    /**
     * 회원 탈퇴
     * @param id
     * @return int
     */
    public int deleteUser(String id);

    /**
     * 로그인
     * @param id
     * @return UserEntity
     */
    public UserEntity login(String id);

    /**
     * 로그 아웃
     * @param id
     * @return UserEntity
     */
    public UserEntity logout(String id);

}
