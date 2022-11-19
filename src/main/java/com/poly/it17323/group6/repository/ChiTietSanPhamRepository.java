/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.ChatLieu;
import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ThanhNam
 */
public class ChiTietSanPhamRepository {

    private Session session = Hibernate_Util.getFACTORY().openSession();
    private String fromTable = "From ChiTietSanPham";

    public List<ChiTietSanPham> getAll() {
        Query query = session.createQuery(fromTable, ChiTietSanPham.class);
        List<ChiTietSanPham> list = query.getResultList();
        return list;
    }

    public ChiTietSanPham getOne(String id) {
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(fromTable, ChiTietSanPham.class);
        query.setParameter("id", id);
        ChiTietSanPham chiTietSanPham = (ChiTietSanPham) query.getSingleResult();
        return chiTietSanPham;
    }

    public Boolean add(ChiTietSanPham chiTietSanPham) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.save(chiTietSanPham);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(ChiTietSanPham chiTietSanPham) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.saveOrUpdate(chiTietSanPham);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(ChiTietSanPham chiTietSanPham) {
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.delete(chiTietSanPham);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
     public static void main(String[] args) {
        List<ChiTietSanPham> list = new ChiTietSanPhamRepository().getAll();
        for (ChiTietSanPham chiTietSanPham : list) {
            System.out.println(chiTietSanPham.toString());
        }
    }
}
