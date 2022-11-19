/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.repository.HoaDonRepository;
import com.poly.it17323.group6.service.IHoaDonService;
import java.util.List;

/**
 *
 * @author pdanh
 */
public class HoaDonService implements IHoaDonService {

    private HoaDonRepository hdRepo = new HoaDonRepository();

    @Override
    public List<HoaDon> getAll() {
        return hdRepo.getAll();
    }
    
    

}
