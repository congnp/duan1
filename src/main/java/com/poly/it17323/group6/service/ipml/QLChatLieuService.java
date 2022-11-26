/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.ChatLieu;
import com.poly.it17323.group6.repository.ChatLieuRepository;
import com.poly.it17323.group6.response.QLSanPhamResponse;
import com.poly.it17323.group6.service.IQLChatLieuService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class QLChatLieuService implements IQLChatLieuService {

    private ChatLieuRepository repo = new ChatLieuRepository();

    @Override
    public List<QLSanPhamResponse> getAllQLCL() {
        List<ChatLieu> list = repo.getAll();
        List<QLSanPhamResponse> respon = new ArrayList<>();
        for (ChatLieu cl : list) {
            QLSanPhamResponse chatlieu = new QLSanPhamResponse(cl);
            respon.add(chatlieu);
        }
        return respon;
    }

    @Override
    public boolean addQLCL(QLSanPhamResponse qlCL) {
        var cl = repo.add(new ChatLieu(null, qlCL.getMaChatLieu(), qlCL.getTenChatLieu()));
        return cl;
    }

    @Override
    public boolean updateQLCL(QLSanPhamResponse qlCL) {
        var cl = repo.update(new ChatLieu(qlCL.getIdChatLieu(), qlCL.getMaChatLieu(), qlCL.getTenChatLieu()));
        return cl;
    }

    @Override
    public boolean deleteQLCL(QLSanPhamResponse qlCL) {
        ChatLieu sp = new ChatLieu();
        sp.setIdCL(qlCL.getIdChatLieu());
        return repo.delete(sp);
    }

}
