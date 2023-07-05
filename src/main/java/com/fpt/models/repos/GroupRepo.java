package com.fpt.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.fpt.models.entities.Group;

public interface GroupRepo extends CrudRepository <Group, Long> {
    
}
