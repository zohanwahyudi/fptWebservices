package com.fpt.models.repos.dbo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fpt.models.entities.dbo.Tbip;

public interface TbipRepo extends CrudRepository<Tbip, Long> {
    @Query(value = "SELECT * FROM dbo.[tbip]" +
                    "WHERE EstateID = :estate AND ipaddress = :ip AND category = :type ", nativeQuery = true)
                    List<Tbip> SelectIP(String estate, String ip, String type);
}
