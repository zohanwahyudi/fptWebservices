package com.fpt.controller.dbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.models.entities.dbo.User;
import com.fpt.services.dbo.UserService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public Iterable<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/user/login")
    public List<User> SelectUser(@RequestParam("username") String username, @RequestParam("password") String password){
        return userService.SelectUser(username, password);
    }    
}
