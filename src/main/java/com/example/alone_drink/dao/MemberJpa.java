package com.example.alone_drink.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_CUST_BASE")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberJpa {

    @Id
    private String cust_id;

    @Column
    private String cust_password;

    @Column
    private String cust_name;

    @Column
    private int cust_age;

    @Column
    private String cust_phNum;

    @Column
    private String cust_sexCd;

    @Column
    private String cust_email;

}
