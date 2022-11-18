/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.SanPham;
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
public class QLSanPhamResponse {
    private String TenSP, loaiSp, chatLieu, size;
    
    private String mauSac, soLuongTon, gia, moTa;
    
    private String tinhTrang, ngayTao, ngaySua;
    
    private String maSp;

    public QLSanPhamResponse() {
    }

    public QLSanPhamResponse(ChiTietSanPham chiTietSP, SanPham sanPham) {
        this.TenSP = sanPham.getTenSP();
        this.loaiSp = chiTietSP.getLoaiSP().getTen();
        this.chatLieu = chiTietSP.getChatLieu().getTenCL();
        this.size = chiTietSP.getSize().getTen();
        this.mauSac = chiTietSP.getMauSac().getTenMS();
        this.soLuongTon = chiTietSP.getSlTon()+"";
        this.gia = chiTietSP.getGia()+"";
        this.moTa = chiTietSP.getMoTa();
        this.tinhTrang = chiTietSP.getTinhTrang()+"";
        this.ngayTao = chiTietSP.getNgayTao()+"";
        this.ngaySua = chiTietSP.getNgaySua()+"";
        this.maSp = sanPham.getMaSP();
    }
    
    
}
