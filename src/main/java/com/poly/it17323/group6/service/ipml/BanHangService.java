/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.repository.ChiTietSanPhamRepository;
import com.poly.it17323.group6.repository.HoaDonChiTietRepository;
import com.poly.it17323.group6.repository.HoaDonRepository;
import com.poly.it17323.group6.repository.KhuyenMaiRepository;
import com.poly.it17323.group6.response.BanhangReponse;
import com.poly.it17323.group6.service.IBanHangService;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author pdanh
 */
public class BanHangService implements IBanHangService {

    private final HoaDonRepository hdRepo = new HoaDonRepository();
    private final HoaDonChiTietRepository hdctRepo = new HoaDonChiTietRepository();
    private final ChiTietSanPhamRepository ctspRepo = new ChiTietSanPhamRepository();
    private KhuyenMaiRepository kmRepo = new KhuyenMaiRepository();
    private static int ma = 2;

    @Override
    public boolean add_HD(BanhangReponse b) {
        java.util.Date currentDate = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayTao;
        ngayTao = Date.valueOf(sdf.format(currentDate));
        hdRepo.add(new HoaDon(null, new BanHangService().getMaTang(), 0, BigDecimal.valueOf(0.0), 0, ngayTao, ngayTao, b.getNd(), b.getKh()));
        return true;
    }

    @Override
    public boolean update_HD(BanhangReponse b) {
        hdRepo.update(b.getHd().getIdHD(), b.getTongTien(), b.getTinhTrang(), b.getPttt());
        return true;
    }

    @Override
    public boolean add_HDCT(BanhangReponse b) {
        hdctRepo.add(new HoaDonChiTiet(null, b.getCtsp().getGia(), Integer.parseInt(b.getSlMua()), new BigDecimal(1 - (b.getKm().getGiamGia() / 100.0)).multiply(b.getCtsp().getGia()), b.getHd(), b.getKm(), b.getCtsp()));
        return true;
    }

    @Override
    public boolean updateSL_HDCT(BanhangReponse b) {
        hdctRepo.update(b.getHdct().getIdHDCT(), Integer.parseInt(b.getSlMua()));
        return true;
    }

    @Override
    public boolean delete_HDCT(BanhangReponse b) {
        hdctRepo.delete(b.getHdct().getIdHDCT());
        return true;
    }

    @Override
    public boolean updateSL_CTSP(BanhangReponse b) {
        ctspRepo.update(b.getCtsp().getId(), Integer.parseInt(b.getSlMua()));
        return true;
    }

    @Override
    public boolean checkTrung(BanhangReponse b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getMaTang() {
        return "HD0" + (ma++);
    }

}
