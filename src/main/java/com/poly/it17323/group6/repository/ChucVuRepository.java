/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ThanhNam
 */
public class ChucVuRepository {

    private Session session = Hibernate_Util.getFACTORY().openSession();
    private String fromTable = "From ChucVu";

    public List<ChucVu> getAll() {
        Query query = session.createQuery(fromTable, ChucVu.class);
        List<ChucVu> list = query.getResultList();
        return list;
    }

    public ChucVu getOne(Integer id) {
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(fromTable, ChucVu.class);
        query.setParameter("id", id);
        ChucVu chucVu = (ChucVu) query.getSingleResult();
        return chucVu;
    }

    public Boolean add(ChucVu chucVu) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.save(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(ChucVu chucVu) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.saveOrUpdate(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(ChucVu chucVu) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.delete(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
     public static void main(String[] args) {
        List<ChucVu> list = new ChucVuRepository().getAll();
        for (ChucVu chucVu : list) {
            System.out.println(chucVu.toString());
        }
    }
}
