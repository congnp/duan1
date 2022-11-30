package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.DoiTra;
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
public class DoiTraRepository {

    private Session session;
    private String fromTable = "From DoiTra";

    public List<DoiTra> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, DoiTra.class);
        List<DoiTra> list = query.getResultList();
        return list;
    }

    public DoiTra getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(fromTable, DoiTra.class);
        query.setParameter("id", id);
        DoiTra doiTra = (DoiTra) query.getSingleResult();
        return doiTra;
    }

    public Boolean add(DoiTra doiTra) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.save(doiTra);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(DoiTra doiTra) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.saveOrUpdate(doiTra);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(DoiTra doiTra) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.delete(doiTra);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
