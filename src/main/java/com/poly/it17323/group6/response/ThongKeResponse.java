/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Admin
 */

public class ThongKeResponse {
    private BigDecimal tong;
    
    private Date ngayTao;

    private String maHD;
    private String maND, tenSP, tenNV;
    private String maSP;
    private int soLuongTon, soLuongBan;

    public ThongKeResponse(BigDecimal tong, Date ngayTao, String maHD, String maND, String tenSP, String tenNV, String maSP, int soLuongTon, int soLuongBan) {
        this.tong = tong;
        this.ngayTao = ngayTao;
        this.maHD = maHD;
        this.maND = maND;
        this.tenSP = tenSP;
        this.tenNV = tenNV;
        this.maSP = maSP;
        this.soLuongTon = soLuongTon;
        this.soLuongBan = soLuongBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }
    

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }
    
    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    
    public ThongKeResponse() {
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }
    
    public BigDecimal getTong() {
        return tong;
    }

    public void setTong(BigDecimal tong) {
        this.tong = tong;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
    
}
