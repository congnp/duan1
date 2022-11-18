/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.response.AnhResponse;
import com.poly.it17323.group6.response.ChatLieuResponse;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IQLChatLieuService {
    List<ChatLieuResponse> getAllQLCL();
    
    ChatLieuResponse getOneQLCL(String id);
    
    boolean addQLCL(ChatLieuResponse qlCL);
    
    boolean updateQLCL(ChatLieuResponse qlCL);
    
    boolean deleteQLCL(ChatLieuResponse qlCL);
}
