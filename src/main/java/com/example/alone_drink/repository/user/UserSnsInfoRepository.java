package com.example.alone_drink.repository.user;

import com.example.alone_drink.vo.user.entity.UserSnsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSnsInfoRepository extends JpaRepository<UserSnsEntity, String> {
}
