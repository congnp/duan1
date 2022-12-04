package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.hibernateconfig.EmailXacNhanThem;
import com.poly.it17323.group6.repository.ChucVuRepository;
import com.poly.it17323.group6.repository.NguoiDungRepository;
import com.poly.it17323.group6.response.NguoiDungReponse;
import com.poly.it17323.group6.service.INguoiDungService;
import java.sql.Date;
import java.util.List;
import java.util.UUID;
import javax.mail.MessagingException;

/**
 *
 * @author Admin
 */
public class NguoiDungService implements INguoiDungService {
    
    private final NguoiDungRepository ndRepo = new NguoiDungRepository();
    private final ChucVuRepository cvRepo = new ChucVuRepository();
    private static String emailCheck;
    private final static int random_int = (int) Math.floor(Math.random() * (999999 - 10000 + 1));
    private  EmailXacNhanThem esss = new EmailXacNhanThem();
    private final String email = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    @Override
    public List<NguoiDung> getAll() {
        return ndRepo.getAll();
    }

    @Override
    public boolean add(NguoiDungReponse ND) {
        Date ngaySinh = Date.valueOf(ND.getNgaySinh());
        Date ngayTao = Date.valueOf(ND.getNgayTao());
        Date ngaySua = Date.valueOf(ND.getNgaySua());
        ndRepo.add(new NguoiDung(null, ND.getMaND(), ND.getTenTK(), ND.getMatKhau(), ND.getHoVaTen(), ND.getGioiTinh(), ngaySinh, ND.getEmail(), ND.getSdt(), ND.getDiaChi(), ND.getCccd(), ND.getTinhTrang(), ngayTao, ngaySua, cvRepo.getOne(ND.getIdCV())));
        return true;
    }

    @Override
    public boolean update(NguoiDungReponse ND) {
        Date ngaySinh = Date.valueOf(ND.getNgaySinh());
        Date ngayTao = Date.valueOf(ND.getNgayTao());
        Date ngaySua = Date.valueOf(ND.getNgaySua());
        ndRepo.update_nd(new NguoiDung(ND.getIdND(), ND.getMaND(), ND.getTenTK(), ND.getMatKhau(), ND.getHoVaTen(), ND.getGioiTinh(), ngaySinh, ND.getEmail(), ND.getSdt(), ND.getDiaChi(), ND.getCccd(), ND.getTinhTrang(), ngayTao, ngaySua, cvRepo.getOne(ND.getIdCV())));
        return true;
    }

    @Override
    public boolean delete(NguoiDungReponse ND) {
        Date ngaySinh = Date.valueOf(ND.getNgaySinh());
        Date ngayTao = Date.valueOf(ND.getNgayTao());
        Date ngaySua = Date.valueOf(ND.getNgaySua());
        ndRepo.delete(new NguoiDung(ND.getIdND(), ND.getMaND(), ND.getTenTK(), ND.getMatKhau(), ND.getHoVaTen(), ND.getGioiTinh(), ngaySinh, ND.getEmail(), ND.getSdt(), ND.getDiaChi(), ND.getCccd(), ND.getTinhTrang(), ngayTao, ngaySua, cvRepo.getOne(ND.getIdCV())));
        return true;
    }

    @Override
    public NguoiDung getOne(UUID id) {
        return ndRepo.getOne(id);
    }

    @Override
    public List<NguoiDung> getByName(String name) {
       return ndRepo.getByName(name);
    }

    @Override
    public String checkEmailXacNhan(NguoiDungReponse ND) {
        for (NguoiDung qLNguoiDungResponse : ndRepo.getAll()) {
            if (qLNguoiDungResponse.getEmail().equalsIgnoreCase(ND.getEmail())) {
                emailCheck = ND.getEmail();
               try {
                    esss.guiMaXacNhan(ND.getEmail(), "Mã xác nhận của bạn là :" + random_int);   
                } catch (MessagingException ex) {
                    ex.printStackTrace();
                }
               return "Vui lòng lấy mã xác nhận ở Mail";
            }
        }
        return null;
    }

    @Override
    public String emaiFals(NguoiDungReponse ndr) {
        if (ndr.getEmail().isBlank()) {
            return "Vui lòng nhập email";
        } else if (!ndr.getEmail().trim().matches(email)) {
            return "Email không đúng định dạng";
        } else if (checkEmailXacNhan(ndr) == null) {
            return "Email không tồn tại trong hệ thống";
        }
        return null;
    }

    @Override
    public String checkMa(String maXn) {
         return maXn.equals(String.valueOf(random_int)) ? "Xác nhận thành công" : "Mã xác nhận sai";
    }

}
