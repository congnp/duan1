/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author pdanh
 */
public interface IHoaDonChiTietService {

    List<HoaDonChiTiet> getAll();

    List<HoaDonChiTiet> getAllByIDHD(UUID id);
    
}
