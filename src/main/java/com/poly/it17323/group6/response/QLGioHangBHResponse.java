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
public class QLGioHangBHResponse {

    private String maSP, tenSP, soLuongMua;

    private String donGia, giamGia;

    private String tinhTrang;

    public QLGioHangBHResponse() {
    }

    public QLGioHangBHResponse(HoaDonChiTiet hdct) {
        this.maSP = hdct.getChiTietSanPham().getSanPham().getMaSP();
        this.tenSP = hdct.getChiTietSanPham().getSanPham().getTenSP();
        this.soLuongMua = hdct.getSlMua()+"";
        this.donGia = hdct.getGia()+"";
        this.giamGia = hdct.getKhuyenMai().getGiamGia()+"";
        this.tinhTrang = hdct.getKhuyenMai().getTinhTrang()+"";
    }

}
