package com.fpt.services.dbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.models.entities.dbo.User;
import com.fpt.models.repos.dbo.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public Iterable<User> findAll(){
        return userRepo.findAll();
    }

    public List<User> SelectUser(String username, String password){
        return userRepo.SelectUser(username, password);
    }    
}
