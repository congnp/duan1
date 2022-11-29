/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.Anh;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public interface IAnhService {
    List<Anh> getAllQLAnh();
    
    List<Anh> getAllByIdCTSP(UUID id);
    
    Anh getOneQLAnh(UUID id);
    
    boolean addQLAnh(Anh qlAnh);
    
    boolean updateQLCL(Anh qlAnh);
    
    boolean deleteQLCL(Anh qlAmh );
    
    String getMaTang();
}
