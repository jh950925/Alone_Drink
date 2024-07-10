package com.example.alone_drink.module.serviceImpl.user;

import com.example.alone_drink.module.repository.user.UserInfoRepository;
import com.example.alone_drink.module.service.user.UserService;
import com.example.alone_drink.module.vo.dto.user.UserInfoDto;
import com.example.alone_drink.module.vo.entity.user.UserInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImp implements UserService {

    private final UserInfoRepository userInfoRepository;

    private final ModelMapper modelMapper;

    /**
     * 회원가입
     * @param userInfoDto
     * @return UserInfoDto
     */
    @Override
    public UserInfoDto registerUser(UserInfoDto userInfoDto) {
        UserInfo userInfoEntity = modelMapper.map(userInfoDto, UserInfo.class);
        userInfoRepository.save(userInfoEntity);

        UserInfoDto result = modelMapper.map(userInfoEntity, UserInfoDto.class);

        return result;
    }

    /**
     * 회원 아이디 찾기
     * @param email 
     * @return UserInfoDto
     */
    @Override
    public UserInfoDto findUserId(String email) {

        return null;
    }

    /**
     * 회원 비밀번호 찾기
     * @param userId 
     * @return USerInfoDto
     */
    @Override
    public UserInfoDto findUserPassword(String userId) {
        return null;
    }

    /**
     * 로그인
     * @param userId 
     * @param password
     * @return UserInfoDto
     */
    @Override
    public UserInfoDto login(String userId, String password) {


        return null;
    }

    /**
     * 로그아웃
     * @param userNo 
     */
    @Override
    public void logout(Long userNo) {

    }
}
