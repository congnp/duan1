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
public interface IQLSanPhamService {
    List<QLSanPhamResponse> getAllQLSP();
    
    QLSanPhamResponse getOneQLSP(UUID id);
    
    QLSanPhamResponse getOneByTenSP(String ten);
    
    boolean addQLSP(QLSanPhamResponse qlSP);
    
    boolean updateQLSP(QLSanPhamResponse qlSP);
    
    boolean deleteQLSP(QLSanPhamResponse qlSP);
    
    String getMaTang();
}
