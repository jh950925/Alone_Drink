package com.example.alone_drink.repository.user;

import com.example.alone_drink.vo.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
