/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
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
public class QLHoaDonChiTietResponse {
    private String tenSp, loaiSp, chatLieu, size;
    
    private String mauSac, soLuongMua, giaTien, giamGia, giaSauKm;

    public QLHoaDonChiTietResponse() {
    }

    public QLHoaDonChiTietResponse(HoaDonChiTiet hdct) {
        this.tenSp = hdct.getChiTietSanPham().getSanPham().getTenSP();
        this.loaiSp = hdct.getChiTietSanPham().getLoaiSP().getTen();
        this.chatLieu = hdct.getChiTietSanPham().getChatLieu().getTenCL();
        this.size = hdct.getChiTietSanPham().getChatLieu().getTenCL();
        this.mauSac = hdct.getChiTietSanPham().getMauSac().getTenMS();
        this.soLuongMua = hdct.getSlMua()+"";
        this.giaTien = hdct.getGia()+"";
        this.giamGia = hdct.getKhuyenMai().getGiamGia()+"";
        this.giaSauKm = hdct.getGiaKM()+"";
    }
    
    
}
