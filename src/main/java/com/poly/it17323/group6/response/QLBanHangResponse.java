
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
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
public class QLBanHangResponse {
    private String maHoaDon;
    
    private String maND;
    
    private String ngayTao;
    
    private String tinhTrangHoaDon, tenND, tongTien, phuongThucTT;
    
    private String maSP, tenSP, soLuongMua, donGia, giamGia;
    
    private String chatLieu, size, mauSac, soLuongTon;

    public QLBanHangResponse() {
    }

    public QLBanHangResponse(HoaDon hoaDon, HoaDonChiTiet hdct, ChiTietSanPham sp) {
        this.maHoaDon = hoaDon.getMaHD();
        this.maND = hoaDon.getNguoiDung().getMaND();
        this.ngayTao = hoaDon.getNgayTao();
        this.tinhTrangHoaDon = hoaDon.getTinhTrang()+"";
        this.maSP = sp.getSanPham().getMaSP();
        this.tenSP = sp.getSanPham().getTenSP();
        this.soLuongMua = hdct.getSlMua()+"";
        this.donGia = hdct.getGia()+"";
        this.giamGia = hdct.getGiaKM()+"";
        this.chatLieu = sp.getChatLieu().getTenCL();
        this.size = sp.getSize().getTen();
        this.mauSac = sp.getMauSac().getTenMS();
        this.soLuongTon = sp.getSlTon()+"";
        this.tenND = hoaDon.getNguoiDung().getHoTen();
        this.tongTien = hoaDon.getTongTien()+"";
        this.phuongThucTT = hoaDon.getPttt()+"";
    }
    
    
}
