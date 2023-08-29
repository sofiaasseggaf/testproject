/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.testproject.controller;

import com.test.testproject.model.Konsumen;
import com.test.testproject.service.KonsumenService;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Random;
import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sofia
 */
@Controller
public class KonsumenController {

    Random random = new Random();
    int randomNumber = random.nextInt(100);
        
    @Autowired
    private KonsumenService konsumenService;

    @GetMapping("/input")
    public String inputKonsumen() {
        return "input konsumen";
    }

    @RequestMapping(value = "inputKonsumen", method = RequestMethod.POST)
    public ModelAndView userlogin(@RequestParam("nama") String nama,
            @RequestParam("alamat") String alamat,
            @RequestParam("kota") String kota,
            @RequestParam("provinsi") String provinsi,
            @RequestParam("tgl") String tgl,
            @RequestParam("status") String status,
            Model model, HttpServletResponse res) {

        Konsumen a = new Konsumen(randomNumber, nama, alamat, kota, provinsi, provinsi, status);
        this.konsumenService.addKonsumen(a);
        ModelAndView mView = new ModelAndView("konsumen");
        return mView;

    }

}
