/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.Size;
import com.poly.it17323.group6.repository.SizeRepository;
import com.poly.it17323.group6.response.QLSanPhamResponse;
import com.poly.it17323.group6.service.IQLSizeService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class QLSizeService implements IQLSizeService{

    private SizeRepository repo = new SizeRepository();

    private int ma = repo.getAll().size() + 1;

    @Override
    public String getMaTang() {
        return "SZ0" + (ma++);
    }
    
    @Override
    public List<QLSanPhamResponse> getAllQLSize() {
        List<Size> list = repo.getAll();
        List<QLSanPhamResponse> respon = new ArrayList<>();
        for (Size s : list) {
            QLSanPhamResponse size = new QLSanPhamResponse(s);
            respon.add(size);
        }
        return respon;
    }

    @Override
    public QLSanPhamResponse getOneQLSize(UUID id) {
        Size s = repo.getOne(id);
        if (s == null) {
            return null;
        } else {
            return new QLSanPhamResponse(s);
        }
    }

    @Override
    public boolean addQLSize(QLSanPhamResponse qlSize) {
        var sp = repo.add(new Size(null,new QLSizeService().getMaTang(),qlSize.getTenSize()));
        return sp;
    }

    @Override
    public boolean updateQLSize(QLSanPhamResponse qlSize) {
        var sp = repo.update(new Size(qlSize.getIdSize(),qlSize.getMaSize(),qlSize.getTenSize()));
        return sp;
    }

    @Override
    public boolean deleteQLSize(QLSanPhamResponse qlSize) {
        Size sp = new Size();
        sp.setId(qlSize.getIdSize());
       return repo.delete(sp);
    }

}
