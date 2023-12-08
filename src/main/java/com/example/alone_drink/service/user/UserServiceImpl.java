package com.example.alone_drink.service.user;

import com.example.alone_drink.repository.user.Userrepository;
import com.example.alone_drink.vo.user.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final Userrepository userrepository;

    @Override
    public UserEntity joingUser() {
        return null;
    }

    @Override
    public UserEntity updateUser(String id) {
        return null;
    }

    @Override
    public UserEntity deleteUser(String id) {
        return null;
    }

    @Override
    public UserEntity login(String id) {
        return null;
    }

    @Override
    public UserEntity logout(String id) {
        return null;
    }

}
