package com.fpt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.models.entities.Barang;
import com.fpt.models.repos.BarangRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class BarangService {
    @Autowired
    private BarangRepo barangRepo;

    public Barang save(Barang barang){
        return barangRepo.save(barang);
    }
    public Barang findOne(Long ID){
        return barangRepo.findById(ID).get();
    }
    public Iterable<Barang> findAll(){
        return barangRepo.findAll();
    }
    public void removeOne(Long ID){
        barangRepo.deleteById(ID);
    }

}
