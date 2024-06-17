package com.example.alone_drink.module.serviceImpl.user;

import com.example.alone_drink.config.modelMapper.ModelMapperConfig;
import com.example.alone_drink.module.vo.dto.user.UserInfoDto;
import com.example.alone_drink.module.vo.entity.user.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class UserServiceImpTest {

    @Autowired
    private ModelMapperConfig modelMapperConfig;

    @Test
    @DisplayName("ModelMapper 테스트")
    void dtoToEntityTest() {
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setUserId("jh950925");
        userInfoDto.setUserPass("dustp@105");
        userInfoDto.setUserEmail("jh950925@naver.com");
        userInfoDto.setUserNm("김준형");
        userInfoDto.setModDt("20240501");
        userInfoDto.setRegDt("20240501");
        userInfoDto.setUserAdr("주소테스트");
        userInfoDto.setUserAge("20");
        userInfoDto.setUserSexCd("1");
        userInfoDto.setUserYmd("19950925");

        UserInfo entity = modelMapperConfig.modelMapper().map(userInfoDto, UserInfo.class);

        System.out.println("entity = " + entity.toString());
    }
}