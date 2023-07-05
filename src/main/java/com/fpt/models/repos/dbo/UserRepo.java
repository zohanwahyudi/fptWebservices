package com.fpt.models.repos.dbo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fpt.models.entities.dbo.User;

public interface UserRepo extends CrudRepository <User, Long> {
    @Query(value = "SELECT * FROM dbo.[User]" + 
    "WHERE Username = :username AND Name = :password", nativeQuery = true)
    List<User> SelectUser(String username, String password);
}
