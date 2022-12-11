package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.hibernateconfig.EmailSender;
import com.poly.it17323.group6.repository.ChucVuRepository;
import com.poly.it17323.group6.repository.NguoiDungRepository;
import com.poly.it17323.group6.response.NguoiDungReponse;
import com.poly.it17323.group6.service.INguoiDungService;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author Admin
 */
public class NguoiDungService implements INguoiDungService {

    private final NguoiDungRepository ndRepo = new NguoiDungRepository();
    private final ChucVuRepository cvRepo = new ChucVuRepository();
    private static String tenTk;
    private static String mk;
    private static String emailCheck;
    private final static int random_int = (int) Math.floor(Math.random() * (999999 - 100000 + 1));
    private EmailSender es = new EmailSender();
    private final String email = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private int ma = ndRepo.getAll().size() + 1;

    @Override
    public List<NguoiDung> getAll() {
        return ndRepo.getAll();
    }

    @Override
    public boolean add(NguoiDungReponse ND) {
        tenTk = ND.getTenTK();
        mk = ND.getMatKhau();
        Date ngaySinh = Date.valueOf(ND.getNgaySinh());
        Date ngayTao = Date.valueOf(ND.getNgayTao());
        Date ngaySua = Date.valueOf(ND.getNgaySua());
        ChucVu cv = cvRepo.getOneND("Nhân viên");
        ndRepo.add(new NguoiDung(null, new NguoiDungService().getMaTang(), ND.getTenTK(), ND.getMatKhau(), ND.getHoVaTen(), ND.getGioiTinh(), ngaySinh, emailCheck, ND.getSdt(), ND.getDiaChi(), ND.getCccd(), ND.getTinhTrang(), ngayTao, ngaySua, cv));
        return true;
    }

    @Override
    public boolean update(NguoiDungReponse ND) {
        Date ngaySinh = Date.valueOf(ND.getNgaySinh());
        Date ngayTao = Date.valueOf(ND.getNgayTao());
        Date ngaySua = Date.valueOf(ND.getNgaySua());

        ChucVu cv = cvRepo.getOneND("Nhân viên");
        ndRepo.update_nd(new NguoiDung(ND.getIdND(), ND.getMaND(), ND.getTenTK(), ND.getMatKhau(), ND.getHoVaTen(), ND.getGioiTinh(), ngaySinh, ND.getEmail(), ND.getSdt(), ND.getDiaChi(), ND.getCccd(), ND.getTinhTrang(), ngayTao, ngaySua, cvRepo.getOne(cv.getIdCV())));
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
        emailCheck = ND.getEmail();
        try {
            es.guiMail("Ma xac nhan", ND.getEmail(), "Mã xác nhận của bạn là :" + random_int);
        } catch (MessagingException ex) {
            Logger.getLogger(NguoiDungService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Vui lòng lấy mã xác nhận ở Mail";

    }

    @Override
    public String emaiFals(NguoiDungReponse ndr) {
        if (ndr.getEmail().isBlank()) {
            return "Vui lòng nhập email";
        } else if (!ndr.getEmail().trim().matches(email)) {
            return "Email không đúng định dạng";
        }
        return null;
    }

    @Override
    public String checkMa(String maXn) {
        return maXn.equals(String.valueOf(random_int)) ? "Xác nhận thành công" : "Mã xác nhận sai";
    }

    @Override
    public String guiTkMk(NguoiDungReponse ndr) {
        try {
            es.guiMail("Ten TK và MK", emailCheck, "Tên TK:" + ndr.getTenTK() + "\n" + "Mật khẩu:" + ndr.getMatKhau());
        } catch (MessagingException ex) {

        }
        return null;
    }

    @Override
    public boolean checkEmail(String email) {
        List<NguoiDung> list = ndRepo.getAll();
        for (NguoiDung nguoiDung : list) {
            if (nguoiDung.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<NguoiDung> getTT(int tt) {
        return ndRepo.getTT(tt);
    }

    @Override
    public boolean checkMaND(String ma) {
        List<NguoiDung> list = ndRepo.getAll();
        for (NguoiDung nguoiDung : list) {
            if (nguoiDung.getMaND().equals(ma)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getMaTang() {
        return "ND01" + (ma++);
    }

}
