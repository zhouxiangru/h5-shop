package com.zhou.service;

import com.zhou.pojo.User;

import java.util.List;

/**
 * user service
 *
 * @author 周相儒
 * @create 2018-01-03 22:07
 */
public interface UserService {

  List<User> selectAll();

  String hello();

}
