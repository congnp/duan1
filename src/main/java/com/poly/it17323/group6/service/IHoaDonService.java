package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.HoaDon;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author ASUS
 */
public interface IHoaDonService {

    List<HoaDon> getAll();

    boolean update(HoaDon hd);

    boolean delete(UUID idHD);
    
    List<HoaDon> getByMa(String ma);
}
