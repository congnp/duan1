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
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class QLChatLieuService implements IQLChatLieuService {

    private ChatLieuRepository repo = new ChatLieuRepository();
    
    private int ma = repo.getAll().size() + 1;

    @Override
    public String getMaTang() {
        return "CL0" + (ma++);
    }
    
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
        if (qlCL.getTenChatLieu().length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được để trống tên !!! ");
            return false;
        }
        if((new QLChatLieuService().getOneByTenCL(qlCL.getTenChatLieu())) != null){
            JOptionPane.showMessageDialog(null, "Không được để trùng tên !!! ");
            return false;
        }else{
            return repo.add(new ChatLieu(null,new QLChatLieuService().getMaTang(), qlCL.getTenChatLieu()));
        }
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
    
        @Override
    public QLSanPhamResponse getOneByTenCL(String ten) {
        List<ChatLieu> list = repo.getOneByTen(ten);
        List<QLSanPhamResponse> respon = new ArrayList<>();
        for (ChatLieu cl : list) {
            QLSanPhamResponse chatL = new QLSanPhamResponse(cl);
            respon.add(chatL);
        }
        if(respon.size()>0){
            return respon.get(0);
        }else{
            return null;
        }
    }

}
