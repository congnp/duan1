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
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class QLKhuyenMaiService implements IKhuyenMaiService {

    private KhuyenMaiRepository kmRepo = new KhuyenMaiRepository();

    private int ma = kmRepo.getAll().size() + 1;

    @Override
    public String MaKm() {
        return "KM0" + (ma++);
    }

    @Override
    public KhuyenMaiReponse getOne(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String add(KhuyenMaiReponse km) {
        try {
            if (km.getTenKM().isEmpty() || km.getMoTa().isEmpty()) {
                return "Vui lòng nhập đầy đủ dữ liệu!";
            }
            Date ngayBatDau = Date.valueOf(km.getNgayBD());
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");

            Date ngayTao = Date.valueOf(km.getNgayTao());
            Date ngaySua = Date.valueOf(km.getNgaySua());
            kmRepo.add(new KhuyenMai(null, new QLKhuyenMaiService().MaKm(), km.getTenKM(), ngayBatDau, new Timestamp(sdf2.parse(km.getNgayKT()).getTime()), km.getMoTa(), km.getGiamGia(), km.getTinhTrang(), ngayTao, ngaySua));

        } catch (ParseException ex) {
            Logger.getLogger(QLKhuyenMaiService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "THÊM THẤT BẠI!!!";
    }

    @Override
    public String update(KhuyenMaiReponse km) {
        try {
            if (km.getTenKM().isEmpty() || km.getMoTa().isEmpty()) {
                return "Vui lòng nhập đầy đủ dữ liệu!";
            }
            Date ngayBatDau = Date.valueOf(km.getNgayBD());
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");

            Date ngayTao = Date.valueOf(km.getNgayTao());
            Date ngaySua = Date.valueOf(km.getNgaySua());
            kmRepo.update(new KhuyenMai(km.getIdKM(), km.getMaKM(), km.getTenKM(), ngayBatDau, new Timestamp(sdf2.parse(km.getNgayKT()).getTime()), km.getMoTa(), km.getGiamGia(), km.getTinhTrang(), ngayTao, ngaySua));

        } catch (ParseException ex) {
            Logger.getLogger(QLKhuyenMaiService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public String delete(KhuyenMaiReponse km) {
        Date ngayBatDau = Date.valueOf(km.getNgayBD());
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Date ngayTao = Date.valueOf(km.getNgayTao());
        Date ngaySua = Date.valueOf(km.getNgaySua());
        try {
            kmRepo.delete(new KhuyenMai(km.getIdKM(), km.getMaKM(), km.getTenKM(), ngayBatDau, new Timestamp(sdf2.parse(km.getNgayKT()).getTime()), km.getMoTa(), km.getGiamGia(), km.getTinhTrang(), ngayTao, ngaySua));
        } catch (ParseException ex) {
            Logger.getLogger(QLKhuyenMaiService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public List<KhuyenMai> get_By_Name(String name) {
        return kmRepo.get_By_Name(name);
    }

    @Override
    public List<KhuyenMai> getAll() {
        return kmRepo.getAll();
    }

    @Override
    public List<KhuyenMai> getAllbyTT(int tt) {
        return kmRepo.getAllByTT(tt);
    }

}
