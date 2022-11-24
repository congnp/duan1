package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pdanh
 */
public class HoaDonRepository {

    private Session session;
    private String fromTable = "From HoaDon";

    public List<HoaDon> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " order by MaHD desc", HoaDon.class);
        List<HoaDon> list = query.getResultList();
        return list;
    }

    public HoaDon getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(fromTable, HoaDon.class);
        query.setParameter("id", id);
        HoaDon hoaDon = (HoaDon) query.getSingleResult();
        return hoaDon;
    }

    public Boolean add(HoaDon hoaDon) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(HoaDon hoaDon) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(HoaDon hoaDon) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(UUID idHD, BigDecimal ttien, int tt, int pttt) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            String sql = "UPDATE HoaDon a SET a.tongTien = :ttien,a.tinhTrang = :tt,a.pttt = :pttt WHERE a.idHD = :idHD";
            Query query = session.createQuery(sql);
            query.setParameter("idHD", idHD);
            query.setParameter("ttien", ttien);
            query.setParameter("tt", tt);
            query.setParameter("pttt", pttt);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(UUID idHD, KhachHang KH) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            String sql = "UPDATE HoaDon a SET a.khachHang = :KH WHERE a.idHD = :idHD";
            Query query = session.createQuery(sql);
            query.setParameter("idHD", idHD);
            query.setParameter("KH", KH);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
