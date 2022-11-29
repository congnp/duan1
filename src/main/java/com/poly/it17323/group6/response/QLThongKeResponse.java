/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.DoiTra;
import com.poly.it17323.group6.domainmodel.HoaDon;
import java.util.UUID;
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
public class QLThongKeResponse {
    private UUID idHoaDon, idDoiTra;
    
    private String maHDDThu,maNDDThu;
    
    private String maHDDTra,maNDDTra;
    
    private String ngayTaoDThu, ngayTaoDTra, tongTienDThu,tongTienDTra;
    
    private String lyDoTra, ngayTra;

    public QLThongKeResponse(DoiTra d) {
        this.idDoiTra = d.getIdDT();
        this.lyDoTra = d.getLyDoDT();
        this.maHDDTra = d.getHoaDon().getMaHD();
        this.maNDDTra = d.getHoaDon().getNguoiDung().getMaND();
        this.ngayTaoDTra = d.getHoaDon().getNgayTao()+"";
        this.ngayTra = d.getNgayDT()+"";
        this.tongTienDTra = d.getHoaDon().getTongTien()+"";
    }

    public QLThongKeResponse(HoaDon h ) {
        this.idHoaDon = h.getIdHD();
        this.maHDDThu = h.getMaHD();
        this.maNDDThu = h.getNguoiDung().getMaND();
        this.ngayTaoDThu = h.getNgayTao()+"";
        this.tongTienDThu = h.getTongTien()+"";
        
    }
    

    

    
    
}
