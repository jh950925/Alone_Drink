package com.example.alone_drink.repository.user;

import com.example.alone_drink.vo.user.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE UserEntity u SET u.modDt = :modDt WHERE u.userNo = :userNo")
    void updateUser(@Param("modDt")LocalDateTime modDt,@Param("userNo") Long userNo);
}
