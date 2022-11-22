/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.repository.KhuyenMaiRepository;
import com.poly.it17323.group6.service.IKhuyenMaiService;
import java.util.List;

/**
 *
 * @author pdanh
 */
public class KhuyenMaiService implements IKhuyenMaiService{
    
    private final KhuyenMaiRepository kmRepo = new KhuyenMaiRepository();
    
    @Override
    public List<KhuyenMai> getAll() {
        return kmRepo.getAll();
    }
    
}
