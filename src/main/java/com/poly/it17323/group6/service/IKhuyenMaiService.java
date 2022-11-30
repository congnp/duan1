/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.response.KhuyenMaiReponse;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IKhuyenMaiService {

    List<KhuyenMai> getAll();

    boolean add(KhuyenMaiReponse km);

    boolean update(KhuyenMaiReponse km);

    boolean delete(KhuyenMaiReponse km);
}
