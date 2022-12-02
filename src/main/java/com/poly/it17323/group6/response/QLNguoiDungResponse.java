/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import java.util.UUID;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@NoArgsConstructor
public class QLNguoiDungResponse {

    private UUID idND;

    private String maND, hoTen, gioiTinh, tinhTrang, ngayTao;

    private String tenTK, matKhau, ngaySinh, ngaySua;

    private String email;

    private String maCV, tenCV, newPass, conFirm, sdt, diaChi, cmt_cccd;

    private ChucVu cv;

    public QLNguoiDungResponse(NguoiDung nguoiDung) {
        this.idND = nguoiDung.getIdND();
        this.maND = nguoiDung.getMaND();
        this.tenTK = nguoiDung.getTenTK();
        this.matKhau = nguoiDung.getMatKhau();
        this.hoTen = nguoiDung.getHoTen();
        this.gioiTinh = nguoiDung.getGioiTinh();
        this.ngaySinh = nguoiDung.getNgaySinh() + "";
        this.email = nguoiDung.getEmail();
        this.sdt = nguoiDung.getSdt();
        this.diaChi = nguoiDung.getDiaChi();
        this.cmt_cccd = nguoiDung.getCccd();
        this.tinhTrang = nguoiDung.getTinhTrang() + "";
        this.ngayTao = nguoiDung.getNgayTao() + "";
        this.ngaySua = nguoiDung.getNgaySua() + "";
        this.maCV = nguoiDung.getChucVu().getMaCV();
        this.tenCV = nguoiDung.getChucVu().getTenCV();
        this.cv = nguoiDung.getChucVu();
    }

    public QLNguoiDungResponse(String email) {
        this.email = email;
    }

    public QLNguoiDungResponse(String tenTK, String matKhau) {
        this.tenTK = tenTK;
        this.matKhau = matKhau;

    }

    public QLNguoiDungResponse(String matKhau, String newPass, String conFirm) {
        this.matKhau = matKhau;
        this.newPass = newPass;
        this.conFirm = conFirm;
    }

//    public static String getEmail() {
//        return email;
//    }
//
//    public static void setEmail(String email) {
//        QLNguoiDungResponse.email = email;
//    }

//    public static String getMatKhau() {
//        return matKhau;
//    }
//
//    public static void setMatKhau(String matKhau) {
//        QLNguoiDungResponse.matKhau = matKhau;
//    }
    
    

}
