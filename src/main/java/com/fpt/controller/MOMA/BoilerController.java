package com.fpt.controller.MOMA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.models.entities.MOMA.Boiler;
import com.fpt.services.MOMA.BoilerService;

@RestController
@RequestMapping("api/boiler")
public class BoilerController {
    @Autowired
    private BoilerService boilerService;
/* 
    @PostMapping
    public Boiler save(@RequestBody Boiler boiler){
        return boilerService.save(boiler);
    }
*/
    @PostMapping 
    public List<Boiler> insertDataBoiler(@RequestParam(required = false, name="user") String user, 
    @RequestParam(required=false, name="millcode") String millcode,
    @RequestParam(required=false, name="boilerdataid") Integer boilerdataid,
    @RequestParam(required=false, name="machinemasterid") String machinemasterid,
    @RequestParam(required=false, name="stationtimereferencemasterid") String stationtimereferencemasterid,
    @RequestParam(required=false, name="transactiondate") String transactiondate,
    @RequestParam(required=false, name="superheatersteampressure") Integer superheatersteampressure, 
    @RequestParam(required=false, name="superheatersteamflow") Integer superheatersteamflow,
    @RequestParam(required=false, name="draftdapur") Integer draftdapur, 
    @RequestParam(required=false, name="draftgasbuang") Integer draftgasbuang,
    @RequestParam(required=false, name="panelindicator") Integer panelindicator,
    @RequestParam(required=false, name="superheatersteamtemperature") Integer superheatersteamtemperature,
    @RequestParam(required=false, name="upperdrumpressure") Integer upperdrumpressure,
    @RequestParam(required=false, name="sootblowing") String sootblowing,
    @RequestParam(required=false, name="daeratortemperatur") Integer daeratortemperatur,
    @RequestParam(required=false, name="daeratorlevelbottom") Integer daeratorlevelbottom, 
    @RequestParam(required=false, name="feedtanktemperatur") Integer feedtanktemperatur,
    @RequestParam(required=false, name="sightglass") Integer sightglass, 
    @RequestParam(required=false, name="blowdowndrumbawah") String blowdowndrumbawah,
    @RequestParam(required=false, name="blowdownheaderkiri") String blowdownheaderkiri,
    @RequestParam(required=false, name="blowdownheaderkanan") String blowdownheaderkanan,
    @RequestParam(required=false, name="blowdownheadersuperheater") String blowdownheadersuperheater,
    @RequestParam(required=false, name="blowdownheaderdepan") String blowdownheaderdepan,
    @RequestParam(required=false, name="blowdownautomatic") String blowdownautomatic,
    @RequestParam(required=false, name="remarks") String remarks,
    @RequestParam(required=false, name="statusscreen1") Integer statusscreen1, 
    @RequestParam(required=false, name="statusscreen2") Integer statusscreen2, 
    @RequestParam(required=false, name="statusscreen3") Integer statusscreen3, 
    @RequestParam(required=false, name="statusscreen4") Integer statusscreen4, 
    @RequestParam(required=false, name="statusscreen5") Integer statusscreen5, 
    @RequestParam(required=false, name="statusscreen6") Integer statusscreen6, 
    @RequestParam(required=false, name="statusscreen7") Integer statusscreen7,
    @RequestParam(required=false, name="remarksscreen1") String remarksscreen1, 
    @RequestParam(required=false, name="remarksscreen2") String remarksscreen2, 
    @RequestParam(required=false, name="remarksscreen3") String remarksscreen3, 
    @RequestParam(required=false, name="remarksscreen4") String remarksscreen4, 
    @RequestParam(required=false, name="remarksscreen5") String remarksscreen5, 
    @RequestParam(required=false, name="remarksscreen6") String remarksscreen6, 
    @RequestParam(required=false, name="remarksscreen7") String remarksscreen7,
    @RequestParam(required=false, name="createdby") String createdby, 
    @RequestParam(required=false, name="createdon") String createdon,
    @RequestParam(required=false, name="modifiedby") String modifiedby, 
    @RequestParam(required=false, name="modifiedon") String modifiedon,
    @RequestParam(required=false, name="commentshiftid") String commentshiftid, 
    @RequestParam(required=false, name="approvedby") String approvedby, 
    @RequestParam(required=false, name="approvedon") String approvedon ){
        return boilerService.insertDataBoilers(user, millcode, boilerdataid, machinemasterid, stationtimereferencemasterid, transactiondate, superheatersteampressure, superheatersteamflow, draftdapur, draftgasbuang, panelindicator, superheatersteamtemperature, upperdrumpressure, sootblowing, daeratortemperatur, daeratorlevelbottom, feedtanktemperatur, sightglass, blowdowndrumbawah, blowdownheaderkiri, blowdownheaderkanan, blowdownheadersuperheater, blowdownheaderdepan, blowdownautomatic, remarks, statusscreen1, statusscreen2, statusscreen3, statusscreen4, statusscreen5, statusscreen6, statusscreen7, remarksscreen1, remarksscreen2, remarksscreen3, remarksscreen4, remarksscreen5, remarksscreen6, remarksscreen7, createdby, createdon, modifiedby, modifiedon, commentshiftid, approvedby, approvedon);
        //return boilerService.insertDataBoilers(approvedby, approvedon, blowdownautomatic, blowdowndrumbawah, blowdownheaderdepan, blowdownheaderkanan, blowdownheaderkiri, blowdownheadersuperheater, boilerdataid, commentshiftid, createdby, createdon, daeratorlevelbottom, daeratortemperatur, draftdapur, draftgasbuang, feedtanktemperatur, machinemasterid, millcode, modifiedby, modifiedon, panelindicator, remarks, remarksscreen1, remarksscreen2, remarksscreen3, remarksscreen4, remarksscreen5, remarksscreen6, remarksscreen7, sightglass, sootblowing, stationtimereferencemasterid, statusscreen1, statusscreen2, statusscreen3, statusscreen4, statusscreen5, statusscreen6, statusscreen7, superheatersteamflow, superheatersteampressure, superheatersteamtemperature, transactiondate, upperdrumpressure, user);
        //return boilerService.insertDataBoiler(boiler);
    }
/* 
    @GetMapping("/BoilerDataReport")
    public List<Report> DataReportBoiler(@RequestParam("transactiondate")String transactiondate, @RequestParam("millcode") String millcode, @RequestParam("machinemastercode") String machinemastercode ){
        return boilerService.DataReportBoiler(transactiondate, millcode, machinemastercode);
    } */
}
