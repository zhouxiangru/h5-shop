package com.zhou.mapper;

import com.zhou.pojo.User;

import java.util.List;

public interface UserMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(User record);

  int insertSelective(User record);

  User selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(User record);

  int updateByPrimaryKey(User record);

  List<User> selectAll();
}