/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.repository.HoaDonChiTietRepository;
import com.poly.it17323.group6.service.IHoaDonChiTietService;
import java.util.List;

/**
 *
 * @author pdanh
 */
public class HoaDonChiTietService implements IHoaDonChiTietService{
    private HoaDonChiTietRepository hdctRepo = new HoaDonChiTietRepository();
    @Override
    public List<HoaDonChiTiet> getAll() {
        return hdctRepo.getAll();
    }
    
}
