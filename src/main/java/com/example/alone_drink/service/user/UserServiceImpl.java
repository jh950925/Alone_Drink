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

import java.time.LocalDateTime;
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
    public int updateUser(String id, UserVo userVo) {
        int result = 0;
        if (userInfoRepository.findById(id).orElse(null) != null) {
            result = 1;
            UserInfoEntity vo = userVo.toEntity();
            vo.setUserId(id);
            vo.setComnGrpCd("1");

            userInfoRepository.updateUser(id, vo.getUserPass(), vo.getUserName(), vo.getUserPhoneNo(), vo.getUserSexCd(), LocalDateTime.now());
        }
        return  result;
    }

    @Override
    public int deleteUser(String id) {
        int result = 0;
            UserInfoEntity userInfoEntity = userInfoRepository.findById(id).orElse(null);

        if (userInfoEntity != null) {
            userInfoRepository.deleteById(id);
            userRepository.deleteById(userInfoEntity.getUserEntity().getUserNo());
            result = 1;
        }

        return result;
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
