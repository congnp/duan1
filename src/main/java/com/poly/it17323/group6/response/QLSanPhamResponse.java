/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChatLieu;
import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.LoaiSP;
import com.poly.it17323.group6.domainmodel.MauSac;
import com.poly.it17323.group6.domainmodel.SanPham;
import com.poly.it17323.group6.domainmodel.Size;
import java.util.UUID;
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
public class QLSanPhamResponse {
    private UUID Id;
    private UUID IdSP;
    private String MaSP, TenSP,TinhTrangSP;
    private UUID IdLoaiSP;
    private String  MaLoaiSP, TenLoaiSP,TinhTrangLoaiSP;
    private UUID IdChatLieu;
    private String MaChatLieu, TenChatLieu;
    private UUID IdMauSac;
    private String MaMauSac, TenMauSac;
    private UUID IdSize;
    private String MaSize, TenSize;
    private String SLTon, Gia, MoTa, TinhTrang, NgayTao, NgaySua;

    public QLSanPhamResponse() {
    }

    public QLSanPhamResponse(SanPham sp) {
        this.IdSP = sp.getIdSP();
        this.MaSP = sp.getMaSP();
        this.TenSP = sp.getTenSP();
        this.TinhTrangSP = sp.getTinhTrang()+"";
    }

    public QLSanPhamResponse(LoaiSP loaisp) {
        this.IdLoaiSP = loaisp.getId();
        this.MaLoaiSP = loaisp.getMa();
        this.TenLoaiSP = loaisp.getTen();
        this.TinhTrangLoaiSP = loaisp.getTinhTrang()+"";
    }

    public QLSanPhamResponse(ChatLieu cl) {
        this.IdChatLieu = cl.getIdCL();
        this.MaChatLieu = cl.getMaCL();
        this.TenChatLieu = cl.getTenCL();
    }

    public QLSanPhamResponse(MauSac ms) {
        this.IdMauSac = ms.getIdMS();
        this.MaMauSac = ms.getMaMS();
        this.TenMauSac = ms.getTenMS();
    }

    public QLSanPhamResponse(Size s) {
        this.IdSize = s.getId();
        this.MaSize = s.getMa();
        this.TenSize = s.getTen();
    }

    public QLSanPhamResponse(ChiTietSanPham ctsp) {
        this.Id = ctsp.getId();
        this.IdSP = ctsp.getSanPham().getIdSP();
        this.MaSP = ctsp.getSanPham().getMaSP();
        this.TenSP = ctsp.getSanPham().getTenSP();
        this.IdLoaiSP = ctsp.getLoaiSP().getId();
        this.MaLoaiSP = ctsp.getLoaiSP().getMa();
        this.TenLoaiSP = ctsp.getLoaiSP().getTen();
        this.IdChatLieu = ctsp.getChatLieu().getIdCL();
        this.MaChatLieu = ctsp.getChatLieu().getMaCL();
        this.TenChatLieu = ctsp.getChatLieu().getTenCL();
        this.IdMauSac = ctsp.getMauSac().getIdMS();
        this.MaMauSac = ctsp.getMauSac().getMaMS();
        this.TenMauSac = ctsp.getMauSac().getTenMS();
        this.IdSize = ctsp.getSize().getId();
        this.MaSize = ctsp.getSize().getMa();
        this.TenSize = ctsp.getSize().getTen();
        this.SLTon = ctsp.getSlTon() + "";
        this.Gia = ctsp.getGia() + "";
        this.MoTa = ctsp.getMoTa();
        this.TinhTrang = ctsp.getTinhTrang() + "";
        this.NgayTao = ctsp.getNgayTao() + "";
        this.NgaySua = ctsp.getNgaySua() + "";
    }

}
