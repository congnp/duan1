/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.ChatLieu;
import com.poly.it17323.group6.repository.ChatLieuRepository;
import com.poly.it17323.group6.response.ChatLieuResponse;
import com.poly.it17323.group6.service.IQLChatLieuService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLChatLieuService implements IQLChatLieuService {

    private ChatLieuRepository repo = new ChatLieuRepository();

    @Override
    public List<ChatLieuResponse> getAllQLCL() {
        List<ChatLieu> list = repo.getAll();
        List<ChatLieuResponse> respon = new ArrayList<>();
        for (ChatLieu cl : list) {
            ChatLieuResponse chatlieu = new ChatLieuResponse(cl);
            respon.add(chatlieu);
        }
        return respon;
    }

    @Override
    public ChatLieuResponse getOneQLCL(String id) {
        ChatLieu cl = repo.getOne(id);
        if (cl == null) {
            return null;
        } else {
            return new ChatLieuResponse(cl);
        }
    }

    @Override
    public boolean addQLCL(ChatLieuResponse qlCL) {
        qlCL.setIdCL(null);
        var cl = repo.add(new ChatLieu(qlCL.getIdCL(), qlCL.getMaCL(), qlCL.getTenCL()));
        return cl;
    }

    @Override
    public boolean updateQLCL(ChatLieuResponse qlCL) {
        var cl = repo.update(new ChatLieu(qlCL.getIdCL(), qlCL.getMaCL(), qlCL.getTenCL()));
        return cl;
    }

    @Override
    public boolean deleteQLCL(ChatLieuResponse qlCL) {
        var cl = repo.delete(new ChatLieu(qlCL.getIdCL(), qlCL.getMaCL(), qlCL.getTenCL()));
        return cl;
    }

}
