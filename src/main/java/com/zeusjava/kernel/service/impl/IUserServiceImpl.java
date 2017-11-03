package com.zeusjava.kernel.service.impl;

import com.zeusjava.kernel.dao.UserMapper;
import com.zeusjava.kernel.entity.User;
import com.zeusjava.kernel.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public Boolean addUser(User user) {
        return userMapper.insertSelective(user) > 0;
    }

    @Override
    public Boolean deleteUser(Integer id) {
        return userMapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public Boolean updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user)>0;
    }
}