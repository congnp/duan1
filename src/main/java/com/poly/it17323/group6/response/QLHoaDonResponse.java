
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.HoaDon;
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
    
    private String tenKH, maHD;
    
    private String phuongThucTT;
    
    private String tongTien;
    
    private String trangThai;
    
    private String ngayTao;
    
    private String ngaySua;
    
    
    public QLHoaDonResponse() {
    }

    public QLHoaDonResponse(HoaDon hoaDon) {
        this.maND = hoaDon.getNguoiDung().getMaND();
        this.maKH = hoaDon.getKhachHang().getMaKH();
        this.tenKH = hoaDon.getKhachHang().getHoTen();
        this.maHD = hoaDon.getMaHD();
        this.phuongThucTT = hoaDon.getPttt()+"";
        this.tongTien = hoaDon.getTongTien()+"";
        this.trangThai = hoaDon.getTinhTrang()+"";
        this.ngayTao = hoaDon.getNgayTao();
        this.ngaySua = hoaDon.getNgaySua();
        
    }
    
    
}
