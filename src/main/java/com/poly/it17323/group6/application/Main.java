package com.poly.it17323.group6.application;

import com.poly.it17323.group6.thread.UpdateKhuyenMaiThread;
import com.poly.it17323.group6.view.SRM_Login;

/**
 *
 * @author pdanh
 */
public class Main {
    static{
        new Thread(new UpdateKhuyenMaiThread()).start();
    }

    public static void main(String[] args) {
        new SRM_Login().setVisible(true);
    }
}
