package com.fpt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.models.entities.Group;
import com.fpt.models.repos.GroupRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class GroupService {
    @Autowired
    private GroupRepo groupRepo;

    public Iterable<Group> findAll(){
        return groupRepo.findAll();
    }
}
