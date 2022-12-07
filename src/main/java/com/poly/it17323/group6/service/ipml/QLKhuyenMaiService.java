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
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class QLKhuyenMaiService implements IKhuyenMaiService{
    private KhuyenMaiRepository kmRepo;
    private int ma;

    public QLKhuyenMaiService(){
        kmRepo = new KhuyenMaiRepository();
        ma = kmRepo.getAll().size()+1;
    }

    

    @Override
    public KhuyenMaiReponse getOne(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String add(KhuyenMaiReponse km) {
        if (km.getTenKM().isEmpty()  || km.getMoTa().isEmpty()
                ) {
            return "Vui lòng nhập đầy đủ dữ liệu!";
        }
        Date ngayBatDau = Date.valueOf(km.getNgayBD());
        Date ngayKetThuc = Date.valueOf(km.getNgayKT());
        Date ngayTao = Date.valueOf(km.getNgayTao());
        Date ngaySua = Date.valueOf(km.getNgaySua());
        kmRepo.add(new KhuyenMai(null, km.getMaKM(), km.getTenKM(), ngayBatDau, ngayKetThuc, km.getMoTa(), km.getGiamGia(), km.getTinhTrang(), ngayTao, ngaySua));
        if (km == null) {
            return "THÊM THẤT BẠI!!!";
        } else {
            return "THÊM THÀNH CÔNG!";
        }
    }
        
        
    

    @Override
    public String update(KhuyenMaiReponse km) {
        if (km.getTenKM().isEmpty() || km.getGiamGia().equals(km)|| km.getMoTa().isEmpty()
                ||km.getTinhTrang().equals(km)) {
            return "Vui lòng nhập đầy đủ dữ liệu!";
        } 
        Date ngayBatDau = Date.valueOf(km.getNgayBD());
        Date ngayKetThuc = Date.valueOf(km.getNgayKT());
        Date ngayTao = Date.valueOf(km.getNgayTao());
        Date ngaySua = Date.valueOf(km.getNgaySua());
        kmRepo.update(new KhuyenMai(km.getIdKM(), km.getMaKM(), km.getTenKM(), ngayBatDau, ngayKetThuc, km.getMoTa(), km.getGiamGia(), km.getTinhTrang(), ngayTao, ngaySua));
        if (km == null) {
            return "Sửa THẤT BẠI!!!";
        } else {
            return "Sửa THÀNH CÔNG!";
        }
    }
    

    @Override
    public String delete(KhuyenMaiReponse km) {
        Date ngayBatDau = Date.valueOf(km.getNgayBD());
        Date ngayKetThuc = Date.valueOf(km.getNgayKT());
        Date ngayTao = Date.valueOf(km.getNgayTao());
        Date ngaySua = Date.valueOf(km.getNgaySua());
        kmRepo.delete(new KhuyenMai(km.getIdKM(), km.getMaKM(), km.getTenKM(), ngayBatDau, ngayKetThuc, km.getMoTa(), km.getGiamGia(), km.getTinhTrang(), ngayTao, ngaySua));
        return null;
        
    }

    @Override
    public String MaKm() {
        return "KM0" + (ma++); 
    }

    @Override
    public List<KhuyenMai> get_By_Name(String name) {
        return kmRepo.get_By_Name(name);
    }

    @Override
    public List<KhuyenMai> getAll() {
         return kmRepo.getAll();
    }

   
    
}
