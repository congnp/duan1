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
import javax.swing.JOptionPane;

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
        SanPham sp = new SanPham(qlCTSP.getIdSP(), qlCTSP.getMaSP(), qlCTSP.getTenSP(), null);
        LoaiSP loaisp = new LoaiSP(qlCTSP.getIdLoaiSP(), qlCTSP.getMaLoaiSP(), qlCTSP.getTenLoaiSP(), null);
        ChatLieu cl = new ChatLieu(qlCTSP.getIdChatLieu(), qlCTSP.getMaChatLieu(), qlCTSP.getTenChatLieu());
        MauSac ms = new MauSac(qlCTSP.getIdMauSac(), qlCTSP.getMaMauSac(), qlCTSP.getTenMauSac());
        Size s = new Size(qlCTSP.getIdSize(), qlCTSP.getMaSize(), qlCTSP.getTenSize());
        
        if(new QLCTSPService().getOne_ByTen(qlCTSP.getTenSP(), qlCTSP.getTenLoaiSP(), qlCTSP.getTenChatLieu(), qlCTSP.getTenMauSac(), qlCTSP.getTenSize())!=null){
            JOptionPane.showMessageDialog(null, "Đã có SP này");
            return false;
        }
        if (qlCTSP.getSLTon().length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được để trống số lượng !!");
            return false;
        }
        if (qlCTSP.getGia().length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được để trống giá!!");
            return false;
        }
        int sl;
        try {
            sl = Integer.parseInt(qlCTSP.getSLTon());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Số lượng tồn phải là số");
            return false;
        }
        if (sl <= 0) {
            JOptionPane.showMessageDialog(null, "Số lượng tồn lớn hơn 0");
            return false;
        }
        BigDecimal gia;
        try {
            gia = BigDecimal.valueOf(Double.parseDouble(qlCTSP.getGia()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Giá phải là số");
            return false;
        }
        if (gia.compareTo(BigDecimal.ZERO) == -1) {
            JOptionPane.showMessageDialog(null, "Giá bán phải là số nguyên dương");
            return false;
        }
        return repo.add(new ChiTietSanPham(null, sl, gia,
                qlCTSP.getMoTa(), Integer.parseInt(qlCTSP.getTinhTrang()),
                ngayTao, ngaySua, sp, loaisp, cl, s, ms));
    }

    @Override
    public boolean updateQLChiTietSP(QLSanPhamResponse qlCTSP) {
        Date ngayTao = Date.valueOf(qlCTSP.getNgayTao().trim());
        Date ngaySua = Date.valueOf(qlCTSP.getNgaySua().trim());
        SanPham sp = new SanPham(qlCTSP.getIdSP(), qlCTSP.getMaSP(), qlCTSP.getTenSP(), null);
        LoaiSP loaisp = new LoaiSP(qlCTSP.getIdLoaiSP(), qlCTSP.getMaLoaiSP(), qlCTSP.getTenLoaiSP(), null);
        ChatLieu cl = new ChatLieu(qlCTSP.getIdChatLieu(), qlCTSP.getMaChatLieu(), qlCTSP.getTenChatLieu());
        MauSac ms = new MauSac(qlCTSP.getIdMauSac(), qlCTSP.getMaMauSac(), qlCTSP.getTenMauSac());
        Size s = new Size(qlCTSP.getIdSize(), qlCTSP.getMaSize(), qlCTSP.getTenSize());
        if (qlCTSP.getSLTon().length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được để trống số lượng !!");
            return false;
        }
        if (qlCTSP.getGia().length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được để trống giá!!");
            return false;
        }
        if (qlCTSP.getSLTon().length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được để trống số lượng !!");
            return false;
        }
        if (qlCTSP.getGia().length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được để trống giá!!");
            return false;
        }
        int sl;
        try {
            sl = Integer.parseInt(qlCTSP.getSLTon());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Số lượng tồn phải là số");
            return false;
        }
        if (sl <= 0) {
            JOptionPane.showMessageDialog(null, "Số lượng tồn lớn hơn 0");
            return false;
        }
        BigDecimal gia;
        try {
            gia = BigDecimal.valueOf(Double.parseDouble(qlCTSP.getGia()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Giá phải là số");
            return false;
        }
        if (gia.compareTo(BigDecimal.ZERO) == -1) {
            JOptionPane.showMessageDialog(null, "Giá bán phải là số nguyên dương");
            return false;
        }
        return repo.update(new ChiTietSanPham(qlCTSP.getId(), sl, gia,
                qlCTSP.getMoTa(), Integer.parseInt(qlCTSP.getTinhTrang()),
                ngayTao, ngaySua, sp, loaisp, cl, s, ms));
    }

    @Override
    public boolean deleteQLChiTietSP(QLSanPhamResponse qlCTSP) {
        ChiTietSanPham sp = new ChiTietSanPham();
        sp.setId(qlCTSP.getId());
        return repo.delete(sp);
    }
    
        @Override
    public List<QLSanPhamResponse> getAll_ByName(String ten) {
        List<ChiTietSanPham> list = repo.getAll_ByName(ten);
        List<QLSanPhamResponse> respon = new ArrayList<>();
        for (ChiTietSanPham ctsp : list) {
            QLSanPhamResponse chiTietSP = new QLSanPhamResponse(ctsp);
            respon.add(chiTietSP);
        }
        return respon;
    }

    @Override
    public QLSanPhamResponse getOne_ByTen(String SP, String LoaiSP, String CL, String MS, String Size) {
        List<ChiTietSanPham> list = repo.getOne_ByTen(SP, LoaiSP, CL, MS, Size);
        List<QLSanPhamResponse> respon = new ArrayList<>();
        for (ChiTietSanPham sanpham : list) {
            QLSanPhamResponse sp = new QLSanPhamResponse(sanpham);
            respon.add(sp);
        }
        if (respon.size() > 0) {
            return respon.get(0);
        } else {
            return null;
        }
    }

}
