package com.zeusjava.kernel.service;

import com.zeusjava.kernel.entity.User;

import java.util.List;

public interface IUserService {
    User getUserById(int userId);

    Boolean addUser(User user);

    Boolean deleteUser(Integer id);

    Boolean updateUser(User user);
}
