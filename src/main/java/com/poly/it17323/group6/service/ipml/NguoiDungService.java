/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.repository.NguoiDungRepository;
import com.poly.it17323.group6.service.INguoiDungService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NguoiDungService implements INguoiDungService {

    private NguoiDungRepository ndRepo = new NguoiDungRepository();

    @Override
    public List<NguoiDung> getAll() {
        return ndRepo.getAll();
    }

    @Override
    public boolean Login(String tenTk, String pass, String role) {
        for (NguoiDung x : getAll()) {
            if (x.getTenTK().equalsIgnoreCase(tenTk) && x.getMatKhau().equalsIgnoreCase(pass) && x.getChucVu().getTenCV().equalsIgnoreCase(role)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(NguoiDung ND) {
       return ndRepo.add(ND);
    }

    @Override
    public boolean update(NguoiDung ND,String Id) {
        return ndRepo.update(ND,Id);
    }

    @Override
    public boolean delete(NguoiDung ND) {
        return ndRepo.delete(ND);
    }

    @Override
    public NguoiDung getObjById(String Id) {
        return ndRepo.getOne(Id);
    }

}
