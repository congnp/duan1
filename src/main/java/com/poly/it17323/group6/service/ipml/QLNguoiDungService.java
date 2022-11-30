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
import com.poly.it17323.group6.view.SRM_ExceptToken;
import com.poly.it17323.group6.view.SRM_ResetPass;
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
    private final String valiPass = "^[a-z0-9-]{8,16}$";
    private final static int random_int = (int) Math.floor(Math.random() * (999999 - 10000 + 1));

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
    public String login(QLNguoiDungResponse response) {
//        List<QLNguoiDungResponse> qlndr = new ArrayList<>();
        for (QLNguoiDungResponse NguoiDung : getAllNguoiDung()) {
            if (NguoiDung.getTenTK().equalsIgnoreCase(response.getTenTK()) && NguoiDung.getMatKhau().equalsIgnoreCase(response.getMatKhau())) {
//                qlndr.add(NguoiDung);
                return "Đăng nhập thành công";
            }
        }
        return null;
    }

    @Override
    public QLNguoiDungResponse getOneNv(QLNguoiDungResponse response) {
        NguoiDung nd = new NguoiDung();
        nd.setTenTK(response.getTenTK());
        nd.setMatKhau(response.getMatKhau());
        repo.getOneND(nd);
        QLNguoiDungResponse qlndr = new QLNguoiDungResponse(repo.getOneND(nd));
        return qlndr;

//        for (QLNguoiDungResponse NguoiDung : getAllNguoiDung()) {
//            if (NguoiDung.getTenTK().equalsIgnoreCase(response.getTenTK()) && NguoiDung.getMatKhau().equalsIgnoreCase(response.getMatKhau())) {
////                qlndr.setCmt_cccd(NguoiDung.getCmt_cccd());
////                qlndr.setConFirm(NguoiDung.getEmail());
////                qlndr.setDiaChi(NguoiDung.getDiaChi());
////                qlndr.setGioiTinh(NguoiDung.getGioiTinh());
////                qlndr.setTenTK(NguoiDung.getTenTK());
////                qlndr.setMatKhau(NguoiDung.getMatKhau());
////                qlndr.setTenCV(qlndr.getTenCV());
////                qlndr.setMaCV(NguoiDung.getMaCV());
////                qlndr.setMaND(NguoiDung.getMaND());
//                return NguoiDung;
//            }
//        }
//        return null;
    }

//    public static void main(String[] args) {
//        QLNguoiDungResponse qlndr1 = new QLNguoiDungResponse();
//        qlndr1.setTenTK("vanne1312");
//        qlndr1.setMatKhau("87654321");
////        qlndr1.setTenCV("Nhân viên");
//        QLNguoiDungResponse qlndr = new QLNguoiDungService().getOneNv(qlndr1);
//        System.out.println(qlndr.toString());
//
//    }
    @Override
    public String loginFailse(QLNguoiDungResponse qlndr) {
        if (qlndr.getTenTK().isBlank()) {
            return "Không được để trống tên tài khoản";
        } else if (qlndr.getMatKhau().isBlank()) {
            return "Không được để trống mật khẩu";
        } else if (login(qlndr) == null) {
            return "Tên tài khoản hoặc mật khẩu không chính xác";
        }
        return null;
    }

    @Override
    public String checkMail(QLNguoiDungResponse nd) {
        for (NguoiDung qLNguoiDungResponse : repo.getAll()) {
            if (qLNguoiDungResponse.getEmail().equalsIgnoreCase(nd.getEmail())) {
                try {
                    es.guiMail(nd.getEmail(), "Mã xác nhận của bạn là :" + random_int);
                    return "Vui lòng lấy mã xác nhận ở Mail";
                } catch (MessagingException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public String emailFailse(QLNguoiDungResponse qlndr) {
        if (qlndr.getEmail().isBlank()) {
            return "Vui lòng nhập email";
        } else if (!qlndr.getEmail().trim().matches(email)) {
            return "Email không đúng định dạng";
        } else if (checkMail(qlndr) == null) {
            return "Email không tồn tại trong hệ thống";
        }
        return null;
    }

    @Override
    public String checkMa(String maXn) {
//        if (maXn.equals(String.valueOf(random_int))) {
//            return "Xác nhận thành công";
//        } else {
//            return "Xác nhận thất bại";
//        }
        return maXn.equals(String.valueOf(random_int)) ? "Xác nhận thành công" : "Mã xác nhận sai";
    }

    @Override
    public boolean addQLND(QLNguoiDungResponse qlND) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updatePass(QLNguoiDungResponse qlND) {
        if (qlND.getNewPass().isBlank()) {
            return "Bạn chưa nhập Pass";
        } else if (!qlND.getNewPass().trim().matches(valiPass)) {
            return "Mật khẩu không được chứa kí tự đặc biệt,viết hoa và từ 8-16 kí tự";
        } else if (qlND.getConFirm().isBlank()) {
            return "Bạn chưa nhập xác nhận Pass";
        } else if (!qlND.getConFirm().trim().matches(qlND.getNewPass().trim())) {
            return "Confirm không đúng Pass";
        } else {
            NguoiDung nd = new NguoiDung();
            nd.setMatKhau(qlND.getNewPass());
            nd.setEmail(qlND.getEmail());
            System.out.println(nd.toString());
            if (repo.update(nd) == true) {
                return "Cập nhật Pass thành công";
            } else {
                return "Cập nhật Pass thất bại";
            }
        }
    }

}
