package com.fpt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.models.entities.Activity;
import com.fpt.models.repos.ActivityRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ActivityService {
    @Autowired
    private ActivityRepo activityRepo;
    public Iterable<Activity> findAll(){
        return activityRepo.findAll();
    }

    public List<Activity> SelectActivityMasterTEDA(String estate, String group){
        return activityRepo.SelectActivityMasterTEDA(estate, group);
    }

    public Activity SaveActivityMaster(Activity activity){
        return activityRepo.save(activity);
    }
    
}
