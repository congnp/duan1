package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.Anh;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 *
 * @author ThanhNam
 */
public class AnhRepository {

    private Session session;
    private String fromTable = "From Anh";

    public List<Anh> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, Anh.class);
        List<Anh> list = query.getResultList();
        return list;
    }

    public Anh getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(fromTable, Anh.class);
        query.setParameter("id", id);
        Anh anh = (Anh) query.getSingleResult();
        return anh;
    }

    public List<Anh> getAllByIDCTSP(UUID IdCTSP) {
        session = Hibernate_Util.getFACTORY().openSession();
        List<Anh> list = new ArrayList<>();
        Query query = session.createQuery("SELECT h FROM Anh h WHERE h.chiTietSanPham.id = :id");
        query.setParameter("id", IdCTSP);
        list = query.getResultList();
        return list;
    }

    public Boolean add(Anh anh) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.save(anh);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(Anh anh) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.saveOrUpdate(anh);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(Anh anh) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.delete(anh);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
