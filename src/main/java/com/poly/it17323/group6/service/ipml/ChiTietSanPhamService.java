/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.repository.ChiTietSanPhamRepository;
import com.poly.it17323.group6.service.IChiTietSanPhamService;
import java.util.List;

/**
 *
 * @author pdanh
 */
public class ChiTietSanPhamService implements IChiTietSanPhamService {

    private ChiTietSanPhamRepository ctspRepo = new ChiTietSanPhamRepository();

    @Override
    public List<ChiTietSanPham> getAll() {
        return ctspRepo.getAll();
    }

}
