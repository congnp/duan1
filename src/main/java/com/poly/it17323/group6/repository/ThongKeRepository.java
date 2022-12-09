/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author Admin
 */
public class ThongKeRepository {
    private Session session;
    private String fromTable = "From HoaDon";
    
    public List<Object[]> DoanhThuChart() {
        session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT ngayTao, SUM(tongTienMat)+SUM(tongTienCK) "
                + "FROM HoaDon where tinhTrang = 1  group by ngayTao";
        org.hibernate.query.Query query = session.createQuery(hql);
        List<Object[]> result = query.list();
        return result;
    }
    public List<HoaDon> getAll2() {
        session = Hibernate_Util.getFACTORY().openSession();
        org.hibernate.query.Query query = session.createQuery(fromTable + " a where a.tinhTrang = 1 order by MaHD desc", HoaDon.class);
        List<HoaDon> list = query.getResultList();
        return list;
    }
    public List<HoaDon> DoanhThu() {
        session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT SUM(tongTienMat)+SUM(tongTienCK) AS TongDoanhThu FROM HoaDon WHERE tinhTrang = 1";
        org.hibernate.query.Query query = session.createQuery(hql);
        List<HoaDon> result = query.getResultList();
        return result;
    }

    

    public List<HoaDon> thongKeNVien() {
        session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT nguoiDung.hoTen,a.maHD,a.ngayTao, SUM(a.tongTienMat) AS TongDoanhThu "
                + "FROM HoaDon a where a.tinhTrang = 1 group by a.ngayTao,nguoiDung.hoTen,a.maHD";
        org.hibernate.query.Query query = session.createQuery(hql);
        List<HoaDon> result = query.getResultList();
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println((new ThongKeRepository().getQuantityDate()));
//        List<Object[]> list = new ThongKeRepository().DoanhThuChart();
//        for (Object[] x : list) {
//            System.out.println(x[0] + " " + x[1]);
//        }
    }
    public List<Integer> selectYears(){
        Session session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT DISTINCT YEAR(ngayTao) FROM HoaDon ORDER BY YEAR(ngayTao) DESC";
        Query query = session.createQuery(hql);
        List<Integer> result = query.getResultList();
        return result;  
    }

    public List<Integer> selectMonths(int year){
        Session session = Hibernate_Util.getFACTORY().openSession();
        String hql = "SELECT MONTH(ngayTao) FROM HoaDon WHERE YEAR(ngayTao) = :ngayTao GROUP BY MONTH(ngayTao)";
        Query query = session.createQuery(hql);
        query.setParameter("ngayTao", year);
        List<Integer> result = query.getResultList();
        return result;  
    }
    //lấy Số lượng bán Ngày hiện tại
    public List<Object[]> getQuantityDate(){
        Session session = Hibernate_Util.getFACTORY().openSession();
        String hql = """
                     SELECT SUM(slMua) Quantity FROM HoaDonChiTiet a
                     WHERE YEAR(a.hoaDon.ngayTao) = YEAR(GETDATE()) AND MONTH(NgayTao) = MONTH(GETDATE()) 
                     AND DAY(a.hoaDon.ngayTao) = DAY(GETDATE())""";
        Query query = session.createQuery(hql);
        List<Object[]> result = query.list();
        return result;    
    }
}
