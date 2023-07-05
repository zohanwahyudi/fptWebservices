package com.fpt.models.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.repository.query.Param;

import com.fpt.models.entities.Teda;
public interface TedaRepo extends CrudRepository <Teda, Long>{

    @Query(value = "SELECT * FROM teda.[User] ORDER BY Id", nativeQuery=true)
    List<Teda> findAll();

    @Query(value = "SELECT * FROM teda.[User] WHERE Nama LIKE '%',:params, '%' ", nativeQuery=true)
    List<Teda> findByNamaLike(String params);

    @Query(value = "SELECT * FROM teda.[User] WHERE " +
            "Nama LIKE CONCAT('%',:query, '%')" +
            "Or Username LIKE CONCAT('%', :query, '%')", nativeQuery=true)
    List<Teda> searchUserTeda(String query);
/*
    @Query(value = "INSERT INTO teda.[User] (Nama, NIK, Username, Password, Active, CreatedBy, CreatedOn) VALUES (:Nama, :NIK, :Username, :Password, :Active, :CreatedBy, :CreatedOn )", nativeQuery=true)
    Teda saveUserTEDA(@Param("Nama") String Nama, @Param("NIK") String NIK, @Param("Username") String Username, @Param("Password") String Password, @Param("Active") String Active, @Param("CreatedBy") String CreatedBy, @Param("CreatedOn") String CreatedOn);
    // Teda saveUserTEDA(Teda teda); 
    // Void saveUserTEDA(@Param(Teda));
    */
}
