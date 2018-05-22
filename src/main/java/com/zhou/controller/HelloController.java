package com.zhou.controller;

import com.zhou.pojo.User;
import com.zhou.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo Controller
 *
 * @author 周相儒
 * @create 2018-01-03 19:58
 */

@RestController
public class HelloController {

  @Autowired
  private UserServiceImpl userService;


  @RequestMapping(value = "/hello")
  public User hello() {

//    List<User> list = userService.selectAll();
//    User user = list.get(0);
    User user = new User();
    user.setAge(12);
    user.setName("Tom");
    user.setNickname("tony");
    return user;
  }


}
