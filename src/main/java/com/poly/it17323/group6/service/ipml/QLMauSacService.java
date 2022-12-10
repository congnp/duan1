/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.MauSac;
import com.poly.it17323.group6.domainmodel.SanPham;
import com.poly.it17323.group6.repository.MauSacRepository;
import com.poly.it17323.group6.response.QLSanPhamResponse;
import com.poly.it17323.group6.service.IQLMauSacService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class QLMauSacService implements IQLMauSacService {

    private MauSacRepository repo = new MauSacRepository();
    
    private int ma = repo.getAll().size() + 1;

    @Override
    public String getMaTang() {
        return "M0" + (ma++);
    } 
    
    @Override
    public List<QLSanPhamResponse> getAllQLMauSac() {
        List<MauSac> list = repo.getAll();
        List<QLSanPhamResponse> respon = new ArrayList<>();
        for (MauSac mausac : list) {
            QLSanPhamResponse ms = new QLSanPhamResponse(mausac);
            respon.add(ms);
        }
        return respon;
    }

    @Override
    public QLSanPhamResponse getOneQLMauSac(UUID id) {
        MauSac ms = repo.getOne(id);
        if (ms == null) {
            return null;
        } else {
            return new QLSanPhamResponse(ms);
        }
    }

    @Override
    public boolean addQLMauSac(QLSanPhamResponse qlMauSac) {
        
        if (qlMauSac.getTenMauSac().length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được để trống tên !!! ");
            return false;
        }
        if((new QLMauSacService().getOneByTenMS(qlMauSac.getTenMauSac())) != null){
            JOptionPane.showMessageDialog(null, "Không được để trùng tên !!! ");
            return false;
        }else{
            return repo.add(new MauSac(null, new QLMauSacService().getMaTang(), qlMauSac.getTenMauSac()));
        }
    }

    @Override
    public boolean updateQLMauSac(QLSanPhamResponse qlMauSac) {
        var ms = repo.update(new MauSac(qlMauSac.getIdMauSac(), qlMauSac.getMaMauSac(), qlMauSac.getTenMauSac()));
        return ms;
    }

    @Override
    public boolean deleteQLMauSac(QLSanPhamResponse qlMauSac) {
        MauSac sp = new MauSac();
        sp.setIdMS(qlMauSac.getIdMauSac());
       return repo.delete(sp);
    }
    
        @Override
    public QLSanPhamResponse getOneByTenMS(String ten) {
        List<MauSac> list = repo.getOneByTen(ten);
        List<QLSanPhamResponse> respon = new ArrayList<>();
        for (MauSac ms : list) {
            QLSanPhamResponse sp = new QLSanPhamResponse(ms);
            respon.add(sp);
        }
        if(respon.size()>0){
            return respon.get(0);
        }else{
            return null;
        }
    }

}
