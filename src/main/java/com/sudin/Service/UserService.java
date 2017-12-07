package com.sudin.Service;

import com.sudin.Model.Users;

import java.util.List;

public interface UserService {

    Users findOne(Long id);

    List<Users> findAll();

    Users addUser(Users users);

    void removeOne(Long id);

}
