package com.mr.service.impl;

import com.mr.mapper.UserMapper;
import com.mr.model.User;
import com.mr.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 安晓 on 2018/5/25.
 */
@Service
@Transactional(readOnly = true)
public class LoginService implements com.mr.service.LoginService{

    @Autowired
    private UserMapper userMapper;

    public User selectByUserName(String username) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> list = userMapper.selectByExample(example);
        return list.size()==0?null:list.get(0);
    }

    public List<String> selectRoleByUserId(Integer userId) {
        return userMapper.selectRoleByUserId(userId);
    }

    public List<String> selectPermissionByUserId(Integer userId) {
        return userMapper.selectPermissionByUserId(userId);
    }
}
