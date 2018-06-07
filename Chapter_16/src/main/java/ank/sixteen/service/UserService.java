package ank.sixteen.service;

import ank.sixteen.dto.User;

import java.util.List;

public interface UserService {

    List<User> queryList();

    User getUserById(Integer id);
}
