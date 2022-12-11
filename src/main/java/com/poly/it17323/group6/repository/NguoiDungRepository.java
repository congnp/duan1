package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.MauSac;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import com.poly.it17323.group6.response.NguoiDungReponse;
import com.poly.it17323.group6.response.QLNguoiDungResponse;
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
    
    public static void main(String[] args) {
        List<NguoiDung> list = new NguoiDungRepository().getAll();
        list.forEach(p -> System.out.println(p.toString()));
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
            
        }
        return false;
    }
    
    public Boolean updatePass(QLNguoiDungResponse nd){
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query q = session.createQuery("UPDATE NguoiDung SET MatKhau = :mk WHERE MatKhau = :mk1");
            q.setParameter("mk", nd.getNewPass());
            q.setParameter("mk1", nd.getMatKhau());
            q.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            transaction.rollback();
            
        }
        return false;
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
        return false;
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

    public List<NguoiDung> getByName(String name) {
         session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " where HoVaTen like : name", NguoiDung.class);
        query.setParameter("name", name);
        List<NguoiDung> list = query.getResultList();
        return list;
    }
    public List<NguoiDung> getTT(int tt){
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " WHERE TinhTrang = :tt";
        Query query = session.createQuery(sql, NguoiDung.class);
        query.setParameter("tt", tt); 
        List<NguoiDung> lists = query.getResultList();
        return lists;
    }
}
