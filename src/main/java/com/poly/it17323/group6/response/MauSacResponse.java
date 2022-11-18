/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.MauSac;
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
public class MauSacResponse {
    private String idMS;
    
    private String maMS;
    
    private String tenMS;

    public MauSacResponse() {
    }

    public MauSacResponse(MauSac mauSac) {
        this.idMS = mauSac.getIdMS();
        this.maMS = mauSac.getMaMS();
        this.tenMS = mauSac.getTenMS();
    }
    
}
