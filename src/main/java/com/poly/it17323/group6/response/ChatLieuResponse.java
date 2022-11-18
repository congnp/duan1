/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.ChatLieu;
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
public class ChatLieuResponse {
    private String idCL;
    
    private String maCL;
    
    private String tenCL;

    public ChatLieuResponse(ChatLieu chatLieu) {
        this.idCL = chatLieu.getIdCL();
        this.maCL = chatLieu.getMaCL();
        this.tenCL = chatLieu.getTenCL();
    }
    

        
    
}
