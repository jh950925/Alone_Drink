package com.example.alone_drink.service.user;

import com.example.alone_drink.repository.user.UserRepository;
import com.example.alone_drink.repository.user.UserSnsInfoRepository;
import com.example.alone_drink.repository.user.userInfoRepository;
import com.example.alone_drink.vo.user.entity.UserEntity;
import com.example.alone_drink.vo.user.entity.UserInfoEntity;
import com.example.alone_drink.vo.user.vo.UserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final userInfoRepository userInfoRepository;
    private final UserSnsInfoRepository userSnsInfoRepository;

    @Override
    public Map<String,Object> joingUser(UserVo userVo) {
        Map<String, Object> map = new HashMap<>();

        UserEntity userEntity = new UserEntity();
        userEntity.setUserTypeCd("B");
        userEntity.setComnGrpCd("1");
        UserEntity target = userRepository.save(userEntity);

        UserInfoEntity userInfoEntity = userVo.toEntity();
        userInfoEntity.setComnGrpCd("1");
        userInfoEntity.setUserEntity(target);
        UserInfoEntity target2 = userInfoRepository.save(userInfoEntity);

        map.put("user", target);
        map.put("userInfo", target2);

        return map;
    }

    @Override
    public UserInfoEntity updateUser(String id, UserVo userVo) {
        if (userInfoRepository.findById(id).orElse(null) == null) {
            return null;
        }

        UserInfoEntity vo = userVo.toEntity();
        vo.setUserId(id);
        vo.setComnGrpCd("1");

        return userInfoRepository.save(vo);
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
