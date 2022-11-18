/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.response.ChucVuResponse;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IQLChucVuService {
    List<ChucVuResponse> getAllQLCV();
    
    ChucVuResponse getOneQLCV(String id);
    
    boolean addQLCV(ChucVuResponse qlCV);
    
    boolean updateQLCV(ChucVuResponse qlCV);
    
    boolean deleteQLCV(ChucVuResponse qlCV);
}
