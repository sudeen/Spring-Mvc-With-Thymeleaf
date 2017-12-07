package com.sudin.Controller;

import com.sudin.Model.Users;
import com.sudin.Pojos.UserPojo;
import com.sudin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Users addUsers(@RequestBody UserPojo userPojo){
        Users users=new Users();
        users.setName(userPojo.getName());
        users.setEmail(userPojo.getEmail());
        return userService.addUser(users);
    }

    @RequestMapping(value = "/findAll")
    @ResponseBody
    public List<Users> findAdd(){
        return userService.findAll();
    }

    @RequestMapping(value = "/findOne/{id}")
    @ResponseBody
    public Users findOne(@PathVariable("id") Long id){
        return userService.findOne(id);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public void removeOne(@PathVariable("id") Long id){
        userService.removeOne(id);
    }

}
