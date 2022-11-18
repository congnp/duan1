/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.DoiTra;
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
public class QLThongKeResponse {
    private String maND;
    
    private String lyDoTra;
    
    private String ngayTra;
    
    private String maHD;
    
    private String ngayTao;
    
    private String tongTien;

    public QLThongKeResponse() {
    }

    public QLThongKeResponse(HoaDon hoaDon, DoiTra doiTra) {
        this.maND = hoaDon.getNguoiDung().getMaND();
        this.lyDoTra = doiTra.getLyDoDT();
        this.ngayTra = doiTra.getNgayDT()+"";
        this.maHD = hoaDon.getMaHD();
        this.ngayTao = hoaDon.getNgayTao();
        this.tongTien = hoaDon.getTongTien()+"";
    }
    
    
}
