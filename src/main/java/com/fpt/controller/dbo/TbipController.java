package com.fpt.controller.dbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.models.entities.dbo.Tbip;
import com.fpt.services.dbo.TbipService;

@RestController
@RequestMapping("api/tbip")
public class TbipController {
    @Autowired
    private TbipService tbipService;

    @GetMapping
    public Iterable<Tbip> findAllTbip(){
        return tbipService.findAllTbip();
    }

    @GetMapping("/search")
    public List<Tbip> SelectIP(@RequestParam("estate") String estate, @RequestParam("ip") String ip, @RequestParam("type") String type){
        return tbipService.SelectIP(estate, ip, type);
    }
}
