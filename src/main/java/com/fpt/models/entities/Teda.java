package com.fpt.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "[User]", catalog = "teda")

public class Teda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Nama;
    private int NIK;
    private String Username;
    private String Password;
    private String Active;
    private String createdby;
    private String createdon;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public int getNIK() {
        return NIK;
    }
    public void setNIK(int nIK) {
        NIK = nIK;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getActive() {
        return Active;
    }
    public void setActive(String active) {
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
    @Override
    public String toString() {
        return "Teda [Id=" + Id + ", Nama=" + Nama + ", NIK=" + NIK + ", Username=" + Username + ", Password="
                + Password + ", Active=" + Active + ", createdby=" + createdby + ", createdon=" + createdon + "]";
    }
    
}


