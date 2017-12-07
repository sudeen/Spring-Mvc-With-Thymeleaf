package com.sudin.Service.impls;

import com.sudin.Model.Users;
import com.sudin.Repository.UserRepository;
import com.sudin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public Users findOne(Long id) {
        return userRepository.findOne(id);
    }

    public List<Users> findAll() {
        return (List<Users>) userRepository.findAll();
    }

    public Users addUser(Users users) {
        return userRepository.save(users);
    }

    @Override
    public void removeOne(Long id) {
        userRepository.delete(id);
    }


}
