package com.fpt.models.entities.dbo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "[tbip]", catalog = "dbo")
public class Tbip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String namatablet;
    private String ipaddress;
    private String estate;
    private String krani;
    private String nikkra;
    private String team;
    private String category;
    private String status;
    private String estateid;
    private String createdby;
    private String createdon;
    private String modifiedby;
    private String modifiedon;
    private String poac;
    private int viewuser;
    private String vehiclecode;
    private String vehiclecategory;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getNamatablet() {
        return namatablet;
    }
    public void setNamatablet(String namatablet) {
        this.namatablet = namatablet;
    }
    public String getIpaddress() {
        return ipaddress;
    }
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }
    public String getEstate() {
        return estate;
    }
    public void setEstate(String estate) {
        this.estate = estate;
    }
    public String getKrani() {
        return krani;
    }
    public void setKrani(String krani) {
        this.krani = krani;
    }
    public String getNikkra() {
        return nikkra;
    }
    public void setNikkra(String nikkra) {
        this.nikkra = nikkra;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getEstateid() {
        return estateid;
    }
    public void setEstateid(String estateid) {
        this.estateid = estateid;
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
    public String getPoac() {
        return poac;
    }
    public void setPoac(String poac) {
        this.poac = poac;
    }
    public int getViewuser() {
        return viewuser;
    }
    public void setViewuser(int viewuser) {
        this.viewuser = viewuser;
    }
    public String getVehiclecode() {
        return vehiclecode;
    }
    public void setVehiclecode(String vehiclecode) {
        this.vehiclecode = vehiclecode;
    }
    public String getVehiclecategory() {
        return vehiclecategory;
    }
    public void setVehiclecategory(String vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }
    @Override
    public String toString() {
        return "Tbip [Id=" + Id + ", namatablet=" + namatablet + ", ipaddress=" + ipaddress + ", estate=" + estate
                + ", krani=" + krani + ", nikkra=" + nikkra + ", team=" + team + ", category=" + category + ", status="
                + status + ", estateid=" + estateid + ", createdby=" + createdby + ", createdon=" + createdon
                + ", modifiedby=" + modifiedby + ", modifiedon=" + modifiedon + ", poac=" + poac + ", viewuser="
                + viewuser + ", vehiclecode=" + vehiclecode + ", vehiclecategory=" + vehiclecategory + "]";
    }
   
}
