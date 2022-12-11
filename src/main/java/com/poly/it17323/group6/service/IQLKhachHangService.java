/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.response.KhachHangResponse;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public interface IQLKhachHangService {

    List<KhachHangResponse> getAll();

    KhachHangResponse getOne(UUID id);

    KhachHangResponse getOneByMa(String ma);

    String addKh(KhachHangResponse kh);

    String updateKh(KhachHangResponse kh);

    String deleteKh(KhachHangResponse kh);

    String MaKh();

    List<KhachHangResponse> getByName(String name);

}
