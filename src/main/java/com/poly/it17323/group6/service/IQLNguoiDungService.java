/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.response.QLNguoiDungResponse;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IQLNguoiDungService {
    List<QLNguoiDungResponse> getAllNguoiDung();
    
    QLNguoiDungResponse getOneQLNguoiDung(String id);
    
    boolean addQLND(QLNguoiDungResponse qlND);
    
    boolean updateQLND(QLNguoiDungResponse qlND);
    
    boolean deleteQLND(QLNguoiDungResponse qlND);
}
