/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.KhachHang;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
@Getter
@Setter
@ToString
public class QLKhachHangResponse {
    private String maKH;
    
    private String hoTen;
    
    private String gioiTinh;
    
    private String diaChi;
    
    private String sdt;
    
    private String ngaySinh;
    
    private String ngayTao;
    
    private String ngaySua;

    public QLKhachHangResponse() {
    }

    public QLKhachHangResponse(KhachHang khachHang) {
        this.maKH = khachHang.getMaKH();
        this.hoTen = khachHang.getHoTen();
        this.gioiTinh = khachHang.getGioiTinh();
        this.diaChi = khachHang.getDiaChi();
        this.sdt = khachHang.getSdt();
        this.ngaySinh = khachHang.getNgaySinh()+"";
        this.ngayTao = khachHang.getNgayTao()+"";
        this.ngaySua = khachHang.getNgaySua()+"";
    }
    
    
}
