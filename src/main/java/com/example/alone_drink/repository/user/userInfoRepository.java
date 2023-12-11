package com.example.alone_drink.repository.user;

import com.example.alone_drink.vo.user.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userInfoRepository extends JpaRepository<UserInfoEntity, String> {
}
