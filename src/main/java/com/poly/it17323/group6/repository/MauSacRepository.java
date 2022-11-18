/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.MauSac;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class MauSacRepository {
    private Session session = Hibernate_Util.getFACTORY().openSession();
    
    private String fromTable = "From MauSac";
    
    public List<MauSac> getAll(){
        Query query = session.createQuery(fromTable, MauSac.class);
        List<MauSac> lists = query.getResultList();
        return lists ;
    }
    
    public MauSac getOne(Long id) {
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, MauSac.class);
        query.setParameter("id", id);
        MauSac mausac = (MauSac) query.getSingleResult();
        return mausac;
    }
    public Boolean add(MauSac mausac) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(mausac);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public Boolean update(MauSac mausac, Long id) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(mausac);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(MauSac mausac) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(mausac);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public static void main(String[] args) {
        List<MauSac> list = new MauSacRepository().getAll();
<<<<<<< HEAD
        for (MauSac mausac : list){
            System.out.println(mausac.toString());
=======
        for (MauSac loaisp : list){
            System.out.println(loaisp.toString());
>>>>>>> 9505eb7978d0620d16b6c528d11542c7bbe54916
        }
    }
}
