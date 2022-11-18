/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.repository.NguoiDungRepository;
import com.poly.it17323.group6.response.QLNguoiDungResponse;
import com.poly.it17323.group6.service.IQLNguoiDungService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLNguoiDungService implements IQLNguoiDungService {

    private NguoiDungRepository repo = new NguoiDungRepository();
    @Override

    public List<QLNguoiDungResponse> getAllNguoiDung() {
        List<NguoiDung> list = repo.getAll();
        List<QLNguoiDungResponse> respon = new ArrayList<>();
        for (NguoiDung nguoiDung : list) {
            QLNguoiDungResponse nd = new QLNguoiDungResponse(nguoiDung);
            respon.add(nd);
        }
        return respon;
    }

    @Override
    public QLNguoiDungResponse getOneQLNguoiDung(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addQLND(QLNguoiDungResponse qlND) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateQLND(QLNguoiDungResponse qlND) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteQLND(QLNguoiDungResponse qlND) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        List<QLNguoiDungResponse> list = new QLNguoiDungService().getAllNguoiDung();
        for(QLNguoiDungResponse p :list){
            System.out.println(p.toString());
        }
    }

}
