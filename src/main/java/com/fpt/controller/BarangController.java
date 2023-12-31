package com.fpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.models.entities.Barang;
import com.fpt.services.BarangService;

@RestController
@RequestMapping("api/barang")
public class BarangController {

    @Autowired
    private BarangService barangService;

    @PostMapping
    public Barang save(@RequestBody Barang barang){
        return barangService.save(barang);
    }

    @GetMapping
    public Iterable<Barang> findAll(){
        return barangService.findAll();
    }

    @GetMapping("/{ID}")
        public Barang findOne(@PathVariable("ID") Long ID){
            return barangService.findOne(ID);
    }

    @PostMapping("/{ID}")
    public Barang update(Barang barang){
        return barangService.save(barang);
    }
    
    @DeleteMapping("/{ID}")
    public void removeOne(@PathVariable("ID") Long ID){
        barangService.removeOne(ID);
    }
}
