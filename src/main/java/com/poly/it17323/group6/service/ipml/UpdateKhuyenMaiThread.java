/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.service.ipml;

import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.repository.KhuyenMaiRepository;
import com.poly.it17323.group6.view.SRM_BanHang;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class UpdateKhuyenMaiThread implements Runnable {

    private final KhuyenMaiRepository repository = new KhuyenMaiRepository();
    private SRM_BanHang srm;

    public UpdateKhuyenMaiThread(SRM_BanHang srm) {
        this.srm = srm;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("running update khuyen mai...");
                List<KhuyenMai> list = repository.getAll();

                list.stream().forEach(km -> {
                    Timestamp current = new Timestamp(new Date().getTime());
                    if (current.compareTo(km.getNgayKT()) > 0) {
                        km.setTinhTrang(0);
                        repository.update(km);
                    }
                });
                srm.loadKM(repository.getAll());
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UpdateKhuyenMaiThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
