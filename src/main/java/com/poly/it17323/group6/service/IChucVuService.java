/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.response.NguoiDungReponse;
import java.util.List;

/**
 *
 * @author ThanhNam
 */
public interface IChucVuService {

    List<ChucVu> getAll();

    boolean add(NguoiDungReponse CV);

    boolean update(NguoiDungReponse CV);

    boolean delete(NguoiDungReponse CV);
}
