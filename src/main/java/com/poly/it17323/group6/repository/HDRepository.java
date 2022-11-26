/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ASUS
 */
public class HDRepository {

    private Session session = Hibernate_Util.getFACTORY().openSession();
    private String fromTable = "from HoaDon";

    public List<HoaDon> getAll() {
        Query query = session.createQuery(fromTable, HoaDon.class);
        List<HoaDon> list = query.getResultList();
        return list;
    }

    public Boolean add(HoaDon hoaDon) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.save(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(HoaDon hoadon) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.saveOrUpdate(hoadon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean delete(HoaDon hoaDon) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.delete(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<HoaDon> list = new HDRepository().getAll();
        for (HoaDon hoaDon : list) {
            System.out.println(hoaDon.toString());
        }
    }
}
