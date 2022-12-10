/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Admin
 */
public class ThongKeRepository {

    private Session session;
    private String fromTable = "From HoaDon";

//    public List<Object[]> DoanhThuChart() {
//        session = Hibernate_Util.getFACTORY().openSession();
//        String hql = "SELECT ngayTao, SUM(tongTienMat)+SUM(tongTienCK) "
//                + "FROM HoaDon where tinhTrang = 1 group by ngayTao";
//        org.hibernate.query.Query query = session.createQuery(hql);
//        List<Object[]> result = query.list();
//        return result;
//    }
//    public List<Object[]> NhanVienChart(){
//        session = Hibernate_Util.getFACTORY().openSession();
//        String hql = "SELECT a.nguoiDung.hoTen, SUM(a.tongTienMat)+SUM(a.tongTienCK) "
//                + "as DoanhThu FROM HoaDon a GROUP BY a.nguoiDung.hoTen";
//        org.hibernate.query.Query query = session.createQuery(hql);
//        List<Object[]> result = query.list();
//        return result;
//    }
//    public List<Object[]> SanPhamChart(){
//        session = Hibernate_Util.getFACTORY().openSession();
//        String hql = "SELECT a.chiTietSanPham.sanPham.tenSP, SUM(a.hoaDon.tongTienMat)+SUM(a.hoaDon.tongTienCK) "
//                + "FROM HoaDonChiTiet a GROUP BY a.chiTietSanPham.sanPham.tenSP";
//        org.hibernate.query.Query query = session.createQuery(hql);
//        List<Object[]> result = query.list();
//        return result;
//    }
    public List<Object[]> getThongKeTgian() {
        session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT a.hoaDon.ngayTao, "
                + "a.hoaDon.nguoiDung.maND,a.chiTietSanPham.sanPham.tenSP,"
                + "SUM(a.hoaDon.tongTienMat)+SUM(a.hoaDon.tongTienCK)"
                + "FROM HoaDonChiTiet a where a.hoaDon.tinhTrang = 1 GROUP BY "
                + "a.hoaDon.ngayTao,"
                + "a.hoaDon.nguoiDung.maND,a.chiTietSanPham.sanPham.tenSP ";
        org.hibernate.query.Query query = session.createQuery(hql);
        List<Object[]> result = query.getResultList();
        return result;
    }

    public List<Object[]> getThongKeNV() {
        session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT a.hoaDon.nguoiDung.maND, a.hoaDon.nguoiDung.hoTen, "
                + "COUNT(a.chiTietSanPham.id) AS TongSPBan , "
                + "SUM(a.hoaDon.tongTienMat)+SUM(a.hoaDon.tongTienCK) as LoiNhuan "
                + "FROM HoaDonChiTiet a GROUP BY a.hoaDon.nguoiDung.maND, a.hoaDon.nguoiDung.hoTen";
        org.hibernate.query.Query query = session.createQuery(hql);
        List<Object[]> result = query.list();
        return result;
    }

    public List<Object[]> getThongKeSPham() {
        session = Hibernate_Util.getFACTORY().openSession();
        String hql = """
                     SELECT  a.chiTietSanPham.sanPham.maSP,a.chiTietSanPham.sanPham.tenSP,
                     a.chiTietSanPham.slTon, SUM(a.slMua) AS SoLuongMua, 
                     SUM(a.hoaDon.tongTienMat)+SUM(a.hoaDon.tongTienCK) as LoiNhuan 
                     FROM HoaDonChiTiet a  WHERE a.hoaDon.tinhTrang = 1 
                     GROUP BY a.chiTietSanPham.sanPham.maSP,a.chiTietSanPham.sanPham.tenSP, 
                     a.chiTietSanPham.slTon""";
        org.hibernate.query.Query query = session.createQuery(hql);
        List<Object[]> result = query.list();
        return result;
    }

    public List<BigDecimal> DoanhThu() {
        session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT SUM(tongTienMat)+SUM(tongTienCK) AS TongDoanhThu FROM HoaDon WHERE tinhTrang = 1";
        org.hibernate.query.Query query = session.createQuery(hql);
        List<BigDecimal> result = query.getResultList();
        return result;
    }

    

    // Lấy năm
    public List<Integer> selectYears() {
        Session session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT DISTINCT YEAR(ngayTao) FROM HoaDon ORDER BY YEAR(ngayTao) DESC";
        Query query = session.createQuery(hql);
        List<Integer> result = query.getResultList();
        return result;
    }

    //Lấy tháng
    public List<Integer> selectMonths(int year) {
        Session session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT MONTH(ngayTao) FROM HoaDon WHERE YEAR(ngayTao) = :ngayTao GROUP BY MONTH(ngayTao)";
        Query query = session.createQuery(hql);
        query.setParameter("ngayTao", year);
        List<Integer> result = query.getResultList();
        return result;
    }

    //lấy Số lượng HD Ngày hiện tại
    public List<Integer> getSoHDHienTai() {
        Session session = Hibernate_Util.getFACTORY().openSession();
        String hql = """
                     SELECT COUNT(maHD) FROM HoaDon
                     WHERE ngayTao = CONVERT (date,GETDATE()) and tinhTrang = 1 """;
        Query query = session.createQuery(hql);
        List<Integer> result = query.list();
        return result;
    }
    //Lấy tất cả số hóa đơn
    public List<Integer> getSoHD() {
        Session session = Hibernate_Util.getFACTORY().openSession();
        String hql = """
                     SELECT COUNT(maHD) FROM HoaDon
                     WHERE tinhTrang = 1 """;
        Query query = session.createQuery(hql);
        List<Integer> result = query.list();
        return result;
    }
    //Lấy doanh thu ngày hiện tại
    public List<BigDecimal> getDoanhThuHienTai() {
        session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT SUM(tongTienMat)+SUM(tongTienCK) AS TongDoanhThu FROM HoaDon "
                + "WHERE ngayTao = CONVERT (date,GETDATE()) and tinhTrang = 1";
        org.hibernate.query.Query query = session.createQuery(hql);
        List<BigDecimal> result = query.list();
        return result;
    }

    //Tìm kiếm Doanh Thu
    public List<Object[]> searchThongKe(Date ngayBD,Date ngayKT) {
        session = Hibernate_Util.getFACTORY().openSession();
        String hql = """
                     SELECT a.hoaDon.ngayTao,a.hoaDon.nguoiDung.maND,
                     a.chiTietSanPham.sanPham.tenSP, SUM(a.hoaDon.tongTienMat)+SUM(a.hoaDon.tongTienCK) as DoanhThu,
                     a.hoaDon.nguoiDung.hoTen, 
                     COUNT(a.idHDCT) AS TongSoHD,a.chiTietSanPham.sanPham.maSP,
                     a.chiTietSanPham.slTon, SUM(a.slMua) AS SoLuongMua,a.chiTietSanPham.sanPham.maSP FROM HoaDonChiTiet a 
                     WHERE a.hoaDon.ngayTao BETWEEN :ngayBD and :ngayKT
                     GROUP BY a.hoaDon.ngayTao,a.hoaDon.nguoiDung.maND,a.chiTietSanPham.sanPham.tenSP,
                              a.hoaDon.nguoiDung.hoTen,
                              a.chiTietSanPham.slTon,a.chiTietSanPham.sanPham.maSP""";
        org.hibernate.query.Query query = session.createQuery(hql);
        query.setParameter("ngayBD", ngayBD);
        query.setParameter("ngayKT", ngayKT);
        List<Object[]> result = query.list();
        return result;
    }
    public static void main(String[] args) throws ParseException {

        //System.out.println((new ThongKeRepository().getSoHDHienTai()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Object[]> list = new ThongKeRepository().searchThongKe(sdf.parse("2022-12-03"), sdf.parse("2022-12-09"));
        for (Object[] x : list) {
            System.out.println(x[0] + "" + x[1]+""+x[2]+""+ x[3]+"" + x[4]);
        }
    }
}
