package com.example.alone_drink.vo.login;

import lombok.Data;

@Data
public class KakaoLoginVO {

    // 아이디
    private String id;
    // 비밀번호
    private String password;
    // 이름
    private String name;
    // 나이
    private int age;
    //전화번호
    private String phNum;
    // 성별코드
    private String sexCd;
    // 이메일
    private String email;

    public KakaoLoginVO(String id, String password, String name, int age, String phNum, String sexCd, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.phNum = phNum;
        this.sexCd = sexCd;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public String getSexCd() {
        return sexCd;
    }

    public void setSexCd(String sexCd) {
        this.sexCd = sexCd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
