/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poly.it17323.group6.view;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.poly.it17323.group6.response.NguoiDungReponse;
import com.poly.it17323.group6.service.IChucVuService;
import com.poly.it17323.group6.service.INguoiDungService;
import com.poly.it17323.group6.service.ipml.ChucVuService;
import com.poly.it17323.group6.service.ipml.NguoiDungService;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LE BAO NGOC
 */
public class SRM_ThemND extends javax.swing.JFrame implements Runnable, ThreadFactory {
    
    private WebcamPanel panel1 = null;
    private Webcam webcam1 = null;
    private static final long serialVersionUID = 6441489157408381878L;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    private final IChucVuService icvs = new ChucVuService();
    private final INguoiDungService inds = new NguoiDungService();
    private final IChucVuService service = new ChucVuService();
    private String kq;

    /**
     * Creates new form SRM_ThemND
     */
    public SRM_ThemND() {
        initComponents();
        initWebCam();
        setLocationRelativeTo(this);
        txt_nd_MaND.setEditable(false);
        Jdate_nd_ngayTao.setEnabled(false);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private NguoiDungReponse getFromMoi() {
        NguoiDungReponse ndr = new NguoiDungReponse();
        ndr.setMaND(txt_nd_MaND.getText().trim());
        ndr.setTenTK(txt_nd_TenTK.getText().trim());
        ndr.setMatKhau(txt_nd_MatKhau.getText().trim());
        ndr.setHoVaTen(txt_nd_HovaTen.getText().trim());
        ndr.setGioiTinh(rdo_nd_Nam.isSelected() ? "Nam" : "Nữ");
        ndr.setNgaySinh(txt_nd_NgaySinh.getText());
        ndr.setSdt(txtSDT.getText());
        ndr.setDiaChi(txtSDT.getText());
        ndr.setCccd(txt_nd_CCCD.getText());
        ndr.setTinhTrang(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date currentDate = new java.util.Date();
        Date ngayTao;
        ngayTao = Date.valueOf(sdf.format((currentDate)));
        ndr.setNgayTao(String.valueOf(ngayTao));
        String ngaySua = sdf.format(Jdate_nd_ngaySua.getDate());
        ndr.setNgaySua(ngaySua);
//        ndr.setTenCV("Nhân viên");
//        ChucVu cv = new ChucVu();
//        cv.setTenCV("Nhân viên");
//        service.getOne("Nhân viên");
        //getId

//        CV(cv.getIdCV());
        return ndr;
        
    }
    
    public boolean check() {
        if (txt_nd_TenTK.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên tài khoản");
            return false;
        }
        if (txt_nd_MatKhau.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu");
            return false;
        }
        if (txt_nd_HovaTen.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập họ và tên");
            return false;
        }
        if (txt_nd_NgaySinh.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày sinh");
            return false;
        }
        if (txtSDT.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Sdt");
            return false;
        }
        if (txtDiaChi.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập địa chỉ");
            return false;
        }
        if (txt_nd_CCCD.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập CCCD/CMND");
            return false;
        }
        if (Jdate_nd_ngayTao.getDateFormatString().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày tạo");
            return false;
        }
        if (Jdate_nd_ngaySua.getDateFormatString().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày sửa");
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txt_nd_TenTK = new javax.swing.JTextField();
        txt_nd_MaND = new javax.swing.JTextField();
        txt_nd_MatKhau = new javax.swing.JTextField();
        txt_nd_HovaTen = new javax.swing.JTextField();
        txt_nd_CCCD = new javax.swing.JTextField();
        txt_nd_NgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        rdo_nd_Nu = new javax.swing.JRadioButton();
        rdo_nd_Nam = new javax.swing.JRadioButton();
        txtSDT = new javax.swing.JTextField();
        btn_nd_Them = new javax.swing.JButton();
        pnQr = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Jdate_nd_ngayTao = new com.toedter.calendar.JDateChooser();
        Jdate_nd_ngaySua = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel16.setBackground(new java.awt.Color(232, 211, 227));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin người dùng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel51.setText("Mã người dùng : ");

        jLabel52.setText("Tên tài khoản :");

        jLabel53.setText("Mật khẩu :");

        jLabel54.setText("Họ và tên :");

        jLabel55.setText("Giới tính :");

        jLabel56.setText("Ngày sinh :");

        jLabel58.setText("Sđt :");

        jLabel59.setText("Địa chỉ :");

        jLabel60.setText("CCCD/CMT : ");

        jLabel62.setText("Ngày Tạo : ");

        jLabel63.setText("Ngày Sửa : ");

        buttonGroup1.add(rdo_nd_Nu);
        rdo_nd_Nu.setText("Nữ");

        buttonGroup1.add(rdo_nd_Nam);
        rdo_nd_Nam.setText("Nam");

        btn_nd_Them.setText("Thêm");
        btn_nd_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nd_ThemActionPerformed(evt);
            }
        });

        pnQr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pnQrLayout = new javax.swing.GroupLayout(pnQr);
        pnQr.setLayout(pnQrLayout);
        pnQrLayout.setHorizontalGroup(
            pnQrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );
        pnQrLayout.setVerticalGroup(
            pnQrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQrLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setText("Quay Lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Jdate_nd_ngayTao.setDateFormatString("yyyy-MM-dd");

        Jdate_nd_ngaySua.setDateFormatString("yyyy-MM-dd");
        Jdate_nd_ngaySua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jdate_nd_ngaySuaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel54)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nd_MaND, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(txt_nd_TenTK)
                            .addComponent(txt_nd_MatKhau)
                            .addComponent(txt_nd_HovaTen)
                            .addComponent(txt_nd_NgaySinh))
                        .addGap(18, 31, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel63)
                                        .addComponent(jLabel62))
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel58))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Jdate_nd_ngaySua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Jdate_nd_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_nd_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel60))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(56, 56, 56)
                        .addComponent(rdo_nd_Nam)
                        .addGap(59, 59, 59)
                        .addComponent(rdo_nd_Nu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btn_nd_Them)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1))
                    .addComponent(pnQr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        jPanel16Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_nd_Them, jButton1});

        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(pnQr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btn_nd_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nd_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nd_MaND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel51))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nd_TenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52)))
                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59)
                            .addComponent(txt_nd_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Jdate_nd_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nd_HovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel62)
                            .addComponent(jLabel54))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_nd_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel63)
                                .addComponent(jLabel56))
                            .addComponent(Jdate_nd_ngaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdo_nd_Nu)
                            .addComponent(rdo_nd_Nam)
                            .addComponent(jLabel55))
                        .addGap(17, 17, 17))))
        );

        jPanel16Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_nd_Them, jButton1});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1152, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nd_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nd_ThemActionPerformed
        if (check()) {
            
            NguoiDungReponse ndr = getFromMoi();
//        String email = JOptionPane.showInputDialog("Nhập email để xác nhận thêm");
            //        nd.setEmail(email);
            //        if (inds.checkEmailXacNhan(nd) != null) {
            //            JOptionPane.showMessageDialog(this, inds.checkEmailXacNhan(nd));
            //            try {
            //                String ma = JOptionPane.showInputDialog("Nhập mã xác nhận");
            //                JOptionPane.showMessageDialog(this, inds.checkMa(ma));
            if (inds.add(ndr) == true) {
                JOptionPane.showMessageDialog(this, "THÊM THÀNH CÔNG!");
                inds.guiTkMk(ndr);
                this.dispose();
                webcam1.close();
                try {
                    new SRM_BanHang().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(SRM_ThemND.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "THÊM THẤT BẠI!");
            }

            //                listND = inds.getAll();
            //                loadND(inds.getAll());
            //            } catch (Exception ex) {
            //                ex.printStackTrace(System.out);
            //            }
            //        } else {
            //            JOptionPane.showMessageDialog(this, inds.emaiFals(nd));
            //            return;
            //        }
        }
    }//GEN-LAST:event_btn_nd_ThemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.dispose();
            webcam1.close();
            new SRM_BanHang().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(SRM_ThemND.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Jdate_nd_ngaySuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jdate_nd_ngaySuaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jdate_nd_ngaySuaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SRM_ThemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SRM_ThemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SRM_ThemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SRM_ThemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SRM_ThemND().setVisible(true);
            }
        });
    }
    
    private void initWebCam() {
        Dimension size = WebcamResolution.QVGA.getSize();//Lấy kích thước
        webcam1 = Webcam.getWebcams().get(0); //0 is default webcam
        //Lấy webcam đầu mặc định là 0
        webcam1.setViewSize(size);
        
        panel1 = new WebcamPanel(webcam1);
        panel1.setPreferredSize(size);
//        panel1.setFPSDisplayed(true);

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 200));
        
        executor.execute(this);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Jdate_nd_ngaySua;
    private com.toedter.calendar.JDateChooser Jdate_nd_ngayTao;
    private javax.swing.JButton btn_nd_Them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnQr;
    private javax.swing.JRadioButton rdo_nd_Nam;
    private javax.swing.JRadioButton rdo_nd_Nu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txt_nd_CCCD;
    private javax.swing.JTextField txt_nd_HovaTen;
    private javax.swing.JTextField txt_nd_MaND;
    private javax.swing.JTextField txt_nd_MatKhau;
    private javax.swing.JTextField txt_nd_NgaySinh;
    private javax.swing.JTextField txt_nd_TenTK;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            Result result = null;
            BufferedImage image = null;
            
            if (webcam1.isOpen()) {
                if ((image = webcam1.getImage()) == null) {
                    continue;
                }
            }
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            
            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException e) {
                
            }
            if (result != null) {
                String txtCmt = String.valueOf(result.getText());
//                txtCmt.setText(result.getText());
                String chuoi = txtCmt;
                String nganCach = "|";
                
                int c = chuoi.indexOf(nganCach); // lấy ra vị trí
                String soCanCuocCongDan = chuoi.substring(0, c);
                txt_nd_CCCD.setText(soCanCuocCongDan);
                
                int d = chuoi.indexOf(nganCach, c + 1);// lấy ra vị trí
                String sochungMinhThu = chuoi.substring(c + 1, d);
                System.out.println(sochungMinhThu);
                
                int e = chuoi.indexOf(nganCach, d + 1);// lấy ra vị trí

                String hoVaTen = chuoi.substring(d + 1, e);
                txt_nd_HovaTen.setText(hoVaTen);
                
                int f = chuoi.indexOf(nganCach, e + 1);// lấy ra vị trí
                String ngaySinh = chuoi.substring(e + 1, f);
                SimpleDateFormat simDate = new SimpleDateFormat("yyyy-MM-dd");
                String catNgaySinh = ngaySinh.substring(0, 2);
                String catThangSinh = ngaySinh.substring(2, 4);
                String catNamSinh = ngaySinh.substring(4, 8);
                String gepNgaySing = catNamSinh + "-" + catThangSinh + "-" + catNgaySinh;

//                System.out.println(catNgaySinh);
//                System.out.println(catThangSinh);
//                System.out.println(catNamSinh);
                txt_nd_NgaySinh.setText(gepNgaySing);
                
                try {
                    System.out.println(simDate.parse(gepNgaySing));
//       
                } catch (ParseException ex) {
                    
                }
                int i = chuoi.indexOf(nganCach, f + 1);// lấy ra vị trí
                String gioiTinh = chuoi.substring(f + 1, i);
                System.out.println(gioiTinh);
//                txt.setText(gioiTinh);
                if (gioiTinh.equals("Nam")) {
                    rdo_nd_Nam.setSelected(true);
                } else {
                    rdo_nd_Nu.setSelected(true);
                }
                
                int k = chuoi.indexOf(nganCach, i + 1);// lấy ra vị trí
                String diaChi = chuoi.substring(i + 1, k);
//                System.out.println(diaChi);
                txtDiaChi.setText(diaChi);

//                int b = chuoi.lastIndexOf(nganCach, chuoi.length()) + 1;// lấy ra vị trí
//                String ngayCap = chuoi.substring(b, chuoi.length());
//                String catNgayCap = ngayCap.substring(0, 2);
//                String catThangCap = ngayCap.substring(2, 4);
//                String catNamCap = ngayCap.substring(4, 8);
//
//                String cap = catNgayCap + "-" + catThangCap + "-" + catNamCap;
//                txt_nd_NgayTao.setText(cap);
            }
        } while (true);
    }
    
    @Override
    public Thread newThread(Runnable r) {
        Thread t1 = new Thread(r, "My Thread");
        t1.setDaemon(true);
        return t1;
    }
}
