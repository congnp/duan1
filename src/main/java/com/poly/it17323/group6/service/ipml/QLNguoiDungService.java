/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.hibernateconfig.EmailSender;
import com.poly.it17323.group6.repository.NguoiDungRepository;
import com.poly.it17323.group6.response.QLNguoiDungResponse;
import com.poly.it17323.group6.service.IQLNguoiDungService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author Admin
 */
public class QLNguoiDungService implements IQLNguoiDungService {

    private EmailSender es = new EmailSender();
    private final NguoiDungRepository repo = new NguoiDungRepository();
    private final String email = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private final static int random_int = (int) Math.floor(Math.random() * (9000 - 1000 + 1));

    @Override
    public List<QLNguoiDungResponse> getAllNguoiDung() {
        List<NguoiDung> list = repo.getAll();
        List<QLNguoiDungResponse> respon = new ArrayList<>();
        for (NguoiDung nguoiDung : list) {
            QLNguoiDungResponse nd = new QLNguoiDungResponse(nguoiDung);
            respon.add(nd);
        }
        return respon;
    }

    @Override
    public String Login(QLNguoiDungResponse response) {
        if (response.getTenTK().trim().isBlank()) {
            return "Không được để trống tên tài khoản";
        } else if (response.getMatKhau().trim().isBlank()) {
            return "Không được để trống mật khẩu";
        }
        for (NguoiDung NguoiDung : repo.getAll()) {
            if (NguoiDung.getTenTK().equalsIgnoreCase(response.getTenTK()) && NguoiDung.getMatKhau().equalsIgnoreCase(response.getMatKhau()) && NguoiDung.getChucVu().getTenCV().equalsIgnoreCase(response.getTenCV())) {
                return "Đăng nhập thành công";
            }
        }
        return "Đăng nhập thất bại";
    }

    @Override
    public String checkMail(QLNguoiDungResponse nd) {
        for (QLNguoiDungResponse qLNguoiDungResponse : getAllNguoiDung()) {
            if (qLNguoiDungResponse.getEmail().equals(nd.getEmail())) {
                try {
                    es.guiMail(nd.getEmail(),"Mat khau moi cua ban la: "+random_int);
                    return "Vui lòng kiểm tra Email để lấy Pass";
                } catch (MessagingException ex) {
                    Logger.getLogger(QLNguoiDungService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    @Override
    public boolean addQLND(QLNguoiDungResponse qlND) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updatePass(QLNguoiDungResponse qlND) {
        if (qlND.getNewPass().isBlank()) {
            return "Bạn chưa nhập Pass";
        } else if (qlND.getConFirm().isBlank()) {
            return "Bạn chưa nhập xác nhận Pass";
        }
        else if(!qlND.getNewPass().equals(String.valueOf(random_int))){
            return "Mat khau khong dung voi mail";
        }
        else if (!qlND.getConFirm().matches(qlND.getNewPass())) {
            return "Confirm không đúng Pass";
        } else {
            NguoiDung nd = new NguoiDung();
//            nd.setMatKhau(qlND.getMatKhau());
//            nd.setEmail(qlND.getEmail());
            if (repo.update(nd)) {
                return "Cập nhật Pass thành công";
            }
        }
        return null;
    }

//    public static void main(String[] args) {
//        List<QLNguoiDungResponse> list = new QLNguoiDungService().getAllNguoiDung();
//        for (QLNguoiDungResponse p : list) {
//            System.out.println(p.toString());
//        }
//    }
}
