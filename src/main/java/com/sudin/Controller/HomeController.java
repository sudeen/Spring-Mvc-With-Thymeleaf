package com.sudin.Controller;

import com.sudin.Model.Users;
import com.sudin.Pojos.UserPojo;
import com.sudin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
