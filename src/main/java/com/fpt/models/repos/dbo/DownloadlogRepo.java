package com.fpt.models.repos.dbo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fpt.models.entities.dbo.Downloadlog;

public interface DownloadlogRepo extends CrudRepository <Downloadlog, Long> {
    @Query (value = "SELECT TOP 1 * FROM dbo.[DownloadLog]" +
                    "WHERE TabletName = :tab AND IP = :ip AND EstateID = :estate ORDER BY TimeStamp desc", nativeQuery = true)
    List<Downloadlog> CheckDownloadLog(String tab, String ip, String estate);
}
