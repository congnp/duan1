/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChucVu;
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
public class ChucVuResponse {
    private String idCV;
    
    private String maCV;
    
    private String tenCV;

    public ChucVuResponse() {
    }

    public ChucVuResponse(ChucVu chucVu) {
        this.idCV = chucVu.getIdCV();
        this.maCV = chucVu.getMaCV();
        this.tenCV = chucVu.getTenCV();
    }
    
    
}
