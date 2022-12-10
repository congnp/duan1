package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.Size;
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
public class SizeRepository {

    private Session session;

    private final String fromTable = "From Size";

    public List<Size> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " ORDER BY ma DESC", Size.class);
        List<Size> lists = query.getResultList();
        return lists;
    }

    public Size getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, Size.class);
        query.setParameter("id", id);
        Size size = (Size) query.getSingleResult();
        return size;
    }

    public List<Size> getOneByTen(String ten) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE ten = :ten";
        Query query = session.createQuery(sql, Size.class);
        query.setParameter("ten", ten);
        List<Size> size = query.getResultList();
        return size;
    }

    public Boolean add(Size size) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(size);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(Size size) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(size);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(Size size) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(size);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
