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
public interface IQLMauSacService {
    List<QLSanPhamResponse> getAllQLMauSac();
    
    QLSanPhamResponse getOneQLMauSac(UUID id);
    
    QLSanPhamResponse getOneByTenMS(String ten);
    
    boolean addQLMauSac(QLSanPhamResponse qlMauSac);
    
    boolean updateQLMauSac(QLSanPhamResponse qlMauSac);
    
    boolean deleteQLMauSac(QLSanPhamResponse qlMauSac);
    
    String getMaTang();
}
