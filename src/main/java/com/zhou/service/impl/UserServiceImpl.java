package com.zhou.service.impl;

import com.zhou.mapper.UserMapper;
import com.zhou.pojo.User;
import com.zhou.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现类
 *
 * @author 周相儒
 * @create 2018-01-03 22:08
 */

@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;
  @Override
  public List<User> selectAll() {
    return userMapper.selectAll();
  }

  @Override
  public String hello() {
    return "小明去打醋，12121212121212嘿嘿嘿";
  }
}
