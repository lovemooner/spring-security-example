package com.spring4all.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
@Data
public class UserDO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 账号
     */
    @Column(name="user_name")
    private String username;

    /**
     * 密码
     */
    @Column(name="password")
    private String password;

    /**
     * 昵称
     */
    @Column(name="nick_name")
    private String nickname;

}
