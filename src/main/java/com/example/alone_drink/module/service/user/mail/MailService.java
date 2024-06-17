package com.example.alone_drink.module.service.user.mail;

public interface MailService {

    /**
     * 인증코드 메일 보내기
     * @param email
     */
    public void sendAuthCodeToEmail(String email);

    /**
     * 인증코드 Redis에 저장
     */
    public void setStoreAuthCodeByEmail();

    /**
     * 저장된 인증코드 가져오기
     */
    public void getStoreAuthCodeByEmail();

    /**
     * 받아온 인증코드 메일과 화면에서 입력된 인증코드 비교하기 - 인증완료
     * @param email
     * @param redisAuthCode
     * @return
     */
    public boolean verifyCode(String email, String redisAuthCode);

}
