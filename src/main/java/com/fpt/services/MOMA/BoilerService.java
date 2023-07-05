package com.fpt.services.MOMA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.models.entities.MOMA.Boiler;
import com.fpt.models.repos.MOMA.BoilerRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BoilerService {
    @Autowired
    private BoilerRepo boilerRepo;

    public Boiler save(Boiler boiler){
        return boilerRepo.save(boiler);
    }
/* 
    public List<Boiler> insertDataBoiler(Boiler boiler){
        return boilerRepo.InsertDataBoiler(boiler);
    }
    */

    public List<Boiler> insertDataBoilers(String user, String millcode, Integer boilerdataid, String machinemasterid,
    String stationtimereferencemasterid, String transactiondate, Integer superheatersteampressure, Integer superheatersteamflow,
    Integer draftdapur, Integer draftgasbuang, Integer panelindicator, Integer superheatersteamtemperature, Integer upperdrumpressure,
    String sootblowing, Integer daeratortemperatur, Integer daeratorlevelbottom, Integer feedtanktemperatur, Integer sightglass,
    String blowdowndrumbawah, String blowdownheaderkiri, String blowdownheaderkanan, String blowdownheadersuperheater,
    String blowdownheaderdepan, String blowdownautomatic, String remarks, Integer statusscreen1, Integer statusscreen2, 
    Integer statusscreen3, Integer statusscreen4, Integer statusscreen5, Integer statusscreen6, Integer statusscreen7,
    String remarksscreen1, String remarksscreen2, String remarksscreen3, String remarksscreen4, String remarksscreen5, 
    String remarksscreen6, String remarksscreen7, String createdby, String createdon, String modifiedby, String modifiedon,
    String commentshiftid, String approvedby, String approvedon) {
        return boilerRepo.InsertDataBoiler(user, millcode, blowdownautomatic, machinemasterid, stationtimereferencemasterid, 
        transactiondate, blowdownheaderkiri, blowdownheadersuperheater, draftdapur, commentshiftid, createdby, createdon, 
        upperdrumpressure, daeratortemperatur, daeratortemperatur, daeratorlevelbottom, feedtanktemperatur, machinemasterid, 
        blowdowndrumbawah, blowdownheaderkiri, blowdownheaderkanan, panelindicator, blowdownheaderdepan, blowdownautomatic, 
        remarksscreen2, remarksscreen3, remarksscreen4, remarksscreen5, remarksscreen6, remarksscreen7, statusscreen6, 
        sootblowing, remarksscreen1, statusscreen1, statusscreen2, statusscreen3, statusscreen4, statusscreen5, statusscreen6, 
        statusscreen7, superheatersteamflow, superheatersteampressure, superheatersteamtemperature, commentshiftid, upperdrumpressure, 
        approvedon);
    }
   /*  {
        return boilerRepo.InsertDataBoiler(approvedby, approvedon, blowdownautomatic, blowdowndrumbawah, blowdownheaderdepan, 
        blowdownheaderkanan, blowdownheaderkiri, blowdownheadersuperheater, boilerdataid, commentshiftid, createdby, createdon, 
        daeratorlevelbottom, daeratortemperatur, draftdapur, draftgasbuang, feedtanktemperatur, machinemasterid, millcode, 
        modifiedby, modifiedon, panelindicator, remarks, remarksscreen1, remarksscreen2, remarksscreen3, remarksscreen4, 
        remarksscreen5, remarksscreen6, remarksscreen7, sightglass, sootblowing, stationtimereferencemasterid, statusscreen1, 
        statusscreen2, statusscreen3, statusscreen4, statusscreen5, statusscreen6, statusscreen7, superheatersteamflow, 
        superheatersteampressure, superheatersteamtemperature, transactiondate, upperdrumpressure);
    } 

    public List<Report> DataReportBoiler(String transactiondate, String millcode, String machinemastercode){
        return boilerRepo.DataReportBoiler(transactiondate, millcode, machinemastercode);
    } */

}
