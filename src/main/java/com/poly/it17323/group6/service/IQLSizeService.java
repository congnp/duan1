/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.response.QLSanPhamResponse;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public interface IQLSizeService {
    List<QLSanPhamResponse> getAllQLSize();
    
    QLSanPhamResponse getOneQLSize(UUID id);
    
    QLSanPhamResponse getOneByTenSize(String ten);
    
    boolean addQLSize(QLSanPhamResponse qlSize);
    
    boolean updateQLSize(QLSanPhamResponse qlSize);
    
    boolean deleteQLSize(QLSanPhamResponse qlSize);
    
    String getMaTang();
}
