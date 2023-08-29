/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.testproject.dao;

import com.test.testproject.model.Konsumen;
import jakarta.transaction.Transactional;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sofia
 */
@Repository
public class KonsumenDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Transactional
    public List<Konsumen> getAllKonsumen() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Konsumen> konsumenList = session.createQuery("from KONSUMEN").list();
        return konsumenList;
    }

    @Transactional
    public Konsumen saveKonsumen(Konsumen k) {
        this.sessionFactory.getCurrentSession().saveOrUpdate(k);
        System.out.println("User added" + k.getId());
        return k;
    }

}
