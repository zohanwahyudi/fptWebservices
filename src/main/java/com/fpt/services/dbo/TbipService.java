package com.fpt.services.dbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.models.entities.dbo.Tbip;
import com.fpt.models.repos.dbo.TbipRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TbipService {
    @Autowired
    private TbipRepo tbipRepo;

    public Iterable<Tbip> findAllTbip(){
        return tbipRepo.findAll();
    }

    public List<Tbip> SelectIP(String estate, String ip, String type){
        return tbipRepo.SelectIP(estate, ip, type);
    }
}
