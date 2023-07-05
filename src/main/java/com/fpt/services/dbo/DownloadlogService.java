package com.fpt.services.dbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.models.entities.dbo.Downloadlog;
import com.fpt.models.repos.dbo.DownloadlogRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DownloadlogService {
    @Autowired
    private DownloadlogRepo downloadlogRepo;

    public List<Downloadlog> CheckDownloadLog(String tab, String ip, String estate){
        return downloadlogRepo.CheckDownloadLog(tab, ip, estate);
    }
}
