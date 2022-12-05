/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.repository.HoaDonRepository;
import com.poly.it17323.group6.response.QLThongKeResponse;
import com.poly.it17323.group6.service.IQLThongKeService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLThongKeService implements IQLThongKeService {

    private HoaDonRepository hdRepo = new HoaDonRepository();

    @Override
    public List<QLThongKeResponse> getThongKe() {
        List<HoaDon> list = hdRepo.getAll2();
        List<QLThongKeResponse> respon = new ArrayList<>();
        for (HoaDon hdon : list) {
            QLThongKeResponse tke = new QLThongKeResponse(hdon);
            respon.add(tke);
        }

        return respon;
    }
//    public static void main(String[] args) {
//        List<QLThongKeResponse> lists = new QLThongKeService().getThongKe();
//        for (QLThongKeResponse x : lists) {
//            System.out.println(x.toString());
//        }
//    }

    @Override
    public List<HoaDon> getDoanhThu() {
        return hdRepo.DoanhThu();

    }

    @Override
    public List<QLThongKeResponse> getDoanhThuChart() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
