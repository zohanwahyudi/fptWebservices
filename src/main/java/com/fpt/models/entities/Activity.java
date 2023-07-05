package com.fpt.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "[Activitymaster]", catalog ="teda")

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String EstateID;
    private String Sun5Code;
    private String Sun5Desc;
    private int Block;
    private String groupactivity;
    private int FFBActivity;
    private int Tumpukan;
    private String Status;
    private String createdby;
    private String createdon;
    private String modifiedby;
    private String modifiedon;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getEstateID() {
        return EstateID;
    }
    public void setEstateID(String estateID) {
        EstateID = estateID;
    }
    public String getSun5Code() {
        return Sun5Code;
    }
    public void setSun5Code(String sun5Code) {
        Sun5Code = sun5Code;
    }
    public String getSun5Desc() {
        return Sun5Desc;
    }
    public void setSun5Desc(String sun5Desc) {
        Sun5Desc = sun5Desc;
    }
    public int getBlock() {
        return Block;
    }
    public void setBlock(int block) {
        Block = block;
    }
    public String getGroupactivity() {
        return groupactivity;
    }
    public void setGroupactivity(String groupactivity) {
        this.groupactivity = groupactivity;
    }
    public int getFFBActivity() {
        return FFBActivity;
    }
    public void setFFBActivity(int fFBActivity) {
        FFBActivity = fFBActivity;
    }
    public int getTumpukan() {
        return Tumpukan;
    }
    public void setTumpukan(int tumpukan) {
        Tumpukan = tumpukan;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
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
    @Override
    public String toString() {
        return "ActivityMaster [Id=" + Id + ", EstateID=" + EstateID + ", Sun5Code=" + Sun5Code + ", Sun5Desc="
                + Sun5Desc + ", Block=" + Block + ", groupactivity=" + groupactivity + ", FFBActivity=" + FFBActivity
                + ", Tumpukan=" + Tumpukan + ", Status=" + Status + ", createdby=" + createdby + ", createdon="
                + createdon + ", modifiedby=" + modifiedby + ", modifiedon=" + modifiedon + "]";
    }
}
