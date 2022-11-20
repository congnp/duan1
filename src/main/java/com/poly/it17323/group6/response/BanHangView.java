/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.domainmodel.KhachHang;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author pdanh
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BanHangView {

    private ChiTietSanPham ctsp;

    private HoaDon hd;

    private KhachHang kh;

    private HoaDonChiTiet HoaDonChiTiet;

    public BanHangView(HoaDon hd) {
        this.hd = hd;
    }

}
