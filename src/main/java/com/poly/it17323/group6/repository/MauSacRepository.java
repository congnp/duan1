package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.MauSac;
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
public class MauSacRepository {

    private Session session;

    private String fromTable = "From MauSac";

    public List<MauSac> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " order by maMS desc", MauSac.class);
        List<MauSac> lists = query.getResultList();
        return lists;
    }

    public MauSac getOne(UUID id) {
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, MauSac.class);
        query.setParameter("id", id);
        MauSac mausac = (MauSac) query.getSingleResult();
        return mausac;
    }

    public List<MauSac> getOneByTen(String ten) {
        String sql = fromTable + " WHERE tenMS like :ten";
        Query query = session.createQuery(sql, MauSac.class);
        query.setParameter("ten", ten);
        List<MauSac> mausac = query.getResultList();
        return mausac;
    }

    public Boolean add(MauSac mausac) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(mausac);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(MauSac mausac) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(mausac);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(MauSac mausac) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(mausac);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
