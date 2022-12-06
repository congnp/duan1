/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

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

    private UUID idHoaDon,idND;

    private String maHD, maND;

    private String ngayTao, tongTienck, tongTienMat;
    private String hoTen, maHDnv,ngayTaonv,tongDt;
    public QLThongKeResponse(HoaDon h) {
        this.idHoaDon = h.getIdHD();
        this.maHD = h.getMaHD();
        this.maND = h.getNguoiDung().getMaND();
        this.ngayTao = h.getNgayTao() + "";
        this.tongTienck = h.getTongTienCK()+ "";
        this.tongTienMat = h.getTongTienMat()+"";
        //Tke nhanVien
        this.idND = h.getNguoiDung().getIdND();
        this.maHDnv = h.getMaHD();
        this.hoTen = h.getNguoiDung().getHoTen();
        this.ngayTaonv = h.getNgayTao()+"";
        this.tongDt = h.getTongTienMat()+"";
    }

}
