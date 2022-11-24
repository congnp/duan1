/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.sql.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class KhachHangRepository {

    

    private String fromTable = "From KhachHang";

    public List<KhachHang> getAll() {
        Session session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, KhachHang.class);
        List<KhachHang> lists = query.getResultList();
        return lists;
    }

    public KhachHang getOne(UUID id) {
        Session session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, KhachHang.class);
        query.setParameter("id", id);
        KhachHang khachhang = (KhachHang) query.getSingleResult();
        return khachhang;
    }
//    public KhachHang getByMa(String ma){
//        String sql = fromTable + " WHERE MaKH = :MaKH";
//        Query query = session.createQuery(sql, KhachHang.class);
//        query.setParameter("MaKH", ma);
//        KhachHang khachhang = (KhachHang) query.getSingleResult();
//        return khachhang;
//    }
    public Boolean add(KhachHang khachhang) {
        Transaction transaction = null;
        
        try{
            Session session = Hibernate_Util.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.save(khachhang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(KhachHang khachhang) {
        Transaction transaction = null;
        
        try{
            Session session = Hibernate_Util.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(khachhang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(KhachHang khachhang) {
        Transaction transaction = null;
        
        try {
            Session session = Hibernate_Util.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.delete(khachhang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    } 

    public static void main(String[] args) {
         KhachHangRepository kh = new KhachHangRepository();
         KhachHang k = kh.getAll().get(0);
         
         kh.update(new KhachHang(k.getIdKH(), k.getMaKH(), "Bui Quynh A", k.getGioiTinh(), k.getDiaChi(), k.getSdt(),null, null, null));
    }
}
