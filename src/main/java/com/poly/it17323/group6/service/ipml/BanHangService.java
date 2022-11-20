/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.repository.HoaDonRepository;
import com.poly.it17323.group6.repository.KhachHangRepository;
import com.poly.it17323.group6.repository.NguoiDungRepository;
import com.poly.it17323.group6.response.BanhangReponse;
import com.poly.it17323.group6.service.IBanHangService;
import java.math.BigDecimal;

/**
 *
 * @author pdanh
 */
public class BanHangService implements IBanHangService {

    private HoaDonRepository hdRepo = new HoaDonRepository();
    private NguoiDungRepository ndRepo = new NguoiDungRepository();
    private KhachHangRepository khRepo = new KhachHangRepository();

    @Override
    public boolean add(BanhangReponse b) {
        HoaDon hd = new HoaDon(null, b.getMaHD(), 0, BigDecimal.valueOf(Double.parseDouble(b.getTongTien())), 0, b.getNgayTao(), b.getNgaySua(), ndRepo.getOne(b.getIdND()), khRepo.getOne(b.getIdKH()));
        return true;
    }

}
