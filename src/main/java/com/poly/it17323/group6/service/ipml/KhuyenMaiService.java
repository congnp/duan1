/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.repository.KhuyenMaiRepository;
import com.poly.it17323.group6.response.KhuyenMaiReponse;
import com.poly.it17323.group6.service.IKhuyenMaiService;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhuyenMaiService implements IKhuyenMaiService {

    private KhuyenMaiRepository kmrepo = new KhuyenMaiRepository();

    @Override
    public List<KhuyenMai> getAll() {
        return kmrepo.getAll();
    }

    @Override
    public boolean add(KhuyenMaiReponse km) {
        Date ngayBatDau = Date.valueOf(km.getNgayBD());
        Date ngayKetThuc = Date.valueOf(km.getNgayKT());
        Date ngayTao = Date.valueOf(km.getNgayTao());
        Date ngaySua = Date.valueOf(km.getNgaySua());
        kmrepo.add(new KhuyenMai(null, km.getMaKM(), km.getTenKM(), ngayBatDau, ngayKetThuc, km.getMoTa(), km.getGiamGia(), km.getTinhTrang(), ngayTao, ngaySua));
        return true;
    }

    @Override
    public boolean update(KhuyenMaiReponse km) {
        Date ngayBatDau = Date.valueOf(km.getNgayBD());
        Date ngayKetThuc = Date.valueOf(km.getNgayKT());
        Date ngayTao = Date.valueOf(km.getNgayTao());
        Date ngaySua = Date.valueOf(km.getNgaySua());
        kmrepo.update(new KhuyenMai(km.getIdKM(), km.getMaKM(), km.getTenKM(), ngayBatDau, ngayKetThuc, km.getMoTa(), km.getGiamGia(), km.getTinhTrang(), ngayTao, ngaySua));
        return true;
    }

    @Override
    public boolean delete(KhuyenMaiReponse km) {
        Date ngayBatDau = Date.valueOf(km.getNgayBD());
        Date ngayKetThuc = Date.valueOf(km.getNgayKT());
        Date ngayTao = Date.valueOf(km.getNgayTao());
        Date ngaySua = Date.valueOf(km.getNgaySua());
        kmrepo.delete(new KhuyenMai(km.getIdKM(), km.getMaKM(), km.getTenKM(), ngayBatDau, ngayKetThuc, km.getMoTa(), km.getGiamGia(), km.getTinhTrang(), ngayTao, ngaySua));
        return true;
    }

}
