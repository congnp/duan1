package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.repository.ChiTietSanPhamRepository;
import com.poly.it17323.group6.repository.HoaDonChiTietRepository;
import com.poly.it17323.group6.repository.HoaDonRepository;
import com.poly.it17323.group6.repository.KhachHangRepository;
import com.poly.it17323.group6.repository.KhuyenMaiRepository;
import com.poly.it17323.group6.repository.NguoiDungRepository;
import com.poly.it17323.group6.response.BanhangReponse;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import com.poly.it17323.group6.service.IQLBanHangService;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author pdanh
 */
public class BanHangService implements IQLBanHangService {

    private final HoaDonRepository hdRepo = new HoaDonRepository();
    private final HoaDonChiTietRepository hdctRepo = new HoaDonChiTietRepository();
    private final ChiTietSanPhamRepository ctspRepo = new ChiTietSanPhamRepository();
    private final KhuyenMaiRepository kmRepo = new KhuyenMaiRepository();
    private final KhachHangRepository khRepo = new KhachHangRepository();
    private final NguoiDungRepository ndRepo = new NguoiDungRepository();
    private int ma = hdRepo.getAll().size() + 1;

    @Override
    public boolean add_HD(BanhangReponse b) {
        java.util.Date currentDate = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayTao;
        ngayTao = Date.valueOf(sdf.format(currentDate));
        hdRepo.add(new HoaDon(null, new BanHangService().getMaTang(), 0, BigDecimal.valueOf(0.0), 0, ngayTao, ngayTao, b.getNd(), b.getKh()));
        return true;
    }

    @Override
    public boolean update_HD(BanhangReponse b) {
        hdRepo.update(b.getHd().getIdHD(), b.getTongTien(), b.getTinhTrang(), b.getPttt());
        return true;
    }

    @Override
    public boolean update_HD_KH(BanhangReponse b) {
        hdRepo.update(b.getHd().getIdHD(), b.getKh());
        return true;
    }

    @Override
    public boolean add_HDCT(BanhangReponse b) {
        hdctRepo.add(new HoaDonChiTiet(null, b.getCtsp().getGia(), Integer.parseInt(b.getSlMua()), new BigDecimal(1 - (b.getKm().getGiamGia() / 100.0)).multiply(b.getCtsp().getGia()), b.getHd(), b.getKm(), b.getCtsp()));
        return true;
    }

    @Override
    public boolean updateSL_HDCT(BanhangReponse b) {
        hdctRepo.update(b.getHdct().getIdHDCT(), Integer.parseInt(b.getSlMua()));
        return true;
    }

    @Override
    public boolean delete_HDCT(BanhangReponse b) {
        hdctRepo.delete(b.getHdct().getIdHDCT());
        return true;
    }

    @Override
    public boolean updateSL_CTSP(BanhangReponse b) {
        ctspRepo.update(b.getCtsp().getId(), Integer.parseInt(b.getSlMua()));
        return true;
    }

    @Override
    public String getMaTang() {
        return "HD0" + (ma++);
    }

    @Override
    public List<ChiTietSanPham> getAll_CTSP() {
        return ctspRepo.getAll();
    }

    @Override
    public List<HoaDonChiTiet> getAll_HDCT() {
        return hdctRepo.getAll();
    }

    @Override
    public List<HoaDonChiTiet> getAll_HDCTByIDHD(UUID id) {
        return hdctRepo.getAllByIDHD(id);
    }

    @Override
    public List<HoaDon> getAll_HD() {
        return hdRepo.getAll();
    }

    @Override
    public List<KhachHang> getAll_KH() {
       return khRepo.getAll();
    }

    @Override
    public KhachHang getOne_KH(UUID id) {
        return khRepo.getOne(id);
    }

    @Override
    public List<KhuyenMai> getAll_KM() {
        return kmRepo.getAll();
    }

    @Override
    public NguoiDung getOne_ND(UUID id) {
        return ndRepo.getOne(id);
    }

    @Override
    public List<NguoiDung> getAll_ND() {
        return ndRepo.getAll();
    }


 

}
