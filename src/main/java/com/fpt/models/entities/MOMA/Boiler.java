package com.fpt.models.entities.MOMA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "[BoilerDataInsert()]", catalog = "dbo")
public class Boiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String user;
    private String millcode;
    private Integer boilerdataid;
    private String machinemasterid;
    private String stationtimereferencemasterid;
    private String transactiondate;
    private Integer superheatersteampressure;
    private Integer superheatersteamflow;
    private Integer draftdapur;
    private Integer draftgasbuang;
    private Integer panelindicator;
    private Integer superheatersteamtemperature;
    private Integer upperdrumpressure;
    private String sootblowing;
    private Integer daeratortemperature;
    private Integer daeratorlevelbottom;
    private Integer feedtanktemperatur;
    private Integer sightglass;
    private String blowdowndrumbawah;
    private String blowdownheaderkiri;
    private String blowdownheaderkanan;
    private String blowdownheadersuperheater;
    private String blowdownheaderdepan;
    private String blowdownautomatic;
    private String remarks;
    private Integer statusscreen1;
    private Integer statusscreen2;
    private Integer statusscreen3;
    private Integer statusscreen4;
    private Integer statusscreen5;
    private Integer statusscreen6;
    private Integer statusscreen7;
    private String remarksscreen1;
    private String remarksscreen2;
    private String remarksscreen3;
    private String remarksscreen4;
    private String remarksscreen5;
    private String remarksscreen6;
    private String remarksscreen7;
    private String createdby;
    private String createdon;
    private String modifiedby;
    private String modifiedon;
    private String commentshiftid;
    private String approvedby;
    private String approvedon;
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getMillcode() {
        return millcode;
    }
    public void setMillcode(String millcode) {
        this.millcode = millcode;
    }
    public Integer getBoilerdataid() {
        return boilerdataid;
    }
    public void setBoilerdataid(Integer boilerdataid) {
        this.boilerdataid = boilerdataid;
    }
    public String getMachinemasterid() {
        return machinemasterid;
    }
    public void setMachinemasterid(String machinemasterid) {
        this.machinemasterid = machinemasterid;
    }
    public String getStationtimereferencemasterid() {
        return stationtimereferencemasterid;
    }
    public void setStationtimereferencemasterid(String stationtimereferencemasterid) {
        this.stationtimereferencemasterid = stationtimereferencemasterid;
    }
    public String getTransactiondate() {
        return transactiondate;
    }
    public void setTransactiondate(String transactiondate) {
        this.transactiondate = transactiondate;
    }
    public Integer getSuperheatersteampressure() {
        return superheatersteampressure;
    }
    public void setSuperheatersteampressure(Integer superheatersteampressure) {
        this.superheatersteampressure = superheatersteampressure;
    }
    public Integer getSuperheatersteamflow() {
        return superheatersteamflow;
    }
    public void setSuperheatersteamflow(Integer superheatersteamflow) {
        this.superheatersteamflow = superheatersteamflow;
    }
    public Integer getDraftdapur() {
        return draftdapur;
    }
    public void setDraftdapur(Integer draftdapur) {
        this.draftdapur = draftdapur;
    }
    public Integer getDraftgasbuang() {
        return draftgasbuang;
    }
    public void setDraftgasbuang(Integer draftgasbuang) {
        this.draftgasbuang = draftgasbuang;
    }
    public Integer getPanelindicator() {
        return panelindicator;
    }
    public void setPanelindicator(Integer panelindicator) {
        this.panelindicator = panelindicator;
    }
    public Integer getSuperheatersteamtemperature() {
        return superheatersteamtemperature;
    }
    public void setSuperheatersteamtemperature(Integer superheatersteamtemperature) {
        this.superheatersteamtemperature = superheatersteamtemperature;
    }
    public Integer getUpperdrumpressure() {
        return upperdrumpressure;
    }
    public void setUpperdrumpressure(Integer upperdrumpressure) {
        this.upperdrumpressure = upperdrumpressure;
    }
    public String getSootblowing() {
        return sootblowing;
    }
    public void setSootblowing(String sootblowing) {
        this.sootblowing = sootblowing;
    }
    public Integer getDaeratortemperature() {
        return daeratortemperature;
    }
    public void setDaeratortemperature(Integer daeratortemperature) {
        this.daeratortemperature = daeratortemperature;
    }
    public Integer getDaeratorlevelbottom() {
        return daeratorlevelbottom;
    }
    public void setDaeratorlevelbottom(Integer daeratorlevelbottom) {
        this.daeratorlevelbottom = daeratorlevelbottom;
    }
    public Integer getFeedtanktemperatur() {
        return feedtanktemperatur;
    }
    public void setFeedtanktemperatur(Integer feedtanktemperatur) {
        this.feedtanktemperatur = feedtanktemperatur;
    }
    public Integer getSightglass() {
        return sightglass;
    }
    public void setSightglass(Integer sightglass) {
        this.sightglass = sightglass;
    }
    public String getBlowdowndrumbawah() {
        return blowdowndrumbawah;
    }
    public void setBlowdowndrumbawah(String blowdowndrumbawah) {
        this.blowdowndrumbawah = blowdowndrumbawah;
    }
    public String getBlowdownheaderkiri() {
        return blowdownheaderkiri;
    }
    public void setBlowdownheaderkiri(String blowdownheaderkiri) {
        this.blowdownheaderkiri = blowdownheaderkiri;
    }
    public String getBlowdownheaderkanan() {
        return blowdownheaderkanan;
    }
    public void setBlowdownheaderkanan(String blowdownheaderkanan) {
        this.blowdownheaderkanan = blowdownheaderkanan;
    }
    public String getBlowdownheadersuperheater() {
        return blowdownheadersuperheater;
    }
    public void setBlowdownheadersuperheater(String blowdownheadersuperheater) {
        this.blowdownheadersuperheater = blowdownheadersuperheater;
    }
    public String getBlowdownheaderdepan() {
        return blowdownheaderdepan;
    }
    public void setBlowdownheaderdepan(String blowdownheaderdepan) {
        this.blowdownheaderdepan = blowdownheaderdepan;
    }
    public String getBlowdownautomatic() {
        return blowdownautomatic;
    }
    public void setBlowdownautomatic(String blowdownautomatic) {
        this.blowdownautomatic = blowdownautomatic;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public Integer getStatusscreen1() {
        return statusscreen1;
    }
    public void setStatusscreen1(Integer statusscreen1) {
        this.statusscreen1 = statusscreen1;
    }
    public Integer getStatusscreen2() {
        return statusscreen2;
    }
    public void setStatusscreen2(Integer statusscreen2) {
        this.statusscreen2 = statusscreen2;
    }
    public Integer getStatusscreen3() {
        return statusscreen3;
    }
    public void setStatusscreen3(Integer statusscreen3) {
        this.statusscreen3 = statusscreen3;
    }
    public Integer getStatusscreen4() {
        return statusscreen4;
    }
    public void setStatusscreen4(Integer statusscreen4) {
        this.statusscreen4 = statusscreen4;
    }
    public Integer getStatusscreen5() {
        return statusscreen5;
    }
    public void setStatusscreen5(Integer statusscreen5) {
        this.statusscreen5 = statusscreen5;
    }
    public Integer getStatusscreen6() {
        return statusscreen6;
    }
    public void setStatusscreen6(Integer statusscreen6) {
        this.statusscreen6 = statusscreen6;
    }
    public Integer getStatusscreen7() {
        return statusscreen7;
    }
    public void setStatusscreen7(Integer statusscreen7) {
        this.statusscreen7 = statusscreen7;
    }
    public String getRemarksscreen1() {
        return remarksscreen1;
    }
    public void setRemarksscreen1(String remarksscreen1) {
        this.remarksscreen1 = remarksscreen1;
    }
    public String getRemarksscreen2() {
        return remarksscreen2;
    }
    public void setRemarksscreen2(String remarksscreen2) {
        this.remarksscreen2 = remarksscreen2;
    }
    public String getRemarksscreen3() {
        return remarksscreen3;
    }
    public void setRemarksscreen3(String remarksscreen3) {
        this.remarksscreen3 = remarksscreen3;
    }
    public String getRemarksscreen4() {
        return remarksscreen4;
    }
    public void setRemarksscreen4(String remarksscreen4) {
        this.remarksscreen4 = remarksscreen4;
    }
    public String getRemarksscreen5() {
        return remarksscreen5;
    }
    public void setRemarksscreen5(String remarksscreen5) {
        this.remarksscreen5 = remarksscreen5;
    }
    public String getRemarksscreen6() {
        return remarksscreen6;
    }
    public void setRemarksscreen6(String remarksscreen6) {
        this.remarksscreen6 = remarksscreen6;
    }
    public String getRemarksscreen7() {
        return remarksscreen7;
    }
    public void setRemarksscreen7(String remarksscreen7) {
        this.remarksscreen7 = remarksscreen7;
    }
    public String getCreatedby() {
        return createdby;
    }
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
    public String getCreatedon() {
        return createdon;
    }
    public void setCreatedon(String createdon) {
        this.createdon = createdon;
    }
    public String getModifiedby() {
        return modifiedby;
    }
    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }
    public String getModifiedon() {
        return modifiedon;
    }
    public void setModifiedon(String modifiedon) {
        this.modifiedon = modifiedon;
    }
    public String getCommentshiftid() {
        return commentshiftid;
    }
    public void setCommentshiftid(String commentshiftid) {
        this.commentshiftid = commentshiftid;
    }
    public String getApprovedby() {
        return approvedby;
    }
    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }
    public String getApprovedon() {
        return approvedon;
    }
    public void setApprovedon(String approvedon) {
        this.approvedon = approvedon;
    }
    @Override
    public String toString() {
        return "Boiler [Id=" + Id + ", user=" + user + ", millcode=" + millcode + ", boilerdataid=" + boilerdataid
                + ", machinemasterid=" + machinemasterid + ", stationtimereferencemasterid="
                + stationtimereferencemasterid + ", transactiondate=" + transactiondate + ", superheatersteampressure="
                + superheatersteampressure + ", superheatersteamflow=" + superheatersteamflow + ", draftdapur="
                + draftdapur + ", draftgasbuang=" + draftgasbuang + ", panelindicator=" + panelindicator
                + ", superheatersteamtemperature=" + superheatersteamtemperature + ", upperdrumpressure="
                + upperdrumpressure + ", sootblowing=" + sootblowing + ", daeratortemperature=" + daeratortemperature
                + ", daeratorlevelbottom=" + daeratorlevelbottom + ", feedtanktemperatur=" + feedtanktemperatur
                + ", sightglass=" + sightglass + ", blowdowndrumbawah=" + blowdowndrumbawah + ", blowdownheaderkiri="
                + blowdownheaderkiri + ", blowdownheaderkanan=" + blowdownheaderkanan + ", blowdownheadersuperheater="
                + blowdownheadersuperheater + ", blowdownheaderdepan=" + blowdownheaderdepan + ", blowdownautomatic="
                + blowdownautomatic + ", remarks=" + remarks + ", statusscreen1=" + statusscreen1 + ", statusscreen2="
                + statusscreen2 + ", statusscreen3=" + statusscreen3 + ", statusscreen4=" + statusscreen4
                + ", statusscreen5=" + statusscreen5 + ", statusscreen6=" + statusscreen6 + ", statusscreen7="
                + statusscreen7 + ", remarksscreen1=" + remarksscreen1 + ", remarksscreen2=" + remarksscreen2
                + ", remarksscreen3=" + remarksscreen3 + ", remarksscreen4=" + remarksscreen4 + ", remarksscreen5="
                + remarksscreen5 + ", remarksscreen6=" + remarksscreen6 + ", remarksscreen7=" + remarksscreen7
                + ", createdby=" + createdby + ", createdon=" + createdon + ", modifiedby=" + modifiedby
                + ", modifiedon=" + modifiedon + ", commentshiftid=" + commentshiftid + ", approvedby=" + approvedby
                + ", approvedon=" + approvedon + "]";
    }
    
    
}
