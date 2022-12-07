/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.thread;

import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.repository.KhuyenMaiRepository;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class UpdateKhuyenMaiThread implements Runnable{
    private final KhuyenMaiRepository repository = new KhuyenMaiRepository();
    

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("running update khuyen mai...");
                List<KhuyenMai> list = repository.getAll();
                
                list.stream().forEach(km -> {
                    Date current = new Date();
                    if(current.compareTo(km.getNgayKT()) > 0){
                        km.setTinhTrang(0);
                        repository.update(km);
                    }
                });
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UpdateKhuyenMaiThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
