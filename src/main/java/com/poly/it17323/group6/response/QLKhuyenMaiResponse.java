/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.KhuyenMai;
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
public class QLKhuyenMaiResponse {
    private String maKM;
    
    private String tenKm;
    
    private String giamGia;
    
    private String moTa;
    
    private String ngayBatDau;
    
    private String ngayKetThuc;
    
    private String ngayTao;
    
    private String ngaySua;
    
    private String tinhTrang;

    public QLKhuyenMaiResponse() {
    }

    public QLKhuyenMaiResponse(KhuyenMai km) {
        this.maKM = km.getMaKM();
        this.tenKm = km.getTenKM();
        this.giamGia = km.getGiamGia()+"";
        this.moTa = km.getMoTa();
        this.ngayBatDau = km.getNgayBD()+"";
        this.ngayKetThuc = km.getNgayKT()+"";
        this.ngayTao = km.getNgayTao()+"";
        this.ngaySua = km.getNgaySua()+"";
        this.tinhTrang = km.getTinhTrang()+"";
    }
    
//    
}
