package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.SanPham;
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
public class SanPhamRepository {

    private Session session;

    private final String fromTable = "From SanPham";

    public List<SanPham> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " order by maSP desc", SanPham.class);
        List<SanPham> lists = query.getResultList();
        return lists;
    }

    public SanPham getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, SanPham.class);
        query.setParameter("id", id);
        SanPham sanpham = (SanPham) query.getSingleResult();
        return sanpham;
    }
    
    public List<SanPham> getOneByTen(String tenSP) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE tenSP like :tenSP";
        Query query = session.createQuery(sql, SanPham.class);
        query.setParameter("tenSP", tenSP);
        List<SanPham> sanpham = query.getResultList();
        return sanpham;
    }

    public Boolean add(SanPham sanpham) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(sanpham);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(SanPham sanpham) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(sanpham);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(SanPham sanpham) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(sanpham);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
