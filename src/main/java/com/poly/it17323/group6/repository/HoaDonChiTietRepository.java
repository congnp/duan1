/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietRepository {
    private Session session = Hibernate_Util.getFACTORY().openSession();
    
    private String fromTable = "From HoaDonChiTiet";
    
    public List<HoaDonChiTiet> getAll(){
        Query query = session.createQuery(fromTable, HoaDonChiTiet.class);
        List<HoaDonChiTiet> lists = query.getResultList();
        return lists ;
    }
    
    public HoaDonChiTiet getOne(Long id) {
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, HoaDonChiTiet.class);
        query.setParameter("id", id);
        HoaDonChiTiet hoadonchitiet = (HoaDonChiTiet) query.getSingleResult();
        return hoadonchitiet;
    }
    public Boolean add(HoaDonChiTiet hoadonchitiet) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoadonchitiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public Boolean update(HoaDonChiTiet hoadonchitiet, Long id) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(hoadonchitiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(HoaDonChiTiet hoadonchitiet) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(hoadonchitiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public static void main(String[] args) {
        List<HoaDonChiTiet> list = new HoaDonChiTietRepository().getAll();
        for (HoaDonChiTiet hoadonchitiet : list){
            System.out.println(hoadonchitiet.toString());
        }
    }
}
