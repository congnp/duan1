/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.ChatLieu;
import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.LoaiSP;
import com.poly.it17323.group6.domainmodel.MauSac;
import com.poly.it17323.group6.domainmodel.SanPham;
import com.poly.it17323.group6.domainmodel.Size;
import com.poly.it17323.group6.repository.ChiTietSanPhamRepository;
import com.poly.it17323.group6.response.QLSanPhamResponse;
import com.poly.it17323.group6.service.ISanPhamChiTietService;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class QLCTSPService implements ISanPhamChiTietService {

    ChiTietSanPhamRepository repo = new ChiTietSanPhamRepository();

    @Override
    public List<QLSanPhamResponse> getAllQLChiTietSP() {
        List<ChiTietSanPham> list = repo.getAll();
        List<QLSanPhamResponse> respon = new ArrayList<>();
        for (ChiTietSanPham ctsp : list) {
            QLSanPhamResponse chiTietSP = new QLSanPhamResponse(ctsp);
            respon.add(chiTietSP);
        }
        System.out.println(respon);
        return respon;
    }

    @Override
    public QLSanPhamResponse getOneQLChiTietSP(UUID id) {
        ChiTietSanPham sp = repo.getOne(id);
        if (sp == null) {
            return null;
        } else {
            return new QLSanPhamResponse(sp);
        }
    }

    @Override
    public boolean addQLChiTietSP(QLSanPhamResponse qlCTSP) {
        Date ngayTao = Date.valueOf(qlCTSP.getNgayTao().trim());
        Date ngaySua = Date.valueOf(qlCTSP.getNgaySua().trim());
        SanPham sp = new SanPham(qlCTSP.getIdSP(), qlCTSP.getMaSP(), qlCTSP.getTenSP(), null); //Integer.parseInt(qlCTSP.getTinhTrangSP()));
        LoaiSP loaisp = new LoaiSP(qlCTSP.getIdLoaiSP(), qlCTSP.getMaLoaiSP(), qlCTSP.getTenLoaiSP(), null); //Integer.parseInt(qlCTSP.getTinhTrangLoaiSP()));
        ChatLieu cl = new ChatLieu(qlCTSP.getIdChatLieu(), qlCTSP.getMaChatLieu(), qlCTSP.getTenChatLieu());
        MauSac ms = new MauSac(qlCTSP.getIdMauSac(), qlCTSP.getMaMauSac(), qlCTSP.getTenMauSac());
        Size s = new Size(qlCTSP.getIdSize(), qlCTSP.getMaSize(), qlCTSP.getTenSize());
        return repo.add(new ChiTietSanPham(null, Integer.parseInt(qlCTSP.getSLTon()),
                BigDecimal.valueOf(Double.parseDouble(qlCTSP.getGia())),
                qlCTSP.getMoTa(), Integer.parseInt(qlCTSP.getTinhTrang()),
                ngayTao, ngaySua, sp, loaisp, cl, s, ms));
    }

    @Override
    public boolean updateQLChiTietSP(QLSanPhamResponse qlCTSP) {
        Date ngayTao = Date.valueOf(qlCTSP.getNgayTao().trim());
        Date ngaySua = Date.valueOf(qlCTSP.getNgaySua().trim());
        SanPham sp = new SanPham(qlCTSP.getIdSP(), qlCTSP.getMaSP(), qlCTSP.getTenSP(), null);//Integer.parseInt(qlCTSP.getTinhTrangSP()));
        LoaiSP loaisp = new LoaiSP(qlCTSP.getIdLoaiSP(), qlCTSP.getMaLoaiSP(), qlCTSP.getTenLoaiSP(),null);// Integer.parseInt(qlCTSP.getTinhTrangLoaiSP()));
        ChatLieu cl = new ChatLieu(qlCTSP.getIdChatLieu(), qlCTSP.getMaChatLieu(), qlCTSP.getTenChatLieu());
        MauSac ms = new MauSac(qlCTSP.getIdMauSac(), qlCTSP.getMaMauSac(), qlCTSP.getTenMauSac());
        Size s = new Size(qlCTSP.getIdSize(), qlCTSP.getMaSize(), qlCTSP.getTenSize());
        return repo.update(new ChiTietSanPham(qlCTSP.getId(),
                Integer.parseInt(qlCTSP.getSLTon()), 
                BigDecimal.valueOf(Double.parseDouble(qlCTSP.getGia())), 
                qlCTSP.getMoTa(), Integer.parseInt(qlCTSP.getTinhTrang()),
                ngayTao, ngaySua, sp, loaisp, cl, s, ms));
    }

    @Override
    public boolean deleteQLChiTietSP(QLSanPhamResponse qlCTSP) {
//        Date ngayTao = Date.valueOf(qlCTSP.getNgayTao());
//        Date ngaySua = Date.valueOf(qlCTSP.getNgaySua());
//        SanPham sp = new SanPham(qlCTSP.getIdSP(), qlCTSP.getMaSP(), qlCTSP.getTenSP(), Integer.parseInt(qlCTSP.getTinhTrangSP()));
//        LoaiSP loaisp = new LoaiSP(qlCTSP.getIdLoaiSP(), qlCTSP.getMaLoaiSP(), qlCTSP.getTenLoaiSP(), Integer.parseInt(qlCTSP.getTinhTrangLoaiSP()));
//        ChatLieu cl = new ChatLieu(qlCTSP.getIdChatLieu(), qlCTSP.getMaLoaiSP(), qlCTSP.getTenLoaiSP());
//        MauSac ms = new MauSac(qlCTSP.getIdMauSac(), qlCTSP.getMaMauSac(), qlCTSP.getTenMauSac());
//        Size s = new Size(qlCTSP.getIdSize(), qlCTSP.getMaSize(), qlCTSP.getTenSize());
//        return repo.delete(new ChiTietSanPham(qlCTSP.getId(), Integer.parseInt(qlCTSP.getSLTon()), BigDecimal.valueOf(Double.parseDouble(qlCTSP.getGia())), qlCTSP.getMoTa(),
//                Integer.parseInt(qlCTSP.getTinhTrang()), ngayTao, ngaySua, sp, loaisp, cl, s, ms));
        ChiTietSanPham sp = new ChiTietSanPham();
        sp.setId(qlCTSP.getId());
        return repo.delete(sp);
    }
    public static void main(String[] args) {
        List<QLSanPhamResponse> lists = new QLCTSPService().getAllQLChiTietSP();
        for (QLSanPhamResponse p : lists) {
            System.out.println(p.toString());
        }
//        SanPham sp1 = new SanPham('E0E52C45-832D-43C5-998D-49227B97FE11','SP01','Áo',null);
//        LoaiSP loaisp = new LoaiSP();
//        ChatLieu cl = new ChatLieu();
//        MauSac ms = new MauSac();
//        Size s = new Size();
//        ChiTietSanPham sp = new ChiTietSanPham(null,, BigDecimal.ONE, moTa, Integer.MIN_VALUE, ngayTao, ngaySua, sanPham, loaiSP, chatLieu, size, mauSac);
    }

}
