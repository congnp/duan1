package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ThanhNam
 */
public class ChiTietSanPhamRepository {

    private Session session;
    private final String fromTable = "From ChiTietSanPham";

    public List<ChiTietSanPham> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, ChiTietSanPham.class);
        List<ChiTietSanPham> list = query.getResultList();
        return list;
    }

    public List<ChiTietSanPham> getAll_ByName(String name) {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " a where a.sanPham.tenSP LIKE CONCAT('%',:name,'%')", ChiTietSanPham.class);
        query.setParameter("name", name);
        List<ChiTietSanPham> list = query.getResultList();
        return list;
    }

    public ChiTietSanPham getOne_ByMa(String ma) {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " a where a.sanPham.maSP LIKE :ma", ChiTietSanPham.class);
        query.setParameter("ma", ma);
        ChiTietSanPham chiTietSanPham = (ChiTietSanPham) query.getSingleResult();
        return chiTietSanPham;
    }

    public ChiTietSanPham getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(sql, ChiTietSanPham.class);
        query.setParameter("id", id);
        ChiTietSanPham chiTietSanPham = (ChiTietSanPham) query.getSingleResult();
        return chiTietSanPham;
    }

    public Boolean add(ChiTietSanPham chiTietSanPham) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
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
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
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
        session = Hibernate_Util.getFACTORY().openSession();
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

    public Boolean update(UUID idCTSP, int sl) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            String sql = "UPDATE ChiTietSanPham a SET a.slTon = :sl WHERE a.id = :idCTSP";
            Query query = session.createQuery(sql);
            query.setParameter("idCTSP", idCTSP);
            query.setParameter("sl", sl);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
