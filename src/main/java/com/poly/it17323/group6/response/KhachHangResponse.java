/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.KhachHang;
import java.util.UUID;
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
public class KhachHangResponse {
    private UUID idKh;
  
    private String maKh;
    
    private String hoTen;
    
    private String gioiTinh;
    
    private String sdt;
    
    private String diaChi;
    
    private String ngaySinh, ngayTao, ngaySua;

    public KhachHangResponse() {
    }

    public KhachHangResponse(KhachHang kh) {
        this.idKh = kh.getIdKH();
        this.maKh = kh.getMaKH();
        this.hoTen = kh.getHoTen();
        this.gioiTinh = kh.getGioiTinh();
        this.sdt = kh.getSdt();
        this.diaChi = kh.getDiaChi();
        this.ngaySinh = kh.getNgaySinh()+"";
        this.ngayTao = kh.getNgayTao()+"";
        this.ngaySua = kh.getNgaySua()+"";
    }
       
}
