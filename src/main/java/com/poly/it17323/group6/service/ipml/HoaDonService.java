package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.repository.HoaDonRepository;
import com.poly.it17323.group6.service.IHoaDonService;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author ASUS
 */
public class HoaDonService implements IHoaDonService {

    private final HoaDonRepository repoHD = new HoaDonRepository();

    @Override
    public List<HoaDon> getAll() {
        return repoHD.getAll();
    }

    @Override
    public boolean update(HoaDon hd) {
        repoHD.update(hd);
        return true;
    }

    @Override
    public boolean delete(UUID idHD) {
        repoHD.delete(idHD);
        return true;
    }

    @Override
    public List<HoaDon> getByMa(String ma) {
        return (List<HoaDon>) repoHD.getByMa2(ma);
    }

}
