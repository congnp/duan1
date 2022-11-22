/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.LoaiSP;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class LoaiSPRepository {
    private Session session = Hibernate_Util.getFACTORY().openSession();
    
    private String fromTable = "From LoaiSP";
    
    public List<LoaiSP> getAll(){
        Query query = session.createQuery(fromTable, LoaiSP.class);
        List<LoaiSP> lists = query.getResultList();
        return lists ;
    }
    
    public LoaiSP getOne(UUID id) {
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, LoaiSP.class);
        query.setParameter("id", id);
        LoaiSP loaisp = (LoaiSP) query.getSingleResult();
        return loaisp;
    }
    public Boolean add(LoaiSP loaisp) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(loaisp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public Boolean update(LoaiSP loaisp, Long id) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(loaisp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(LoaiSP loaisp) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(loaisp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public static void main(String[] args) {
        List<LoaiSP> list = new LoaiSPRepository().getAll();
        for (LoaiSP loaisp : list){
            System.out.println(loaisp.toString());
        }
    }
}
