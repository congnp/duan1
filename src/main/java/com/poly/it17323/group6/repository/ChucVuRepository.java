
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.ChucVu;
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
    private String fromTable = "From ChucVu";

    public List<ChucVu> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, ChucVu.class);
        List<ChucVu> list = query.getResultList();
        return list;
    }

    public ChucVu getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(fromTable, ChucVu.class);
        query.setParameter("id", id);
        ChucVu chucVu = (ChucVu) query.getSingleResult();
        return chucVu;
    }

    public Boolean add(ChucVu chucVu) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.save(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(ChucVu chucVu) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.saveOrUpdate(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(ChucVu chucVu) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.delete(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
