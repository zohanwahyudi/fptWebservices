package com.fpt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.RequestBody;

import com.fpt.models.entities.Teda;
import com.fpt.models.repos.TedaRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TedaService {
    @Autowired
    private TedaRepo tedaRepo;

    public Iterable<Teda> findAll(){
        return tedaRepo.findAll();
    }


    public static Teda findByNamaLike(String params){
        return TedaService.findByNamaLike(params);
    }
/*
    public static Teda searchProducts(String query){
        return TedaService.searchProducts(query);
    } 
 
    public static Teda searchProducts(String query){
        return TedaRepo.searchProducts(query).get(0);
        // return List<Teda> teda = tedaRepo.searchProducts(query);
        // return tedaRepo.searchProducts(query);
    } 
    */
    
    public List<Teda> searchUserTeda(String query){
        List<Teda> user = tedaRepo.searchUserTeda(query);
        return user;
    }
    /*
    public List<Teda> saveUserTEDA(Teda teda){
        return tedaRepo.saveUserTEDA(teda);
    } 
*/
    public Teda saveUserTEDA (Teda teda){
        return tedaRepo.save(teda);
    }  

/*
    public Teda saveUserTEDA(String nama, String nIK, String username, String password, String active, String createdBy,
            String createdOn) {
        return tedaRepo.saveUserTEDA(nama, nIK, username, password, active, createdBy, createdOn);
    }
 */
}
