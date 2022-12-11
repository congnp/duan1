package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.math.BigDecimal;
import java.sql.Date;
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

    //TÌM KIẾM TỔNG TIỀN
    public List<Object[]> searchTien(BigDecimal tien1, BigDecimal tien2) {
        session = Hibernate_Util.getFACTORY().openSession();
        String hql = """
                     SELECT a.maHD, a.nguoiDung.maND, a.khachHang.hoTen, a.pttt, a.tinhTrang, 
                     SUM(a.tongTienMat),SUM(a.tongTienCK) AS TongDoanhThu,a.ngayTao, 
                     a.tienShip FROM HoaDon a 
                     group by a.maHD, a.nguoiDung.maND, a.khachHang.hoTen, a.pttt, a.tinhTrang, 
                     a.ngayTao, a.tienShip
                     HAVING SUM(a.tongTienMat)+SUM(a.tongTienCK) between :tien1 and :tien2""";
        org.hibernate.query.Query query = session.createQuery(hql);
        query.setParameter("tien1", tien1);
        query.setParameter("tien2", tien2);
        List<Object[]> result = query.list();
        return result;
    }

    //TÌM KIẾM NGÀY THÁNG
    public List<Object[]> searchNgay(java.util.Date ngayBD, java.util.Date ngayKT) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = """
                     SELECT a.maHD, a.nguoiDung.maND, a.khachHang.hoTen, a.pttt, a.tinhTrang, 
                     SUM(a.tongTienMat),SUM(a.tongTienCK) AS TongDoanhThu,a.ngayTao, 
                     a.tienShip FROM HoaDon a WHERE a.ngayTao between :ngayBD and :ngayKT
                     group by a.maHD, a.nguoiDung.maND, a.khachHang.hoTen, a.pttt, a.tinhTrang, 
                     a.ngayTao, a.tienShip""";
        Query query = session.createQuery(sql);
        query.setParameter("ngayBD", ngayBD);
        query.setParameter("ngayKT", ngayKT);
        List<Object[]> list = query.getResultList();
        return list;
    }
    //TÌM KIẾM TINH TRẠNG TTOAN
    public List<HoaDon> searchTTTT(int ttrang) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " a WHERE a.tinhTrang = :tinhTrang";   
        Query query = session.createQuery(sql, HoaDon.class);
        query.setParameter("tinhTrang", ttrang);
        List<HoaDon> list = query.getResultList();
        return list;
    }
    //TÌM KIẾM HT TTOAN
    public List<HoaDon> searchHTTT(int ttrang) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " a WHERE a.pttt = :tinhTrang";   
        Query query = session.createQuery(sql, HoaDon.class);
        query.setParameter("tinhTrang", ttrang);
        List<HoaDon> list = query.getResultList();
        return list;
    }
    public List<HoaDon> getByMa2(String ma) {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " a where a.maHD LIKE CONCAT('%',:ma,'%')", HoaDon.class);
        query.setParameter("ma", ma);
        List<HoaDon> hoaDon = query.getResultList();
        return hoaDon;
    }
    public List<HoaDon> getAll_ByTT(int tt) {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " a where a.tinhTrang = :tt order by MaHD desc", HoaDon.class);
        query.setParameter("tt", tt);
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

    public HoaDon getOne_ByMa(String ma) {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " a where a.maHD LIKE :ma", HoaDon.class);
        query.setParameter("ma", ma);
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

    public Boolean delete(UUID idHD) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            String querString = "DELETE FROM HoaDon a where a.idHD = :idHD";
            Query query = session.createQuery(querString);
            query.setParameter("idHD", idHD);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(UUID idHD, int pttt, BigDecimal ttienMat, BigDecimal ttienCk, int tt) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            String sql = "UPDATE HoaDon a "
                    + "SET a.pttt = :pttt,a.tongTienMat = :ttienMat,a.tongTienCK = :ttienCk,a.tinhTrang = :tt"
                    + " WHERE a.idHD = :idHD";
            Query query = session.createQuery(sql);
            query.setParameter("idHD", idHD);
            query.setParameter("ttienMat", ttienMat);
            query.setParameter("ttienCk", ttienCk);
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

    public Boolean update(UUID idHD, int pttt, BigDecimal ttienMat, BigDecimal ttienCK, int tt, Date ngayTT, int tttt, Date ngayMuonNhan, Date ngayGui, Date ngayNhan, BigDecimal tship) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            String sql = "UPDATE HoaDon a "
                    + "SET a.pttt = :pttt,a.tongTienMat = :ttienMat,a.tongTienCK = :ttienCK,a.tinhTrang = :tt,"
                    + "a.ngayTT = :ngayTT, a.tttt = :tttt,a.ngayMuonNhan = :ngayMuonNhan,"
                    + "a.ngayGui = :ngayGui,a.ngayNhan = :ngayNhan,a.tienShip = :tship "
                    + " WHERE a.idHD = :idHD";
            Query query = session.createQuery(sql);
            query.setParameter("pttt", pttt);
            query.setParameter("ttienMat", ttienMat);
            query.setParameter("ttienCK", ttienCK);
            query.setParameter("tt", tt);
            query.setParameter("ngayTT", ngayTT);
            query.setParameter("tttt", tttt);
            query.setParameter("ngayMuonNhan", ngayMuonNhan);
            query.setParameter("ngayGui", ngayGui);
            query.setParameter("ngayNhan", ngayNhan);
            query.setParameter("tship", tship);
            query.setParameter("idHD", idHD);
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
