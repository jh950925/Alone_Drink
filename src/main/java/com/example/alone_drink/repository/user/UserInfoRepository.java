package com.example.alone_drink.repository.user;

import com.example.alone_drink.vo.user.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfoEntity, String> {
}
