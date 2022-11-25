/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.repository.ChucVuRepository;
import com.poly.it17323.group6.repository.NguoiDungRepository;
import com.poly.it17323.group6.response.NguoiDungReponse;
import com.poly.it17323.group6.service.INguoiDungService;
import java.sql.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class NguoiDungService implements INguoiDungService {

    private NguoiDungRepository ndRepo = new NguoiDungRepository();

    @Override
    public List<NguoiDung> getAll() {
        return ndRepo.getAll();
    }

    @Override
    public boolean Login(String tenTk, String pass, String role) {
        for (NguoiDung x : getAll()) {
            if (x.getTenTK().equalsIgnoreCase(tenTk) && x.getMatKhau().equalsIgnoreCase(pass) && x.getChucVu().getTenCV().equalsIgnoreCase(role)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(NguoiDungReponse ND) {
        ChucVuRepository reCV = new ChucVuRepository();
        ChucVu cv = reCV.getAll().get(0);
        Date ngaySinh = Date.valueOf(ND.getNgaySinh());
        Date ngayTao = Date.valueOf(ND.getNgayTao());
        Date ngaySua = Date.valueOf(ND.getNgaySua());
        ndRepo.add(new NguoiDung(ND.getIdND(), ND.getMaND(), ND.getTenTK(), ND.getMatKhau(), ND.getHoVaTen(), ND.getGioiTinh(), ngaySinh, ND.getEmail(), ND.getSdt(), ND.getDiaChi(), ND.getCccd(), ND.getTinhTrang(), ngayTao, ngaySua, cv));
        return true;
    }

    @Override
    public boolean update(NguoiDungReponse ND) {
        ChucVuRepository reCV = new ChucVuRepository();
        ChucVu cv = reCV.getAll().get(0);
        Date ngaySinh = Date.valueOf(ND.getNgaySinh());
        Date ngayTao = Date.valueOf(ND.getNgayTao());
        Date ngaySua = Date.valueOf(ND.getNgaySua());
        ndRepo.update(new NguoiDung(ND.getIdND(), ND.getMaND(), ND.getTenTK(), ND.getMatKhau(), ND.getHoVaTen(), ND.getGioiTinh(), ngaySinh, ND.getEmail(), ND.getSdt(), ND.getDiaChi(), ND.getCccd(), ND.getTinhTrang(), ngayTao, ngaySua, cv));
        return true;
    }

    @Override
    public boolean delete(NguoiDungReponse ND) {
        NguoiDung nd = new NguoiDung();
        nd.setIdND(ND.getIdND());
        ndRepo.delete(nd);
        return true;
    }

    @Override
    public NguoiDung getOne(UUID id) {
        return ndRepo.getOne(id);
    }

}
