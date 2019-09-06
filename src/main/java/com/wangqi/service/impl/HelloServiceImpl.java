package com.wangqi.service.impl;

import com.wangqi.mapper.HelloMapper;
import com.wangqi.mapper.UserMapper;
import com.wangqi.service.HelloService;
import com.wangqi.vo.Hello;
import com.wangqi.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getHello() {
        User user = userMapper.selectByPrimaryKey(1L);
        return user;
    }
}
