package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.MauSac;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import com.poly.it17323.group6.response.NguoiDungReponse;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class NguoiDungRepository {

    private Session session;

    private final String fromTable = "From NguoiDung";

    public List<NguoiDung> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, NguoiDung.class);
        List<NguoiDung> lists = query.getResultList();
        return lists;
    }

    public NguoiDung getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, NguoiDung.class);
        query.setParameter("id", id);
        NguoiDung nguoidung = (NguoiDung) query.getSingleResult();
        return nguoidung;
    }
    
    public NguoiDung getOneND(NguoiDung nd) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE TenTK = :tk AND MatKhau = :mk";
        Query query = session.createQuery(sql, NguoiDung.class);
        query.setParameter("tk", nd.getTenTK());
        query.setParameter("mk", nd.getMatKhau());
        NguoiDung nguoidung = (NguoiDung) query.getSingleResult();
        return nguoidung;
    }

    public Boolean add(NguoiDung nguoidung) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(nguoidung);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(NguoiDung nd) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query q = session.createQuery("UPDATE NguoiDung SET MatKhau = :mk WHERE Email = :email");
            q.setParameter("mk", nd.getMatKhau());
            q.setParameter("email", nd.getEmail());
            q.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            transaction.rollback();
            return null;
        }

    }

    public Boolean update_nd(NguoiDung nguoidung) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(nguoidung);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(NguoiDung nguoidung) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(nguoidung);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
