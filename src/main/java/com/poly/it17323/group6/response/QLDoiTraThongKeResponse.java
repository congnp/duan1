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
public class QLDoiTraThongKeResponse {
    private String maND;
    
    private String lyDoTra;
    
    private String ngayTra;
    
    private String maHD;
    
    private String ngayTao;
    
    private String tongTien;

    public QLDoiTraThongKeResponse() {
    }

    public QLDoiTraThongKeResponse(DoiTra doiTra) {
        this.maND = doiTra.getHoaDon().getNguoiDung().getMaND();
        this.lyDoTra = doiTra.getLyDoDT();
        this.ngayTra = doiTra.getNgayDT()+"";
        this.maHD =doiTra.getHoaDon().getMaHD();
        this.ngayTao = doiTra.getHoaDon().getNgayTao();
        this.tongTien = doiTra.getHoaDon().getTongTien()+"";
    }
    
    
}
