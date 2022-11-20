/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.repository.KhachHangRepository;
import com.poly.it17323.group6.service.IKhachHangService;
import java.util.List;

/**
 *
 * @author pdanh
 */
public class KhachHangService implements IKhachHangService {

    private KhachHangRepository khRepo = new KhachHangRepository();

    @Override
    public List<KhachHang> getAll() {
        return khRepo.getAll();
    }

}
