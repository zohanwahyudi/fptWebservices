package com.fpt.models.entities.dbo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "[DownloadLog]", catalog = "dbo")
public class Downloadlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String estateid;
    private String tabletname;
    private String ip;
    private int flag;
    private String timestamp;
    private String createdby;
    private String createdon;
    private String modifiedon;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getEstateid() {
        return estateid;
    }
    public void setEstateid(String estateid) {
        this.estateid = estateid;
    }
    public String getTabletname() {
        return tabletname;
    }
    public void setTabletname(String tabletname) {
        this.tabletname = tabletname;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public int getFlag() {
        return flag;
    }
    public void setFlag(int flag) {
        this.flag = flag;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
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
    public String getModifiedon() {
        return modifiedon;
    }
    public void setModifiedon(String modifiedon) {
        this.modifiedon = modifiedon;
    }
    @Override
    public String toString() {
        return "Downloadlog [ID=" + ID + ", estateid=" + estateid + ", tabletname=" + tabletname + ", ip=" + ip
                + ", flag=" + flag + ", timestamp=" + timestamp + ", createdby=" + createdby + ", createdon="
                + createdon + ", modifiedon=" + modifiedon + "]";
    }    
}
