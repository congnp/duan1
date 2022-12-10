package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.KhachHang;
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
public class KhachHangRepository {

    private Session session;
    private String fromTable = "From KhachHang";

    public List<KhachHang> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable+" order by maKH asc" , KhachHang.class);
        List<KhachHang> lists = query.getResultList();
        return lists;
    }

    public static void main(String[] args) {
        for (KhachHang khachHang : new KhachHangRepository().getAll()) {
            System.out.println(khachHang);
        }
    }

    public KhachHang getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, KhachHang.class);
        query.setParameter("id", id);
        KhachHang khachhang = (KhachHang) query.getSingleResult();
        return khachhang;
    }

    public KhachHang getOneByMa(String ma) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE maKH = :ma";
        Query query = session.createQuery(sql, KhachHang.class);
        query.setParameter("ma", ma);
        KhachHang khachhang = (KhachHang) query.getSingleResult();
        return khachhang;
    }

    public List<KhachHang> getByName(String name) {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " a where a.hoTen LIKE CONCAT('%',:name,'%') order by MaKH asc", KhachHang.class);
        query.setParameter("name", name);
        List<KhachHang> list = query.getResultList();
        return list;
    }

    public Boolean add(KhachHang khachhang) {
        Transaction transaction = null;
        try {
            session = Hibernate_Util.getFACTORY().openSession();
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
        try {
            session = Hibernate_Util.getFACTORY().openSession();
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
            session = Hibernate_Util.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.delete(khachhang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
