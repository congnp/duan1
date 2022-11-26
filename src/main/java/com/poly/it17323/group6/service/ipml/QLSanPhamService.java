/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.SanPham;
import com.poly.it17323.group6.repository.SanPhamRepository;
import com.poly.it17323.group6.response.QLSanPhamResponse;
import com.poly.it17323.group6.service.IQLSanPhamService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class QLSanPhamService implements IQLSanPhamService{

    private SanPhamRepository repo = new SanPhamRepository();

    @Override
    public List<QLSanPhamResponse> getAllQLSP() {
        List<SanPham> list = repo.getAll();
        List<QLSanPhamResponse> respon = new ArrayList<>();
        for (SanPham sanpham : list) {
            QLSanPhamResponse sp = new QLSanPhamResponse(sanpham);
            respon.add(sp);
        }
        return respon;
    }

    @Override
    public QLSanPhamResponse getOneQLSP(UUID id) {
        SanPham sp = repo.getOne(id);
        if (sp == null) {
            return null;
        } else {
            return new QLSanPhamResponse(sp);
        }
    }

    @Override
    public boolean addQLSP(QLSanPhamResponse qlSP) {
        return repo.add(new SanPham(null,qlSP.getMaSP(), qlSP.getTenSP(),null));
    }

    @Override
    public boolean updateQLSP(QLSanPhamResponse qlSP) {
        return repo.update(new SanPham(qlSP.getIdSP(), qlSP.getMaSP(), qlSP.getTenSP(),null));
        
    }

    @Override
    public boolean deleteQLSP(QLSanPhamResponse qlSP) {
        SanPham sp = new SanPham();
        sp.setIdSP(qlSP.getIdSP());
       return repo.delete(sp);
        
    }
    public static void main(String[] args) {
        List<QLSanPhamResponse> lists = new QLSanPhamService().getAllQLSP();
        for (QLSanPhamResponse p : lists) {
            System.out.println(p.toString());
        }
    }

}
