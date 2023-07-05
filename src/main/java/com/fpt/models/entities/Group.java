package com.fpt.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "[Groupactivitymaster]", catalog ="teda")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String groupactivity;
    private int Active;
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
    public String getGroupactivity() {
        return groupactivity;
    }
    public void setGroupactivity(String groupactivity) {
        this.groupactivity = groupactivity;
    }
    public int getActive() {
        return Active;
    }
    public void setActive(int active) {
        Active = active;
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
        return "Group [Id=" + Id + ", groupactivity=" + groupactivity + ", Active=" + Active + ", createdby="
                + createdby + ", createdon=" + createdon + ", modifiedby=" + modifiedby + ", modifiedon=" + modifiedon
                + "]";
    }
       
}
