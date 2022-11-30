package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author pdanh
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BanhangReponse {

    private NguoiDung nd;
    private KhachHang kh;

    private HoaDon hd;
    private ChiTietSanPham ctsp;
    private String slMua;
    private KhuyenMai km;

    private BigDecimal tongTien;
    private int tinhTrang;
    private int pttt;

    private HoaDonChiTiet hdct;

    // INSERT HOA DON 
    public BanhangReponse(NguoiDung nd, KhachHang kh) {
        this.nd = nd;
        this.kh = kh;
    }

    // UPDATE HOA DON
    public BanhangReponse(HoaDon hd, BigDecimal tongTien, int tinhTrang, int pttt) {
        this.hd = hd;
        this.tongTien = tongTien;
        this.tinhTrang = tinhTrang;
        this.pttt = pttt;
    }

    // UPDATE HOA DON (KH)
    public BanhangReponse(HoaDon hd, KhachHang kh) {
        this.kh = kh;
        this.hd = hd;
    }

    // INSERT HDCT
    public BanhangReponse(HoaDon hd, ChiTietSanPham ctsp, String slMua, KhuyenMai km) {
        this.hd = hd;
        this.ctsp = ctsp;
        this.slMua = slMua;
        this.km = km;
    }

    // UPDATE HDCT
    public BanhangReponse(HoaDonChiTiet hdct, String slMua) {
        this.hdct = hdct;
        this.slMua = slMua;
    }

    // DELETE HDCT
    public BanhangReponse(HoaDonChiTiet hdct) {
        this.hdct = hdct;
    }

    // UPDATE CTSP
    public BanhangReponse(ChiTietSanPham ctsp, String slMua) {
        this.ctsp = ctsp;
        this.slMua = slMua;
    }

}
