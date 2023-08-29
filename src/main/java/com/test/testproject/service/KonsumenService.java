/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.testproject.service;

import com.test.testproject.dao.KonsumenDao;
import com.test.testproject.model.Konsumen;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofia
 */
@Service
public class KonsumenService {

    @Autowired
    private KonsumenDao konsumenDao;

    public List<Konsumen> getKonsumen() {
        return this.konsumenDao.getAllKonsumen();
    }

    public Konsumen addKonsumen(Konsumen k) {
        return this.konsumenDao.saveKonsumen(k);
    }

}
