/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class SizeResponse {
    private String idSize;
    
    private String maSize;
    
    private String tenSize;

    public SizeResponse(Size size) {
        this.idSize = size.getId();
        this.maSize = size.getMa();
        this.tenSize = size.getTen();
    }
    
    

}
