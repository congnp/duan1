package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.KhuyenMai;
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
public class KhuyenMaiRepository {

    private Session session;

    private String fromTable = "From KhuyenMai";

    public List<KhuyenMai> getAll() {
        //database b dau 
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, KhuyenMai.class);
        List<KhuyenMai> lists = query.getResultList();
        return lists;
    }

    public List<KhuyenMai> getAllByTT(int tt) {
        //database b dau 
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " WHERE tinhTrang = :tt", KhuyenMai.class);
        query.setParameter("tt", tt);
        List<KhuyenMai> lists = query.getResultList();
        return lists;
    }
    
    public static void main(String[] args) {
        for (KhuyenMai khuyenMai : new KhuyenMaiRepository().getAllByTT(0)) {
            System.out.println(khuyenMai);
        }
    }

    public KhuyenMai getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, KhuyenMai.class);
        query.setParameter("id", id);
        KhuyenMai khuyenmai = (KhuyenMai) query.getSingleResult();
        return khuyenmai;
    }

    public Boolean add(KhuyenMai khuyenmai) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(khuyenmai);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(KhuyenMai khuyenmai) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
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
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(khuyenmai);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<KhuyenMai> get_By_Name(String name) {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " where TenKM like : name", KhuyenMai.class);
        query.setParameter("name", name);
        List<KhuyenMai> list = query.getResultList();
        return list;
    }
}
