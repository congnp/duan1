package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.repository.ChucVuRepository;
import com.poly.it17323.group6.repository.NguoiDungRepository;
import com.poly.it17323.group6.response.NguoiDungReponse;
import com.poly.it17323.group6.service.INguoiDungService;
import java.sql.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class NguoiDungService implements INguoiDungService {

    private final NguoiDungRepository ndRepo = new NguoiDungRepository();
    private final ChucVuRepository cvRepo = new ChucVuRepository();

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

}
