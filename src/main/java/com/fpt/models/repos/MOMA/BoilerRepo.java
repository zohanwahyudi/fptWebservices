package com.fpt.models.repos.MOMA;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fpt.models.entities.MOMA.Boiler;
import com.fpt.models.entities.MOMA.Report;

public interface BoilerRepo extends CrudRepository <Boiler, Long> {
    @Query(value = "EXEC dbo.BoilerDataInsert :user, :millcode, :boilerdataid, :machinemasterid, :stationtimereferencemasterid, " +
    " :transactiondate, :superheatersteampressure, :superheatersteamflow, :draftdapur, :draftgasbuang, :panelindicator, " + 
    " :superheatersteamtemperature, :upperdrumpressure, :sootblowing, :daeratortemperatur, :daeratorlevelbottom, " +
    " :feedtanktemperatur, :sightglass, :blowdowndrumbawah, :blowdownheaderkiri, :blowdownheaderkanan, :blowdownheadersuperheater, " +
    " :blowdownheaderdepan, :blowdownautomatic, :remarks, :statusscreen1, :statusscreen2, :statusscreen3, " +
    " :statusscreen4, :statusscreen5, :statusscreen6, :statusscreen7, :remarksscreen1, :remarksscreen2, :remarksscreen3, " +
    " :remarksscreen4, :remarksscreen5, :remarksscreen6, :remarksscreen7, :createdby, :createdon, :modifiedby, " +
    " :modifiedon, :commentshiftid, :approvedby, :approvedon ",
    nativeQuery = true)
    List<Boiler> InsertDataBoiler(@Param("user") String user, @Param("millcode") String millcode, @Param("boilerdataid") String blowdownautomatic2, 
    @Param("machinemasterid") String machinemasterid, @Param("stationtimereferencemasterid") String stationtimereferencemasterid, 
    @Param("transactiondate") String transactiondate, @Param("superheatersteampressure") String blowdownheaderkiri2, 
    @Param("superheatersteamflow") String blowdownheadersuperheater, @Param("draftdapur") Integer draftdapur, 
    @Param("draftgasbuang") String commentshiftid2, @Param("panelindicator") String createdby, @Param("superheatersteamtemperature") String createdon,
    @Param("upperdrumpressure") Integer upperdrumpressure, @Param("sootblowing") Integer daeratortemperatur2, @Param("daeratortemperatur") Integer daeratortemperatur,
    @Param("daeratorlevelbottom") Integer daeratorlevelbottom, @Param("feedtanktemperatur") Integer feedtanktemperatur, @Param("sightglass") String machinemasterid2,
    @Param("blowdowndrumbawah") String blowdowndrumbawah, @Param("blowdownheaderkiri") String blowdownheaderkiri, @Param("blowdownheaderkanan") String blowdownheaderkanan,
    @Param("blowdownheadersuperheater") Integer panelindicator, @Param("blowdownheaderdepan") String blowdownheaderdepan,
    @Param("blowdownautomatic") String blowdownautomatic, @Param("remarks") String remarks, @Param("statusscreen1") String remarksscreen3, 
    @Param("statusscreen2") String remarksscreen4, @Param("statusscreen3") String remarksscreen5, @Param("statusscreen4") String remarksscreen6, 
    @Param("statusscreen5") String remarksscreen7, @Param("statusscreen6") Integer statusscreen6, @Param("statusscreen7") String sootblowing, 
    @Param("remarksscreen1") String remarksscreen1, @Param("remarksscreen2") Integer statusscreen1, @Param("remarksscreen3") Integer statusscreen2, 
    @Param("remarksscreen4") Integer statusscreen3, @Param("remarksscreen5") Integer statusscreen4, @Param("remarksscreen6") Integer statusscreen5, 
    @Param("remarksscreen7") Integer statusscreen62, @Param("createdby") Integer statusscreen7, @Param("createdon") Integer superheatersteamflow, @Param("modifiedby") Integer superheatersteampressure, 
    @Param("modifiedon") Integer superheatersteamtemperature, @Param("commentshiftid") String commentshiftid, @Param("approvedby") Integer upperdrumpressure2, @Param("approvedon") String approvedon );

    @Query(value = "EXEC dbo.BoilerDataReport :transactiondate, :millcode, :machinemastercode ", nativeQuery = true)
    List<Report[]> DataReportBoiler(@Param("transactiondate") String transactiondate, @Param("millcode") String millcode, @Param("machinemastercode") String machinemastercode);

}
