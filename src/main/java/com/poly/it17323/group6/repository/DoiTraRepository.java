/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.DoiTra;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ThanhNam
 */
public class DoiTraRepository {

    private Session session = Hibernate_Util.getFACTORY().openSession();
    private String fromTable = "From DoiTra";

    public List<DoiTra> getAll() {
        Query query = session.createQuery(fromTable, DoiTra.class);
        List<DoiTra> list = query.getResultList();
        return list;
    }

    public DoiTra getOne(String id) {
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(fromTable, DoiTra.class);
        query.setParameter("id", id);
        DoiTra doiTra = (DoiTra) query.getSingleResult();
        return doiTra;
    }

    public Boolean add(DoiTra doiTra) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.save(doiTra);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(DoiTra doiTra) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.saveOrUpdate(doiTra);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(DoiTra doiTra) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.delete(doiTra);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
     public static void main(String[] args) {
        List<DoiTra> list = new DoiTraRepository().getAll();
        for (DoiTra doiTra : list) {
            System.out.println(doiTra.toString());
        }
    }
}
