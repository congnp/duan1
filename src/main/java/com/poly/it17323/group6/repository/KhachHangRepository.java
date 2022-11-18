/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;


import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class KhachHangRepository {
    private Session session = Hibernate_Util.getFACTORY().openSession();
    
    private String fromTable = "From KhachHang";
    
    public List<KhachHang> getAll(){
        Query query = session.createQuery(fromTable, KhachHang.class);
        List<KhachHang> lists = query.getResultList();
        return lists ;
    }
    
    public KhachHang getOne(Long id) {
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, KhachHang.class);
        query.setParameter("id", id);
        KhachHang khachhang = (KhachHang) query.getSingleResult();
        return khachhang;
    }
    public Boolean add(KhachHang khachhang) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(khachhang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public Boolean update(KhachHang khachhang, Long id) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
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
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
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
        List<KhachHang> list = new KhachHangRepository().getAll();
        for (KhachHang khachhang : list){
            System.out.println(khachhang.toString());
        }
    }
}
