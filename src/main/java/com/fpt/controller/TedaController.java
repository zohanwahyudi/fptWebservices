package com.fpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.models.entities.Teda;
import com.fpt.services.TedaService;

import java.util.List;

@RestController
@RequestMapping("api/teda")
public class TedaController {
    @Autowired
    private TedaService tedaService;

    @GetMapping
    public Iterable<Teda> findAll(){
        return tedaService.findAll();
    }
/*
    @GetMapping("/{params}")
    public Teda findByNamaLike(@PathVariable("params") String params){
        return TedaService.findByNamaLike(params);
    } */

    @GetMapping("/search")
    public List<Teda> searchUserTeda(@RequestParam("query") String query){
        return tedaService.searchUserTeda(query);
    }
/*
    @PostMapping
    public Teda saveUserTEDA(String Nama,String NIK,String Username,String Password,String Active,String CreatedBy,String CreatedOn){
        return tedaService.saveUserTEDA(Nama, NIK, Username, Password, Active, CreatedBy, CreatedOn);
    } */

    @PostMapping
    public Teda saveUserTEDA(@RequestBody Teda teda){
        return tedaService.saveUserTEDA(teda);
    }

}
