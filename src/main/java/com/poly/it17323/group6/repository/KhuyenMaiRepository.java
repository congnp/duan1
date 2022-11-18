/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class KhuyenMaiRepository {
    private Session session = Hibernate_Util.getFACTORY().openSession();
    
    private String fromTable = "From KhuyenMai";
    
    public List<KhuyenMai> getAll(){
        Query query = session.createQuery(fromTable, KhuyenMai.class);
        List<KhuyenMai> lists = query.getResultList();
        return lists ;
    }
    
    public KhuyenMai getOne(Long id) {
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, KhuyenMai.class);
        query.setParameter("id", id);
        KhuyenMai khuyenmai = (KhuyenMai) query.getSingleResult();
        return khuyenmai;
    }
    public Boolean add(KhuyenMai khuyenmai) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(khuyenmai);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public Boolean update(KhuyenMai khuyenmai, Long id) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(khuyenmai);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(KhuyenMai khuyenmai) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(khuyenmai);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public static void main(String[] args) {
        List<KhuyenMai> list = new KhuyenMaiRepository().getAll();
        for (KhuyenMai khuyenmai : list){
            System.out.println(khuyenmai.toString());
        }
    }
}
