/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

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

    private static int ma = 1;
    private String idHD;
    private String idND;
    private String idKH;
    private String maHD;
    private String pttt;
    private String tongTien;
    private Date ngaySua;
    private Date ngayTao;

    public BanhangReponse(String idHD, String idND, String idKH, String maHD, String pttt, String tongTien, Date ngayTao, Date ngaySua) {
        this.idHD = idHD;
        this.idND = idND;
        this.idKH = idKH;
        this.maHD = maHD;
        this.pttt = pttt;
        this.tongTien = tongTien;
        this.ngaySua = ngaySua;
        this.ngayTao = ngayTao;
    }

    public String getMaTang() {
        return "HD" + (ma++);
    }

}
