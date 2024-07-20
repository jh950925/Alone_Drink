package com.example.alone_drink.module.service.user;

public interface MailService {

    /**
     * 인증코드 메일 보내기
     * @param email
     */
    public void sendAuthCodeToEmail(String email);

    /**
     * 받아온 인증코드 메일과 화면에서 입력된 인증코드 비교하기 - 인증완료
     * @param email
     * @param redisAuthCode
     * @return
     */
    public boolean verifyCode(String email, String redisAuthCode);

}
