/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ThanhNam
 */
@Getter
@Setter
@ToString
public class NguoiDungReponse {

    private UUID idCV;
    private String maCV;
    private String tenCV;
    private UUID idND;
    private String maND;
    private String tenTK;
    private String matKhau;
    private String hoVaTen;
    private String gioiTinh;
    private String ngaySinh;
    private String email;
    private String sdt;
    private String diaChi;
    private String cccd;
    private Integer tinhTrang;
    private String ngayTao;
    private String ngaySua;

    public NguoiDungReponse() {
    }

    public NguoiDungReponse(UUID idCV, String maCV, String tenCV) {
        this.idCV = idCV;
        this.maCV = maCV;
        this.tenCV = tenCV;
    }

    public NguoiDungReponse(UUID idND, String maND, String tenTK, String matKhau, String hoVaTen, String gioiTinh, String ngaySinh, String email, String sdt, String diaChi, String cccd, Integer tinhTrang, String ngayTao, String ngaySua, UUID idCV) {
        this.idND = idND;
        this.maND = maND;
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.cccd = cccd;
        this.tinhTrang = tinhTrang;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.idCV = idCV;
    }

}
