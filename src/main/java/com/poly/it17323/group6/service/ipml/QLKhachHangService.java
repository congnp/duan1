/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.repository.KhachHangRepository;
import com.poly.it17323.group6.response.KhachHangResponse;
import com.poly.it17323.group6.service.IQLKhachHangService;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class QLKhachHangService implements IQLKhachHangService {

    private KhachHangRepository khRepo;
    private int ma;

    public QLKhachHangService() {
        khRepo = new KhachHangRepository();
        ma = khRepo.getAll().size()+1;
    }

    @Override
    public List<KhachHangResponse> getAll() {
        List<KhachHang> kh = khRepo.getAll();
        List<KhachHangResponse> khResponse = new ArrayList<>();
        for (KhachHang list : kh) {
            KhachHangResponse khachHang = new KhachHangResponse(list);
            khResponse.add(khachHang);
        }
        return khResponse;
    }

    @Override
    public KhachHangResponse getOne(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public String addKh(KhachHangResponse kh) {
        if (kh.getHoTen().isEmpty() || kh.getGioiTinh().isEmpty() || kh.getDiaChi().isEmpty()
                ||kh.getSdt().isEmpty()) {
            return "Vui lòng nhập đầy đủ dữ liệu!";
        } 
        if(kh.getSdt().length() < 10){
           return "Số điện thoại phải nhập đủ 10 số";
        }
        int sdt;
        try {
            sdt = Integer.parseInt(kh.getSdt());
        } catch (Exception e) {
            return "Số điện thoại phải là số!";
        }
        
//        if(kh.getHoTen().matches("[a-zA-Z][a-zA-Z ]+")){
//          return "Họ tên chỉ chứa alphabet và ký tự trắng";
//        }
        Date ngaySinh = Date.valueOf(kh.getNgaySinh());
        Date ngayTao = Date.valueOf(kh.getNgayTao());
        Date ngaySua = Date.valueOf(kh.getNgaySua());
        khRepo.add(new KhachHang(null, new QLKhachHangService().MaKh(), kh.getHoTen(), kh.getGioiTinh(), kh.getDiaChi(), kh.getSdt(), ngaySinh, ngayTao, ngaySua));
        if (kh == null) {
            return "THÊM THẤT BẠI!!!";
        } else {
            return "THÊM THÀNH CÔNG!";
        }

    }

    @Override
    public String updateKh(KhachHangResponse kh) {
        if (kh.getHoTen().isEmpty() || kh.getGioiTinh().isEmpty() || kh.getDiaChi().isEmpty()
                ||kh.getSdt().isEmpty()) {
            return "Vui lòng nhập đầy đủ dữ liệu!";
        }
        if(kh.getSdt().length() < 10){
           return "Số điện thoại phải nhập đủ 10 số";
        }
        int sdt;
        try {
            sdt = Integer.parseInt(kh.getSdt());
        } catch (Exception e) {
            return "Số điện thoại phải là số!";
        }
        Date ngaySinh = Date.valueOf(kh.getNgaySinh());
        Date ngayTao = Date.valueOf(kh.getNgayTao());
        Date ngaySua = Date.valueOf(kh.getNgaySua());
        khRepo.update(new KhachHang(kh.getIdKh(),kh.getMaKh(), kh.getHoTen(), kh.getGioiTinh(), kh.getDiaChi(), kh.getSdt(), ngaySinh, ngayTao, ngaySua));
        if (kh == null) {
            return "SỬA THẤT BẠI!!!";
        } else {
            return "SỬA THÀNH CÔNG!";
        }

    }

    @Override
    public String deleteKh(KhachHangResponse kh) {
        KhachHang khang = new KhachHang();
        khang.setIdKH(kh.getIdKh());

        if (khRepo.delete(khang)) {
            return "XÓA THÀNH CÔNG!";
        } else {
            return "XÓA THẤT BẠI!";
        }
    }

    @Override
    public String MaKh() {
        return "KH0" + (ma++);       
// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
