/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.LoaiSP;
import com.poly.it17323.group6.repository.LoaiSPRepository;
import com.poly.it17323.group6.response.QLSanPhamResponse;
import com.poly.it17323.group6.service.IQLLoaiSPService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class QLLoaiSPService implements IQLLoaiSPService {

    private LoaiSPRepository repo = new LoaiSPRepository();
    
    private int ma = repo.getAll().size() + 1;

    @Override
    public String getMaTang() {
        return "L0" + (ma++);
    }
    @Override
    public List<QLSanPhamResponse> getAllQLLoaiSP() {
        List<LoaiSP> list = repo.getAll();
        List<QLSanPhamResponse> respon = new ArrayList<>();
        for (LoaiSP cl : list) {
            QLSanPhamResponse chatlieu = new QLSanPhamResponse(cl);
            respon.add(chatlieu);
        }
        return respon;
    }

    @Override
    public QLSanPhamResponse getOneQLLoaiSP(UUID id) {
        LoaiSP cl = repo.getOne(id);
        if (cl == null) {
            return null;
        } else {
            return new QLSanPhamResponse(cl);
        }
    }

    @Override
    public boolean addQLLoaiSP(QLSanPhamResponse qlLoaiSP) {
        qlLoaiSP.setIdLoaiSP(null);
        var cl = repo.add(new LoaiSP(null,new QLLoaiSPService().getMaTang(), qlLoaiSP.getTenLoaiSP(), null));
        return cl;
    }

    @Override
    public boolean updateQLLoaiSP(QLSanPhamResponse qlLoaiSP) {
        return repo.update(new LoaiSP(qlLoaiSP.getIdLoaiSP(), qlLoaiSP.getMaLoaiSP(), qlLoaiSP.getTenLoaiSP(), null));
    }

    @Override
    public boolean deleteQLLoaiSP(QLSanPhamResponse qlLoaiSP) {
        LoaiSP sp = new LoaiSP();
        sp.setId(qlLoaiSP.getIdLoaiSP());
        return repo.delete(sp);
    }

}
