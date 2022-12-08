package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.domainmodel.Size;
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
public class ChucVuRepository {

    private Session session;

    private final String fromTable = "From ChucVu";

    public List<ChucVu> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, ChucVu.class);
        List<ChucVu> lists = query.getResultList();
        return lists;
    }

    public ChucVu getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, ChucVu.class);
        query.setParameter("id", id);
        ChucVu cv = (ChucVu) query.getSingleResult();
        return cv;
    }
    
    public ChucVu getOneND(String tenCv) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE tenCV = :cv";
        Query query = session.createQuery(sql, ChucVu.class);
        query.setParameter("cv", tenCv);
        ChucVu nguoidung = (ChucVu) query.getSingleResult();
        return nguoidung;
    }

    public Boolean add(ChucVu cv) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(cv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(ChucVu cv) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(cv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(ChucVu cv) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(cv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
