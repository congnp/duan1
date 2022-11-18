/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.LoaiSP;
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
public class LoaiSPResponse {
    private String idLoaiSP;
    
    private String maLoaiSP;
    
    private String tenLoaiSP, tinhTrang;

    public LoaiSPResponse(LoaiSP loaiSp) {
        this.idLoaiSP = loaiSp.getId();
        this.maLoaiSP = loaiSp.getMa();
        this.tenLoaiSP = loaiSp.getTen();
        this.tinhTrang = loaiSp.getTinhTrang()+"";
    }
    
    
}
