/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.response.BanhangReponse;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author pdanh
 */
public interface IQLBanHangService {

    boolean add_HD(BanhangReponse b);

    boolean update_HD(BanhangReponse b);

    boolean update_HD_KH(BanhangReponse b);

    boolean add_HDCT(BanhangReponse b);

    boolean updateSL_HDCT(BanhangReponse b);

    boolean updateSL_CTSP(BanhangReponse b);

    boolean delete_HDCT(BanhangReponse b);

    String getMaTang();

    List<ChiTietSanPham> getAll_CTSP();

    List<ChiTietSanPham> getAll_ByName(String name);

    List<HoaDonChiTiet> getAll_HDCT();

    List<HoaDonChiTiet> getAll_HDCTByIDHD(UUID id);

    List<HoaDon> getAll_HD();

    List<KhachHang> getAll_KH();

    KhachHang getOne_KH(UUID id);

    List<KhuyenMai> getAll_KM();

    NguoiDung getOne_ND(UUID id);

    List<NguoiDung> getAll_ND();

}
