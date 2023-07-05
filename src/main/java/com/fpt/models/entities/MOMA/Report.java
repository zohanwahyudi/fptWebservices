package com.fpt.models.entities.MOMA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "[BoilerDataReport()]", catalog = "dbo")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String millname;
    private String fromtime;
    private String totime;
    private String transactiondate;
    private String hari;
    private String machinemasterid;
    private String machinename;
    private Integer superheatersteampressure;
    private Integer superheatersteamtemperature;
    private Integer superheatersteamflow;
    private Integer draftdapur;
    private Integer draftgasbuang;
    private Integer feedtanktemperature;
    private Integer daeratortemperature;
    private Integer daeratorlevelbottom;
    private String drumbawah;
    private String headerkiri;
    private String headerkanan;
    private String headerdepan;
    private String bsuperheater;
    private String bautomatic;
    private Integer upperdrumpressure;
    private Integer panelindicator;
    private Integer sightglass;
    private String sootblowing;
    private String remarksscreen;
    private String documentnumber;
    private String revdate;
    private String opr1shift1;
    private String opr2shift1;
    private String opr3shift1;
    private String opr4shift1;
    private String opr2shift2;
    private String opr3shift2;
    private String opr4shift2;
    private String assisten1shift1;
    private String assisten2shift1;
    private String assisten1shift2;
    private String assisten2shift2;
    private String onassisten1shift1;
    private String onassisten2shift1;
    private String onassisten1shift2;
    private String onassisten2shift2;
    private String shift1assistenapprovalstatus;
    private String shift2assistenapprovalstatus;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getMillname() {
        return millname;
    }
    public void setMillname(String millname) {
        this.millname = millname;
    }
    public String getFromtime() {
        return fromtime;
    }
    public void setFromtime(String fromtime) {
        this.fromtime = fromtime;
    }
    public String getTotime() {
        return totime;
    }
    public void setTotime(String totime) {
        this.totime = totime;
    }
    public String getTransactiondate() {
        return transactiondate;
    }
    public void setTransactiondate(String transactiondate) {
        this.transactiondate = transactiondate;
    }
    public String getHari() {
        return hari;
    }
    public void setHari(String hari) {
        this.hari = hari;
    }
    public String getMachinemasterid() {
        return machinemasterid;
    }
    public void setMachinemasterid(String machinemasterid) {
        this.machinemasterid = machinemasterid;
    }
    public String getMachinename() {
        return machinename;
    }
    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }
    public Integer getSuperheatersteampressure() {
        return superheatersteampressure;
    }
    public void setSuperheatersteampressure(Integer superheatersteampressure) {
        this.superheatersteampressure = superheatersteampressure;
    }
    public Integer getSuperheatersteamtemperature() {
        return superheatersteamtemperature;
    }
    public void setSuperheatersteamtemperature(Integer superheatersteamtemperature) {
        this.superheatersteamtemperature = superheatersteamtemperature;
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
    public Integer getFeedtanktemperature() {
        return feedtanktemperature;
    }
    public void setFeedtanktemperature(Integer feedtanktemperature) {
        this.feedtanktemperature = feedtanktemperature;
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
    public String getDrumbawah() {
        return drumbawah;
    }
    public void setDrumbawah(String drumbawah) {
        this.drumbawah = drumbawah;
    }
    public String getHeaderkiri() {
        return headerkiri;
    }
    public void setHeaderkiri(String headerkiri) {
        this.headerkiri = headerkiri;
    }
    public String getHeaderkanan() {
        return headerkanan;
    }
    public void setHeaderkanan(String headerkanan) {
        this.headerkanan = headerkanan;
    }
    public String getHeaderdepan() {
        return headerdepan;
    }
    public void setHeaderdepan(String headerdepan) {
        this.headerdepan = headerdepan;
    }
    public String getBsuperheater() {
        return bsuperheater;
    }
    public void setBsuperheater(String bsuperheater) {
        this.bsuperheater = bsuperheater;
    }
    public String getBautomatic() {
        return bautomatic;
    }
    public void setBautomatic(String bautomatic) {
        this.bautomatic = bautomatic;
    }
    public Integer getUpperdrumpressure() {
        return upperdrumpressure;
    }
    public void setUpperdrumpressure(Integer upperdrumpressure) {
        this.upperdrumpressure = upperdrumpressure;
    }
    public Integer getPanelindicator() {
        return panelindicator;
    }
    public void setPanelindicator(Integer panelindicator) {
        this.panelindicator = panelindicator;
    }
    public Integer getSightglass() {
        return sightglass;
    }
    public void setSightglass(Integer sightglass) {
        this.sightglass = sightglass;
    }
    public String getSootblowing() {
        return sootblowing;
    }
    public void setSootblowing(String sootblowing) {
        this.sootblowing = sootblowing;
    }
    public String getRemarksscreen() {
        return remarksscreen;
    }
    public void setRemarksscreen(String remarksscreen) {
        this.remarksscreen = remarksscreen;
    }
    public String getDocumentnumber() {
        return documentnumber;
    }
    public void setDocumentnumber(String documentnumber) {
        this.documentnumber = documentnumber;
    }
    public String getRevdate() {
        return revdate;
    }
    public void setRevdate(String revdate) {
        this.revdate = revdate;
    }
    public String getOpr1shift1() {
        return opr1shift1;
    }
    public void setOpr1shift1(String opr1shift1) {
        this.opr1shift1 = opr1shift1;
    }
    public String getOpr2shift1() {
        return opr2shift1;
    }
    public void setOpr2shift1(String opr2shift1) {
        this.opr2shift1 = opr2shift1;
    }
    public String getOpr3shift1() {
        return opr3shift1;
    }
    public void setOpr3shift1(String opr3shift1) {
        this.opr3shift1 = opr3shift1;
    }
    public String getOpr4shift1() {
        return opr4shift1;
    }
    public void setOpr4shift1(String opr4shift1) {
        this.opr4shift1 = opr4shift1;
    }
    public String getOpr2shift2() {
        return opr2shift2;
    }
    public void setOpr2shift2(String opr2shift2) {
        this.opr2shift2 = opr2shift2;
    }
    public String getOpr3shift2() {
        return opr3shift2;
    }
    public void setOpr3shift2(String opr3shift2) {
        this.opr3shift2 = opr3shift2;
    }
    public String getOpr4shift2() {
        return opr4shift2;
    }
    public void setOpr4shift2(String opr4shift2) {
        this.opr4shift2 = opr4shift2;
    }
    public String getAssisten1shift1() {
        return assisten1shift1;
    }
    public void setAssisten1shift1(String assisten1shift1) {
        this.assisten1shift1 = assisten1shift1;
    }
    public String getAssisten2shift1() {
        return assisten2shift1;
    }
    public void setAssisten2shift1(String assisten2shift1) {
        this.assisten2shift1 = assisten2shift1;
    }
    public String getAssisten1shift2() {
        return assisten1shift2;
    }
    public void setAssisten1shift2(String assisten1shift2) {
        this.assisten1shift2 = assisten1shift2;
    }
    public String getAssisten2shift2() {
        return assisten2shift2;
    }
    public void setAssisten2shift2(String assisten2shift2) {
        this.assisten2shift2 = assisten2shift2;
    }
    public String getOnassisten1shift1() {
        return onassisten1shift1;
    }
    public void setOnassisten1shift1(String onassisten1shift1) {
        this.onassisten1shift1 = onassisten1shift1;
    }
    public String getOnassisten2shift1() {
        return onassisten2shift1;
    }
    public void setOnassisten2shift1(String onassisten2shift1) {
        this.onassisten2shift1 = onassisten2shift1;
    }
    public String getOnassisten1shift2() {
        return onassisten1shift2;
    }
    public void setOnassisten1shift2(String onassisten1shift2) {
        this.onassisten1shift2 = onassisten1shift2;
    }
    public String getOnassisten2shift2() {
        return onassisten2shift2;
    }
    public void setOnassisten2shift2(String onassisten2shift2) {
        this.onassisten2shift2 = onassisten2shift2;
    }
    public String getShift1assistenapprovalstatus() {
        return shift1assistenapprovalstatus;
    }
    public void setShift1assistenapprovalstatus(String shift1assistenapprovalstatus) {
        this.shift1assistenapprovalstatus = shift1assistenapprovalstatus;
    }
    public String getShift2assistenapprovalstatus() {
        return shift2assistenapprovalstatus;
    }
    public void setShift2assistenapprovalstatus(String shift2assistenapprovalstatus) {
        this.shift2assistenapprovalstatus = shift2assistenapprovalstatus;
    }
    @Override
    public String toString() {
        return "Report [Id=" + Id + ", millname=" + millname + ", fromtime=" + fromtime + ", totime=" + totime
                + ", transactiondate=" + transactiondate + ", hari=" + hari + ", machinemasterid=" + machinemasterid
                + ", machinename=" + machinename + ", superheatersteampressure=" + superheatersteampressure
                + ", superheatersteamtemperature=" + superheatersteamtemperature + ", superheatersteamflow="
                + superheatersteamflow + ", draftdapur=" + draftdapur + ", draftgasbuang=" + draftgasbuang
                + ", feedtanktemperature=" + feedtanktemperature + ", daeratortemperature=" + daeratortemperature
                + ", daeratorlevelbottom=" + daeratorlevelbottom + ", drumbawah=" + drumbawah + ", headerkiri="
                + headerkiri + ", headerkanan=" + headerkanan + ", headerdepan=" + headerdepan + ", bsuperheater="
                + bsuperheater + ", bautomatic=" + bautomatic + ", upperdrumpressure=" + upperdrumpressure
                + ", panelindicator=" + panelindicator + ", sightglass=" + sightglass + ", sootblowing=" + sootblowing
                + ", remarksscreen=" + remarksscreen + ", documentnumber=" + documentnumber + ", revdate=" + revdate
                + ", opr1shift1=" + opr1shift1 + ", opr2shift1=" + opr2shift1 + ", opr3shift1=" + opr3shift1
                + ", opr4shift1=" + opr4shift1 + ", opr2shift2=" + opr2shift2 + ", opr3shift2=" + opr3shift2
                + ", opr4shift2=" + opr4shift2 + ", assisten1shift1=" + assisten1shift1 + ", assisten2shift1="
                + assisten2shift1 + ", assisten1shift2=" + assisten1shift2 + ", assisten2shift2=" + assisten2shift2
                + ", onassisten1shift1=" + onassisten1shift1 + ", onassisten2shift1=" + onassisten2shift1
                + ", onassisten1shift2=" + onassisten1shift2 + ", onassisten2shift2=" + onassisten2shift2
                + ", shift1assistenapprovalstatus=" + shift1assistenapprovalstatus + ", shift2assistenapprovalstatus="
                + shift2assistenapprovalstatus + "]";
    }
    
}
