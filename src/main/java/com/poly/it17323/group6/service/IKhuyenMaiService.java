/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.response.KhuyenMaiReponse;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public interface IKhuyenMaiService {

    List<KhuyenMai> getAll();

    KhuyenMaiReponse getOne(UUID id);

    String add(KhuyenMaiReponse km);

    String update(KhuyenMaiReponse km);

    String delete(KhuyenMaiReponse km);

    String MaKm();

    List<KhuyenMai> get_By_Name(String name);
    
    List<KhuyenMai> getAllbyTT(int tt);

}
