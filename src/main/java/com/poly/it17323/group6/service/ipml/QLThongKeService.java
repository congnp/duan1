/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.repository.HoaDonRepository;
import com.poly.it17323.group6.repository.ThongKeRepository;
import com.poly.it17323.group6.response.QLThongKeResponse;
import com.poly.it17323.group6.service.IQLThongKeService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLThongKeService implements IQLThongKeService {

    private ThongKeRepository tkeRepo = new ThongKeRepository();

    @Override
    public List<QLThongKeResponse> getThongKe() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<QLThongKeResponse> getThongKeNV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon> getDoanhThu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
