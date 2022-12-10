package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import java.math.BigDecimal;
import java.sql.Date;
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

    private int pttt;
    private BigDecimal tongTienMat;
    private BigDecimal tongTienCK;
    private int tinhTrang;
    private Date ngayTT;
    private int tttt;
    private Date ngayMuonNhan;
    private Date ngayGui;
    private Date ngayNhan;
    private BigDecimal tienShip;

    private HoaDonChiTiet hdct;

    // INSERT HOA DON 
    public BanhangReponse(NguoiDung nd, KhachHang kh) {
        this.nd = nd;
        this.kh = kh;
    }

    // UPDATE HOA DON TAI QUAY
    public BanhangReponse(HoaDon hd, int pttt, BigDecimal tienMat, BigDecimal tienCK, int tinhTrang) {
        this.hd = hd;
        this.tongTienMat = tienMat;
        this.tongTienCK = tienCK;
        this.tinhTrang = tinhTrang;
        this.pttt = pttt;
    }

    // UPDATE HOA DON DAT HANG
    public BanhangReponse(HoaDon hd, int pttt, BigDecimal tongTienMat, BigDecimal tongTienCK, int tinhTrang, Date ngayTT, int tttt, Date ngayMuonNhan, Date ngayGui, Date ngayNhan, BigDecimal tienShip) {
        this.hd = hd;
        this.pttt = pttt;
        this.tongTienMat = tongTienMat;
        this.tongTienCK = tongTienCK;
        this.tinhTrang = tinhTrang;
        this.ngayTT = ngayTT;
        this.tttt = tttt;
        this.ngayMuonNhan = ngayMuonNhan;
        this.ngayGui = ngayGui;
        this.ngayNhan = ngayNhan;
        this.tienShip = tienShip;
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
     
    // DELETE ALL HDCT
    public BanhangReponse(HoaDon hd) {
        this.hd = hd;
    }

    // UPDATE CTSP
    public BanhangReponse(ChiTietSanPham ctsp, String slMua) {
        this.ctsp = ctsp;
        this.slMua = slMua;
    }

}
