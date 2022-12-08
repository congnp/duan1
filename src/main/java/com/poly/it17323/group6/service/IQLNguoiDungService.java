/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.response.QLNguoiDungResponse;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IQLNguoiDungService {

    List<QLNguoiDungResponse> getAllNguoiDung();

    String login(QLNguoiDungResponse qlndr);

    QLNguoiDungResponse getOneNv();

    String loginFailse(QLNguoiDungResponse qlndr);

    String checkMail(QLNguoiDungResponse nd);

    String emailFailse(QLNguoiDungResponse qlndr);

    String checkMa(String maXn);

    boolean addQLND(QLNguoiDungResponse qlND);

    String update(QLNguoiDungResponse qlND);
    
    String updatePass(QLNguoiDungResponse qlndr);

}
