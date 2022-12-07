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
public interface IQLChatLieuService {

    List<QLSanPhamResponse> getAllQLCL();
    
    QLSanPhamResponse getOneByTenCL(String ten);

    boolean addQLCL(QLSanPhamResponse qlCL);

    boolean updateQLCL(QLSanPhamResponse qlCL);

    boolean deleteQLCL(QLSanPhamResponse qlCL);
     
    String getMaTang();
}
