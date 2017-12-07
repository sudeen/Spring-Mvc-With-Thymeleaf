package com.sudin.Service;

import com.sudin.Model.Users;

import java.util.List;

public interface UserService {

    List<Users> findAll();

    Users addUser(Users users);

}
