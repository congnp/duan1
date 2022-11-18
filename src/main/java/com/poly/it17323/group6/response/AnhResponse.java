/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.Anh;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class AnhResponse {
    private String idAnh;
    
    private String maAnh;
    
    private String tenAnh;
    
    private String tenSP, duongDanAnh;

    public AnhResponse(Anh anh) {
        this.idAnh = anh.getIdAnh();
        this.maAnh = anh.getMaAnh();
        this.tenAnh = anh.getTenAnh();
        this.tenSP = anh.getChiTietSanPham().getSanPham().getTenSP();
        this.duongDanAnh = anh.getLinkAnh();
    }
    
    
}
