package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
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
public class HoaDonChiTietRepository {

    private Session session;

    private final String fromTable = "From HoaDonChiTiet";

    public List<HoaDonChiTiet> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, HoaDonChiTiet.class);
        List<HoaDonChiTiet> lists = query.getResultList();
        return lists;
    }

    public HoaDonChiTiet getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, HoaDonChiTiet.class);
        query.setParameter("id", id);
        HoaDonChiTiet hoadonchitiet = (HoaDonChiTiet) query.getSingleResult();
        return hoadonchitiet;
    }

    public List<HoaDonChiTiet> getAllByIDHD(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE IdHD = :id";
        Query query = session.createQuery(sql, HoaDonChiTiet.class);
        query.setParameter("id", id);
        List<HoaDonChiTiet> lstDHCT = query.getResultList();
        return lstDHCT;
    }

    public Boolean add(HoaDonChiTiet hoadonchitiet) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(hoadonchitiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(HoaDonChiTiet hoadonchitiet) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
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
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(hoadonchitiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
