
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.KhuyenMai;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
@Getter
@Setter
@ToString
public class KhuyenMaiReponse {
    private UUID idKM;
    private String maKM;
    private String tenKM;
    private String ngayBD,ngayKT,ngayTao,ngaySua;
    private String moTa;
    private Integer giamGia;
    private Integer tinhTrang;

    public KhuyenMaiReponse() {
    }

    public KhuyenMaiReponse(KhuyenMai km) {
        this.idKM = km.getIdKM();
        this.maKM = km.getMaKM();
        this.tenKM = km.getTenKM();
        this.ngayBD = km.getNgayBD()+"";
        this.ngayKT = km.getNgayKT()+"";
        this.moTa = km.getMoTa();
        this.giamGia = km.getGiamGia();
        this.tinhTrang = km.getTinhTrang();
        this.ngayTao = km.getNgayTao()+"";
        this.ngaySua = km.getNgaySua()+"";
    }
    
}
