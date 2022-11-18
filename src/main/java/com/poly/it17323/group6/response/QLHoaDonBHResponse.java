/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.HoaDon;
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
public class QLHoaDonBHResponse {
    private String maHoaDon;
    
    private String maND;
    
    private String ngayTao;
    
    private String tinhTrangHoaDon;
    
    private String tenKH, sdt;
    
    private String tenND, tongTien, phuongThucTT;

    public QLHoaDonBHResponse() {
    }

    public QLHoaDonBHResponse(HoaDon hd) {
        this.maHoaDon = hd.getMaHD();
        this.maND = hd.getNguoiDung().getMaND();
        this.ngayTao = hd.getNgayTao();
        this.tinhTrangHoaDon = hd.getTinhTrang()+"";
        this.tenKH = hd.getKhachHang().getHoTen();
        this.sdt = hd.getKhachHang().getSdt();
        this.tenND = hd.getNguoiDung().getHoTen();
        this.tongTien = hd.getTongTien()+"";
        this.phuongThucTT = hd.getPttt()+"";
    }
    
    
}
