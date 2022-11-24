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
public interface IQLBanHangService {

    boolean add_HD(BanhangReponse b);

    boolean update_HD(BanhangReponse b);

    boolean update_HD_KH(BanhangReponse b);

    boolean add_HDCT(BanhangReponse b);

    boolean updateSL_HDCT(BanhangReponse b);

    boolean updateSL_CTSP(BanhangReponse b);

    boolean delete_HDCT(BanhangReponse b);

    String getMaTang();
}
