/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.NguoiDung;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INguoiDungService {

    List<NguoiDung> getAll();

    boolean Login(String tenTk, String pass, String role);

    boolean add(NguoiDung ND);

    boolean update(NguoiDung ND);

    boolean delete(NguoiDung ND);
}
