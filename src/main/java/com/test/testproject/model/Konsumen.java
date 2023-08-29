/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.testproject.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author sofia
 */
@Entity(name = "Konsumen")
@Table
public class Konsumen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 

    private String nama;

    private String alamat;

    private String kota;

    private String provinsi;

    private String tgl_registrasi;
    
    private String status;


    public Konsumen(int id, String nama, String alamat, String kota, String provinsi, String tgl_registrasi, String status) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
        this.provinsi = provinsi;
        this.tgl_registrasi = tgl_registrasi;
        this.status = status;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getTgl_registrasi() {
        return tgl_registrasi;
    }

    public void setTgl_registrasi(String tgl_registrasi) {
        this.tgl_registrasi = tgl_registrasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
}
