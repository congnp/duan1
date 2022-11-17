/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.Anh;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import javax.persistence.Query;
import javax.transaction.Transaction;
import org.hibernate.Session;

/**
 *
 * @author ThanhNam
 */
public class AnhRepository {

    private Session session = Hibernate_Util.getFACTORY().openSession();
    private String fromTable = "From Anh";

    public List<Anh> getAll() {
        Query query = session.createQuery(fromTable, Anh.class);
        List<Anh> list = query.getResultList();
        return list;
    }

    public Anh getOne(Integer id) {
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(fromTable, Anh.class);
        query.setParameter("id", id);
        Anh anh = (Anh) query.getSingleResult();
        return anh;
    }

    public Boolean add(Anh anh) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.save(anh);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(Anh anh) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.saveOrUpdate(anh);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(Anh anh) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.delete(anh);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
