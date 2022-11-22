/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author pdanh
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BanhangReponse {

    private NguoiDung nd;
    private KhachHang kh;

    private HoaDonChiTiet hdct;
    private HoaDon hd;
    private ChiTietSanPham ctsp;
    private String slMua;

    // INSERT HOA DON lúc dau
    public BanhangReponse(NguoiDung nd, KhachHang kh) {
        this.nd = nd;
        this.kh = kh;
    }

    // INSERT HDCT
    public BanhangReponse(HoaDon hd, ChiTietSanPham ctsp, String slMua) {
        this.hd = hd;
        this.ctsp = ctsp;
        this.slMua = slMua;
    }

    // UPDATE HDCT
    public BanhangReponse(HoaDonChiTiet hdct, HoaDon hd, ChiTietSanPham ctsp, String slMua) {
        this.hdct = hdct;
        this.hd = hd;
        this.ctsp = ctsp;
        this.slMua = slMua;
    }

    // DELETE HDCT
    public BanhangReponse(HoaDonChiTiet hdct, HoaDon hd, ChiTietSanPham ctsp) {
        this.hdct = hdct;
        this.hd = hd;
        this.ctsp = ctsp;
    }

    // UPDATE CTSP
    public BanhangReponse(ChiTietSanPham ctsp, String slMua) {
        this.ctsp = ctsp;
        this.slMua = slMua;
    }
    
    

}
