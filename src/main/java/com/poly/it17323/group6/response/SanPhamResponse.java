/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

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
public class SanPhamResponse {
    private String idSP;
    
    private String maSP;
    
    private String tenSP, tinhTrang;

    public SanPhamResponse() {
    }

    public SanPhamResponse(SanPham sanPham) {
        this.idSP = sanPham.getIdSP();
        this.maSP = sanPham.getMaSP();
        this.tenSP = sanPham.getTenSP();
        this.tinhTrang = sanPham.getTinhTrang()+"";
    }
    
    
}
