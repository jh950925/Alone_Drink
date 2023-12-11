package com.example.alone_drink.repository.user;

import com.example.alone_drink.vo.user.entity.UserInfoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface userInfoRepository extends JpaRepository<UserInfoEntity, String> {


    @Transactional
    @Modifying
    @Query("UPDATE UserInfoEntity u SET u.userPass = :userPass, u.userName = :userName, u.userPhoneNo = :userPhoneNo, u.userSexCd = :userSex, u.modDt = :modDt WHERE u.userId = :id")
    void updateUser(@Param("id") String id, @Param("userPass") String userPass, @Param("userName") String userName, @Param("userPhoneNo") String userPhoneNum, @Param("userSex") String userSex, @Param("modDt") LocalDateTime modDt);
}
