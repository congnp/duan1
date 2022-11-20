/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.domainmodel.NguoiDung;
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
  private UUID idND;
  private String idCV;
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

    public NguoiDungReponse(NguoiDung nd) {
        this.idND = nd.getIdND();
        this.idCV = nd.getChucVu().getTenCV();
        this.maND = nd.getMaND();
        this.tenTK = nd.getTenTK();
        this.matKhau = nd.getMatKhau();
        this.hoVaTen = nd.getHoTen();
        this.gioiTinh = nd.getGioiTinh();
        this.ngaySinh = nd.getNgaySinh()+"";
        this.email = nd.getEmail();
        this.sdt = nd.getSdt();
        this.diaChi = nd.getDiaChi();
        this.cccd = nd.getCccd();
        this.tinhTrang = nd.getTinhTrang();
        this.ngayTao = nd.getNgayTao()+"";
        this.ngaySua = nd.getNgaySua()+"";
    }

    public String getCV(ChucVu cv){
        return idCV + cv;
    }
  
}

