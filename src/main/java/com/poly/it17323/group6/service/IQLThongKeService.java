/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.response.QLThongKeResponse;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IQLThongKeService {

    List<QLThongKeResponse> getThongKe();
    
    List<QLThongKeResponse> getThongKeNV();
    
    List<HoaDon> getDoanhThu();
    
    
}
