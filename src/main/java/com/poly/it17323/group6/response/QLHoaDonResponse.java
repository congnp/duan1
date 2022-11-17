
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author pdanh
 */
@Getter
@Setter
@ToString
public class QLHoaDonResponse {
    private String maND;
    
    private String maKH;
    
    private String tenKH;
    
    private String phuongThucTT;
    
    private String tongTien;
    
    private String trangThai;
    
    private String ngayTao;
    
    private String ngaySua;
    
    private String tenSp, loaiSp, chatLieu, size;
    
    private String mauSac, soLuongMua, giaTien, giamGia, giaSauKm;

    public QLHoaDonResponse() {
    }

    public QLHoaDonResponse(HoaDon hoaDon,HoaDonChiTiet hoaDonct, KhuyenMai khuyenMai, ChiTietSanPham chiTietsp, KhachHang khachHang, NguoiDung nguoiDung) {
        this.maND = nguoiDung.getMaND();
        this.maKH = khachHang.getMaKH();
        this.tenKH = khachHang.getHoTen();
        this.phuongThucTT = hoaDon.getPttt()+"";
        this.tongTien = hoaDon.getTongTien()+"";
        this.trangThai = hoaDon.getTinhTrang()+"";
        this.ngayTao = hoaDon.getNgayTao();
        this.ngaySua = hoaDon.getNgaySua();
        this.tenSp = chiTietsp.getSanPham().getTenSP();
        this.loaiSp = chiTietsp.getLoaiSP().getTen();
        this.chatLieu = chiTietsp.getChatLieu().getTenCL();
        this.size = chiTietsp.getSize().getTen();
        this.mauSac = chiTietsp.getMauSac().getTenMS();
        this.soLuongMua = hoaDonct.getSlMua()+"";
        this.giaTien = hoaDonct.getGia()+"";
        this.giamGia = khuyenMai.getGiamGia()+"";
        this.giaSauKm = hoaDonct.getGiaKM()+"";
    }
    
    
}
