/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.domainmodel.NguoiDung;
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
public class QLNguoiDungResponse {
    private String maND, tenTK, matKhau;
    
    private String hoTen, gioiTinh, ngaySinh, email;
    
    private String sdt, diaChi, cmt_cccd;
    
    private String tinhTrang, ngayTao, ngaySua;
    
    private String  maCV, tenCV;

    public QLNguoiDungResponse() {
    }

    public QLNguoiDungResponse(NguoiDung nguoiDung) {
        this.maND = nguoiDung.getMaND();
        this.tenTK = nguoiDung.getTenTK();
        this.matKhau = nguoiDung.getMatKhau();
        this.hoTen = nguoiDung.getHoTen();
        this.gioiTinh = nguoiDung.getGioiTinh();
        this.ngaySinh = nguoiDung.getNgaySinh()+"";
        this.email = nguoiDung.getEmail();
        this.sdt = nguoiDung.getSdt();
        this.diaChi = nguoiDung.getDiaChi();
        this.cmt_cccd = nguoiDung.getCccd();
        this.tinhTrang = nguoiDung.getTinhTrang()+"";
        this.ngayTao = nguoiDung.getNgayTao()+"";
        this.ngaySua = nguoiDung.getNgaySua()+"";
        this.maCV = nguoiDung.getChucVu().getMaCV();
        this.tenCV = nguoiDung.getChucVu().getTenCV();
    }
    
    
}
