package com.huatian.bean;

import lombok.Data;

import java.util.Set;

@Data
public class Role {
    private int id;
    private String roleName;

    private Set<Permissions> permissions;
}
