package com.huatian.bean;

import lombok.Data;

import java.util.Set;

@Data
public class User {
    private int id;
    private String userName;
    private String passWord;

    private Set<Role> roles;
}
