/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Admin
 */

public class ThongKeResponse {
    private BigDecimal tong;
    
    private Date ngayTao;

    public ThongKeResponse() {
    }

    public ThongKeResponse(BigDecimal tong, Date ngayTao) {
        this.tong = tong;
        this.ngayTao = ngayTao;
    }

    public BigDecimal getTong() {
        return tong;
    }

    public void setTong(BigDecimal tong) {
        this.tong = tong;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
    
}
