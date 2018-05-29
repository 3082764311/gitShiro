package com.mr.service;

import com.mr.model.User;

import java.util.List;

/**
 * Created by 安晓 on 2018/5/25.
 */
public interface LoginService {
    User selectByUserName(String username);

    List<String> selectRoleByUserId(Integer userId);

    List<String> selectPermissionByUserId(Integer userId);

}
