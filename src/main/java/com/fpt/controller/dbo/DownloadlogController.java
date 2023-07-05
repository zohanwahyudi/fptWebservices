package com.fpt.controller.dbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.models.entities.dbo.Downloadlog;
import com.fpt.services.dbo.DownloadlogService;

@RestController
@RequestMapping("api/downloadlog")
public class DownloadlogController {
    @Autowired
    private DownloadlogService downloadlogService;

    @GetMapping("/checklog")
    public List<Downloadlog> CheckDownloadLog(@RequestParam("tab")String tab, @RequestParam("ip")String ip, @RequestParam("estate")String estate){
        return downloadlogService.CheckDownloadLog(tab, ip, estate);
    }

}
