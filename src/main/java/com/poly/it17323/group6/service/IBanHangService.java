/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.response.BanhangReponse;

/**
 *
 * @author pdanh
 */
public interface IBanHangService {

    boolean addHD(BanhangReponse b);

    boolean addHDCT(BanhangReponse b);

    boolean updateHDCT(BanhangReponse b);

    boolean updateCTSP(BanhangReponse b);

    boolean deleteHDCT(BanhangReponse b);

    boolean checkTrung(BanhangReponse b);

    String getMaTang();
}
