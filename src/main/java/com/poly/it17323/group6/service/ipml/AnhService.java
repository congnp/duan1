/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.Anh;
import com.poly.it17323.group6.repository.AnhRepository;
import com.poly.it17323.group6.response.QLSanPhamResponse;
import com.poly.it17323.group6.service.IAnhService;
import com.poly.it17323.group6.service.ISanPhamChiTietService;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class AnhService implements IAnhService {

    private final AnhRepository repo = new AnhRepository();
    
    private int ma = repo.getAll().size() + 1;

    @Override
    public String getMaTang() {
        return "A0" + (ma++);
    }
    
    @Override
    public List<Anh> getAllQLAnh() {
        return repo.getAll();
    }

    @Override
    public List<Anh> getAllByIdCTSP(UUID id) {
        return repo.getAllByIDCTSP(id);
    }

    @Override
    public Anh getOneQLAnh(UUID id) {
        return repo.getOne(id);
    }

    @Override
    public boolean addQLAnh(Anh qlAnh) {
        qlAnh.setMaAnh(new AnhService().getMaTang());
        return repo.add(qlAnh);
    }

    @Override
    public boolean updateQLCL(Anh qlAnh) {
        return repo.update(qlAnh);
    }

    @Override
    public boolean deleteQLCL(Anh qlAmh) {
        return repo.delete(qlAmh);
    }

}
