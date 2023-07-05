package com.fpt.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.models.entities.Activity;
import com.fpt.services.ActivityService;

@RestController
@RequestMapping("api/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @GetMapping()
    public Iterable<Activity> findAll(){
        return activityService.findAll();
    }

    @GetMapping("/search")
    public List<Activity> SelectActivityMasterTEDA(@RequestParam("estate") String estate, @RequestParam("group") String group){
        return activityService.SelectActivityMasterTEDA(estate, group);
    }

    @PostMapping
    public Activity SaveActivityMaster(@RequestBody Activity activity){
        return activityService.SaveActivityMaster(activity);
    }
    
}
