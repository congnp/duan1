/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.repository.ChucVuRepository;
import com.poly.it17323.group6.service.IChucVuService;
import java.util.List;

/**
 *
 * @author ThanhNam
 */
public class ChucVuService implements IChucVuService{

    private ChucVuRepository cvr = new ChucVuRepository();
    @Override
    public List<ChucVu> getAll() {
        return cvr.getAll();
    }
    
}
