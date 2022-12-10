package com.poly.it17323.group6.view;

import com.poly.it17323.group6.domainmodel.ChatLieu;
import com.poly.it17323.group6.domainmodel.ChiTietSanPham;
import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.domainmodel.KhuyenMai;
import com.poly.it17323.group6.domainmodel.LoaiSP;
import com.poly.it17323.group6.domainmodel.MauSac;
import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.domainmodel.SanPham;
import com.poly.it17323.group6.domainmodel.Size;
import com.poly.it17323.group6.response.BanhangReponse;
import com.poly.it17323.group6.response.KhachHangResponse;
import com.poly.it17323.group6.response.KhuyenMaiReponse;
import com.poly.it17323.group6.response.NguoiDungReponse;
import com.poly.it17323.group6.response.QLNguoiDungResponse;
import com.poly.it17323.group6.response.QLSanPhamResponse;
import com.poly.it17323.group6.response.QLThongKeResponse;
import com.poly.it17323.group6.service.IChucVuService;
import com.poly.it17323.group6.service.IHoaDonService;
import com.poly.it17323.group6.service.IKhuyenMaiService;
import com.poly.it17323.group6.service.INguoiDungService;
import com.poly.it17323.group6.service.IQLKhachHangService;
import com.poly.it17323.group6.service.IQLNguoiDungService;
import com.poly.it17323.group6.service.ipml.BanHangService;
import com.poly.it17323.group6.service.ipml.QLKhachHangService;
import com.poly.it17323.group6.service.ipml.QLNguoiDungService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import com.poly.it17323.group6.service.IQLBanHangService;
import com.poly.it17323.group6.service.IQLChatLieuService;
import com.poly.it17323.group6.service.IQLLoaiSPService;
import com.poly.it17323.group6.service.IQLMauSacService;
import com.poly.it17323.group6.service.IQLSanPhamService;
import com.poly.it17323.group6.service.IQLSizeService;
import com.poly.it17323.group6.service.ISanPhamChiTietService;
import com.poly.it17323.group6.service.ipml.ChucVuService;
import com.poly.it17323.group6.service.ipml.HoaDonService;
import com.poly.it17323.group6.service.ipml.NguoiDungService;
import com.poly.it17323.group6.service.ipml.QLCTSPService;
import com.poly.it17323.group6.service.ipml.QLChatLieuService;
import com.poly.it17323.group6.service.ipml.QLLoaiSPService;
import com.poly.it17323.group6.service.ipml.QLMauSacService;
import com.poly.it17323.group6.service.ipml.QLSanPhamService;
import com.poly.it17323.group6.service.ipml.QLSizeService;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import javax.swing.JFileChooser;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.poly.it17323.group6.domainmodel.KhachHang;
import com.poly.it17323.group6.repository.KhuyenMaiRepository;
import com.poly.it17323.group6.repository.ThongKeRepository;
import com.poly.it17323.group6.response.ThongKeResponse;
import com.poly.it17323.group6.service.ipml.QLKhuyenMaiService;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableCellRenderer;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author pdanh
 */
public final class SRM_BanHang extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private Executor ex = Executors.newSingleThreadExecutor(this);

    Double bHeight = 0.0;

    ArrayList<String> itemName = new ArrayList<>();
    ArrayList<String> soLuong = new ArrayList<>();
    ArrayList<String> itemPrice = new ArrayList<>();
    ArrayList<String> itemNameDH = new ArrayList<>();
    ArrayList<String> soLuongDH = new ArrayList<>();
    ArrayList<String> itemPriceDH = new ArrayList<>();

    private final IQLBanHangService iBH = new BanHangService();
    private final IQLNguoiDungService iqlnds = new QLNguoiDungService();
    private final IQLKhachHangService iQlKH = new QLKhachHangService();
    List<KhachHangResponse> lstKh = new ArrayList<>();
    private final IKhuyenMaiService iKM = new QLKhuyenMaiService();
    private final IChucVuService icvs = new ChucVuService();
    private final INguoiDungService inds = new NguoiDungService();
    private final IHoaDonService ihd = new HoaDonService();
    private DefaultTableModel model = new DefaultTableModel();
    private DefaultTableModel mdHD = new DefaultTableModel();
    private DefaultTableModel modelSP;
    private DefaultTableModel modelHD;
    private DefaultTableModel modelCTHD;
    private DefaultTableModel modelKM;
    private DefaultTableModel modelND;
    private DefaultComboBoxModel comboBoxND;
    private final DefaultComboBoxModel boxKM = new DefaultComboBoxModel();
    public List<KhuyenMai> listKM;
    private List<NguoiDung> listND;
    private double sum;
    private double giamSum;
    private double ttoan;
    private String kq;
    private final QLNguoiDungResponse ndRP;
    //Van
    private byte[] personalImage;
    int indexcbbThuocTinhSP;
    int indextblCTSP;
    private DefaultComboBoxModel cbbModel;
    private final IQLSanPhamService iSP = new QLSanPhamService();
    private final IQLLoaiSPService iLoaiSP = new QLLoaiSPService();
    private final IQLChatLieuService iCL = new QLChatLieuService();
    private final IQLMauSacService iMS = new QLMauSacService();
    private final IQLSizeService iSize = new QLSizeService();
    private final ISanPhamChiTietService iChiTietSP = new QLCTSPService();
    int indextblAnh;
    int indextblAnhctsp;
    int indextblThuocTinh;
    int id_anh_ctsp;
    int index_ctsp_Anh;
    int SoAnh;
    //Van
//    private final CardLayout cardLayout;

    public SRM_BanHang() throws IOException {

        initComponents();

        tbl_km.getColumn("Check").setCellEditor(new RadioButtonEditor(new JCheckBox()));
        tbl_km.getColumn("Check").setCellRenderer(new RadioButtonRenderer());
        jButton2.addActionListener((e) -> {

            for (JCheckBox rd : rdList) {

                rd.setSelected(!rd.isSelected());
                System.out.println(rd.getText() + " " + rd.isSelected());
            }
            loadKM(iKM.getAll());
        });
        initWebCam();
        tblSanPham.setEnabled(false);
        txtTienThua.setEditable(false);
        txtTienThua2.setEditable(false);
        txtNgayNhan.setEnabled(false);
        xoa.setEnabled(false);
        xoatatca.setEnabled(false);
        btnThanhToan.setEnabled(false);
        btnChoGiao.setEnabled(false);
        btnGiaoHang.setEnabled(false);
        btnDaGiao.setEnabled(false);
        chon.setEnabled(false);
        thaydoi.setEnabled(false);
        txtTienKhachCK.setEditable(false);
        txtTienKhachCK2.setEditable(false);
        setLocationRelativeTo(null);
        effectNav(PN_BanHang, PN_KhachHang, PN_KhuyenMai, PN_QLHoaDon, PN_QLNguoiDung, PN_QLSanPham, PN_QLThongKe, "Bán Hàng");
        listKM = iKM.getAll();
        setIcon();
        setIconTK();
        loadDataSP();
        loadDataHD(iBH.getAll_HD());
        loadHoaDon();
        loadDataKM();
        loadKhachHang();
        loadComboBoxNd();
        loadND(inds.getAll());
        loadKM(iKM.getAll());
        loadAllthongKe();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("Logo.png"));
        ndRP = getND();
        lblHoTenNV.setText(ndRP.getHoTen());
//        cardLayout = (CardLayout) PN_Main.getLayout();
//        setExtendedState(MAXIMIZED_BOTH);
//Van
        loadAll();
        //Van
    }

    private void loadAll() throws IOException {
        loadQLThuocTinh();
        if (tbl_ttsp.getRowCount() > 0) {
            indextblThuocTinh = 0;
            showDetailThuocTinh();
        }
        loadQLCTSP();
        if (tbl_ctsp.getRowCount() > 0) {
            indextblCTSP = 0;
            showDetailChiTietSP();
        }
        loadcbbSP();
        loadcbbLoaiSP();
        loadcbbChatLieu();
        loadcbbMauSac();
        loadcbbSize();
    }

    private boolean setRole() {
        if (ndRP.getCv().getTenCV().equalsIgnoreCase("Nhân Viên")) {
            JOptionPane.showMessageDialog(this, "VAO DAY LAM GI !!!");
            return false;
        }
        return true;
    }

    //---MAI---//
    ThongKeRepository tke = new ThongKeRepository();

    private void loadAllthongKe() {
        loadThongKeSPham();
        loadThongKeDTHU();
        loadThongKeNVien();
        Char1(BieuDoTKeDT);
        Char2(BieuDoTKeNvien);
        Char3(BieuDoTKeSanPham);
        soHoaDon();
        getdoanhThu();
    }
    public void Char1(JPanel jpanelItem1){
        //List<Object[]> lst = tblDoanhThu.getThongKeTgian();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < tblDoanhThu.getRowCount(); i++) {
            ThongKeResponse tke = new ThongKeResponse();
                tke.setNgayTao((java.util.Date) tblDoanhThu.getValueAt(i, 3));
                String n = tblDoanhThu.getValueAt(i, 4).toString();
                String t = n.substring(0, n.length() - 4);
                BigDecimal big = BigDecimal.valueOf(Double.parseDouble(t));
                tke.setTong(big);
//                Double d = tke.getTong().doubleValue();
                dataset.addValue(tke.getTong(), "Doanh Thu", tke.getNgayTao());
        }
        JFreeChart barChart = ChartFactory.createBarChart(
                "THỐNG KÊ DOANH THU ".toUpperCase(),
                "Thời gian", "Doanh Thu",
                dataset, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpanelItem1.getWidth(), 321));

        jpanelItem1.removeAll();
        jpanelItem1.setLayout(new CardLayout());
        jpanelItem1.add(chartPanel);
        jpanelItem1.validate();
        jpanelItem1.repaint();
    }
    public void Char2(JPanel jpanelItem1){
        //List<Object[]> lst = tke.getThongKeNV();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < tblNhanVienTke.getRowCount(); i++) {
            ThongKeResponse tke = new ThongKeResponse();
                tke.setTenNV((String) tblNhanVienTke.getValueAt(i, 2));
                String n = tblNhanVienTke.getValueAt(i, 4).toString();
                String t = n.substring(0, n.length() - 4);
                BigDecimal big = BigDecimal.valueOf(Double.parseDouble(t));
                tke.setTong(big);
                //Double d = tke.getTong().doubleValue();
                dataset.addValue(tke.getTong(), "Doanh Thu", tke.getTenNV());
        }
        JFreeChart barChart = ChartFactory.createBarChart(
                "THỐNG KÊ NHÂN VIÊN ".toUpperCase(),
                "Tên Nhân Viên", "Doanh Thu",
                dataset, PlotOrientation.HORIZONTAL, false, true, false);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpanelItem1.getWidth(), 321));

        jpanelItem1.removeAll();
        jpanelItem1.setLayout(new CardLayout());
        jpanelItem1.add(chartPanel);
        jpanelItem1.validate();
        jpanelItem1.repaint();

    }
    public void Char3(JPanel jpanelItem1){
        //List<Object[]> lst = tkeRepo.getThongKeSPham();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < tblSanPhamTke.getRowCount(); i++) {
            ThongKeResponse tke = new ThongKeResponse();
                tke.setTenSP((String) tblSanPhamTke.getValueAt(i, 2));
                String n = tblSanPhamTke.getValueAt(i, 5).toString();
                String t = n.substring(0, n.length() - 4);
                BigDecimal big = BigDecimal.valueOf(Double.parseDouble(t));
                tke.setTong(big);
                dataset.addValue(tke.getTong(), "Doanh Thu", tke.getTenSP());
        }
        JFreeChart barChart = ChartFactory.createBarChart(
                "THỐNG KÊ SẢN PHẨM ".toUpperCase(),
                "Tên Sản Phẩm", "Doanh Thu",
                dataset, PlotOrientation.HORIZONTAL, false, true, false);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpanelItem1.getWidth(), 321));

        jpanelItem1.removeAll();
        jpanelItem1.setLayout(new CardLayout());
        jpanelItem1.add(chartPanel);
        jpanelItem1.validate();
        jpanelItem1.repaint();

    }
    private void loadThongKeDTHU() {
        model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        List<Object[]> lst = tke.getThongKeTgian();
        for (Object[] hd : lst) {
            model.addRow(new Object[]{tblDoanhThu.getRowCount() + 1, hd[1], hd[2], hd[0], hd[3] + " VNĐ"});
        }
    }

    private void loadThongKeNVien() {
        model = (DefaultTableModel) tblNhanVienTke.getModel();
        model.setRowCount(0);
        List<Object[]> lst = tke.getThongKeNV();
        for (Object[] hd : lst) {
            model.addRow(new Object[]{tblNhanVienTke.getRowCount() + 1, hd[0], hd[1], hd[2], hd[3] + " VNĐ"});
        }
    }

    private void loadThongKeSPham() {
        model = (DefaultTableModel) tblSanPhamTke.getModel();
        model.setRowCount(0);
        List<Object[]> lst = tke.getThongKeSPham();
        for (Object[] hd : lst) {
            model.addRow(new Object[]{tblSanPhamTke.getRowCount() + 1, hd[0], hd[1], hd[2], hd[3], hd[4] + " VNĐ"});
        }
    }

    private void soHoaDon() {
        lblHoaDon.setText("");
        lblHoaDon.setText(tke.getSoHD().get(0)+ "");
    }

    private void getdoanhThu() {
        DecimalFormat dt = new DecimalFormat("#,###");
        lblDoanhThu.setText("");
        lblDoanhThu.setText(dt.format(tke.DoanhThu().get(0)) + " VND");
        lblSLuong.setText(tke.getSoHDHienTai().get(0) + "    /");
        if(tke.getDoanhThuHienTai().get(0)==null){
            lblDoanhThuhnay.setText("0 VND");
        }else{
            lblDoanhThuhnay.setText(dt.format(tke.getDoanhThuHienTai().get(0)) + " VND");
        }
        
    }

    //---MAI---//
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        Jpanel = new javax.swing.JPanel();
        ChucNang = new javax.swing.JPanel();
        PN_BanHang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        banhang = new javax.swing.JLabel();
        PN_QLNguoiDung = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nhanvien = new javax.swing.JLabel();
        PN_QLThongKe = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        thongke = new javax.swing.JLabel();
        PN_QLSanPham = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sanpham = new javax.swing.JLabel();
        PN_QLHoaDon = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        hoadon = new javax.swing.JLabel();
        PN_KhuyenMai = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nhanvien4 = new javax.swing.JLabel();
        khuyenmai = new javax.swing.JLabel();
        PN_KhachHang = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        khachhang = new javax.swing.JLabel();
        btnExist = new javax.swing.JButton();
        pnDetailND = new javax.swing.JPanel();
        lblHoTenNV = new javax.swing.JLabel();
        lblAnhND = new javax.swing.JLabel();
        PN_Main = new javax.swing.JPanel();
        QL_BanHang = new javax.swing.JPanel();
        HoaDon = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        rdoTatCa = new javax.swing.JRadioButton();
        rdoDaThanhToan = new javax.swing.JRadioButton();
        rdoHDCho = new javax.swing.JRadioButton();
        rdoDangGiao = new javax.swing.JRadioButton();
        rdoChoGiao = new javax.swing.JRadioButton();
        GioHang = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        xoa = new javax.swing.JButton();
        xoatatca = new javax.swing.JButton();
        SanPham = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        timkiem = new javax.swing.JLabel();
        DonHang = new javax.swing.JPanel();
        KhachHang = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblMaKH = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        chon = new javax.swing.JButton();
        thaydoi = new javax.swing.JButton();
        PanelChung = new javax.swing.JTabbedPane();
        panelTaiQuay = new javax.swing.JPanel();
        mahd = new javax.swing.JLabel();
        nv = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txtTienThua = new javax.swing.JTextField();
        lblMaHD = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        cboPthuctt = new javax.swing.JComboBox<>();
        btnTaoHD = new javax.swing.JButton();
        lblTenND = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JLabel();
        txtThanhToan = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        txtTienKhachCK = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        inhoadon = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        PanelDatHang = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        txtTienKhachDua2 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        txtTienThua2 = new javax.swing.JTextField();
        lblMaHD2 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        cboPthuctt2 = new javax.swing.JComboBox<>();
        btnTaoHD2 = new javax.swing.JButton();
        lblTenND2 = new javax.swing.JLabel();
        txtTongTien2 = new javax.swing.JLabel();
        txtGiamGia2 = new javax.swing.JLabel();
        txtThanhToan2 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        txtTienKhachCK2 = new javax.swing.JTextField();
        txtTienShip = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        txtNgayKhachMuonNhan = new com.toedter.calendar.JDateChooser();
        txtNgayGuiDi = new com.toedter.calendar.JDateChooser();
        btnGiaoHang = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        txtNgayNhan = new com.toedter.calendar.JDateChooser();
        btnInHD = new javax.swing.JButton();
        cboTTTT = new javax.swing.JComboBox<>();
        jLabel112 = new javax.swing.JLabel();
        btnChoGiao = new javax.swing.JButton();
        btnDaGiao = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        panelQR = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        ketqua = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        QL_NguoiDung = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        cbb_nd_ChucVu = new javax.swing.JComboBox<>();
        txt_nd_TenTK = new javax.swing.JTextField();
        txt_nd_MaND = new javax.swing.JTextField();
        txt_nd_MatKhau = new javax.swing.JTextField();
        txt_nd_HovaTen = new javax.swing.JTextField();
        txt_nd_Email = new javax.swing.JTextField();
        txt_nd_Sdt = new javax.swing.JTextField();
        txt_nd_CCCD = new javax.swing.JTextField();
        rdo_nd_Nu = new javax.swing.JRadioButton();
        rdo_nd_Nam = new javax.swing.JRadioButton();
        txt_nd_DiaChi = new javax.swing.JTextField();
        rdo_nd_DangLam = new javax.swing.JRadioButton();
        rdo_nd_NghiLam = new javax.swing.JRadioButton();
        btn_nd_Them = new javax.swing.JButton();
        btn_nd_Sua = new javax.swing.JButton();
        btn_nd_Xoa = new javax.swing.JButton();
        Jdate_nd_ngaySinh = new com.toedter.calendar.JDateChooser();
        Jdate_nd_ngayTao = new com.toedter.calendar.JDateChooser();
        Jdate_nd_ngaySua = new com.toedter.calendar.JDateChooser();
        tbl_nd_NghiLam = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbl_nd_DangLam = new javax.swing.JTable();
        txt_nd_TimKiem = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtNghiLam = new javax.swing.JTable();
        QL_ThongKe = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lblDoanhThu = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblSLuong = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblDoanhThuhnay = new javax.swing.JLabel();
        btnExcel = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txt_NgayKetThucTKe = new com.toedter.calendar.JDateChooser();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        ThoiGian2 = new javax.swing.JPanel();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        TongQuanTgian = new javax.swing.JPanel();
        BieuDoTKeDT = new javax.swing.JPanel();
        ChiTiet = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        SanPhamm = new javax.swing.JPanel();
        TongQuanSPh = new javax.swing.JTabbedPane();
        TongQuanSP = new javax.swing.JPanel();
        BieuDoTKeSanPham = new javax.swing.JPanel();
        ChiTietSP = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblSanPhamTke = new javax.swing.JTable();
        NhanVien = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        TongQuanNV = new javax.swing.JPanel();
        BieuDoTKeNvien = new javax.swing.JPanel();
        ChiTietNV = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblNhanVienTke = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        txt_NgayBatDauTKe = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        QL_HoaDon = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txt_hd_timKiem = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        txt_hd_NgayBatDau = new javax.swing.JTextField();
        txt_hd_NgayKetThuc = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        cbb_hd_TrangThaiThanhToan = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        cbb_hd_HinhThucTT = new javax.swing.JComboBox<>();
        jPanel21 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        txt_hd_TKTongTienBatDau = new javax.swing.JTextField();
        txt_hd_TKTongTienKetThuc = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_HoaDon = new javax.swing.JTable();
        btn_hd_Xoa = new javax.swing.JButton();
        btn_hd_Sua = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbl_HoaDonChiTiet = new javax.swing.JTable();
        QL_KhuyenMai = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_km_Ma = new javax.swing.JTextField();
        txt_km_GiamGia = new javax.swing.JTextField();
        txt_km_Ten = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        rdo_km_ConKhuyenMai = new javax.swing.JRadioButton();
        rdo_km_DungKhuyenMai = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txt_km_MoTa = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btn_km_Sua = new javax.swing.JButton();
        btn_km_Xoa = new javax.swing.JButton();
        btn_km_Clear = new javax.swing.JButton();
        btn_km_Them = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboKM = new javax.swing.JComboBox<>();
        txt_km_NgayBatDau = new com.toedter.calendar.JDateChooser();
        txt_km_NgayKetThuc = new com.toedter.calendar.JDateChooser();
        txt_km_NgayTao = new com.toedter.calendar.JDateChooser();
        txt_km_NgaySua = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        txt_km_TimKiem = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_km = new javax.swing.JTable();
        QL_AnhHai = new javax.swing.JPanel();
        lblAnhHai = new javax.swing.JLabel();
        lblTym = new javax.swing.JLabel();
        QL_KhachHang = new javax.swing.JPanel();
        JPanel_ThongTinKH = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_kh_MaKh = new javax.swing.JTextField();
        txt_kh_HoTenKH = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_kh_DiaChi = new javax.swing.JTextArea();
        txt_kh_sdt = new javax.swing.JTextField();
        rdo_kh_Nam = new javax.swing.JRadioButton();
        rdo_kh_Nu = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnChonKH = new javax.swing.JButton();
        btnSuaKH = new javax.swing.JButton();
        btnThemKH = new javax.swing.JButton();
        btnLamMoiKH = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        txt_kh_NgayTao = new com.toedter.calendar.JDateChooser();
        txt_kh_NgaySua = new com.toedter.calendar.JDateChooser();
        txt_kh_NgaySinh = new com.toedter.calendar.JDateChooser();
        JPanel_DanhSachKH = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtTimKiemKHang = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        QL_SanPham = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tbl_ttsp = new javax.swing.JTable();
        txt_tt_Ten = new javax.swing.JTextField();
        txt_tt_Ma = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        cbb_ttsp = new javax.swing.JComboBox<>();
        btn_ctsp_Clear1 = new javax.swing.JButton();
        btn_ctsp_Xoa1 = new javax.swing.JButton();
        btn_ctsp_Sua1 = new javax.swing.JButton();
        btn_ctsp_Them1 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txt_ctsp_Gia = new javax.swing.JTextField();
        txt_ctsp_SLTon = new javax.swing.JTextField();
        cbb_ctsp_SanPham = new javax.swing.JComboBox<>();
        cbb_ctsp_LoaiSP = new javax.swing.JComboBox<>();
        cbb_ctsp_Size = new javax.swing.JComboBox<>();
        cbb_ctsp_Mau = new javax.swing.JComboBox<>();
        cbb_ctsp_ChatLieu = new javax.swing.JComboBox<>();
        rdo_ctsp_DangKinhDoanh = new javax.swing.JRadioButton();
        rdo_ctsp_DungKinhDoanh = new javax.swing.JRadioButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        txt_ctsp_MoTa = new javax.swing.JTextArea();
        btn_ctsp_SanPham = new javax.swing.JButton();
        btn_ctsp_LoaiSP = new javax.swing.JButton();
        btn_ctsp_ChatLieu = new javax.swing.JButton();
        btn_ctsp_Size = new javax.swing.JButton();
        btn_ctsp_Mau = new javax.swing.JButton();
        txt_ctsp_NgaySua = new com.toedter.calendar.JDateChooser();
        txt_ctsp_NgayTao = new com.toedter.calendar.JDateChooser();
        jScrollPane16 = new javax.swing.JScrollPane();
        tbl_ctsp = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        txt_ctsp_TimKiem = new javax.swing.JTextField();
        btn_ctsp_Them = new javax.swing.JButton();
        btn_ctsp_Sua = new javax.swing.JButton();
        btn_ctsp_Xoa = new javax.swing.JButton();
        btn_ctsp_Clear = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        txt_ctsp_ThemSL = new javax.swing.JTextField();
        btn_ctsp_Sua2 = new javax.swing.JButton();
        btn_ctsp_Import = new javax.swing.JButton();
        btn_Export_ctsp = new javax.swing.JButton();
        btn_TaiMau = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jpanel.setBackground(new java.awt.Color(255, 255, 255));
        Jpanel.setPreferredSize(new java.awt.Dimension(1266, 762));

        ChucNang.setBackground(new java.awt.Color(210, 166, 199));
        ChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ChucNang.setPreferredSize(new java.awt.Dimension(211, 758));

        PN_BanHang.setBackground(new java.awt.Color(210, 166, 199));
        PN_BanHang.setPreferredSize(new java.awt.Dimension(207, 70));
        PN_BanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_BanHangMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("BÁN HÀNG");

        javax.swing.GroupLayout PN_BanHangLayout = new javax.swing.GroupLayout(PN_BanHang);
        PN_BanHang.setLayout(PN_BanHangLayout);
        PN_BanHangLayout.setHorizontalGroup(
            PN_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_BanHangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(banhang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_BanHangLayout.setVerticalGroup(
            PN_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_BanHangLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PN_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(banhang, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        PN_QLNguoiDung.setBackground(new java.awt.Color(210, 166, 199));
        PN_QLNguoiDung.setPreferredSize(new java.awt.Dimension(207, 70));
        PN_QLNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_QLNguoiDungMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("NHÂN VIÊN");

        javax.swing.GroupLayout PN_QLNguoiDungLayout = new javax.swing.GroupLayout(PN_QLNguoiDung);
        PN_QLNguoiDung.setLayout(PN_QLNguoiDungLayout);
        PN_QLNguoiDungLayout.setHorizontalGroup(
            PN_QLNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_QLNguoiDungLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_QLNguoiDungLayout.setVerticalGroup(
            PN_QLNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PN_QLNguoiDungLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(PN_QLNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24))
        );

        PN_QLThongKe.setBackground(new java.awt.Color(210, 166, 199));
        PN_QLThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_QLThongKeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("THỐNG KÊ");

        thongke.setText(".");

        javax.swing.GroupLayout PN_QLThongKeLayout = new javax.swing.GroupLayout(PN_QLThongKe);
        PN_QLThongKe.setLayout(PN_QLThongKeLayout);
        PN_QLThongKeLayout.setHorizontalGroup(
            PN_QLThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_QLThongKeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_QLThongKeLayout.setVerticalGroup(
            PN_QLThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PN_QLThongKeLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(PN_QLThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25))
        );

        PN_QLSanPham.setBackground(new java.awt.Color(210, 166, 199));
        PN_QLSanPham.setPreferredSize(new java.awt.Dimension(207, 70));
        PN_QLSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_QLSanPhamMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("SẢN PHẨM");

        javax.swing.GroupLayout PN_QLSanPhamLayout = new javax.swing.GroupLayout(PN_QLSanPham);
        PN_QLSanPham.setLayout(PN_QLSanPhamLayout);
        PN_QLSanPhamLayout.setHorizontalGroup(
            PN_QLSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_QLSanPhamLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_QLSanPhamLayout.setVerticalGroup(
            PN_QLSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_QLSanPhamLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PN_QLSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        PN_QLHoaDon.setBackground(new java.awt.Color(210, 166, 199));
        PN_QLHoaDon.setPreferredSize(new java.awt.Dimension(207, 70));
        PN_QLHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_QLHoaDonMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("HÓA ĐƠN");

        javax.swing.GroupLayout PN_QLHoaDonLayout = new javax.swing.GroupLayout(PN_QLHoaDon);
        PN_QLHoaDon.setLayout(PN_QLHoaDonLayout);
        PN_QLHoaDonLayout.setHorizontalGroup(
            PN_QLHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_QLHoaDonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_QLHoaDonLayout.setVerticalGroup(
            PN_QLHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PN_QLHoaDonLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(PN_QLHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22))
        );

        PN_KhuyenMai.setBackground(new java.awt.Color(210, 166, 199));
        PN_KhuyenMai.setPreferredSize(new java.awt.Dimension(207, 70));
        PN_KhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_KhuyenMaiMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("KHUYẾN MÃI");

        javax.swing.GroupLayout PN_KhuyenMaiLayout = new javax.swing.GroupLayout(PN_KhuyenMai);
        PN_KhuyenMai.setLayout(PN_KhuyenMaiLayout);
        PN_KhuyenMaiLayout.setHorizontalGroup(
            PN_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PN_KhuyenMaiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(khuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(47, 47, 47))
            .addGroup(PN_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PN_KhuyenMaiLayout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(nhanvien4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(92, Short.MAX_VALUE)))
        );
        PN_KhuyenMaiLayout.setVerticalGroup(
            PN_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_KhuyenMaiLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PN_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(khuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(PN_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PN_KhuyenMaiLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(nhanvien4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        PN_KhachHang.setBackground(new java.awt.Color(210, 166, 199));
        PN_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_KhachHangMouseClicked(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel85.setText("KHÁCH HÀNG");

        javax.swing.GroupLayout PN_KhachHangLayout = new javax.swing.GroupLayout(PN_KhachHang);
        PN_KhachHang.setLayout(PN_KhachHangLayout);
        PN_KhachHangLayout.setHorizontalGroup(
            PN_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_KhachHangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel85)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_KhachHangLayout.setVerticalGroup(
            PN_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_KhachHangLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PN_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnExist.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnExist.setText("Dang xuat");
        btnExist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExistActionPerformed(evt);
            }
        });

        pnDetailND.setBackground(new java.awt.Color(210, 166, 199));
        pnDetailND.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnDetailND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnDetailNDMouseClicked(evt);
            }
        });

        lblHoTenNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHoTenNV.setText("Ho va Ten NV");

        javax.swing.GroupLayout pnDetailNDLayout = new javax.swing.GroupLayout(pnDetailND);
        pnDetailND.setLayout(pnDetailNDLayout);
        pnDetailNDLayout.setHorizontalGroup(
            pnDetailNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailNDLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblHoTenNV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetailNDLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(lblAnhND, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        pnDetailNDLayout.setVerticalGroup(
            pnDetailNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailNDLayout.createSequentialGroup()
                .addComponent(lblHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(lblAnhND, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout ChucNangLayout = new javax.swing.GroupLayout(ChucNang);
        ChucNang.setLayout(ChucNangLayout);
        ChucNangLayout.setHorizontalGroup(
            ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_KhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PN_KhuyenMai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addComponent(PN_QLHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addComponent(PN_QLSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addComponent(PN_QLThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ChucNangLayout.createSequentialGroup()
                .addComponent(pnDetailND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChucNangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExist, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addComponent(PN_QLNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addComponent(PN_BanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );
        ChucNangLayout.setVerticalGroup(
            ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChucNangLayout.createSequentialGroup()
                .addComponent(pnDetailND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PN_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PN_QLNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PN_QLThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PN_QLSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PN_QLHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PN_KhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PN_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExist)
                .addGap(67, 67, 67))
        );

        PN_Main.setBackground(new java.awt.Color(0, 204, 204));
        PN_Main.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PN_Main.setPreferredSize(new java.awt.Dimension(1049, 758));
        PN_Main.setLayout(new java.awt.CardLayout());

        QL_BanHang.setBackground(new java.awt.Color(255, 255, 255));
        QL_BanHang.setPreferredSize(new java.awt.Dimension(1047, 758));

        HoaDon.setBackground(new java.awt.Color(232, 211, 227));
        HoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HÓA ĐƠN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tblHoaDon.setBackground(new java.awt.Color(255, 204, 204));
        tblHoaDon.setSelectionBackground(new java.awt.Color(255, 204, 51));
        tblHoaDon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        rdoTatCa.setBackground(new java.awt.Color(232, 211, 227));
        buttonGroup5.add(rdoTatCa);
        rdoTatCa.setSelected(true);
        rdoTatCa.setText("Tất cả    ");
        rdoTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTatCaActionPerformed(evt);
            }
        });

        rdoDaThanhToan.setBackground(new java.awt.Color(232, 211, 227));
        buttonGroup5.add(rdoDaThanhToan);
        rdoDaThanhToan.setText("Đã thanh toán");
        rdoDaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDaThanhToanActionPerformed(evt);
            }
        });

        rdoHDCho.setBackground(new java.awt.Color(232, 211, 227));
        buttonGroup5.add(rdoHDCho);
        rdoHDCho.setText("HĐ chờ");
        rdoHDCho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoHDChoActionPerformed(evt);
            }
        });

        rdoDangGiao.setBackground(new java.awt.Color(232, 211, 227));
        buttonGroup5.add(rdoDangGiao);
        rdoDangGiao.setText("Đang giao");
        rdoDangGiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDangGiaoActionPerformed(evt);
            }
        });

        rdoChoGiao.setBackground(new java.awt.Color(232, 211, 227));
        buttonGroup5.add(rdoChoGiao);
        rdoChoGiao.setText("Chờ giao");
        rdoChoGiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChoGiaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HoaDonLayout = new javax.swing.GroupLayout(HoaDon);
        HoaDon.setLayout(HoaDonLayout);
        HoaDonLayout.setHorizontalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoaDonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(HoaDonLayout.createSequentialGroup()
                        .addComponent(rdoTatCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoDaThanhToan)
                        .addGap(12, 12, 12)
                        .addComponent(rdoHDCho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoChoGiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoDangGiao)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        HoaDonLayout.setVerticalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoaDonLayout.createSequentialGroup()
                .addGroup(HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTatCa)
                    .addComponent(rdoDaThanhToan)
                    .addComponent(rdoHDCho)
                    .addComponent(rdoDangGiao)
                    .addComponent(rdoChoGiao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GioHang.setBackground(new java.awt.Color(232, 211, 227));
        GioHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GIỎ HÀNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tblGioHang.setBackground(new java.awt.Color(153, 255, 153));
        tblGioHang.setSelectionBackground(new java.awt.Color(0, 255, 51));
        tblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGioHang);

        xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoa.setText("Xóa  ");
        xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xoaMouseClicked(evt);
            }
        });

        xoatatca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoatatca.setText("Xóa tất cả ");

        javax.swing.GroupLayout GioHangLayout = new javax.swing.GroupLayout(GioHang);
        GioHang.setLayout(GioHangLayout);
        GioHangLayout.setHorizontalGroup(
            GioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GioHangLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xoatatca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        GioHangLayout.setVerticalGroup(
            GioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GioHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(GioHangLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(xoatatca)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        GioHangLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {xoa, xoatatca});

        SanPham.setBackground(new java.awt.Color(232, 211, 227));
        SanPham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SẢN PHẨM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tblSanPham.setBackground(new java.awt.Color(232, 211, 227));
        tblSanPham.setSelectionBackground(new java.awt.Color(255, 153, 255));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSanPham);

        txtTimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemCaretUpdate(evt);
            }
        });

        jButton1.setText("Thêm SP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SanPhamLayout = new javax.swing.GroupLayout(SanPham);
        SanPham.setLayout(SanPhamLayout);
        SanPhamLayout.setHorizontalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SanPhamLayout.createSequentialGroup()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        SanPhamLayout.setVerticalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SanPhamLayout.createSequentialGroup()
                .addGroup(SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(timkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
        );

        DonHang.setBackground(new java.awt.Color(255, 255, 255));
        DonHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ĐƠN HÀNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        DonHang.setPreferredSize(new java.awt.Dimension(404, 758));

        KhachHang.setBackground(new java.awt.Color(232, 211, 227));
        KhachHang.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Mã KH  ");

        lblMaKH.setForeground(new java.awt.Color(255, 51, 51));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Tên KH  ");

        lblTenKH.setForeground(new java.awt.Color(255, 51, 51));

        chon.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chon.setText("Chọn  ");
        chon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chonMouseClicked(evt);
            }
        });

        thaydoi.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        thaydoi.setText("Thay đổi  ");
        thaydoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thaydoiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout KhachHangLayout = new javax.swing.GroupLayout(KhachHang);
        KhachHang.setLayout(KhachHangLayout);
        KhachHangLayout.setHorizontalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(22, 22, 22)
                .addGroup(KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thaydoi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        KhachHangLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chon, thaydoi});

        KhachHangLayout.setVerticalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhachHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblMaKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(thaydoi)))
                .addGap(25, 25, 25))
        );

        KhachHangLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chon, thaydoi});

        KhachHangLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, lblTenKH});

        panelTaiQuay.setBackground(new java.awt.Color(232, 211, 227));
        panelTaiQuay.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mahd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mahd.setText("Mã HĐ :");

        nv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nv.setText("Tên NV :");

        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel93.setText("Tổng tiền :");

        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel94.setText("Giảm giá :");

        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel95.setText("Thanh toán :");

        jLabel96.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel96.setText("Tiền khách đưa :");

        txtTienKhachDua.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTienKhachDuaCaretUpdate(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel97.setText("Tiền thừa :");

        lblMaHD.setForeground(new java.awt.Color(51, 102, 255));

        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel98.setText("Phương thức tt :");

        cboPthuctt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản", "Chuyển khoản và Tiền mặt" }));
        cboPthuctt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPthucttItemStateChanged(evt);
            }
        });

        btnTaoHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTaoHD.setText("Tạo HÐ");
        btnTaoHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoHDMouseClicked(evt);
            }
        });

        lblTenND.setForeground(new java.awt.Color(51, 102, 255));

        txtTongTien.setText("0");

        txtGiamGia.setText("0");

        txtThanhToan.setText("0");

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel100.setText("Tiền khách CK :");

        txtTienKhachCK.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTienKhachCKCaretUpdate(evt);
            }
        });

        btnThanhToan.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThanhToanMouseClicked(evt);
            }
        });

        inhoadon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inhoadon.setText("IN HÐ");
        inhoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inhoadonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTaiQuayLayout = new javax.swing.GroupLayout(panelTaiQuay);
        panelTaiQuay.setLayout(panelTaiQuayLayout);
        panelTaiQuayLayout.setHorizontalGroup(
            panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaiQuayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addComponent(jLabel94)
                    .addComponent(nv)
                    .addComponent(jLabel95)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98)
                    .addComponent(mahd)
                    .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(inhoadon)
                        .addComponent(jLabel100)))
                .addGap(14, 14, 14)
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTaiQuayLayout.createSequentialGroup()
                        .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtThanhToan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGiamGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTaiQuayLayout.createSequentialGroup()
                                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTenND, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtTienKhachCK, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTienKhachDua, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboPthuctt, javax.swing.GroupLayout.Alignment.LEADING, 0, 209, Short.MAX_VALUE)
                                            .addComponent(txtTienThua))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(52, 52, 52))
                    .addGroup(panelTaiQuayLayout.createSequentialGroup()
                        .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2)
                            .addComponent(lblMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btnTaoHD)
                        .addGap(32, 32, 32))))
        );
        panelTaiQuayLayout.setVerticalGroup(
            panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaiQuayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mahd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTaoHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTenND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nv))
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93))
                .addGap(27, 27, 27)
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboPthuctt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98))
                .addGap(28, 28, 28)
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96))
                .addGap(27, 27, 27)
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienKhachCK, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100))
                .addGap(31, 31, 31)
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inhoadon))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        panelTaiQuayLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblMaHD, lblTenND, mahd, nv});

        panelTaiQuayLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel93, jLabel94, jLabel95, jLabel96, jLabel98});

        panelTaiQuayLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboPthuctt, txtGiamGia, txtThanhToan, txtTienKhachCK, txtTienKhachDua, txtTongTien});

        PanelChung.addTab("Tại quầy", panelTaiQuay);

        PanelDatHang.setBackground(new java.awt.Color(232, 211, 227));
        PanelDatHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel99.setText("Mã HĐ :");

        lbl3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl3.setText("Tên NV :");

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel101.setText("Tổng tiền :");

        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel102.setText("Giảm giá :");

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel103.setText("Thanh toán :");

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel104.setText("Tiền khách đưa :");

        txtTienKhachDua2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTienKhachDua2CaretUpdate(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel105.setText("Tiền thừa :");

        lblMaHD2.setForeground(new java.awt.Color(51, 51, 255));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel106.setText("Phương thức TT :");

        cboPthuctt2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản", "Chuyển khoản và Tiền mặt" }));
        cboPthuctt2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPthuctt2ItemStateChanged(evt);
            }
        });

        btnTaoHD2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTaoHD2.setText("Tạo HÐ");
        btnTaoHD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoHD2MouseClicked(evt);
            }
        });

        lblTenND2.setForeground(new java.awt.Color(51, 51, 255));

        txtTongTien2.setText("0");

        txtGiamGia2.setText("0");

        txtThanhToan2.setText("0");

        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel107.setText("Tiền khách CK :");

        txtTienKhachCK2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTienKhachCK2CaretUpdate(evt);
            }
        });

        txtTienShip.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTienShipCaretUpdate(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel108.setText("Tiền ship :");

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel109.setText("NKMN/N.Gửi");

        btnGiaoHang.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnGiaoHang.setText("GIAO HÀNG");
        btnGiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaoHangActionPerformed(evt);
            }
        });

        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel111.setText("Ngày nhận");

        btnInHD.setText("IN");
        btnInHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHDActionPerformed(evt);
            }
        });

        cboTTTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thanh toán trước", "Thanh toán sau" }));

        jLabel112.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel112.setText("Trạng thái TT");

        btnChoGiao.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnChoGiao.setText("CHỜ GIAO");
        btnChoGiao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChoGiaoMouseClicked(evt);
            }
        });

        btnDaGiao.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnDaGiao.setText("ĐÃ GIAO");
        btnDaGiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaGiaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDatHangLayout = new javax.swing.GroupLayout(PanelDatHang);
        PanelDatHang.setLayout(PanelDatHangLayout);
        PanelDatHangLayout.setHorizontalGroup(
            PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatHangLayout.createSequentialGroup()
                        .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel111)
                            .addComponent(jLabel105)
                            .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel112)
                            .addComponent(jLabel103)
                            .addComponent(jLabel108)
                            .addComponent(jLabel102)
                            .addComponent(jLabel101)
                            .addComponent(lbl3)
                            .addComponent(jLabel99)
                            .addComponent(jLabel104)
                            .addComponent(jLabel107))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienShip, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThanhToan2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboTTTT, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPthuctt2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTienKhachDua2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelDatHangLayout.createSequentialGroup()
                                .addComponent(txtNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtGiamGia2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelDatHangLayout.createSequentialGroup()
                                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTenND2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMaHD2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTaoHD2))
                            .addComponent(txtTongTien2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelDatHangLayout.createSequentialGroup()
                                .addComponent(txtNgayKhachMuonNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayGuiDi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTienKhachCK2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTienThua2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatHangLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnChoGiao)
                        .addGap(18, 18, 18)
                        .addComponent(btnGiaoHang)
                        .addGap(28, 28, 28)
                        .addComponent(btnDaGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelDatHangLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel103, jLabel108});

        PanelDatHangLayout.setVerticalGroup(
            PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatHangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatHangLayout.createSequentialGroup()
                        .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaHD2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99))
                        .addGap(9, 9, 9)
                        .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTenND2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl3))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101)
                            .addComponent(txtTongTien2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnTaoHD2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGiamGia2, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108)
                    .addComponent(txtTienShip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtThanhToan2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel112))
                .addGap(18, 18, 18)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109)
                    .addComponent(txtNgayKhachMuonNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayGuiDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboPthuctt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addGap(18, 18, 18)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienKhachDua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104))
                .addGap(18, 18, 18)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienKhachCK2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addGap(18, 18, 18)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienThua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111)
                    .addComponent(txtNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDaGiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGiaoHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChoGiao, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        PanelDatHangLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtGiamGia2, txtThanhToan2, txtTienShip, txtTongTien2});

        PanelDatHangLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel101, jLabel102, jLabel99, lbl3});

        PanelDatHangLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblMaHD2, lblTenND2});

        PanelDatHangLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnChoGiao, btnDaGiao, btnGiaoHang});

        PanelChung.addTab("Đặt hàng", PanelDatHang);

        javax.swing.GroupLayout DonHangLayout = new javax.swing.GroupLayout(DonHang);
        DonHang.setLayout(DonHangLayout);
        DonHangLayout.setHorizontalGroup(
            DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DonHangLayout.createSequentialGroup()
                .addGroup(DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelChung, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        DonHangLayout.setVerticalGroup(
            DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonHangLayout.createSequentialGroup()
                .addComponent(KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelChung))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelQR.setBackground(new java.awt.Color(232, 211, 227));
        panelQR.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã QR  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        panelQR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelQR.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, -1));

        ketqua.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        panelQR.add(ketqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, 20));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel11.setText("Ket qua :");
        panelQR.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jPanel5.add(panelQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 210));

        javax.swing.GroupLayout QL_BanHangLayout = new javax.swing.GroupLayout(QL_BanHang);
        QL_BanHang.setLayout(QL_BanHangLayout);
        QL_BanHangLayout.setHorizontalGroup(
            QL_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_BanHangLayout.createSequentialGroup()
                .addGroup(QL_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GioHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, QL_BanHangLayout.createSequentialGroup()
                        .addComponent(HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        QL_BanHangLayout.setVerticalGroup(
            QL_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_BanHangLayout.createSequentialGroup()
                .addGroup(QL_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DonHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(QL_BanHangLayout.createSequentialGroup()
                        .addGroup(QL_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)
                        .addComponent(GioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        PN_Main.add(QL_BanHang, "card4");

        jPanel15.setPreferredSize(new java.awt.Dimension(1000, 746));

        jPanel16.setBackground(new java.awt.Color(232, 211, 227));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin người dùng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel51.setText("Mã người dùng : ");

        jLabel52.setText("Tên tài khoản :");

        jLabel53.setText("Mật khẩu :");

        jLabel54.setText("Họ và tên :");

        jLabel55.setText("Giới tính :");

        jLabel56.setText("Ngày sinh :");

        jLabel57.setText("Email :");

        jLabel58.setText("Sđt :");

        jLabel59.setText("Địa chỉ :");

        jLabel60.setText("CCCD/CMT : ");

        jLabel61.setText("Tình trạng :");

        jLabel62.setText("Ngày Tạo : ");

        jLabel63.setText("Ngày Sửa : ");

        jLabel64.setText("Chức vụ : ");

        buttonGroup1.add(rdo_nd_Nu);
        rdo_nd_Nu.setText("Nữ");

        buttonGroup1.add(rdo_nd_Nam);
        rdo_nd_Nam.setText("Nam");

        buttonGroup2.add(rdo_nd_DangLam);
        rdo_nd_DangLam.setText("Đang làm");

        buttonGroup2.add(rdo_nd_NghiLam);
        rdo_nd_NghiLam.setText("Nghỉ làm");

        btn_nd_Them.setText("Thêm");
        btn_nd_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nd_ThemActionPerformed(evt);
            }
        });

        btn_nd_Sua.setText("Sửa");
        btn_nd_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nd_SuaActionPerformed(evt);
            }
        });

        btn_nd_Xoa.setText("Xoá");
        btn_nd_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nd_XoaActionPerformed(evt);
            }
        });

        Jdate_nd_ngaySinh.setDateFormatString("yyyy-MM-dd");
        Jdate_nd_ngaySinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jdate_nd_ngaySinhMouseClicked(evt);
            }
        });

        Jdate_nd_ngayTao.setDateFormatString("yyyy-MM-dd");
        Jdate_nd_ngayTao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jdate_nd_ngayTaoMouseClicked(evt);
            }
        });

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
                            .addComponent(jLabel53)
                            .addComponent(jLabel52)
                            .addComponent(jLabel64)
                            .addComponent(jLabel51)
                            .addComponent(jLabel54)
                            .addComponent(jLabel56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jdate_nd_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nd_MaND)
                            .addComponent(txt_nd_MatKhau)
                            .addComponent(txt_nd_TenTK)
                            .addComponent(cbb_nd_ChucVu, 0, 361, Short.MAX_VALUE)
                            .addComponent(txt_nd_HovaTen)))
                    .addComponent(jLabel55)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(rdo_nd_Nam)
                        .addGap(26, 26, 26)
                        .addComponent(rdo_nd_Nu)))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel58)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel63))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel61)
                        .addComponent(jLabel62)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(rdo_nd_DangLam)
                        .addGap(18, 18, 18)
                        .addComponent(rdo_nd_NghiLam))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_nd_Email)
                        .addComponent(txt_nd_Sdt)
                        .addComponent(txt_nd_DiaChi)
                        .addComponent(txt_nd_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Jdate_nd_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jdate_nd_ngaySua, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_nd_Xoa)
                    .addComponent(btn_nd_Them)
                    .addComponent(btn_nd_Sua))
                .addGap(245, 245, 245))
        );

        jPanel16Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_nd_Sua, btn_nd_Them, btn_nd_Xoa});

        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nd_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(txt_nd_Sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel59)
                                    .addComponent(txt_nd_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel60)
                                    .addComponent(txt_nd_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdo_nd_NghiLam)
                            .addComponent(rdo_nd_DangLam)
                            .addComponent(jLabel61))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel62)
                            .addComponent(Jdate_nd_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(Jdate_nd_ngaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(txt_nd_MaND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(btn_nd_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_nd_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel64)
                                    .addComponent(cbb_nd_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52)
                                    .addComponent(txt_nd_TenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel53)
                                    .addComponent(txt_nd_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addComponent(txt_nd_HovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel55)
                                    .addComponent(rdo_nd_Nam)
                                    .addComponent(rdo_nd_Nu)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btn_nd_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(Jdate_nd_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_nd_NghiLam.setBackground(new java.awt.Color(232, 211, 227));

        jPanel17.setBackground(new java.awt.Color(232, 211, 227));
        jPanel17.setPreferredSize(new java.awt.Dimension(1000, 392));

        tbl_nd_DangLam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaND", "TenTK", "MatKhau", "HoVaTen", "GioiTinh", "NgaySinh", "Email", "Sdt", "DiaChi", "CCCD/CMT", "TinhTrang", "NgayTao", "NgaySua", "ChucVu"
            }
        ));
        tbl_nd_DangLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_nd_DangLamMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tbl_nd_DangLam);

        txt_nd_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_nd_TimKiemCaretUpdate(evt);
            }
        });

        jLabel65.setText("Tìm kiếm : ");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65)
                .addGap(27, 27, 27)
                .addComponent(txt_nd_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(641, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jScrollPane12)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nd_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel65, txt_nd_TimKiem});

        tbl_nd_NghiLam.addTab("Đang làm", jPanel17);

        jPanel18.setBackground(new java.awt.Color(232, 211, 227));

        txtNghiLam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaND", "TenTK", "MatKhau", "HoVaTen", "GioiTinh", "NgaySinh", "Email", "Sdt", "DiaChi", "CCCD/CMT", "TinhTrang", "NgayTao", "NgaySua"
            }
        ));
        jScrollPane13.setViewportView(txtNghiLam);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbl_nd_NghiLam.addTab("Nghỉ làm", jPanel18);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbl_nd_NghiLam, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tbl_nd_NghiLam, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Người dùng", jPanel15);

        javax.swing.GroupLayout QL_NguoiDungLayout = new javax.swing.GroupLayout(QL_NguoiDung);
        QL_NguoiDung.setLayout(QL_NguoiDungLayout);
        QL_NguoiDungLayout.setHorizontalGroup(
            QL_NguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_NguoiDungLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        QL_NguoiDungLayout.setVerticalGroup(
            QL_NguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_NguoiDungLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
        );

        PN_Main.add(QL_NguoiDung, "card2");

        QL_ThongKe.setBackground(new java.awt.Color(232, 211, 227));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel9.setBackground(new java.awt.Color(255, 255, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Tổng Doanh Thu");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Số Hóa Đơn");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 102, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSLuong.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblSLuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("SL/ Doanh Thu Hôm nay");

        lblDoanhThuhnay.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblDoanhThuhnay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(lblSLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDoanhThuhnay, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblDoanhThuhnay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblSLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnExcel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcel.setText("Xuất Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Ngày kết thúc");

        ThoiGian2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TongQuanTgian.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BieuDoTKeDT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout BieuDoTKeDTLayout = new javax.swing.GroupLayout(BieuDoTKeDT);
        BieuDoTKeDT.setLayout(BieuDoTKeDTLayout);
        BieuDoTKeDTLayout.setHorizontalGroup(
            BieuDoTKeDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        BieuDoTKeDTLayout.setVerticalGroup(
            BieuDoTKeDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TongQuanTgianLayout = new javax.swing.GroupLayout(TongQuanTgian);
        TongQuanTgian.setLayout(TongQuanTgianLayout);
        TongQuanTgianLayout.setHorizontalGroup(
            TongQuanTgianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BieuDoTKeDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TongQuanTgianLayout.setVerticalGroup(
            TongQuanTgianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TongQuanTgianLayout.createSequentialGroup()
                .addComponent(BieuDoTKeDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        jTabbedPane10.addTab("Tổng Quan", TongQuanTgian);

        ChiTiet.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã ND", "Tên SP", "Ngày", "Doanh Thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblDoanhThu);

        javax.swing.GroupLayout ChiTietLayout = new javax.swing.GroupLayout(ChiTiet);
        ChiTiet.setLayout(ChiTietLayout);
        ChiTietLayout.setHorizontalGroup(
            ChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        ChiTietLayout.setVerticalGroup(
            ChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChiTietLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane10.addTab("Chi Tiết", ChiTiet);

        javax.swing.GroupLayout ThoiGian2Layout = new javax.swing.GroupLayout(ThoiGian2);
        ThoiGian2.setLayout(ThoiGian2Layout);
        ThoiGian2Layout.setHorizontalGroup(
            ThoiGian2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane10)
        );
        ThoiGian2Layout.setVerticalGroup(
            ThoiGian2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane10)
        );

        jTabbedPane11.addTab("Thời Gian", ThoiGian2);

        SanPhamm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TongQuanSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BieuDoTKeSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout BieuDoTKeSanPhamLayout = new javax.swing.GroupLayout(BieuDoTKeSanPham);
        BieuDoTKeSanPham.setLayout(BieuDoTKeSanPhamLayout);
        BieuDoTKeSanPhamLayout.setHorizontalGroup(
            BieuDoTKeSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        BieuDoTKeSanPhamLayout.setVerticalGroup(
            BieuDoTKeSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TongQuanSPLayout = new javax.swing.GroupLayout(TongQuanSP);
        TongQuanSP.setLayout(TongQuanSPLayout);
        TongQuanSPLayout.setHorizontalGroup(
            TongQuanSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BieuDoTKeSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TongQuanSPLayout.setVerticalGroup(
            TongQuanSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BieuDoTKeSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TongQuanSPh.addTab("Tổng Quan", TongQuanSP);

        ChiTietSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblSanPhamTke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số Lượng Tồn", "Số Lượng Bán", "Doanh Thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(tblSanPhamTke);

        javax.swing.GroupLayout ChiTietSPLayout = new javax.swing.GroupLayout(ChiTietSP);
        ChiTietSP.setLayout(ChiTietSPLayout);
        ChiTietSPLayout.setHorizontalGroup(
            ChiTietSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChiTietSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addContainerGap())
        );
        ChiTietSPLayout.setVerticalGroup(
            ChiTietSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChiTietSPLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        TongQuanSPh.addTab("Chi Tiết", ChiTietSP);

        javax.swing.GroupLayout SanPhammLayout = new javax.swing.GroupLayout(SanPhamm);
        SanPhamm.setLayout(SanPhammLayout);
        SanPhammLayout.setHorizontalGroup(
            SanPhammLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TongQuanSPh)
        );
        SanPhammLayout.setVerticalGroup(
            SanPhammLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TongQuanSPh)
        );

        jTabbedPane11.addTab("Sản Phẩm", SanPhamm);

        NhanVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TongQuanNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BieuDoTKeNvien.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout BieuDoTKeNvienLayout = new javax.swing.GroupLayout(BieuDoTKeNvien);
        BieuDoTKeNvien.setLayout(BieuDoTKeNvienLayout);
        BieuDoTKeNvienLayout.setHorizontalGroup(
            BieuDoTKeNvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        BieuDoTKeNvienLayout.setVerticalGroup(
            BieuDoTKeNvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TongQuanNVLayout = new javax.swing.GroupLayout(TongQuanNV);
        TongQuanNV.setLayout(TongQuanNVLayout);
        TongQuanNVLayout.setHorizontalGroup(
            TongQuanNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BieuDoTKeNvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TongQuanNVLayout.setVerticalGroup(
            TongQuanNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TongQuanNVLayout.createSequentialGroup()
                .addComponent(BieuDoTKeNvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane8.addTab("Tổng Quan", TongQuanNV);

        ChiTietNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblNhanVienTke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã ND", "Họ Tên", "Tổng HĐ Bán", "Doanh Thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblNhanVienTke);

        javax.swing.GroupLayout ChiTietNVLayout = new javax.swing.GroupLayout(ChiTietNV);
        ChiTietNV.setLayout(ChiTietNVLayout);
        ChiTietNVLayout.setHorizontalGroup(
            ChiTietNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChiTietNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addContainerGap())
        );
        ChiTietNVLayout.setVerticalGroup(
            ChiTietNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChiTietNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane8.addTab("Chi Tiết", ChiTietNV);

        javax.swing.GroupLayout NhanVienLayout = new javax.swing.GroupLayout(NhanVien);
        NhanVien.setLayout(NhanVienLayout);
        NhanVienLayout.setHorizontalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane8)
        );
        NhanVienLayout.setVerticalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane8)
        );

        jTabbedPane11.addTab("Nhân Viên", NhanVien);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Ngày bắt đầu");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Gửi Báo Cáo");

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout QL_ThongKeLayout = new javax.swing.GroupLayout(QL_ThongKe);
        QL_ThongKe.setLayout(QL_ThongKeLayout);
        QL_ThongKeLayout.setHorizontalGroup(
            QL_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(QL_ThongKeLayout.createSequentialGroup()
                .addGroup(QL_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(QL_ThongKeLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(txt_NgayBatDauTKe, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txt_NgayKetThucTKe, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(QL_ThongKeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        QL_ThongKeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExcel, btnTimKiem});

        QL_ThongKeLayout.setVerticalGroup(
            QL_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_ThongKeLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(QL_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QL_ThongKeLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(QL_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(txt_NgayBatDauTKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(txt_NgayKetThucTKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QL_ThongKeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(QL_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTimKiem)
                            .addComponent(btnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jTabbedPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        QL_ThongKeLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnExcel, btnTimKiem, jButton4, jButton6});

        PN_Main.add(QL_ThongKe, "card3");

        jPanel13.setBackground(new java.awt.Color(232, 211, 227));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Hoá đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Tìm kiếm hoá đơn: ");

        txt_hd_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hd_timKiemActionPerformed(evt);
            }
        });

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setText("Ngày bắt đầu: ");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel44.setText("Ngày kết thúc: ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(txt_hd_NgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(txt_hd_NgayBatDau)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txt_hd_NgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txt_hd_NgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setText("Trạng thái thanh toán:");

        cbb_hd_TrangThaiThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chờ thanh toán", "Đã thanh toán", "Đã huỷ" }));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbb_hd_TrangThaiThanhToan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel47)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(cbb_hd_TrangThaiThanhToan)
                .addContainerGap())
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setText("Hình thức thanh toán: ");

        cbb_hd_HinhThucTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt" }));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(cbb_hd_HinhThucTT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(cbb_hd_HinhThucTT)
                .addContainerGap())
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setText("Tổng tiền: ");

        jLabel50.setText("--->");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_hd_TKTongTienBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_hd_TKTongTienKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_hd_TKTongTienBatDau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_hd_TKTongTienKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50)))
                .addContainerGap())
        );

        tbl_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MaHD", "TenNV", "MaKH", "TenKH", "PhuongThucTT", "TrangThai", "Tien Khach Dua", "Tien Khach CK", "Ngay Tao", "Tien Ship"
            }
        ));
        tbl_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_HoaDonMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tbl_HoaDon);

        btn_hd_Xoa.setText("Xoá Hóa Ðon");
        btn_hd_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hd_XoaActionPerformed(evt);
            }
        });

        btn_hd_Sua.setText("Xóa CTHÐ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel33)
                        .addGap(63, 63, 63)
                        .addComponent(txt_hd_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10)))
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_hd_Xoa)
                .addGap(18, 18, 18)
                .addComponent(btn_hd_Sua)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txt_hd_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hd_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hd_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel26.setBackground(new java.awt.Color(232, 211, 227));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hoá Đơn Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tbl_HoaDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "SanPham", "LoaiSP", "ChatLieu", "SIze", "Mausac", "Gia", "SoLuongMua", "GiaTien", "GiamGia", "GiaSauKM"
            }
        ));
        jScrollPane11.setViewportView(tbl_HoaDonChiTiet);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane11)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout QL_HoaDonLayout = new javax.swing.GroupLayout(QL_HoaDon);
        QL_HoaDon.setLayout(QL_HoaDonLayout);
        QL_HoaDonLayout.setHorizontalGroup(
            QL_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_HoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QL_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        QL_HoaDonLayout.setVerticalGroup(
            QL_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_HoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PN_Main.add(QL_HoaDon, "card5");

        QL_KhuyenMai.setBackground(new java.awt.Color(232, 211, 227));

        jPanel27.setBackground(new java.awt.Color(232, 211, 227));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("Mã khuyến mại : ");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("Tên khuyến mại :");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("Giảm giá :");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("%");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("Tình trạng : ");

        buttonGroup1.add(rdo_km_ConKhuyenMai);
        rdo_km_ConKhuyenMai.setText("Còn khuyến mãi");

        buttonGroup1.add(rdo_km_DungKhuyenMai);
        rdo_km_DungKhuyenMai.setText("Dừng khuyến mãi");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText("Ngày Bắt Đầu :");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("Ngày kết thúc :");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText("Mô tả : ");

        txt_km_MoTa.setColumns(20);
        txt_km_MoTa.setRows(5);
        jScrollPane8.setViewportView(txt_km_MoTa);

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setText("Ngày tạo :");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setText("Ngày sửa :");

        btn_km_Sua.setText("Sửa");
        btn_km_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_km_SuaActionPerformed(evt);
            }
        });

        btn_km_Xoa.setText("Xoá");
        btn_km_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_km_XoaActionPerformed(evt);
            }
        });

        btn_km_Clear.setText("Clear");
        btn_km_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_km_ClearActionPerformed(evt);
            }
        });

        btn_km_Them.setText("Thêm");
        btn_km_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_km_ThemActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Sale");

        cboKM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_km_NgayBatDau.setDateFormatString("yyyy-MM-dd");

        txt_km_NgayKetThuc.setDateFormatString("yyyy-MM-dd");

        txt_km_NgayTao.setDateFormatString("yyyy-MM-dd");

        txt_km_NgaySua.setDateFormatString("yyyy-MM-dd");

        jLabel9.setText("Gio");

        jLabel12.setText("Phut");

        jLabel13.setText("Giay");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel38)
                            .addComponent(jLabel36))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(txt_km_GiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_km_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo_km_ConKhuyenMai)
                            .addComponent(txt_km_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel27Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btn_km_Them)
                        .addGap(40, 40, 40)
                        .addComponent(btn_km_Sua)
                        .addGap(44, 44, 44)
                        .addComponent(btn_km_Xoa)))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jLabel42))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_km_NgaySua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_km_NgayTao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_km_NgayKetThuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_km_NgayBatDau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btn_km_Clear)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(rdo_km_DungKhuyenMai)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboKM, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txt_km_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel35))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txt_km_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txt_km_GiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdo_km_DungKhuyenMai)
                            .addComponent(rdo_km_ConKhuyenMai)
                            .addComponent(jLabel38)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(txt_km_NgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41)))
                            .addComponent(txt_km_NgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(txt_km_NgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45)
                            .addComponent(txt_km_NgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_km_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_km_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_km_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_km_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jPanel28.setBackground(new java.awt.Color(232, 211, 227));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setText("Tìm kiếm :");

        txt_km_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_km_TimKiemCaretUpdate(evt);
            }
        });

        jButton2.setText("Select All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Stop KM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(31, 31, 31)
                .addComponent(jButton3)
                .addGap(64, 64, 64)
                .addComponent(jLabel46)
                .addGap(57, 57, 57)
                .addComponent(txt_km_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_km_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_km.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Check", "STT", "Ma", "TenKM", "GiamGia", "MoTa", "NgayBatDau", "NgayKetThuc", "TinhTrang", "NgayTao", "NgaySua"
            }
        ));
        tbl_km.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_kmMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_km);

        javax.swing.GroupLayout QL_KhuyenMaiLayout = new javax.swing.GroupLayout(QL_KhuyenMai);
        QL_KhuyenMai.setLayout(QL_KhuyenMaiLayout);
        QL_KhuyenMaiLayout.setHorizontalGroup(
            QL_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_KhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QL_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QL_KhuyenMaiLayout.setVerticalGroup(
            QL_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_KhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        PN_Main.add(QL_KhuyenMai, "card2");

        javax.swing.GroupLayout QL_AnhHaiLayout = new javax.swing.GroupLayout(QL_AnhHai);
        QL_AnhHai.setLayout(QL_AnhHaiLayout);
        QL_AnhHaiLayout.setHorizontalGroup(
            QL_AnhHaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_AnhHaiLayout.createSequentialGroup()
                .addComponent(lblAnhHai, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTym, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        QL_AnhHaiLayout.setVerticalGroup(
            QL_AnhHaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_AnhHaiLayout.createSequentialGroup()
                .addComponent(lblAnhHai, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(QL_AnhHaiLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(lblTym, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PN_Main.add(QL_AnhHai, "card5");

        JPanel_ThongTinKH.setBackground(new java.awt.Color(232, 211, 227));
        JPanel_ThongTinKH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN KHÁCH HÀNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Mã KH :");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Họ Tên :");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Giới tính :");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Địa chỉ :");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Số điện thoại :");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Ngày sinh :");

        txt_kh_MaKh.setEnabled(false);

        txt_kh_DiaChi.setColumns(20);
        txt_kh_DiaChi.setRows(5);
        jScrollPane6.setViewportView(txt_kh_DiaChi);

        buttonGroup1.add(rdo_kh_Nam);
        rdo_kh_Nam.setText("Nam");

        buttonGroup1.add(rdo_kh_Nu);
        rdo_kh_Nu.setText("Nữ");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Ngày sửa :");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("Ngày Tạo :");

        jPanel6.setBackground(new java.awt.Color(232, 211, 227));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("XÓA");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnChonKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChonKH.setText("CHỌN");
        btnChonKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChonKHMouseClicked(evt);
            }
        });

        btnSuaKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaKH.setText("CẬP NHẬT");
        btnSuaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKHActionPerformed(evt);
            }
        });

        btnThemKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemKH.setText("THÊM");
        btnThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKHActionPerformed(evt);
            }
        });

        btnLamMoiKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoiKH.setText("LÀM MỚI");
        btnLamMoiKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiKHActionPerformed(evt);
            }
        });

        btnrefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnrefresh.setText("REFRESH");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLamMoiKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete)
                    .addComponent(btnThemKH, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChonKH)
                    .addComponent(btnSuaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnrefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnChonKH, btnDelete, btnLamMoiKH, btnSuaKH, btnThemKH, btnrefresh});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChonKH)
                    .addComponent(btnThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnSuaKH))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoiKH)
                    .addComponent(btnrefresh))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnChonKH, btnDelete, btnLamMoiKH, btnSuaKH, btnThemKH, btnrefresh});

        javax.swing.GroupLayout JPanel_ThongTinKHLayout = new javax.swing.GroupLayout(JPanel_ThongTinKH);
        JPanel_ThongTinKH.setLayout(JPanel_ThongTinKHLayout);
        JPanel_ThongTinKHLayout.setHorizontalGroup(
            JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ThongTinKHLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel22)
                            .addComponent(jLabel30))
                        .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_kh_MaKh)
                                    .addComponent(txt_kh_HoTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                            .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_kh_NgaySua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(txt_kh_NgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel29))
                        .addGap(17, 17, 17))
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addComponent(rdo_kh_Nam)
                        .addGap(26, 26, 26)
                        .addComponent(rdo_kh_Nu)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_kh_NgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txt_kh_sdt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(57, 57, 57)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        JPanel_ThongTinKHLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_kh_HoTenKH, txt_kh_MaKh});

        JPanel_ThongTinKHLayout.setVerticalGroup(
            JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_kh_MaKh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txt_kh_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel24))
                    .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txt_kh_HoTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo_kh_Nam)
                            .addComponent(rdo_kh_Nu))))
                .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel31))
                    .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_kh_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txt_kh_NgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                        .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel30)
                                .addComponent(jLabel27))
                            .addComponent(txt_kh_NgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(JPanel_ThongTinKHLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JPanel_ThongTinKHLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_kh_HoTenKH, txt_kh_MaKh, txt_kh_sdt});

        JPanel_DanhSachKH.setBackground(new java.awt.Color(232, 211, 227));
        JPanel_DanhSachKH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH SÁCH KHÁCH HÀNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("Tìm kiếm ");

        txtTimKiemKHang.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemKHangCaretUpdate(evt);
            }
        });

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã KH", "Họ Tên", "Giới Tính", "Địa Chỉ", "SĐT", "Ngày Sinh", "Ngày Tạo", "Ngày Sửa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblKhachHang);

        javax.swing.GroupLayout JPanel_DanhSachKHLayout = new javax.swing.GroupLayout(JPanel_DanhSachKH);
        JPanel_DanhSachKH.setLayout(JPanel_DanhSachKHLayout);
        JPanel_DanhSachKHLayout.setHorizontalGroup(
            JPanel_DanhSachKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_DanhSachKHLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel32)
                .addGap(47, 47, 47)
                .addComponent(txtTimKiemKHang, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_DanhSachKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        JPanel_DanhSachKHLayout.setVerticalGroup(
            JPanel_DanhSachKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_DanhSachKHLayout.createSequentialGroup()
                .addGroup(JPanel_DanhSachKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemKHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout QL_KhachHangLayout = new javax.swing.GroupLayout(QL_KhachHang);
        QL_KhachHang.setLayout(QL_KhachHangLayout);
        QL_KhachHangLayout.setHorizontalGroup(
            QL_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QL_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel_ThongTinKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanel_DanhSachKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        QL_KhachHangLayout.setVerticalGroup(
            QL_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_KhachHangLayout.createSequentialGroup()
                .addComponent(JPanel_ThongTinKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPanel_DanhSachKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PN_Main.add(QL_KhachHang, "card5");

        jPanel23.setBackground(new java.awt.Color(232, 211, 227));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel70.setText("Mã : ");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setText("Tên : ");

        tbl_ttsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ma", "Ten"
            }
        ));
        tbl_ttsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ttspMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tbl_ttsp);

        txt_tt_Ma.setEnabled(false);

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 0, 51));
        jLabel72.setText("Thông tin của: ");

        cbb_ttsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sản phẩm", "Loại SP", "Chất Liệu", "Màu Sắc", "Size" }));
        cbb_ttsp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_ttspItemStateChanged(evt);
            }
        });
        cbb_ttsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbb_ttspMouseClicked(evt);
            }
        });

        btn_ctsp_Clear1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ctsp_Clear1.setText("Clear");
        btn_ctsp_Clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_Clear1ActionPerformed(evt);
            }
        });

        btn_ctsp_Xoa1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ctsp_Xoa1.setText("Xoá");
        btn_ctsp_Xoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_Xoa1ActionPerformed(evt);
            }
        });

        btn_ctsp_Sua1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ctsp_Sua1.setText("Sửa");
        btn_ctsp_Sua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_Sua1ActionPerformed(evt);
            }
        });

        btn_ctsp_Them1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ctsp_Them1.setText("Thêm");
        btn_ctsp_Them1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_Them1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addGap(64, 64, 64)
                        .addComponent(cbb_ttsp, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addComponent(jLabel70)
                            .addGap(28, 28, 28)
                            .addComponent(txt_tt_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addComponent(jLabel71)
                            .addGap(28, 28, 28)
                            .addComponent(txt_tt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(189, 189, 189)
                    .addComponent(btn_ctsp_Them1)
                    .addGap(135, 135, 135)
                    .addComponent(btn_ctsp_Sua1)
                    .addGap(118, 118, 118)
                    .addComponent(btn_ctsp_Xoa1)
                    .addGap(121, 121, 121)
                    .addComponent(btn_ctsp_Clear1)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(cbb_ttsp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(txt_tt_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71))))
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(353, 353, 353)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_ctsp_Sua1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ctsp_Them1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ctsp_Xoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ctsp_Clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(359, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("Thuộc tính sản phẩm", jPanel23);

        jPanel24.setBackground(new java.awt.Color(232, 211, 227));

        jPanel37.setBackground(new java.awt.Color(232, 211, 227));
        jPanel37.setPreferredSize(new java.awt.Dimension(1022, 36));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel73.setText("Loại SP : ");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel74.setText("Sản phẩm :");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel75.setText("Chất Liệu :");

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel76.setText("Size : ");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel77.setText("Màu :");

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel78.setText("Số lượng tồn :");

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel79.setText("Ngày tạo :");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel80.setText("Giá :");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel81.setText("Mô tả :");

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel82.setText("Tình Trạng :");

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel83.setText("Ngày Sửa : ");

        rdo_ctsp_DangKinhDoanh.setText("Đang kinh doanh");

        rdo_ctsp_DungKinhDoanh.setText("Dừng kinh doanh");

        txt_ctsp_MoTa.setColumns(20);
        txt_ctsp_MoTa.setRows(5);
        jScrollPane19.setViewportView(txt_ctsp_MoTa);

        btn_ctsp_SanPham.setText("+");
        btn_ctsp_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_SanPhamActionPerformed(evt);
            }
        });

        btn_ctsp_LoaiSP.setText("+");
        btn_ctsp_LoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_LoaiSPActionPerformed(evt);
            }
        });

        btn_ctsp_ChatLieu.setText("+");
        btn_ctsp_ChatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_ChatLieuActionPerformed(evt);
            }
        });

        btn_ctsp_Size.setText("+");
        btn_ctsp_Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_SizeActionPerformed(evt);
            }
        });

        btn_ctsp_Mau.setText("+");
        btn_ctsp_Mau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_MauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75)
                    .addComponent(jLabel77)
                    .addComponent(jLabel74)
                    .addComponent(jLabel76)
                    .addComponent(jLabel73))
                .addGap(56, 56, 56)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(cbb_ctsp_LoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_ctsp_LoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(cbb_ctsp_Mau, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_ctsp_Mau, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(cbb_ctsp_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_ctsp_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(cbb_ctsp_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_ctsp_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(cbb_ctsp_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_ctsp_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(175, 175, 175)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79)
                    .addComponent(jLabel83)
                    .addComponent(jLabel82)
                    .addComponent(jLabel81)
                    .addComponent(jLabel80)
                    .addComponent(jLabel78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(rdo_ctsp_DangKinhDoanh)
                        .addGap(34, 34, 34)
                        .addComponent(rdo_ctsp_DungKinhDoanh))
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_ctsp_SLTon, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_ctsp_Gia, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_ctsp_NgayTao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(txt_ctsp_NgaySua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(txt_ctsp_SLTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ctsp_Gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel78)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel80)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel81)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel82)
                                    .addComponent(rdo_ctsp_DangKinhDoanh)
                                    .addComponent(rdo_ctsp_DungKinhDoanh))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ctsp_NgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel83))
                                .addGap(15, 15, 15)
                                .addComponent(txt_ctsp_NgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbb_ctsp_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel75))
                                    .addComponent(btn_ctsp_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbb_ctsp_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel76)
                                    .addComponent(btn_ctsp_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_ctsp_Mau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbb_ctsp_Mau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel77)))
                                .addGap(25, 25, 25))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbb_ctsp_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel74))
                            .addComponent(btn_ctsp_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addComponent(cbb_ctsp_LoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btn_ctsp_LoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(230, 230, 230))))
        );

        tbl_ctsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "SanPham", "LoaiSP", "ChatLieu", "Size", "Mau", "SoLuongTon", "Gia", "MoTa", "TinhTrang", "NgaySua", "NgayTao"
            }
        ));
        tbl_ctsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ctspMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(tbl_ctsp);

        jPanel30.setBackground(new java.awt.Color(232, 211, 227));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel84.setText("Tìm kiếm :");

        txt_ctsp_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_ctsp_TimKiemCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel84)
                .addGap(18, 18, 18)
                .addComponent(txt_ctsp_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(txt_ctsp_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_ctsp_Them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ctsp_Them.setText("Thêm");
        btn_ctsp_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_ThemActionPerformed(evt);
            }
        });

        btn_ctsp_Sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ctsp_Sua.setText("Sửa");
        btn_ctsp_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_SuaActionPerformed(evt);
            }
        });

        btn_ctsp_Xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ctsp_Xoa.setText("Xoá");
        btn_ctsp_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_XoaActionPerformed(evt);
            }
        });

        btn_ctsp_Clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ctsp_Clear.setText("Clear");
        btn_ctsp_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_ClearActionPerformed(evt);
            }
        });

        jPanel31.setBackground(new java.awt.Color(232, 211, 227));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thêm số lượng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btn_ctsp_Sua2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ctsp_Sua2.setText("Thêm");
        btn_ctsp_Sua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_Sua2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txt_ctsp_ThemSL, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_ctsp_Sua2)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ctsp_ThemSL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ctsp_Sua2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_ctsp_Import.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ctsp_Import.setText("Import Excel");
        btn_ctsp_Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctsp_ImportActionPerformed(evt);
            }
        });

        btn_Export_ctsp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Export_ctsp.setText("In danh sách");
        btn_Export_ctsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Export_ctspActionPerformed(evt);
            }
        });

        btn_TaiMau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_TaiMau.setText("Tải mẫu");
        btn_TaiMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaiMauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_ctsp_Them)
                                .addGap(51, 51, 51)
                                .addComponent(btn_ctsp_Sua)
                                .addGap(48, 48, 48)
                                .addComponent(btn_ctsp_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btn_ctsp_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)))
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(btn_TaiMau, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btn_ctsp_Import)
                        .addGap(48, 48, 48)
                        .addComponent(btn_Export_ctsp)
                        .addGap(25, 25, 25)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ctsp_Clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_ctsp_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ctsp_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ctsp_Import)
                        .addComponent(btn_Export_ctsp)
                        .addComponent(btn_ctsp_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_TaiMau, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jTabbedPane3.addTab("Chi tiết sản phẩm", jPanel24);

        javax.swing.GroupLayout QL_SanPhamLayout = new javax.swing.GroupLayout(QL_SanPham);
        QL_SanPham.setLayout(QL_SanPhamLayout);
        QL_SanPhamLayout.setHorizontalGroup(
            QL_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_SanPhamLayout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        QL_SanPhamLayout.setVerticalGroup(
            QL_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_SanPhamLayout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PN_Main.add(QL_SanPham, "card2");

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addComponent(ChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PN_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_Main, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public QLNguoiDungResponse getND() {
        QLNguoiDungResponse qlndr = iqlnds.getOneNv();
        return qlndr;
    }

    private void PN_BanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_BanHangMouseClicked
        effectNav(PN_BanHang, PN_KhuyenMai, PN_KhachHang, PN_QLNguoiDung, PN_QLThongKe, PN_QLSanPham, PN_QLHoaDon, "Ban Hang");
        nextPN(QL_BanHang);
    }//GEN-LAST:event_PN_BanHangMouseClicked

    private void PN_QLNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_QLNguoiDungMouseClicked
        if (!setRole()) {
            return;
        }
        effectNav(PN_QLNguoiDung, PN_KhuyenMai, PN_KhachHang, PN_BanHang, PN_QLThongKe, PN_QLSanPham, PN_QLHoaDon, "Nhan Vien");
        nextPN(QL_NguoiDung);
    }//GEN-LAST:event_PN_QLNguoiDungMouseClicked

    private void PN_KhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_KhuyenMaiMouseClicked
        if (!setRole()) {
            return;
        }
        effectNav(PN_KhuyenMai, PN_QLNguoiDung, PN_KhachHang, PN_BanHang, PN_QLThongKe, PN_QLSanPham, PN_QLHoaDon, "Khuyen Mai");
        nextPN(QL_KhuyenMai);
    }//GEN-LAST:event_PN_KhuyenMaiMouseClicked

    private void PN_QLThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_QLThongKeMouseClicked
        if (!setRole()) {
            return;
        }
        effectNav(PN_QLThongKe, PN_QLNguoiDung, PN_KhachHang, PN_QLSanPham, PN_KhachHang, PN_QLHoaDon, PN_KhuyenMai, "Thong Ke");
        nextPN(QL_ThongKe);
    }//GEN-LAST:event_PN_QLThongKeMouseClicked

    private void PN_QLSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_QLSanPhamMouseClicked
        effectNav(PN_QLSanPham, PN_QLNguoiDung, PN_KhachHang, PN_BanHang, PN_QLThongKe, PN_QLHoaDon, PN_KhuyenMai, "San Pham");
        nextPN(QL_SanPham);
    }//GEN-LAST:event_PN_QLSanPhamMouseClicked

    private void PN_QLHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_QLHoaDonMouseClicked
        if (!setRole()) {
            return;
        }
        effectNav(PN_QLHoaDon, PN_QLNguoiDung, PN_KhachHang, PN_BanHang, PN_QLThongKe, PN_QLSanPham, PN_KhuyenMai, "Hoa Don");
        nextPN(QL_HoaDon);
    }//GEN-LAST:event_PN_QLHoaDonMouseClicked

    private void btnExistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExistActionPerformed
        new SRM_Login().setVisible(true);
        webcam.close();
        this.dispose();
    }//GEN-LAST:event_btnExistActionPerformed

    private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioHangMouseClicked
        tblSanPham.setRowSelectionAllowed(false);
        tblGioHang.setRowSelectionAllowed(true);
    }//GEN-LAST:event_tblGioHangMouseClicked

    private void PN_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_KhachHangMouseClicked
        effectNav(PN_KhachHang, PN_QLNguoiDung, PN_QLHoaDon, PN_BanHang, PN_QLThongKe, PN_QLSanPham, PN_KhuyenMai, "Khach Hang");
        nextPN(QL_KhachHang);
    }//GEN-LAST:event_PN_KhachHangMouseClicked

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        int index = tblHoaDon.getSelectedRow();
        HoaDon HD = iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(index, 1).toString());
        if (HD.getTinhTrang() == 1) {
            xoatatca.setEnabled(false);
            xoa.setEnabled(false);
            tblSanPham.setEnabled(false);
            tblGioHang.setEnabled(false);
            txtTienKhachDua.setEditable(false);
            txtTienKhachCK.setEditable(false);
            txtTienKhachDua2.setEditable(false);
            txtTienKhachCK2.setEditable(false);
            txtTienShip.setEditable(false);
            txtNgayGuiDi.setEnabled(false);
            txtNgayKhachMuonNhan.setEnabled(false);
            txtNgayNhan.setEnabled(false);
            btnThanhToan.setEnabled(false);
            btnChoGiao.setEnabled(false);
            btnGiaoHang.setEnabled(false);
            btnDaGiao.setEnabled(false);
            rdoDaThanhToan.setSelected(true);
            rdoChoGiao.setSelected(false);
            rdoDangGiao.setSelected(false);
            rdoHDCho.setSelected(false);
            rdoTatCa.setSelected(false);
        } else if (HD.getTinhTrang() == -1) {
            btnDaGiao.setEnabled(false);
            btnChoGiao.setEnabled(true);
            btnGiaoHang.setEnabled(true);
            tblSanPham.setEnabled(true);
            tblGioHang.setEnabled(true);
            txtTienKhachDua2.setEditable(true);
            txtNgayKhachMuonNhan.setEnabled(true);
            txtNgayGuiDi.setEnabled(true);
            txtTienShip.setEditable(true);
            txtNgayNhan.setEnabled(false);
            rdoDaThanhToan.setSelected(false);
            rdoChoGiao.setSelected(true);
            rdoDangGiao.setSelected(false);
            rdoHDCho.setSelected(false);
            rdoTatCa.setSelected(false);
        } else if (HD.getTinhTrang() == -2) {
            xoatatca.setEnabled(false);
            xoa.setEnabled(false);
            tblSanPham.setEnabled(false);
            tblGioHang.setEnabled(false);
            txtNgayGuiDi.setEnabled(false);
            txtNgayKhachMuonNhan.setEnabled(false);
            btnChoGiao.setEnabled(false);
            btnGiaoHang.setEnabled(false);
            btnDaGiao.setEnabled(true);
            txtNgayNhan.setEnabled(true);
            rdoDaThanhToan.setSelected(false);
            rdoChoGiao.setSelected(false);
            rdoDangGiao.setSelected(true);
            rdoHDCho.setSelected(false);
            rdoTatCa.setSelected(false);
        } else {
            if (iBH.getAll_HDCTByIDHD(HD.getIdHD()).size() > 0) {
                xoatatca.setEnabled(true);
                xoa.setEnabled(true);
                if (HD.getKhachHang().getMaKH().equalsIgnoreCase("KH00")) {
                    btnThanhToan.setEnabled(true);
                    txtTienKhachDua.setEditable(true);
                    btnChoGiao.setEnabled(false);
                    btnGiaoHang.setEnabled(false);
                    btnDaGiao.setEnabled(false);
                } else {
                    btnChoGiao.setEnabled(true);
                    btnGiaoHang.setEnabled(true);
                    txtTienKhachDua2.setEditable(true);
                    txtNgayKhachMuonNhan.setEnabled(true);
                    txtNgayGuiDi.setEnabled(true);
                    txtTienShip.setEditable(true);
                    btnThanhToan.setEnabled(false);
                    txtNgayNhan.setEnabled(false);
                    btnDaGiao.setEnabled(false);
                }
            } else {
                xoatatca.setEnabled(false);
                xoa.setEnabled(false);
                if (HD.getKhachHang().getMaKH().equalsIgnoreCase("KH00")) {
                    btnThanhToan.setEnabled(false);
                    txtTienKhachDua.setEditable(true);
                    btnChoGiao.setEnabled(false);
                    btnGiaoHang.setEnabled(false);
                    btnDaGiao.setEnabled(false);
                } else {
                    btnChoGiao.setEnabled(false);
                    btnGiaoHang.setEnabled(false);
                    txtTienKhachDua2.setEditable(true);
                    txtNgayKhachMuonNhan.setEnabled(true);
                    txtNgayGuiDi.setEnabled(true);
                    txtTienShip.setEditable(true);
                    btnThanhToan.setEnabled(false);
                    txtNgayGuiDi.setEnabled(true);
                    txtNgayNhan.setEnabled(false);
                    btnDaGiao.setEnabled(false);
                }
            }
            rdoDaThanhToan.setSelected(false);
            rdoChoGiao.setSelected(false);
            rdoDangGiao.setSelected(false);
            rdoHDCho.setSelected(true);
            rdoTatCa.setSelected(false);
            tblSanPham.setEnabled(true);
            tblGioHang.setEnabled(true);
        }
        if (HD.getKhachHang().getMaKH().equalsIgnoreCase("KH00")) {
            PanelChung.setSelectedIndex(0);
            showDetailHD_TQ(HD);
            tblHoaDon.setRowSelectionAllowed(true);
            loadDataGH(iBH.getAll_HDCTByIDHD(HD.getIdHD()));
            tblHoaDon.setRowSelectionAllowed(true);
        } else {
            PanelChung.setSelectedIndex(1);
            if (HD.getTinhTrang() == -2) {
                showDetailHD_Dh_DG(HD);
            } else if (HD.getTinhTrang() == -1) {
                showDetailHD_Dh_CG(HD);
            } else if (HD.getTinhTrang() == 0) {
                showDetailHD_Dh_CTT(HD);
            } else {
                showDetailHD_Dh(HD);
            }
            tblHoaDon.setRowSelectionAllowed(true);
            loadDataGH(iBH.getAll_HDCTByIDHD(HD.getIdHD()));
            tblHoaDon.setRowSelectionAllowed(true);
        }
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        if (PanelChung.getSelectedIndex() == 1 && lblMaKH.getText().equalsIgnoreCase("KH00")) {
            JOptionPane.showMessageDialog(this, "Ban chua chon khach hang");
            return;
        }
        tblGioHang.setRowSelectionAllowed(false);
        tblSanPham.setRowSelectionAllowed(true);
        if (ihd.getAll().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ban phai tao HD de mua hang");
            return;
        }
        HoaDon HD = iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString());
        ChiTietSanPham CTSP = iBH.getAll_CTSP_ByName(txtTimKiem.getText()).get(tblSanPham.getSelectedRow());
        String ipSL = JOptionPane.showInputDialog(this, "Moi nhap so luong");
        if (ipSL.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong");
            return;
        }
        int sl;
        try {
            sl = Integer.parseInt(ipSL);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "So luong phai la so !");
            return;
        }
        if (sl < 0) {
            JOptionPane.showMessageDialog(this, "So luong phai la so duong");
            return;
        }
        if (sl > Integer.parseInt(tblSanPham.getValueAt(tblSanPham.getSelectedRow(), 6).toString())) {
            JOptionPane.showMessageDialog(this, "So luong trong kho khong du");
            return;
        }
        int check = 0;
        for (HoaDonChiTiet HDCT : iBH.getAll_HDCT()) {
            if (HDCT.getHoaDon().getIdHD().equals(HD.getIdHD()) && HDCT.getChiTietSanPham().getId().equals(CTSP.getId())) {
                int slMua = Integer.parseInt(ipSL) + HDCT.getSlMua();
                iBH.updateSL_HDCT(getFormDataHDCT_UD(HDCT, String.valueOf(slMua)));
                check = 1;
            }
        }
        if (check == 0) {
            iBH.add_HDCT(getFormDataHDCT(ipSL));
        }
        int slTon = CTSP.getSlTon() - Integer.parseInt(ipSL);
        iBH.updateSL_CTSP(getFormDataCTSP_UD(String.valueOf(slTon)));
        loadDataSP();
        loadDataGH(iBH.getAll_HDCTByIDHD(HD.getIdHD()));
        if (iBH.getAll_HDCTByIDHD(HD.getIdHD()).size() > 0) {
            if (HD.getKhachHang().getMaKH().equalsIgnoreCase("KH00")) {
                btnThanhToan.setEnabled(true);
                xoa.setEnabled(true);
                xoatatca.setEnabled(true);
            } else {
                btnChoGiao.setEnabled(true);
                btnGiaoHang.setEnabled(true);
                xoa.setEnabled(true);
                xoatatca.setEnabled(true);
            }
        }
        if (PanelChung.getSelectedIndex() == 0) {
            List<BigDecimal> lstGia = new ArrayList<>();
            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                lstGia.add(x.getGia().multiply(BigDecimal.valueOf(x.getSlMua())));
            }
            sum = 0.0;
            for (BigDecimal bigDecimal : lstGia) {
                sum += Double.parseDouble(bigDecimal.toString());
            }
            DecimalFormat df = new DecimalFormat("#,###");
            txtTongTien.setText(df.format(sum) + " VND");
            List<BigDecimal> lstGiamGia = new ArrayList<>();
            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                lstGiamGia.add(x.getGiaKM().multiply(BigDecimal.valueOf(x.getSlMua())));
            }
            giamSum = 0.0;
            for (BigDecimal bigDecimal : lstGiamGia) {
                giamSum += Double.parseDouble(bigDecimal.toString());
            }
            DecimalFormat dfggia = new DecimalFormat("#,###");
            txtGiamGia.setText(dfggia.format(sum - giamSum) + " VND");
            DecimalFormat dfttoan = new DecimalFormat("#,###");
            txtThanhToan.setText(dfttoan.format(giamSum) + " VND");
            ttoan = giamSum;
            txtTimKiem.setText("");
            BigDecimal tienThua = (txtTienKhachDua.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua.getText()))).subtract(BigDecimal.valueOf(ttoan));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua.setText(dftt.format(tienThua) + " VND");
        } else {
            List<BigDecimal> lstGia = new ArrayList<>();
            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                lstGia.add(x.getGia().multiply(BigDecimal.valueOf(x.getSlMua())));
            }
            sum = 0.0;
            for (BigDecimal bigDecimal : lstGia) {
                sum += Double.parseDouble(bigDecimal.toString());
            }
            DecimalFormat df = new DecimalFormat("#,###");
            txtTongTien2.setText(df.format(sum) + " VND");
            List<BigDecimal> lstGiamGia = new ArrayList<>();
            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                lstGiamGia.add(x.getGiaKM().multiply(BigDecimal.valueOf(x.getSlMua())));
            }
            giamSum = 0.0;
            for (BigDecimal bigDecimal : lstGiamGia) {
                giamSum += Double.parseDouble(bigDecimal.toString());
            }
            DecimalFormat dfggia = new DecimalFormat("#,###");
            txtGiamGia2.setText(dfggia.format(sum - giamSum) + " VND");
            DecimalFormat dfttoan = new DecimalFormat("#,###");
            txtThanhToan2.setText(dfttoan.format(giamSum) + " VND");
            ttoan = giamSum;
            txtTimKiem.setText("");
            BigDecimal tienThua = (txtTienKhachDua2.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua2.getText()))).subtract(BigDecimal.valueOf(ttoan));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua2.setText(dftt.format(tienThua) + " VND");
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaMouseClicked
        HoaDon HD = iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString());
        int indexGH = tblGioHang.getSelectedRow();
        int sl = Integer.parseInt(tblGioHang.getValueAt(indexGH, 3).toString());
        ChiTietSanPham CTSP = iBH.getAll_HDCTByIDHD(HD.getIdHD()).get(indexGH).getChiTietSanPham();
        int slUP = sl + CTSP.getSlTon();
        iBH.updateSL_CTSP(new BanhangReponse(CTSP, String.valueOf(slUP)));
        loadDataSP();
        iBH.delete_HDCT(getFormDataHDCT_DL());
        loadDataGH(iBH.getAll_HDCTByIDHD(HD.getIdHD()));
        txtTimKiem.setText("");
        if (iBH.getAll_HDCTByIDHD(HD.getIdHD()).size() == 0) {
            xoa.setEnabled(false);
            xoatatca.setEnabled(false);
            if (HD.getKhachHang().getMaKH().equalsIgnoreCase("KH00")) {
                btnThanhToan.setEnabled(false);
            } else {
                btnChoGiao.setEnabled(false);
                btnGiaoHang.setEnabled(false);
            }
        } else {
            xoa.setEnabled(true);
            xoatatca.setEnabled(true);
            if (HD.getKhachHang().getMaKH().equalsIgnoreCase("KH00")) {
                btnThanhToan.setEnabled(true);
            } else {
                btnChoGiao.setEnabled(true);
                btnGiaoHang.setEnabled(true);
            }
        }
        if (PanelChung.getSelectedIndex() == 0) {
            List<BigDecimal> lstGia = new ArrayList<>();
            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                lstGia.add(x.getGia().multiply(BigDecimal.valueOf(x.getSlMua())));
            }
            sum = 0.0;
            for (BigDecimal bigDecimal : lstGia) {
                sum += Double.parseDouble(bigDecimal.toString());
            }
            DecimalFormat df = new DecimalFormat("#,###");
            txtTongTien.setText(df.format(sum) + " VND");
            List<BigDecimal> lstGiamGia = new ArrayList<>();
            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                lstGiamGia.add(x.getGiaKM().multiply(BigDecimal.valueOf(x.getSlMua())));
            }
            giamSum = 0.0;
            for (BigDecimal bigDecimal : lstGiamGia) {
                giamSum += Double.parseDouble(bigDecimal.toString());
            }
            DecimalFormat dfggia = new DecimalFormat("#,###");
            txtGiamGia.setText(dfggia.format(sum - giamSum) + " VND");
            DecimalFormat dfttoan = new DecimalFormat("#,###");
            txtThanhToan.setText(dfttoan.format(giamSum) + " VND");
            ttoan = giamSum;
            txtTimKiem.setText("");
            BigDecimal tienThua = (txtTienKhachDua.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua.getText()))).subtract(BigDecimal.valueOf(ttoan));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua.setText(dftt.format(tienThua) + " VND");
        } else {
            List<BigDecimal> lstGia = new ArrayList<>();
            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                lstGia.add(x.getGia().multiply(BigDecimal.valueOf(x.getSlMua())));
            }
            sum = 0.0;
            for (BigDecimal bigDecimal : lstGia) {
                sum += Double.parseDouble(bigDecimal.toString());
            }
            DecimalFormat df = new DecimalFormat("#,###");
            txtTongTien2.setText(df.format(sum) + " VND");
            List<BigDecimal> lstGiamGia = new ArrayList<>();
            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                lstGiamGia.add(x.getGiaKM().multiply(BigDecimal.valueOf(x.getSlMua())));
            }
            giamSum = 0.0;
            for (BigDecimal bigDecimal : lstGiamGia) {
                giamSum += Double.parseDouble(bigDecimal.toString());
            }
            DecimalFormat dfggia = new DecimalFormat("#,###");
            txtGiamGia2.setText(dfggia.format(sum - giamSum) + " VND");
            DecimalFormat dfttoan = new DecimalFormat("#,###");
            txtThanhToan2.setText(dfttoan.format(giamSum) + " VND");
            ttoan = giamSum;
            txtTimKiem.setText("");
            BigDecimal tienThua = (txtTienKhachDua2.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua2.getText()))).subtract(BigDecimal.valueOf(ttoan));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua2.setText(dftt.format(tienThua) + " VND");
        }
    }//GEN-LAST:event_xoaMouseClicked

    private void btnThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseClicked
        if (getFormDataHD_UD_TQ() == null) {
            return;
        }
        iBH.update_HD_TQ(getFormDataHD_UD_TQ());
        loadDataHD(iBH.getAll_HD());
        loadHoaDon();
        loadDataGH_Rong();
        loadAllthongKe();
        JOptionPane.showMessageDialog(this, "Thanh toan thanh cong !");
        clearForm();
        tblSanPham.setEnabled(false);
        tblGioHang.setEnabled(false);
        btnThanhToan.setEnabled(false);
    }//GEN-LAST:event_btnThanhToanMouseClicked

    private void chonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chonMouseClicked
        tblKhachHang.setRowSelectionAllowed(true);
        tblKhachHang.setRowSelectionInterval(0, 0);
        nextPN(QL_KhachHang);
    }//GEN-LAST:event_chonMouseClicked

    private void btnThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKHActionPerformed
        try {
            KhachHangResponse kh = getFormKh();
            kh.setNgaySua(java.time.LocalDate.now() + "");
            kh.setNgayTao(java.time.LocalDate.now() + "");
            String add = iQlKH.addKh(kh);;
            JOptionPane.showMessageDialog(this, add);
            loadKhachHang();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemKHActionPerformed

    private void btnSuaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKHActionPerformed
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?");
            if (hoi == JOptionPane.NO_OPTION) {
                return;
            } else {
                KhachHangResponse kh = getFormKh();
                kh.setIdKh(lstKh.get(tblKhachHang.getSelectedRow()).getIdKh());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date ngayTao;
                ngayTao = Date.valueOf(sdf.format(txt_kh_NgayTao.getDate()));
                kh.setNgayTao(ngayTao + "");
                kh.setNgaySua(java.time.LocalDate.now() + "");
                String update = iQlKH.updateKh(kh);;
                JOptionPane.showMessageDialog(this, update);
                loadKhachHang();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaKHActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        KhachHangResponse kh = lstKh.get(tblKhachHang.getSelectedRow());
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        if (hoi != JOptionPane.YES_OPTION) {
            return;
        }
        int index = tblKhachHang.getSelectedRow();
        kh.setIdKh(iQlKH.getAll().get(index).getIdKh());
        String delete = iQlKH.deleteKh(kh);
        JOptionPane.showMessageDialog(this, delete);
        loadKhachHang();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        showDetailKH();
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnLamMoiKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiKHActionPerformed
        clearKH();
    }//GEN-LAST:event_btnLamMoiKHActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        loadKhachHang();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnChonKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonKHMouseClicked
        thaydoi.setEnabled(true);
        nextPN(QL_BanHang);
    }//GEN-LAST:event_btnChonKHMouseClicked

    private void thaydoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thaydoiMouseClicked
        xoa.setEnabled(false);
        xoatatca.setEnabled(false);
        btnGiaoHang.setEnabled(false);
        btnChoGiao.setEnabled(false);
        btnDaGiao.setEnabled(false);
        if (tblKhachHang.getSelectedRow() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn khách đặt hàng");
            return;
        }
        iBH.update_HD_KH(getFormDataHD_UD_KH());
        HoaDon hd = iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString());
        KhachHang kh = iBH.getOne_KH(hd.getKhachHang().getIdKH());
        NguoiDung nd = iBH.getOne_ND(hd.getNguoiDung().getIdND());
        txtNgayKhachMuonNhan.setDate(hd.getNgayMuonNhan());
        lblMaKH.setText(kh.getMaKH());
        lblTenKH.setText(kh.getHoTen());
        lblMaHD2.setText(hd.getMaHD());
        lblTenND2.setText(nd.getHoTen());
        tblKhachHang.setRowSelectionAllowed(false);
        thaydoi.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Cập nhật khách hàng thành công");
    }//GEN-LAST:event_thaydoiMouseClicked

    private void btn_km_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_km_ClearActionPerformed
        txt_km_Ma.setText("");
        txt_km_MoTa.setText("");
        txt_km_Ten.setText("");
        txt_km_NgayBatDau.setDateFormatString("");
        txt_km_NgayKetThuc.setDateFormatString("");
        buttonGroup1.clearSelection();
        txt_km_NgayTao.setDateFormatString("");
        txt_km_NgaySua.setDateFormatString("");
        txt_km_GiamGia.setText("");
    }//GEN-LAST:event_btn_km_ClearActionPerformed

    private void btn_km_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_km_XoaActionPerformed
        int row = tbl_km.getSelectedRow();
        int s = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không?");
        if (s != JOptionPane.YES_OPTION) {
            return;
        }
        KhuyenMaiReponse km = getKM();
        km.setIdKM(iKM.getAll().get(row).getIdKM());
        iKM.delete(km);
        listKM = iKM.getAll();
        loadKM(iKM.getAll());
        JOptionPane.showMessageDialog(this, "Xóa thành công");
    }//GEN-LAST:event_btn_km_XoaActionPerformed

    private void btn_km_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_km_SuaActionPerformed
        try {
            int row = tbl_km.getSelectedRow();
            KhuyenMaiReponse km = getKM();
            km.setIdKM(iKM.getAll().get(row).getIdKM());
            iKM.update(km);
            listKM = iKM.getAll();
            loadKM(iKM.getAll());
            JOptionPane.showMessageDialog(this, "SỬA THÀNH CÔNG!");
        } catch (Exception e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(this, "SỬA THẤT BẠI!!!");
        }
    }//GEN-LAST:event_btn_km_SuaActionPerformed

    private void btn_km_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_km_ThemActionPerformed
        try {
            iKM.add(getKM());
            listKM = iKM.getAll();
            loadKM(iKM.getAll());
            loadDataKM();
            JOptionPane.showMessageDialog(this, "THÊM THÀNH CÔNG!");
        } catch (Exception e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(this, "THÊM THẤT BẠI!!!");
        }
    }//GEN-LAST:event_btn_km_ThemActionPerformed

    private void pnDetailNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDetailNDMouseClicked
        new SRM_DetailND(ndRP).setVisible(true);
    }//GEN-LAST:event_pnDetailNDMouseClicked


    private void tbl_kmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_kmMouseClicked
        int row = tbl_km.getSelectedRow();
        txt_km_Ma.setText(tbl_km.getValueAt(row, 2).toString());
        txt_km_Ten.setText(tbl_km.getValueAt(row, 3).toString());
        txt_km_GiamGia.setText(tbl_km.getValueAt(row, 4).toString());
        txt_km_MoTa.setText(tbl_km.getValueAt(row, 5).toString());
        String check = tbl_km.getValueAt(row, 8).toString();
        if (check.equalsIgnoreCase("Còn Khuyến Mãi")) {
            rdo_km_ConKhuyenMai.setSelected(true);

        } else {
            rdo_km_DungKhuyenMai.setSelected(true);
        }

        Date ngayBatDau = Date.valueOf(tbl_km.getValueAt(row, 6).toString());
        txt_km_NgayBatDau.setDate(ngayBatDau);
        Date ngayKetThuc = Date.valueOf(tbl_km.getValueAt(row, 7).toString());
        txt_km_NgayKetThuc.setDate(ngayKetThuc);
        Date ngayTao = Date.valueOf(tbl_km.getValueAt(row, 9).toString());
        txt_km_NgayTao.setDate(ngayTao);
        Date ngaySua = Date.valueOf(tbl_km.getValueAt(row, 10).toString());
        txt_km_NgaySua.setDate(ngaySua);
    }//GEN-LAST:event_tbl_kmMouseClicked

    private void btn_hd_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hd_XoaActionPerformed
        int row = tbl_HoaDon.getSelectedRow();
        HoaDon hoadon = ihd.getAll().get(row);
        ihd.delete(hoadon.getIdHD());
        loadHoaDon();
        loadDataHD(iBH.getAll_HD());
    }//GEN-LAST:event_btn_hd_XoaActionPerformed

    private void tbl_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HoaDonMouseClicked
        loadHoaDonChiTiet(iBH.getAll_HDCTByIDHD(ihd.getAll().get(tbl_HoaDon.getSelectedRow()).getIdHD()));
    }//GEN-LAST:event_tbl_HoaDonMouseClicked

    private void txt_hd_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hd_timKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hd_timKiemActionPerformed

    private void txtTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemCaretUpdate
        loadDataSP();
    }//GEN-LAST:event_txtTimKiemCaretUpdate

    private void txt_nd_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_nd_TimKiemCaretUpdate
        loadND(inds.getByName("%" + txt_nd_TimKiem.getText() + "%"));
    }//GEN-LAST:event_txt_nd_TimKiemCaretUpdate

    private void tbl_nd_DangLamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nd_DangLamMouseClicked
        showND();
    }//GEN-LAST:event_tbl_nd_DangLamMouseClicked

    private void btn_nd_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nd_XoaActionPerformed
        int s = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không?");
        if (s != JOptionPane.YES_OPTION) {
            return;
        }
        int row = tbl_nd_DangLam.getSelectedRow();
        NguoiDung nd = inds.getAll().get(row);
        inds.delete(getFromMoi(nd.getIdND()));
        JOptionPane.showMessageDialog(this, "Xóa thành công");
        loadND(inds.getAll());
    }//GEN-LAST:event_btn_nd_XoaActionPerformed

    private void btn_nd_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nd_SuaActionPerformed
        try {
            int row = tbl_nd_DangLam.getSelectedRow();
            NguoiDung nd = inds.getAll().get(row);
            System.out.println(nd);
            inds.update(getFromMoi(nd.getIdND()));
            loadND(inds.getAll());
            JOptionPane.showMessageDialog(this, "SỬA THÀNH CÔNG!");
        } catch (Exception e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(this, "SỬA THẤT BẠI!!!");
        }
    }//GEN-LAST:event_btn_nd_SuaActionPerformed

    private void btn_nd_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nd_ThemActionPerformed
//        NguoiDungReponse nd = new NguoiDungReponse();
        webcam.close();
        this.dispose();
        new SRM_NDMail().setVisible(true);
//        String email = JOptionPane.showInputDialog("Nhập email để xác nhận thêm");
//        nd.setEmail(email);
//        if (inds.checkEmailXacNhan(nd) != null) {
//            JOptionPane.showMessageDialog(this, inds.checkEmailXacNhan(nd));
//            try {
//                String ma = JOptionPane.showInputDialog("Nhập mã xác nhận");
//                JOptionPane.showMessageDialog(this, inds.checkMa(ma));
//                inds.add(getFromMoi(null));
//                listND = inds.getAll();
//                loadND(inds.getAll());
//                JOptionPane.showMessageDialog(this, "THÊM THÀNH CÔNG!");
//            } catch (Exception ex) {
//                ex.printStackTrace(System.out);
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, inds.emaiFals(nd));
//            return;
//        }
    }//GEN-LAST:event_btn_nd_ThemActionPerformed

    // 
    private void rdoTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTatCaActionPerformed
        loadDataHD(iBH.getAll_HD());
        loadDataGH_Rong();
    }//GEN-LAST:event_rdoTatCaActionPerformed

    private void rdoDaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDaThanhToanActionPerformed
        loadDataHD(iBH.getAll_HD_ByTT(1));
        loadDataGH_Rong();
    }//GEN-LAST:event_rdoDaThanhToanActionPerformed

    private void rdoHDChoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoHDChoActionPerformed
        loadDataHD(iBH.getAll_HD_ByTT(0));
        loadDataGH_Rong();
    }//GEN-LAST:event_rdoHDChoActionPerformed

    private void txt_km_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_km_TimKiemCaretUpdate
        loadKM(iKM.get_By_Name("%" + txt_km_TimKiem.getText() + "%"));
    }//GEN-LAST:event_txt_km_TimKiemCaretUpdate

    private void inhoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inhoadonActionPerformed
        bHeight = Double.valueOf(itemName.size());

        //JOptionPane.showMessageDialog(rootPane, bHeight);
        PrinterJob pj = PrinterJob.getPrinterJob();

        pj.setPrintable(new BillPrintable(), getPageFormat(pj));

        try {
            pj.print();

        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_inhoadonActionPerformed

    private void txtTimKiemKHangCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemKHangCaretUpdate
        // TODO add your handling code here:
        loadKhachHang();
    }//GEN-LAST:event_txtTimKiemKHangCaretUpdate

    private void txtTienKhachDuaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTienKhachDuaCaretUpdate
        if (txtTienKhachCK.getText().isEmpty()) {
            BigDecimal tienThua = (txtTienKhachDua.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua.getText()))).subtract(BigDecimal.valueOf(ttoan));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua.setText(dftt.format(tienThua) + " VND");
        } else {
            BigDecimal tienKhachDua = (txtTienKhachDua.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua.getText())));
            BigDecimal tienKhachCk = (txtTienKhachCK.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachCK.getText())));
            BigDecimal tienThua = (tienKhachDua.add(tienKhachCk)).subtract(BigDecimal.valueOf(ttoan));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua.setText(dftt.format(tienThua) + " VND");
        }
    }//GEN-LAST:event_txtTienKhachDuaCaretUpdate

    private void btnTaoHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoHDMouseClicked
        txtTienKhachDua.setEditable(true);
        tblSanPham.setEnabled(true);
        tblGioHang.setEnabled(true);
        clearForm();
        iBH.add_HD(getFormDataHD());
        rdoHDCho.setSelected(true);
        loadDataHD(iBH.getAll_HD_ByTT(0));
        loadHoaDon();
        loadDataGH_Rong();
        tblHoaDon.setRowSelectionInterval(0, 0);
        tblHoaDon.setRowSelectionAllowed(true);
        HoaDon hd = iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString());
        KhachHang kh = iBH.getOne_KH(hd.getKhachHang().getIdKH());
        NguoiDung nd = iBH.getOne_ND(hd.getNguoiDung().getIdND());
        lblMaKH.setText(kh.getMaKH());
        lblTenKH.setText(kh.getHoTen());
        lblMaHD.setText(hd.getMaHD());
        lblTenND.setText(nd.getHoTen());
    }//GEN-LAST:event_btnTaoHDMouseClicked

    private void txtTienKhachDua2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTienKhachDua2CaretUpdate
        double tship = Double.parseDouble(txtTienShip.getText());
        if (txtTienKhachCK2.getText().isEmpty()) {
            BigDecimal tienThua = (txtTienKhachDua2.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua2.getText()))).subtract(BigDecimal.valueOf(ttoan + tship));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua2.setText(dftt.format(tienThua) + " VND");
        } else {
            BigDecimal tienKhachDua = (txtTienKhachDua2.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua2.getText())));
            BigDecimal tienKhachCk = (txtTienKhachCK2.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachCK2.getText())));
            BigDecimal tienThua = (tienKhachDua.add(tienKhachCk)).subtract(BigDecimal.valueOf(ttoan + tship));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua2.setText(dftt.format(tienThua) + " VND");
        }
    }//GEN-LAST:event_txtTienKhachDua2CaretUpdate

    private void btnTaoHD2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoHD2MouseClicked
        clearFormDH();
        txtTienKhachDua2.setEditable(true);
        txtNgayKhachMuonNhan.setEnabled(true);
        txtNgayGuiDi.setEnabled(true);
        txtTienShip.setEditable(true);
        tblSanPham.setEnabled(true);
        tblGioHang.setEnabled(true);
        chon.setEnabled(true);
        thaydoi.setEnabled(false);
        iBH.add_HD(getFormDataHD());
        rdoHDCho.setSelected(true);
        loadDataHD(iBH.getAll_HD_ByTT(0));
        loadHoaDon();
        loadDataGH_Rong();
        tblHoaDon.setRowSelectionInterval(0, 0);
        tblHoaDon.setRowSelectionAllowed(true);
        HoaDon hd = iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString());
        KhachHang kh = iBH.getOne_KH(hd.getKhachHang().getIdKH());
        NguoiDung nd = iBH.getOne_ND(hd.getNguoiDung().getIdND());
        lblMaKH.setText(kh.getMaKH());
        lblTenKH.setText(kh.getHoTen());
        lblMaHD2.setText(hd.getMaHD());
        lblTenND2.setText(nd.getHoTen());
        JOptionPane.showMessageDialog(this, "Moi ban chon Khach Hang");
    }//GEN-LAST:event_btnTaoHD2MouseClicked

    private void cboPthucttItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPthucttItemStateChanged
        if (cboPthuctt.getSelectedIndex() == 0) {
            txtTienKhachCK.setText("");
            txtTienKhachDua.setEditable(true);
            txtTienKhachCK.setEditable(false);
        } else if (cboPthuctt.getSelectedIndex() == 1) {
            txtTienKhachDua.setText("");
            txtTienKhachDua.setEditable(false);
            txtTienKhachCK.setEditable(true);
        } else {
            txtTienKhachDua.setText("");
            txtTienKhachCK.setText("");
            txtTienKhachCK.setEditable(true);
            txtTienKhachDua.setEditable(true);
        }
    }//GEN-LAST:event_cboPthucttItemStateChanged

    private void txtTienKhachCKCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTienKhachCKCaretUpdate
        if (txtTienKhachDua.getText().isEmpty()) {
            BigDecimal tienThua = (txtTienKhachCK.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachCK.getText()))).subtract(BigDecimal.valueOf(ttoan));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua.setText(dftt.format(tienThua) + " VND");
        } else {
            BigDecimal tienKhachDua = (txtTienKhachDua.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua.getText())));
            BigDecimal tienKhachCk = (txtTienKhachCK.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachCK.getText())));
            BigDecimal tienThua = (tienKhachDua.add(tienKhachCk)).subtract(BigDecimal.valueOf(ttoan));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua.setText(dftt.format(tienThua) + " VND");
        }
    }//GEN-LAST:event_txtTienKhachCKCaretUpdate

    private void btnGiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaoHangActionPerformed
        rdoTatCa.setSelected(true);
        if (getFormDataHD_UD_BH_GiaoHang(-2) == null) {
            return;
        }
        JOptionPane.showMessageDialog(this, "ĐƠN HÀNG ĐÃ ĐƯỢC GIAO CHO SHIPPER");
        iBH.update_HD_DH(getFormDataHD_UD_BH_GiaoHang(-2));
        loadDataHD(iBH.getAll_HD());
        clearFormDH();
        txtTienShip.setEditable(false);
        txtNgayKhachMuonNhan.setEnabled(false);
        txtNgayGuiDi.setEnabled(false);
        btnGiaoHang.setEnabled(false);
        btnChoGiao.setEnabled(false);
    }//GEN-LAST:event_btnGiaoHangActionPerformed

    private void txtTienShipCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTienShipCaretUpdate
        if (!txtTienShip.getText().isEmpty()) {
            double ttss;
            ttss = ttoan + Double.valueOf(txtTienShip.getText());
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtThanhToan2.setText(dftt.format(ttss) + " VND");
            BigDecimal tienThua = (txtTienKhachDua.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua.getText()))).subtract(BigDecimal.valueOf(ttss));
            DecimalFormat dfttt = new DecimalFormat("#,###");
            txtTienThua2.setText(dfttt.format(tienThua) + " VND");
        }
    }//GEN-LAST:event_txtTienShipCaretUpdate

    private void txtTienKhachCK2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTienKhachCK2CaretUpdate
        double tship = Double.parseDouble(txtTienShip.getText());
        if (txtTienKhachDua2.getText().isEmpty()) {
            BigDecimal tienThua = (txtTienKhachCK2.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachCK2.getText()))).subtract(BigDecimal.valueOf(ttoan + tship));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua2.setText(dftt.format(tienThua) + " VND");
        } else {
            BigDecimal tienKhachDua = (txtTienKhachDua2.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua2.getText())));
            BigDecimal tienKhachCk = (txtTienKhachCK2.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachCK2.getText())));
            BigDecimal tienThua = (tienKhachDua.add(tienKhachCk)).subtract(BigDecimal.valueOf(ttoan + tship));
            DecimalFormat dftt = new DecimalFormat("#,###");
            txtTienThua2.setText(dftt.format(tienThua) + " VND");
        }
    }//GEN-LAST:event_txtTienKhachCK2CaretUpdate

    private void cboPthuctt2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPthuctt2ItemStateChanged
        if (cboPthuctt2.getSelectedIndex() == 0) {
            txtTienKhachCK2.setText("");
            txtTienKhachDua2.setEditable(true);
            txtTienKhachCK2.setEditable(false);
        } else if (cboPthuctt2.getSelectedIndex() == 1) {
            txtTienKhachDua2.setText("");
            txtTienKhachDua2.setEditable(false);
            txtTienKhachCK2.setEditable(true);
        } else {
            txtTienKhachDua2.setText("");
            txtTienKhachCK2.setText("");
            txtTienKhachCK2.setEditable(true);
            txtTienKhachDua2.setEditable(true);
        }
    }//GEN-LAST:event_cboPthuctt2ItemStateChanged

    private void rdoDangGiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDangGiaoActionPerformed
        loadDataHD(iBH.getAll_HD_ByTT(-2));
        loadDataGH_Rong();    }//GEN-LAST:event_rdoDangGiaoActionPerformed

    private void rdoChoGiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChoGiaoActionPerformed
        loadDataHD(iBH.getAll_HD_ByTT(-1));
        loadDataGH_Rong();
    }//GEN-LAST:event_rdoChoGiaoActionPerformed

    private void btnChoGiaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChoGiaoMouseClicked
        rdoTatCa.setSelected(true);
        if (getFormDataHD_UD_BH(-1) == null) {
            return;
        }
        iBH.update_HD_DH(getFormDataHD_UD_BH(-1));
        loadDataHD(iBH.getAll_HD());
        clearFormDH();
        btnChoGiao.setEnabled(false);
        btnGiaoHang.setEnabled(false);
    }//GEN-LAST:event_btnChoGiaoMouseClicked

    private void btnDaGiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaGiaoActionPerformed
        rdoTatCa.setSelected(true);
        if (getFormDataHD_UD_BH_DaGiao(1) == null) {
            return;
        }
        JOptionPane.showMessageDialog(this, "GIAO HÀNG VÀ THANH TOÁN THÀNH CÔNG");
        iBH.update_HD_DH(getFormDataHD_UD_BH_DaGiao(1));
        loadDataHD(iBH.getAll_HD());
        txtNgayNhan.setEnabled(false);
        clearFormDH();
        btnDaGiao.setEnabled(false);
        txtTienKhachDua2.setEditable(false);
    }//GEN-LAST:event_btnDaGiaoActionPerformed

    private void btnInHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHDActionPerformed
        bHeight = Double.valueOf(itemNameDH.size());
//        System.out.println("SỐ PHẦN TỬ:" + itemName.size());
        //JOptionPane.showMessageDialog(rootPane, bHeight);

        PrinterJob pj1 = PrinterJob.getPrinterJob();

        pj1.setPrintable(new BillPrintable1(), getPageFormat1(pj1));

        try {
            pj1.print();

        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnInHDActionPerformed

    private void Jdate_nd_ngaySinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jdate_nd_ngaySinhMouseClicked

    }//GEN-LAST:event_Jdate_nd_ngaySinhMouseClicked

    private void Jdate_nd_ngayTaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jdate_nd_ngayTaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jdate_nd_ngayTaoMouseClicked

    private void Jdate_nd_ngaySuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jdate_nd_ngaySuaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jdate_nd_ngaySuaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


    }//GEN-LAST:event_jButton2ActionPerformed

    private final KhuyenMaiRepository repository = new KhuyenMaiRepository();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        List<KhuyenMai> list = listKM;

        for (int i = 0; i < list.size(); i++) {
            if (rdList.get(i).isSelected()) {
                KhuyenMai km = list.get(i);

                if (km.getTinhTrang() != 0) {
                    km.setTinhTrang(0);
                    repository.update(km);
                }

            }
        }

        // la sao
        loadKM(listKM);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbl_ttspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ttspMouseClicked
        indextblThuocTinh = tbl_ttsp.getSelectedRow();
        showDetailThuocTinh();
    }//GEN-LAST:event_tbl_ttspMouseClicked

    private void cbb_ttspItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_ttspItemStateChanged
        String result = (String) cbb_ttsp.getSelectedItem();
        if (result.equals("Sản phẩm")) {
            indexcbbThuocTinhSP = 0;
        } else if (result.equals("Loại SP")) {
            indexcbbThuocTinhSP = 1;
        } else if (result.equals("Chất Liệu")) {
            indexcbbThuocTinhSP = 2;
        } else if (result.equals("Màu Sắc")) {
            indexcbbThuocTinhSP = 3;
        } else if (result.equals("Size")) {
            indexcbbThuocTinhSP = 4;
        }
        loadQLThuocTinh();
        if (tbl_ttsp.getRowCount() > 0) {
            showDetailThuocTinh();
        }
    }//GEN-LAST:event_cbb_ttspItemStateChanged

    private void cbb_ttspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbb_ttspMouseClicked

    }//GEN-LAST:event_cbb_ttspMouseClicked

    private void btn_ctsp_Clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_Clear1ActionPerformed

        txt_tt_Ma.setText("");
        txt_tt_Ten.setText("");
    }//GEN-LAST:event_btn_ctsp_Clear1ActionPerformed

    private void btn_ctsp_Xoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_Xoa1ActionPerformed
        try {
            if (tbl_ttsp.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Khong con du lieu de xoa!");
                return;
            }
            int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon xoa khong?", "Thong bao", JOptionPane.YES_NO_OPTION);
            if (hoi == JOptionPane.NO_OPTION) {
                return;
            }
            QLSanPhamResponse ms;
            indextblThuocTinh = tbl_ttsp.getSelectedRow();
            if (indexcbbThuocTinhSP == 0) {
                ms = iSP.getAllQLSP().get(indextblThuocTinh);
                iSP.deleteQLSP(ms);
            } else if (indexcbbThuocTinhSP == 1) {
                ms = iLoaiSP.getAllQLLoaiSP().get(indextblThuocTinh);
                iLoaiSP.deleteQLLoaiSP(ms);
            } else if (indexcbbThuocTinhSP == 2) {
                ms = iCL.getAllQLCL().get(indextblThuocTinh);
                iCL.deleteQLCL(ms);
            } else if (indexcbbThuocTinhSP == 3) {
                ms = iMS.getAllQLMauSac().get(indextblThuocTinh);
                iMS.deleteQLMauSac(ms);
            } else if (indexcbbThuocTinhSP == 4) {
                ms = iSize.getAllQLSize().get(indextblThuocTinh);
                iSize.deleteQLSize(ms);
            }
            loadAll();
            JOptionPane.showMessageDialog(this, "XOÁ THÀNH CÔNG!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, " LỖI NÚT XOÁ !");
        }
    }//GEN-LAST:event_btn_ctsp_Xoa1ActionPerformed

    private void btn_ctsp_Sua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_Sua1ActionPerformed
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon cap nhat khong?", "Thong bao", JOptionPane.YES_NO_OPTION);
            if (hoi == JOptionPane.NO_OPTION) {
                return;
            }
            QLSanPhamResponse ms;
            indextblThuocTinh = tbl_ttsp.getSelectedRow();
            if (indexcbbThuocTinhSP == 0) {
                ms = this.getFormThuocTinh();
                ms.setIdSP(iSP.getAllQLSP().get(indextblThuocTinh).getIdSP());
                iSP.updateQLSP(ms);
            } else if (indexcbbThuocTinhSP == 1) {
                ms = this.getFormThuocTinh();
                ms.setIdLoaiSP(iLoaiSP.getAllQLLoaiSP().get(indextblThuocTinh).getIdLoaiSP());
                iLoaiSP.updateQLLoaiSP(ms);
            } else if (indexcbbThuocTinhSP == 2) {
                ms = this.getFormThuocTinh();
                ms.setIdChatLieu(iCL.getAllQLCL().get(indextblThuocTinh).getIdChatLieu());
                iCL.updateQLCL(ms);
            } else if (indexcbbThuocTinhSP == 3) {
                ms = this.getFormThuocTinh();
                ms.setIdMauSac(iMS.getAllQLMauSac().get(indextblThuocTinh).getIdMauSac());
                iMS.updateQLMauSac(ms);
            } else if (indexcbbThuocTinhSP == 4) {
                ms = this.getFormThuocTinh();
                ms.setIdSize(iSize.getAllQLSize().get(indextblThuocTinh).getIdSize());
                iSize.updateQLSize(ms);
            }
            loadAll();
            JOptionPane.showMessageDialog(this, "SỦA THÀNH CÔNG!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "LỖI NÚT SỬA !");
        }
    }//GEN-LAST:event_btn_ctsp_Sua1ActionPerformed

    private void btn_ctsp_Them1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_Them1ActionPerformed
        try {
            if (indexcbbThuocTinhSP == 0) {
                QLSanPhamResponse ms = this.getFormThuocTinh();
                boolean kq = iSP.addQLSP(getFormThuocTinh());
                if (kq == false) {
                    return;
                }
            } else if (indexcbbThuocTinhSP == 1) {
                boolean kq = iLoaiSP.addQLLoaiSP(getFormThuocTinh());
                if (kq == false) {
                    return;
                }
            } else if (indexcbbThuocTinhSP == 2) {
                boolean kq = iCL.addQLCL(getFormThuocTinh());
                if (kq == false) {
                    return;
                }
            } else if (indexcbbThuocTinhSP == 3) {
                boolean kq = iMS.addQLMauSac(getFormThuocTinh());
                if (kq == false) {
                    return;
                }
            } else if (indexcbbThuocTinhSP == 4) {
                boolean kq = iSize.addQLSize(getFormThuocTinh());
                if (kq == false) {
                    return;
                }
            }
            loadAll();
            JOptionPane.showMessageDialog(this, "THÊM THÀNH CÔNG!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "LỖI NÚT THÊM !");
        }
    }//GEN-LAST:event_btn_ctsp_Them1ActionPerformed

    private void btn_ctsp_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_SanPhamActionPerformed
        new ThemSanPham().setVisible(true);
    }//GEN-LAST:event_btn_ctsp_SanPhamActionPerformed

    private void btn_ctsp_LoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_LoaiSPActionPerformed
        new ThemLoaiSP().setVisible(true);
    }//GEN-LAST:event_btn_ctsp_LoaiSPActionPerformed

    private void btn_ctsp_ChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_ChatLieuActionPerformed
        new ThemChatLieu().setVisible(true);
    }//GEN-LAST:event_btn_ctsp_ChatLieuActionPerformed

    private void btn_ctsp_SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_SizeActionPerformed
        new ThemSize().setVisible(true);
    }//GEN-LAST:event_btn_ctsp_SizeActionPerformed

    private void btn_ctsp_MauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_MauActionPerformed
        new ThemMauSac().setVisible(true);
    }//GEN-LAST:event_btn_ctsp_MauActionPerformed

    private void tbl_ctspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ctspMouseClicked
        indextblCTSP = tbl_ctsp.getSelectedRow();
        try {
            showDetailChiTietSP();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tbl_ctspMouseClicked

    private void txt_ctsp_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_ctsp_TimKiemCaretUpdate
        // TODO add your handling code here:
        loadCTSP_TK();
    }//GEN-LAST:event_txt_ctsp_TimKiemCaretUpdate

    private void btn_ctsp_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_ThemActionPerformed
        try {
            QLSanPhamResponse sp = this.getFormChiTietSP();
            sp.setNgayTao(java.time.LocalDate.now() + "");
            sp.setNgaySua(java.time.LocalDate.now() + "");
            boolean kq = iChiTietSP.addQLChiTietSP(sp);
            if (kq == false) {
                return;
            }
            loadQLCTSP();
            loadDataSP();
            indextblCTSP = 0;
            showDetailChiTietSP();
            loadAll();
            JOptionPane.showMessageDialog(this, "THÊM THÀNH CÔNG!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "LỖI NÚT THÊM !");
        }
    }//GEN-LAST:event_btn_ctsp_ThemActionPerformed

    private void btn_ctsp_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_SuaActionPerformed
        // TODO add your handling code here:
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon cap nhat khong?", "Thong bao", JOptionPane.YES_NO_OPTION);
            if (hoi == JOptionPane.NO_OPTION) {
                return;
            }
            QLSanPhamResponse sp = this.getFormChiTietSP();
            indextblCTSP = tbl_ctsp.getSelectedRow();
            QLSanPhamResponse ctsp = iChiTietSP.getAllQLChiTietSP().get(indextblCTSP);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date ngayTao;
            ngayTao = Date.valueOf(sdf.format(txt_ctsp_NgayTao.getDate()));
            sp.setNgayTao(ngayTao + "");
            sp.setNgaySua(java.time.LocalDate.now() + "");
            sp.setId(ctsp.getId());
            System.out.println(sp);
            boolean kq = iChiTietSP.updateQLChiTietSP(sp);
            if (kq == false) {
                return;
            }
            loadQLCTSP();
            indextblCTSP = 0;
            showDetailChiTietSP();
            loadAll();
            JOptionPane.showMessageDialog(this, "SỬA THÀNH CÔNG!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "LỖI NÚT SỬA !");
        }
    }//GEN-LAST:event_btn_ctsp_SuaActionPerformed

    private void btn_ctsp_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_XoaActionPerformed
        try {
            if (tbl_ctsp.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không còn dữ liệu để xoá !!!");
                return;
            }
            int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon xoa khong?", "Thong bao", JOptionPane.YES_NO_OPTION);
            if (hoi == JOptionPane.NO_OPTION) {
                return;
            }
            QLSanPhamResponse ctsp = iChiTietSP.getAllQLChiTietSP().get(indextblCTSP);
            iChiTietSP.deleteQLChiTietSP(ctsp);
            loadQLCTSP();
            indextblCTSP = 0;
            showDetailChiTietSP();
            loadAll();
            JOptionPane.showMessageDialog(this, "XOÁ THÀNH CÔNG!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "LỖI NÚT XOÁ !");
        }
    }//GEN-LAST:event_btn_ctsp_XoaActionPerformed

    private void btn_ctsp_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_ClearActionPerformed
        cbb_ctsp_SanPham.setSelectedIndex(0);
        cbb_ctsp_LoaiSP.setSelectedIndex(0);
        cbb_ctsp_ChatLieu.setSelectedIndex(0);
        cbb_ctsp_Mau.setSelectedIndex(0);
        cbb_ctsp_Size.setSelectedIndex(0);
        txt_ctsp_Gia.setText("");
        txt_ctsp_MoTa.setText("");
        txt_ctsp_SLTon.setText("");
        txt_ctsp_NgayTao.setDate(Date.valueOf(java.time.LocalDate.now()));
        txt_ctsp_NgaySua.setDate(Date.valueOf(java.time.LocalDate.now()));
    }//GEN-LAST:event_btn_ctsp_ClearActionPerformed

    private void btn_ctsp_Sua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_Sua2ActionPerformed
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon cap nhat khong?", "Thong bao", JOptionPane.YES_NO_OPTION);
            if (hoi == JOptionPane.NO_OPTION) {
                return;
            }
            QLSanPhamResponse sp = this.getFormChiTietSP();
            indextblCTSP = tbl_ctsp.getSelectedRow();
            QLSanPhamResponse ctsp = iChiTietSP.getAllQLChiTietSP().get(indextblCTSP);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date ngayTao;
            ngayTao = Date.valueOf(sdf.format(txt_ctsp_NgayTao.getDate()));
            sp.setNgayTao(ngayTao + "");
            sp.setNgaySua(java.time.LocalDate.now() + "");
            sp.setId(ctsp.getId());
            int themSL = Integer.parseInt(txt_ctsp_ThemSL.getText());
            int SLTon = themSL + Integer.parseInt(sp.getSLTon());
            sp.setSLTon(SLTon + "");
            System.out.println(sp);
            boolean kq = iChiTietSP.updateQLChiTietSP(sp);
            if (kq == false) {
                return;
            }
            loadQLCTSP();
            loadDataSP();
            indextblCTSP = 0;
            showDetailChiTietSP();
            loadAll();
            JOptionPane.showMessageDialog(this, "SỬA THÀNH CÔNG!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "LỖI NÚT SỬA !");
        }
    }//GEN-LAST:event_btn_ctsp_Sua2ActionPerformed

    private void btn_ctsp_ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctsp_ImportActionPerformed
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook ec = null;

        JFileChooser c = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        c.setFileFilter(fnef);
        int l = c.showOpenDialog(null);

        if (l == JFileChooser.APPROVE_OPTION) {
            try {
                File excelFile = c.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                try {
                    ec = new XSSFWorkbook(excelBIS);

                    XSSFSheet ecSheet = ec.getSheetAt(0);

                    for (int i = 1; i < ecSheet.getLastRowNum() + 1; i++) {
                        XSSFRow ecRow = ecSheet.getRow(i);

                        XSSFCell tenSP = ecRow.getCell(1);
                        QLSanPhamResponse sp = iSP.getOneByTenSP(tenSP + "".trim());

                        XSSFCell tenLoaisp = ecRow.getCell(2);
                        QLSanPhamResponse loaiSP = iLoaiSP.getOneByLoai(tenLoaisp + "".trim());

                        XSSFCell tenCL = ecRow.getCell(3);
                        QLSanPhamResponse cl = iCL.getOneByTenCL(tenCL + "".trim());

                        XSSFCell tenMau = ecRow.getCell(5);
                        QLSanPhamResponse m = iMS.getOneByTenMS(tenMau + "".trim());

                        XSSFCell tenSize = ecRow.getCell(4);
                        QLSanPhamResponse s = iSize.getOneByTenSize(tenSize + "".trim());

                        QLSanPhamResponse q = new QLSanPhamResponse();

                        String ton = ecRow.getCell(6) + "".trim();
                        String t = ton.substring(0, ton.length() - 2);
                        q.setSLTon(t);

                        System.out.println(t);
                        q.setGia(ecRow.getCell(7) + "".trim());
                        q.setMoTa(ecRow.getCell(8) + "".trim());

                        String tt = ecRow.getCell(9) + "".trim();
                        String tinhTrang = tt.substring(0, tt.length() - 2);
                        q.setTinhTrang(tinhTrang);
                        q.setSLTon(t);

                        q.setIdSP(sp.getIdSP());
                        q.setMaSP(sp.getMaSP());
                        q.setTenSP(sp.getTenSP());

                        q.setIdLoaiSP(loaiSP.getIdLoaiSP());
                        q.setMaLoaiSP(loaiSP.getMaLoaiSP());
                        q.setTenLoaiSP(loaiSP.getTenLoaiSP());

                        q.setIdChatLieu(cl.getIdChatLieu());
                        q.setMaChatLieu(cl.getMaChatLieu());
                        q.setTenChatLieu(cl.getTenChatLieu());

                        q.setIdMauSac(m.getIdMauSac());
                        q.setMaMauSac(m.getMaMauSac());
                        q.setTenMauSac(m.getTenMauSac());

                        q.setIdSize(s.getIdSize());
                        q.setMaSize(s.getMaSize());
                        q.setTenSize(s.getTenSize());

                        q.setNgayTao(java.time.LocalDate.now() + "");
                        q.setNgaySua(java.time.LocalDate.now() + "");
                        if (iChiTietSP.getOne_ByTen(sp.getTenSP(), loaiSP.getTenLoaiSP(), cl.getTenChatLieu(), m.getTenMauSac(), s.getTenSize()) != null) {
                            QLSanPhamResponse tr = iChiTietSP.getOne_ByTen(sp.getTenSP(), loaiSP.getTenLoaiSP(), cl.getTenChatLieu(), m.getTenMauSac(), s.getTenSize());
                            q.setSLTon(Integer.parseInt(t) + Integer.parseInt(tr.getSLTon()) + "");
                            q.setId(tr.getId());
                            boolean kq = iChiTietSP.updateQLChiTietSP(q);
                            if (kq == false) {
                                return;
                            }
                        } else {
                            boolean kq = iChiTietSP.addQLChiTietSP(q);
                            if (kq == false) {
                                return;
                            }
                        }
                    }
                    loadAll();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_ctsp_ImportActionPerformed

    private void btn_Export_ctspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Export_ctspActionPerformed
        FileOutputStream excelFOU = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook excelJTableExporter = null;

        JFileChooser excelFileChooser = new JFileChooser();

        excelFileChooser.setDialogTitle("Save As");
        // lọc các tệp có đuôi "xls", "xlsx", "xlsm"
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showSaveDialog(null);

        if (excelChooser == JFileChooser.APPROVE_OPTION) {

            try {
                //Nhập thư viện excel poi vào netbeans
                excelJTableExporter = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExporter.createSheet("Sheet 1");
                //Vòng lặp để nhận các cột và hàng jtable
                CellStyle cellStyle = createStyleForHeader(excelSheet);

                //Tạo dòng
                Row row = excelSheet.createRow(0);

                //Tạo cột
                Cell cell = row.createCell(0);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("STT");

                cell = row.createCell(1);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Sản Phẩm");

                cell = row.createCell(2);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Loại SP");

                cell = row.createCell(3);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Chất Liệu");

                cell = row.createCell(4);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Size");

                cell = row.createCell(5);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Màu");

                cell = row.createCell(6);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Số lượng tồn");

                cell = row.createCell(7);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Giá");

                cell = row.createCell(8);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Mô tả");

                cell = row.createCell(9);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Tình trạng");

                cell = row.createCell(10);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Ngày Sửa");

                cell = row.createCell(11);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("Ngày Tạo");
                //Đẩy dữ liệu từ bảng vào excel
                for (int i = 0; i < tbl_ctsp.getRowCount(); i++) {
                    XSSFRow excelRow = excelSheet.createRow(i + 1);
                    for (int j = 0; j < tbl_ctsp.getColumnCount(); j++) {
                        XSSFCell excelCell = excelRow.createCell(j);
                        System.out.println(excelCell);

                        excelCell.setCellValue(tbl_ctsp.getValueAt(i, j).toString());
                    }
                }
                //Nối các phần mở rộng tệp xlsx vào các tệp đã chọn. Để tạo tên tệp duy nhất
                excelFOU = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(null, "In danh sách thành công !!!");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Lỗi in !!!");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Lỗi in !!!");
            } finally {
                try {
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelFOU != null) {
                        excelFOU.close();
                    }
                    if (excelJTableExporter != null) {
                        excelJTableExporter.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Lỗi in !!!");
                }
            }

        }
    }//GEN-LAST:event_btn_Export_ctspActionPerformed

    private void btn_TaiMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaiMauActionPerformed
        try {
            Desktop.getDesktop().open(new File("C:\\Users\\Admin\\Desktop\\Git\\DuAn1\\src\\main\\resource\\Mau.xlsx"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_TaiMauActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nextPN(QL_SanPham);
        jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ngaybd = Date.valueOf(sdf.format(txt_NgayBatDauTKe.getDate()));
        Date ngaykt = Date.valueOf(sdf.format(txt_NgayKetThucTKe.getDate()));
        tke.searchThongKe(ngaybd, ngaykt);
//        for (Object[] s : tke.searchThongKe(ngaybd, ngaykt)) {
//            System.out.println(s[0]);
//        }      
        model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        List<Object[]> lst = tke.searchThongKe(ngaybd, ngaykt);
        for (Object[] hd : lst) {
            model.addRow(new Object[]{tblDoanhThu.getRowCount() + 1, hd[1], hd[2], hd[0], hd[3] + " VNĐ"});
        }
   
        model = (DefaultTableModel) tblNhanVienTke.getModel();
        model.setRowCount(0);
        List<Object[]> lst1 = tke.searchThongKe(ngaybd, ngaykt);
        for (Object[] hd1 : lst1) {
            model.addRow(new Object[]{tblNhanVienTke.getRowCount() + 1, hd1[1], hd1[4], hd1[5], hd1[3] + " VNĐ"});
        }
        
        model = (DefaultTableModel) tblSanPhamTke.getModel();
        model.setRowCount(0);
        List<Object[]> lst2 = tke.searchThongKe(ngaybd, ngaykt);
        for (Object[] hd2 : lst2) {
            model.addRow(new Object[]{tblSanPhamTke.getRowCount() + 1, hd2[6], hd2[2], hd2[7], hd2[8], hd2[3]+ " VNĐ"});
        }
        
        Char1(BieuDoTKeDT);
        Char2(BieuDoTKeNvien);
        Char3(BieuDoTKeSanPham);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        loadAllthongKe();
        txt_NgayBatDauTKe.setDate(Date.valueOf(java.time.LocalDate.now()));
        txt_NgayKetThucTKe.setDate(Date.valueOf(java.time.LocalDate.now()));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        FileOutputStream excelFOU = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook excelJTableExporter = null;

        JFileChooser excelFileChooser = new JFileChooser();

        excelFileChooser.setDialogTitle("Save As");
        // lọc các tệp có đuôi "xls", "xlsx", "xlsm"
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showSaveDialog(null);

        if (excelChooser == JFileChooser.APPROVE_OPTION) {

            try {
                //Nhập thư viện excel poi vào netbeans
                excelJTableExporter = new XSSFWorkbook();
                XSSFSheet excelSheet1 = excelJTableExporter.createSheet("Thống Kê Doanh Thu");
                XSSFSheet excelSheet2 = excelJTableExporter.createSheet("Thống Kê Sản Phẩm");
                XSSFSheet excelSheet3 = excelJTableExporter.createSheet("Thống Kê Nhân Viên");
                //Vòng lặp để nhận các cột và hàng jtable
                CellStyle cellStyle1 = createStyleForHeader(excelSheet1);

                //Tạo dòng
                Row row = excelSheet1.createRow(0);

                //Tạo cột
                Cell cell = row.createCell(0);
                cell.setCellStyle(cellStyle1);
                cell.setCellValue("STT");
                               
                cell = row.createCell(1);
                cell.setCellStyle(cellStyle1);
                cell.setCellValue("Mã HĐ");

                cell = row.createCell(2);
                cell.setCellStyle(cellStyle1);
                cell.setCellValue("Mã ND");

                cell = row.createCell(3);
                cell.setCellStyle(cellStyle1);
                cell.setCellValue("Tên SP");

                cell = row.createCell(4);
                cell.setCellStyle(cellStyle1);
                cell.setCellValue("Ngày Tạo");

                cell = row.createCell(5);
                cell.setCellStyle(cellStyle1);
                cell.setCellValue("Doanh Thu");

                 //Sản phẩm
                CellStyle cellStyle2 = createStyleForHeader(excelSheet2);
                Row row2 = excelSheet2.createRow(0);
                
                Cell cell2 = row2.createCell(0);
                cell2.setCellStyle(cellStyle2);
                cell2.setCellValue("STT");
                
                cell2 = row2.createCell(1);
                cell2.setCellStyle(cellStyle2);
                cell2.setCellValue("Mã SP");
                
                cell2  = row2.createCell(2);
                cell2.setCellStyle(cellStyle2);
                cell2.setCellValue("Tên SP");

                cell2 = row2.createCell(3);
                cell2.setCellStyle(cellStyle2);
                cell2.setCellValue("SL Tồn");

                cell2 = row2.createCell(4);
                cell2.setCellStyle(cellStyle2);
                cell2.setCellValue("SL Bán");

                cell2 = row2.createCell(5);
                cell2.setCellStyle(cellStyle2);
                cell2.setCellValue("Doanh Thu");

                //Nhân Viên
                CellStyle cellStyle3 = createStyleForHeader(excelSheet3);
                Row row3 = excelSheet3.createRow(0);
                
                Cell cell3 = row3.createCell(0);
                cell3.setCellStyle(cellStyle3);
                cell3.setCellValue("STT");
                
                cell3 = row3.createCell(1);
                cell3.setCellStyle(cellStyle3);
                cell3.setCellValue("Mã ND");
                
                cell3 = row3.createCell(2);
                cell3.setCellStyle(cellStyle3);
                cell3.setCellValue("Họ Tên");

                cell3 = row3.createCell(3);
                cell3.setCellStyle(cellStyle3);
                cell3.setCellValue("Tổng HĐ Bán");

                cell3 = row3.createCell(4);
                cell3.setCellStyle(cellStyle3);
                cell3.setCellValue("Doanh Thu");

                
                //Đẩy dữ liệu từ bảng vào excel
                for (int i = 0; i < tblDoanhThu.getRowCount(); i++) {
                    XSSFRow excelRow = excelSheet1.createRow(i + 1);
                    for (int j = 0; j < tblDoanhThu.getColumnCount(); j++) {
                        XSSFCell excelCell = excelRow.createCell(j);
                        System.out.println(excelCell);

                        excelCell.setCellValue(tblDoanhThu.getValueAt(i, j).toString());
                    }
                }
                //Sản phẩm
                for (int i = 0; i < tblSanPhamTke.getRowCount(); i++) {
                    XSSFRow excelRow1 = excelSheet2.createRow(i + 1);
                    for (int j = 0; j < tblSanPhamTke.getColumnCount(); j++) {
                        XSSFCell excelCell = excelRow1.createCell(j);
                        System.out.println(excelCell);

                        excelCell.setCellValue(tblSanPhamTke.getValueAt(i, j).toString());
                    }
                }
                //Nhân Vien 
                for (int i = 0; i < tblNhanVienTke.getRowCount(); i++) {
                    XSSFRow excelRow2 = excelSheet3.createRow(i + 1);
                    for (int j = 0; j < tblNhanVienTke.getColumnCount(); j++) {
                        XSSFCell excelCell = excelRow2.createCell(j);
                        System.out.println(excelCell);

                        excelCell.setCellValue(tblNhanVienTke.getValueAt(i, j).toString());
                    }
                }
                //Nối các phần mở rộng tệp xlsx vào các tệp đã chọn. Để tạo tên tệp duy nhất
                excelFOU = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(null, "IN DANH SÁCH THÀNH CÔNG!");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "LỖI IN !!!");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "LỖI IN !!!");
            } finally {
                try {
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelFOU != null) {
                        excelFOU.close();
                    }
                    if (excelJTableExporter != null) {
                        excelJTableExporter.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "LỖI IN !!!");
                }
            }

        }
    }//GEN-LAST:event_btnExcelActionPerformed

    public PageFormat getPageFormat(PrinterJob pj) {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double bodyHeight = bHeight;
        double headerHeight = 5.0;
        double footerHeight = 5.0;
        double width = cm_to_pp(8);
        double height = cm_to_pp(headerHeight + bodyHeight + footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height);

        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);

        return pf;
    }

    protected static double cm_to_pp(double cm) {
        return toPPI(cm * 0.393600787);
    }

    protected static double toPPI(double inch) {
        return inch * 72d;
    }

    private void loadCTSP_TK() {
        model = new DefaultTableModel();
        model = (DefaultTableModel) tbl_ctsp.getModel();
        model.setRowCount(0);
        int i = 1;
        for (QLSanPhamResponse x : iChiTietSP.getAll_ByName(txt_ctsp_TimKiem.getText())) {
            model.addRow(new Object[]{i++, x.getTenSP(), x.getTenLoaiSP(), x.getTenChatLieu(), x.getTenSize(), x.getTenMauSac(),
                x.getSLTon(), x.getGia(), x.getMoTa(), x.getTinhTrang(), x.getNgaySua(), x.getNgayTao()});
        }
    }

    // b run project minh xem
    public class BillPrintable implements Printable {

        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
                throws PrinterException {

            int row = tblGioHang.getSelectedRow();
            HoaDon hd = iBH.getAll_HD().get(tblHoaDon.getSelectedRow());
            List<HoaDonChiTiet> lstHDCT = iBH.getAll_HDCTByIDHD(hd.getIdHD());
            for (HoaDonChiTiet hoaDonChiTiet : lstHDCT) {
                itemName.add(hoaDonChiTiet.getChiTietSanPham().getSanPham().getTenSP());
                itemPrice.add(String.valueOf(hoaDonChiTiet.getChiTietSanPham().getGia()));
                soLuong.add(String.valueOf(hoaDonChiTiet.getSlMua()));
            }
//            KhachHangResponse kh = (KhachHangResponse) iQlKH.getAll();
            KhachHangResponse khr = iQlKH.getOneByMa(lblMaKH.getText());
//            int r = itemName.size();
            ImageIcon icon = new ImageIcon("C:\\Users\\LE BAO NGOC\\Pictures\\Saved Pictures\\Logo.png");
            int result = NO_SUCH_PAGE;
            if (pageIndex == 0) {

                Graphics2D g2d = (Graphics2D) graphics;
                double width = pageFormat.getImageableWidth();
                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());

                //  FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
                try {
                    int y = 20;
                    int yShift = 10;
                    int headerRectHeight = 15;
                    // int headerRectHeighta=40;

                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                    g2d.drawImage(icon.getImage(), 60, 20, 170, 30, rootPane);
                    y += yShift + 30;
                    g2d.drawString("-----------------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString("                       HÓA ĐƠN                 ", 12, y);
                    y += yShift;
                    g2d.drawString(" Tên khách hàng:       " + lblTenKH.getText(), 10, y);
                    y += yShift;
                    g2d.drawString(" Mã KH:                " + lblMaKH.getText(), 10, y);
                    y += yShift;
                    g2d.drawString(" Sđt:                  " + khr.getSdt(), 10, y);
                    y += yShift;
                    g2d.drawString(" Địa chỉ:              " + khr.getDiaChi(), 10, y);
                    y += yShift;
//                    g2d.drawString(" Mã HD:                " + lblMaHD.getText(), 10, y);
                    y += yShift;
//                    g2d.drawString(" Nhân viên:            " + lblTenND.getText(), 10, y);
                    y += yShift;
                    g2d.drawString("              ", 12, y);
                    y += yShift;
                    g2d.drawString("-----------------------------------------------", 12, y);
                    y += headerRectHeight;

                    g2d.drawString(" Tên sản phẩm       Số lượng     Giá", 12, y);
                    y += yShift;
                    g2d.drawString("-----------------------------------------------", 12, y);
                    y += headerRectHeight;

                    for (int s = 0; s < lstHDCT.size(); s++) {
                        Double gia = Double.parseDouble(soLuong.get(s)) * Double.parseDouble(itemPrice.get(s));
                        g2d.drawString(" " + itemName.get(s) + "               ", 10, y);

                        g2d.drawString("                      " + soLuong.get(s), 10, y);
                        g2d.drawString("     " + gia, 160, y);
                        y += yShift;

                    }
                    g2d.drawString(" Giảm giá:                       " + txtGiamGia.getText() + "             ", 10, y);
                    y += yShift;
                    g2d.drawString("-----------------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString(" Tổng tiền:                      " + txtThanhToan.getText() + "   ", 10, y);
                    y += yShift;
//                    g2d.drawString("-------------------------------------", 10, y);
//                    y += yShift;
//                    g2d.drawString(" Cash      :                 " + txtCash.getText() + "   ", 10, y);
//                    y += yShift;
//                    g2d.drawString("-------------------------------------", 10, y);
//                    y += yShift;
//                    g2d.drawString(" Balance   :                 " + txtBalance.getText() + "   ", 10, y);
//                    y += yShift;

                    g2d.drawString("************************************************", 10, y);
                    y += yShift;
                    g2d.drawString("          CẢM ƠN BẠN ĐÃ GHÉ THẮM            ", 10, y);
                    y += yShift;
                    g2d.drawString("************************************************", 10, y);
                    y += yShift;
                    g2d.drawString("            THIẾT KẾ BỞI NHÓM 6             ", 10, y);
                    y += yShift;
                    g2d.drawString("         ", 10, y);
                    y += yShift;

                } catch (Exception e) {
                    e.printStackTrace();
                }

                result = PAGE_EXISTS;
            }
            return result;
        }
    }

    public PageFormat getPageFormat1(PrinterJob pj) {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double bodyHeight = bHeight;
        double headerHeight = 5.0;
        double footerHeight = 5.0;
        double width = cm_to_pp(11);
        double height = cm_to_pp(headerHeight + bodyHeight + footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height - cm_to_pp(1));

        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);

        return pf;
    }

    public class BillPrintable1 implements Printable {

        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
                throws PrinterException {

            int row = tblGioHang.getSelectedRow();
            HoaDon hd = iBH.getAll_HD().get(tblHoaDon.getSelectedRow());
            List<HoaDonChiTiet> lstHDCT = iBH.getAll_HDCTByIDHD(hd.getIdHD());
            for (HoaDonChiTiet hoaDonChiTiet : lstHDCT) {
                itemNameDH.add(hoaDonChiTiet.getChiTietSanPham().getSanPham().getTenSP());
                itemPriceDH.add(String.valueOf(hoaDonChiTiet.getChiTietSanPham().getGia()));
                soLuongDH.add(String.valueOf(hoaDonChiTiet.getSlMua()));
            }
//            KhachHangResponse kh = (KhachHangResponse) iQlKH.getAll();
            KhachHangResponse khr = iQlKH.getOneByMa(lblMaKH.getText());
//            int r = itemName.size();
            ImageIcon icon = new ImageIcon("C:\\Users\\LE BAO NGOC\\Pictures\\Saved Pictures\\Logo.png");
            int result = NO_SUCH_PAGE;
            if (pageIndex == 0) {

                Graphics2D g2d = (Graphics2D) graphics;
                double width = pageFormat.getImageableWidth();
                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());

                //  FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
                try {
                    int y = 20;
                    int yShift = 10;
                    int headerRectHeight = 15;
                    // int headerRectHeighta=40;

                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                    g2d.drawImage(icon.getImage(), 60, 20, 170, 30, rootPane);
                    y += yShift + 30;
                    g2d.drawString("-----------------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString("                  HÓA ĐƠN ĐẶT HÀNG             ", 12, y);
                    y += yShift;
                    g2d.drawString(" Tên khách hàng:       " + lblTenKH.getText(), 10, y);
                    y += yShift;
                    g2d.drawString(" Mã KH:                " + lblMaKH.getText(), 10, y);
                    y += yShift;
                    g2d.drawString(" Sđt:                  " + khr.getSdt(), 10, y);
                    y += yShift;
                    g2d.drawString(" Địa chỉ KH:           " + khr.getDiaChi(), 10, y);
                    y += yShift;
                    g2d.drawString(" Mã HD:                " + lblMaHD2.getText(), 10, y);
                    y += yShift;
                    g2d.drawString(" Nhân viên:            " + lblTenND2.getText(), 10, y);
                    y += yShift;
                    g2d.drawString("                                                                      ", 12, y);
                    y += yShift;
                    g2d.drawString("-----------------------------------------------", 12, y);
                    y += headerRectHeight;

                    g2d.drawString(" Tên sản phẩm       Số lượng          Giá ", 12, y);
                    y += yShift;
                    g2d.drawString("-----------------------------------------------", 12, y);
                    y += headerRectHeight;

                    for (int s = 0; s < lstHDCT.size(); s++) {
                        Double gia = Double.parseDouble(soLuongDH.get(s)) * Double.parseDouble(itemPriceDH.get(s));
                        g2d.drawString(" " + itemNameDH.get(s) + "               ", 10, y);
                        g2d.drawString("                       " + soLuongDH.get(s), 10, y);
                        g2d.drawString("        " + gia, 160, y);
                        y += yShift;

                    }
                    g2d.drawString(" Giảm giá:                          " + txtGiamGia2.getText() + "             ", 10, y);
                    y += yShift;
                    g2d.drawString(" Tiền ship:                         " + txtTienShip.getText() + "             ", 10, y);
                    y += yShift;
                    g2d.drawString("-----------------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString(" Tổng tiền:                         " + txtThanhToan2.getText() + "             ", 10, y);
                    y += yShift;
//                    g2d.drawString("-------------------------------------", 10, y);
//                    y += yShift;
//                    g2d.drawString(" Cash      :                 " + txtCash.getText() + "   ", 10, y);
//                    y += yShift;
//                    g2d.drawString("-------------------------------------", 10, y);
//                    y += yShift;
//                    g2d.drawString(" Balance   :                 " + txtBalance.getText() + "   ", 10, y);
//                    y += yShift;

                    g2d.drawString("***********************************************", 10, y);
                    y += yShift;
                    g2d.drawString("             CẢM ƠN BẠN ĐÃ GHÉ THẮM            ", 10, y);
                    y += yShift;
                    g2d.drawString("***********************************************", 10, y);
                    y += yShift;
                    g2d.drawString("              THIẾT KẾ BỞI NHÓM 6              ", 10, y);
                    y += yShift;
                    g2d.drawString("         ", 10, y);
                    y += yShift;

                } catch (Exception e) {
                    e.printStackTrace();
                }

                result = PAGE_EXISTS;
            }
            return result;
        }
    }

    // Công
    private void loadND() {
        String Header[] = {"MaND", "TenTK", "MatKhau", "HovaTen", "GioiTinh", "NgaySinh",
            "Email", "SDT", "DiaChi", "CCCD/CMT", "TinhTrang", "NgayTao", "NgaySua", "ChucVu"};
        modelND = new DefaultTableModel(Header, 0);
        modelND.setRowCount(0);
        tbl_nd_DangLam.setModel(modelND);
        for (NguoiDung x : inds.getAll()) {
            modelND.addRow(new Object[]{x.getMaND(), x.getTenTK(), x.getMatKhau(),
                x.getHoTen(), x.getGioiTinh(), x.getNgaySinh(), x.getEmail(),
                x.getSdt(), x.getDiaChi(), x.getCccd(), setTinhTrang(x.getTinhTrang()),
                x.getNgayTao(), x.getNgaySua(), x.getChucVu().getTenCV()});
        }
    }

    // Công
    private void loadND(List<NguoiDung> listND) {
        modelND = (DefaultTableModel) tbl_nd_DangLam.getModel();
        modelND.setRowCount(0);
        tbl_nd_DangLam.setModel(modelND);
        for (NguoiDung x : listND) {
            modelND.addRow(new Object[]{x.getMaND(), x.getTenTK(), x.getMatKhau(),
                x.getHoTen(), x.getGioiTinh(), x.getNgaySinh(), x.getEmail(),
                x.getSdt(), x.getDiaChi(), x.getCccd(), setTinhTrang(x.getTinhTrang()),
                x.getNgayTao(), x.getNgaySua(), x.getChucVu().getTenCV()});
        }
    }

    public String setTinhTrang(int item) {
        if (item == 1) {
            return "Đang Làm";
        } else if (item == 0) {
            return "Nghỉ Làm";
        } else {
            return null;
        }
    }

    private void showND() {
        int row = tbl_nd_DangLam.getSelectedRow();
        NguoiDung nd = inds.getAll().get(row);
        txt_nd_MaND.setText(nd.getMaND());
        txt_nd_TenTK.setText(nd.getTenTK());
        txt_nd_MatKhau.setText(nd.getMatKhau());
        txt_nd_HovaTen.setText(nd.getHoTen());
        String check = nd.getGioiTinh();
        if (check.equalsIgnoreCase("Nam")) {
            rdo_nd_Nam.setSelected(true);
        } else {
            rdo_nd_Nu.setSelected(true);
        }
        Date ngaySinh = Date.valueOf(tbl_nd_DangLam.getValueAt(row, 5).toString());
        Jdate_nd_ngaySinh.setDate(ngaySinh);
        txt_nd_Email.setText(nd.getEmail());
        txt_nd_Sdt.setText(nd.getSdt());
        txt_nd_DiaChi.setText(nd.getDiaChi());
        txt_nd_CCCD.setText(nd.getCccd());
        int tt = nd.getTinhTrang();
        if (tt == 1) {
            rdo_nd_DangLam.setSelected(true);
        } else {
            rdo_nd_NghiLam.setSelected(true);
        }
        Date ngayTao = Date.valueOf(tbl_nd_DangLam.getValueAt(row, 11).toString());
        Jdate_nd_ngayTao.setDate(ngayTao);
        Date ngaySua = Date.valueOf(tbl_nd_DangLam.getValueAt(row, 12).toString());
        Jdate_nd_ngaySua.setDate(ngaySua);
        cbb_nd_ChucVu.setSelectedItem(nd.getChucVu().getTenCV());

    }

    private NguoiDungReponse getFromMoi(UUID idND) {
        NguoiDungReponse ndr = new NguoiDungReponse();
        ndr.setIdND(idND);
        ndr.setMaND(txt_nd_MaND.getText().trim());
        ndr.setTenTK(txt_nd_TenTK.getText().trim());
        ndr.setMatKhau(txt_nd_MatKhau.getText().trim());
        ndr.setHoVaTen(txt_nd_HovaTen.getText().trim());
        ndr.setGioiTinh(rdo_nd_Nam.isSelected() ? "Nam" : "Nữ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ngay = sdf.format(Jdate_nd_ngaySinh.getDate());
        ndr.setNgaySinh(ngay);
        ndr.setEmail(txt_nd_Email.getText());
        ndr.setSdt(txt_nd_Sdt.getText());
        ndr.setDiaChi(txt_nd_DiaChi.getText());
        ndr.setCccd(txt_nd_CCCD.getText());
        ndr.setTinhTrang(rdo_nd_DangLam.isSelected() ? 1 : 0);
        String ngayTao = sdf.format(Jdate_nd_ngayTao.getDate());
        ndr.setNgayTao(ngayTao);
        String ngaySua = sdf.format(Jdate_nd_ngaySua.getDate());
        ndr.setNgaySua(ngaySua);
        ChucVu cv = icvs.getAll().get(cbb_nd_ChucVu.getSelectedIndex());
        ndr.setIdCV(cv.getIdCV());
        return ndr;

    }

    private void loadComboBoxNd() {
        comboBoxND = new DefaultComboBoxModel();
        cbb_nd_ChucVu.setModel(comboBoxND);
        for (ChucVu cv : icvs.getAll()) {
            comboBoxND.addElement(cv.getTenCV());
        }
    }

    private List<JCheckBox> rdList = new ArrayList<>();
    //Dat

    public void loadKM(List<KhuyenMai> byName) {
        modelKM = (DefaultTableModel) tbl_km.getModel();
        modelKM.setRowCount(0);
        listKM = iKM.getAll();
        int stt = 1;

        for (KhuyenMai x : byName) {

            JCheckBox rd = stt <= rdList.size() ? rdList.get(stt - 1) : new JCheckBox("box " + stt);

            if (stt > rdList.size()) {
                rdList.add(rd);//            
            }

            System.out.println(rd.getText() + rd.isSelected());
            modelKM.addRow(new Object[]{rd, stt++, x.getMaKM(),
                x.getTenKM(), x.getGiamGia(), x.getMoTa(), x.getNgayBD(), x.getNgayKT(),
                setTinhTrangKM(x.getTinhTrang()), x.getNgayTao(), x.getNgaySua()});
        }
    }

    private KhuyenMaiReponse getKM() {
        KhuyenMaiReponse km = new KhuyenMaiReponse();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        km.setMaKM(txt_km_Ma.getText().trim());
        km.setTenKM(txt_km_Ten.getText().trim());
        km.setGiamGia(Integer.parseInt(txt_km_GiamGia.getText()));
        km.setTinhTrang(rdo_km_ConKhuyenMai.isSelected() ? 1 : 0);
        km.setMoTa(txt_km_MoTa.getText().trim());
        String ngayBatDau = sdf.format(txt_km_NgayBatDau.getDate());
        km.setNgayBD(ngayBatDau);
        String ngayKetThuc = sdf.format(txt_km_NgayKetThuc.getDate());
        ngayKetThuc += " " + jTextField1.getText() + ":" + jTextField2.getText() + ":" + jTextField3.getText();
        km.setNgayKT(ngayKetThuc);
        String ngayTao = sdf.format(txt_km_NgayTao.getDate());
        km.setNgayTao(ngayTao);
        String ngaySua = sdf.format(txt_km_NgaySua.getDate());
        km.setNgaySua(ngaySua);

        return km;
    }

    public String setTinhTrangKM(int i) {
        if (i == 1) {
            return "Còn Khuyến Mãi";
        } else if (i == 0) {
            return "Dừng Khuyến Mãi";
        } else {
            return null;
        }
    }
    // Đạt

    // Mai
    private void showDetailKH() {
        int index = tblKhachHang.getSelectedRow();
        KhachHangResponse kh = iQlKH.getAll().get(index);
        txt_kh_MaKh.setText(kh.getMaKh());
        txt_kh_HoTenKH.setText(kh.getHoTen());
        if (kh.getGioiTinh().equals("Nam")) {
            rdo_kh_Nam.setSelected(true);
        } else {
            rdo_kh_Nu.setSelected(true);
        }
        txt_kh_sdt.setText(kh.getSdt());
        txt_kh_DiaChi.setText(kh.getDiaChi());
        txt_kh_NgaySinh.setDate(Date.valueOf(kh.getNgaySinh()));
        txt_kh_NgayTao.setDate(Date.valueOf(tblKhachHang.getValueAt(index, 7).toString()));
        txt_kh_NgaySua.setDate(Date.valueOf(tblKhachHang.getValueAt(index, 8).toString()));
        tblKhachHang.setRowSelectionInterval(index, index);
    }

    private void loadKhachHang() {
        model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        lstKh = iQlKH.getByName(txtTimKiemKHang.getText());
        for (KhachHangResponse x : lstKh) {
            model.addRow(new Object[]{tblKhachHang.getRowCount() + 1, x.getMaKh(), x.getHoTen(), x.getGioiTinh(), x.getDiaChi(), x.getSdt(), x.getNgaySinh(), x.getNgayTao(), x.getNgaySua()});
        }
    }

    private KhachHangResponse getFormKh() {
        KhachHangResponse kh = new KhachHangResponse();
        kh.setMaKh(txt_kh_MaKh.getText().trim());
        kh.setHoTen(txt_kh_HoTenKH.getText().trim());
        kh.setGioiTinh(rdo_kh_Nam.isSelected() ? "Nam" : "Nữ");
        kh.setDiaChi(txt_kh_DiaChi.getText().trim());
        kh.setSdt(txt_kh_sdt.getText().trim());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ngaysinh = Date.valueOf(sdf.format(txt_kh_NgaySinh.getDate()));
        kh.setNgaySinh(ngaysinh + "");
//        kh.setNgayTao(txt_kh_NgayTao.getText().trim());
//        kh.setNgaySua(txt_kh_NgaySua.getText().trim());
        return kh;
    }

    private void clearKH() {
        txt_kh_MaKh.setText("");
        txt_kh_DiaChi.setText("");
        txt_kh_NgaySinh.setDate(Date.valueOf(java.time.LocalDate.now()));
        txt_kh_NgayTao.setDate(Date.valueOf(java.time.LocalDate.now()));
        txt_kh_NgaySua.setDate(Date.valueOf(java.time.LocalDate.now()));
        txt_kh_HoTenKH.setText("");
        txt_kh_sdt.setText("");
        buttonGroup1.clearSelection();

    }

    private void setIconTK() {
        jLabel23.setIcon(new ImageIcon("bill.png"));
        jLabel21.setIcon(new ImageIcon("money1.png"));

    }

    // Mai
    //Van QLSP
    private void loadQLThuocTinh() {
        if (indexcbbThuocTinhSP == 0) {
            loadSanPham();
        } else if (indexcbbThuocTinhSP == 1) {
            loadLoaiSP();
        } else if (indexcbbThuocTinhSP == 2) {
            loadChatLieu();
        } else if (indexcbbThuocTinhSP == 3) {
            loadMauSac();
        } else if (indexcbbThuocTinhSP == 4) {
            loadSize();
        } else {
            loadSanPham();
        }
    }

    private void loadSanPham() {
        model = new DefaultTableModel();
        model = (DefaultTableModel) tbl_ttsp.getModel();
        model.setRowCount(0);
        int i = 1;
        for (QLSanPhamResponse sp : iSP.getAllQLSP()) {
            model.addRow(new Object[]{i++, sp.getMaSP(), sp.getTenSP()});
        }
    }

    private void loadLoaiSP() {
        model = new DefaultTableModel();
        model = (DefaultTableModel) tbl_ttsp.getModel();
        model.setRowCount(0);
        int i = 1;
        for (QLSanPhamResponse sp : iLoaiSP.getAllQLLoaiSP()) {
            model.addRow(new Object[]{i++, sp.getMaLoaiSP(), sp.getTenLoaiSP()});
        }
    }

    private void loadChatLieu() {
        model = new DefaultTableModel();
        model = (DefaultTableModel) tbl_ttsp.getModel();
        model.setRowCount(0);
        int i = 1;
        for (QLSanPhamResponse sp : iCL.getAllQLCL()) {
            model.addRow(new Object[]{i++, sp.getMaChatLieu(), sp.getTenChatLieu()});
        }
    }

    private void loadMauSac() {
        model = new DefaultTableModel();
        model = (DefaultTableModel) tbl_ttsp.getModel();
        model.setRowCount(0);
        int i = 1;
        for (QLSanPhamResponse sp : iMS.getAllQLMauSac()) {
            model.addRow(new Object[]{i++, sp.getMaMauSac(), sp.getTenMauSac()});
        }
    }

    private void loadSize() {
        model = new DefaultTableModel();
        model = (DefaultTableModel) tbl_ttsp.getModel();
        model.setRowCount(0);
        int i = 1;
        for (QLSanPhamResponse sp : iSize.getAllQLSize()) {
            model.addRow(new Object[]{i++, sp.getMaSize(), sp.getTenSize()});
        }
    }

    private void showDetailThuocTinh() {
        txt_tt_Ma.setText(tbl_ttsp.getValueAt(indextblThuocTinh, 1).toString());
        txt_tt_Ten.setText(tbl_ttsp.getValueAt(indextblThuocTinh, 2).toString());
        tbl_ttsp.setRowSelectionInterval(indextblThuocTinh, indextblThuocTinh);
    }

    private QLSanPhamResponse getFormThuocTinh() {
        String ma = txt_tt_Ma.getText().trim();
        String ten = txt_tt_Ten.getText().trim();
        QLSanPhamResponse q = null;
        if (indexcbbThuocTinhSP == 0) {
            SanPham s = new SanPham(null, ma, ten, null);
            q = new QLSanPhamResponse(s);
        } else if (indexcbbThuocTinhSP == 1) {
            LoaiSP s = new LoaiSP(null, ma, ten, null);
            q = new QLSanPhamResponse(s);
        } else if (indexcbbThuocTinhSP == 2) {
            ChatLieu s = new ChatLieu(null, ma, ten);
            q = new QLSanPhamResponse(s);
        } else if (indexcbbThuocTinhSP == 3) {
            MauSac s = new MauSac(null, ma, ten);
            q = new QLSanPhamResponse(s);
        } else if (indexcbbThuocTinhSP == 4) {
            Size s = new Size(null, ma, ten);
            q = new QLSanPhamResponse(s);
        }
        return q;
    }

    private void loadcbbSP() {
        cbbModel = new DefaultComboBoxModel();
        cbbModel = (DefaultComboBoxModel) cbb_ctsp_SanPham.getModel();
        cbb_ctsp_SanPham.removeAllItems();
        for (QLSanPhamResponse x : iSP.getAllQLSP()) {
            cbbModel.addElement(x.getTenSP());
        }
    }

    private void loadcbbLoaiSP() {
        cbbModel = new DefaultComboBoxModel();
        cbbModel = (DefaultComboBoxModel) cbb_ctsp_LoaiSP.getModel();
        cbb_ctsp_LoaiSP.removeAllItems();
        for (QLSanPhamResponse x : iLoaiSP.getAllQLLoaiSP()) {
            cbbModel.addElement(x.getTenLoaiSP());
        }
    }

    private void loadcbbChatLieu() {
        cbbModel = new DefaultComboBoxModel();
        cbbModel = (DefaultComboBoxModel) cbb_ctsp_ChatLieu.getModel();
        cbb_ctsp_ChatLieu.removeAllItems();
        for (QLSanPhamResponse x : iCL.getAllQLCL()) {
            cbbModel.addElement(x.getTenChatLieu());
        }
    }

    private void loadcbbMauSac() {
        cbbModel = new DefaultComboBoxModel();
        cbbModel = (DefaultComboBoxModel) cbb_ctsp_Mau.getModel();
        cbb_ctsp_Mau.removeAllItems();
        for (QLSanPhamResponse x : iMS.getAllQLMauSac()) {
            cbbModel.addElement(x.getTenMauSac());
        }
    }

    private void loadcbbSize() {
        cbbModel = new DefaultComboBoxModel();
        cbbModel = (DefaultComboBoxModel) cbb_ctsp_Size.getModel();
        cbb_ctsp_Size.removeAllItems();
        for (QLSanPhamResponse x : iSize.getAllQLSize()) {
            cbbModel.addElement(x.getTenSize());
        }
    }

    private void loadQLCTSP() {
        model = new DefaultTableModel();
        model = (DefaultTableModel) tbl_ctsp.getModel();
        model.setRowCount(0);
        int i = 1;
        for (QLSanPhamResponse x : iChiTietSP.getAllQLChiTietSP()) {
            model.addRow(new Object[]{i++, x.getTenSP(), x.getTenLoaiSP(), x.getTenChatLieu(), x.getTenSize(), x.getTenMauSac(),
                x.getSLTon(), x.getGia(), x.getMoTa(), x.getTinhTrang(), x.getNgaySua(), x.getNgayTao()});
        }
    }

    private void showDetailChiTietSP() throws IOException {
        QLSanPhamResponse x = iChiTietSP.getAllQLChiTietSP().get(indextblCTSP);
        cbb_ctsp_SanPham.setSelectedItem(x.getTenSP());
        cbb_ctsp_LoaiSP.setSelectedItem(x.getTenLoaiSP());
        cbb_ctsp_ChatLieu.setSelectedItem(x.getTenChatLieu());
        cbb_ctsp_Mau.setSelectedItem(x.getTenMauSac());
        cbb_ctsp_Size.setSelectedItem(x.getTenSize());
        txt_ctsp_SLTon.setText(x.getSLTon());
        txt_ctsp_Gia.setText(x.getGia());
        txt_ctsp_MoTa.setText(x.getMoTa());
        rdo_ctsp_DungKinhDoanh.setSelected(x.getTinhTrang().equals("0"));
        rdo_ctsp_DangKinhDoanh.setSelected(x.getTinhTrang().equals("1"));
        txt_ctsp_NgaySua.setDate(Date.valueOf(x.getNgaySua()));
        txt_ctsp_NgayTao.setDate(Date.valueOf(x.getNgayTao()));
//        List<Anh> a = iAnh.getAllByIdCTSP(x.getId());
//        SoAnh = a.size();
//        if (SoAnh > 0) {
//            try {
//                index_ctsp_Anh = 0;
//                showAnhCTSP();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        } else {
//            lbl_sp_Anh.setIcon(null);
//            lbl_sp_Anh.setText("Ảnh");
//        }
//        tbl_ctsp.setRowSelectionInterval(indextblCTSP, indextblCTSP);
    }

    private QLSanPhamResponse getFormChiTietSP() {
        int index;

        index = cbb_ctsp_SanPham.getSelectedIndex();
        QLSanPhamResponse sp = iSP.getAllQLSP().get(index);

        index = cbb_ctsp_LoaiSP.getSelectedIndex();
        QLSanPhamResponse loaiSP = iLoaiSP.getAllQLLoaiSP().get(index);

        index = cbb_ctsp_ChatLieu.getSelectedIndex();
        QLSanPhamResponse cl = iCL.getAllQLCL().get(index);

        index = cbb_ctsp_Mau.getSelectedIndex();
        QLSanPhamResponse m = iMS.getAllQLMauSac().get(index);

        index = cbb_ctsp_Size.getSelectedIndex();
        QLSanPhamResponse s = iSize.getAllQLSize().get(index);

        QLSanPhamResponse q = new QLSanPhamResponse();
        q.setSLTon(txt_ctsp_SLTon.getText().trim());
        q.setGia(txt_ctsp_Gia.getText().trim());
        q.setMoTa(txt_ctsp_MoTa.getText().trim());
        q.setTinhTrang(rdo_ctsp_DungKinhDoanh.isSelected() ? "0" : "1");

        q.setIdSP(sp.getIdSP());
        q.setMaSP(sp.getMaSP());
        q.setTenSP(sp.getTenSP());

        q.setIdLoaiSP(loaiSP.getIdLoaiSP());
        q.setMaLoaiSP(loaiSP.getMaLoaiSP());
        q.setTenLoaiSP(loaiSP.getTenLoaiSP());

        q.setIdChatLieu(cl.getIdChatLieu());
        q.setMaChatLieu(cl.getMaChatLieu());
        q.setTenChatLieu(cl.getTenChatLieu());

        q.setIdMauSac(m.getIdMauSac());
        q.setMaMauSac(m.getMaMauSac());
        q.setTenMauSac(m.getTenMauSac());

        q.setIdSize(s.getIdSize());
        q.setMaSize(s.getMaSize());
        q.setTenSize(s.getTenSize());
        return q;
    }

//    private void showDetailAnh() throws IOException {
//        if (tbl_a.getRowCount() > 0) {
//            try {
//                UUID id = iChiTietSP.getAllQLChiTietSP().get(indextblAnhctsp).getId();
//
////                Anh a = iAnh.getAllByIdCTSP(id).get(indextblAnh);
//
//                txt_a_Ma.setText(a.getMaAnh());
//                txt_a_Ten.setText(a.getTenAnh());
//
////                if (a.getLinkAnh() != null) {
//                    lbl_a_Anh.setText("");
//                    Image img = ImageHelper.createImageFromByteArrayList(a.getLinkAnh(), "jpg");
//                    int width = lbl_a_Anh.getWidth();
//                    int height = lbl_a_Anh.getHeight();
//                    img = ImageHelper.resize(img, width, height);
//                    lbl_a_Anh.setIcon(new ImageIcon(img));
////                    personalImage = a.getLinkAnh();
//                } else {
//                    lbl_a_Anh.setText("Ảnh");
//                }
//                tbl_a.setRowSelectionInterval(indextblAnh, indextblAnh);
////            } catch (IOException ex) {
////                ex.printStackTrace();
//            }
//        } else {
//            lbl_a_Anh.setIcon(null);
//            lbl_a_Anh.setText("Ảnh");
//        }
//
//    }
//    private void showAnhCTSP() throws IOException {
//        UUID id = iChiTietSP.getAllQLChiTietSP().get(indextblCTSP).getId();
////        List<Anh> a = iAnh.getAllByIdCTSP(id);
//        if (a.size() > 0) {
//            if (a.get(index_ctsp_Anh).getLinkAnh() != null) {
//                lbl_sp_Anh.setText("");
//                Image img = ImageHelper.createImageFromByteArrayList(a.get(index_ctsp_Anh).getLinkAnh(), "jpg");
//                int width = lbl_sp_Anh.getWidth();
//                int height = lbl_sp_Anh.getHeight();
//                img = ImageHelper.resize(img, width, height);
//                lbl_sp_Anh.setIcon(new ImageIcon(img));
//                personalImage = a.get(index_ctsp_Anh).getLinkAnh();
//            } else {
//                lbl_sp_Anh.setText("Ảnh");
//            }
//        }
//
//    }
//    private Anh getFormAnh() {
////        Anh a = new Anh();
//        QLSanPhamResponse ql = iChiTietSP.getAllQLChiTietSP().get(indextblAnhctsp);
//        ChiTietSanPham sp = new ChiTietSanPham();
//        sp.setId(ql.getId());
//        if (tbl_a.getRowCount() > 0) {
//            indextblAnh = tbl_a.getSelectedRow();
////            a.setIdAnh(iAnh.getAllByIdCTSP(ql.getId()).get(indextblAnh).getIdAnh());
//        } else {
//            indextblAnh = 0;
//            a.setIdAnh(null);
//        }
//        a.setChiTietSanPham(sp);
//        a.setMaAnh(txt_a_Ma.getText().trim());
//        a.setTenAnh(txt_a_Ten.getText().trim());
//        a.setLinkAnh(personalImage);
//        return a;
//    }
    private CellStyle createStyleForHeader(Sheet sheet) {
        org.apache.poi.ss.usermodel.Font font = sheet.getWorkbook().createFont();
        font.setFontName("Times New Roman");
        font.setBold(true);
        font.setFontHeightInPoints((short) 12); // font size
        font.setColor(IndexedColors.BLACK.getIndex()); // text color

        // Create CellStyle
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setFillForegroundColor(IndexedColors.PINK1.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        return cellStyle;
    }

    //Van QL SP
    // Quyền
    private void loadHoaDon() {
        mdHD = (DefaultTableModel) tbl_HoaDon.getModel();
        mdHD.setRowCount(0);
        List<HoaDon> listHD = ihd.getAll();
        int stt = 1;
        for (HoaDon x : listHD) {
            mdHD.addRow(new Object[]{stt++, x.getMaHD(), x.getNguoiDung().getHoTen(), x.getKhachHang().getMaKH(), x.getKhachHang().getHoTen(), x.getPttt() == 0 ? "Chuyen khoan" : "Tien mat", x.getTinhTrang() == 1 ? "Da thanh toan" : "Cho thanh toan", x.getTongTienMat(), x.getTongTienCK(), x.getNgayTao(), x.getTienShip()});
        }
    }

    private void loadHoaDonChiTiet(List<HoaDonChiTiet> lstHDCT) {
        String Header[] = {"STT", "Ma SP", "Ten SP", "Chat Lieu", "Mau sac", "SIZE", "SL Mua", "Don Gia", "Giam Gia"};
        modelCTHD = new DefaultTableModel(Header, 0);
        modelCTHD.setRowCount(0);
        tbl_HoaDonChiTiet.setModel(modelCTHD);
        int stt = 1;
        for (HoaDonChiTiet x : lstHDCT) {
            modelCTHD.addRow(new Object[]{stt++, x.getChiTietSanPham().getSanPham().getMaSP(), x.getChiTietSanPham().getSanPham().getTenSP(), x.getChiTietSanPham().getChatLieu().getTenCL(), x.getChiTietSanPham().getMauSac().getTenMS(), x.getChiTietSanPham().getSize().getTen(), x.getSlMua(), x.getGia(), x.getKhuyenMai().getGiamGia() + " %"});
        }
    }
    // Quyền

    private ButtonGroup rdGroup = new ButtonGroup();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BieuDoTKeDT;
    private javax.swing.JPanel BieuDoTKeNvien;
    private javax.swing.JPanel BieuDoTKeSanPham;
    private javax.swing.JPanel ChiTiet;
    private javax.swing.JPanel ChiTietNV;
    private javax.swing.JPanel ChiTietSP;
    private javax.swing.JPanel ChucNang;
    private javax.swing.JPanel DonHang;
    private javax.swing.JPanel GioHang;
    private javax.swing.JPanel HoaDon;
    private javax.swing.JPanel JPanel_DanhSachKH;
    private javax.swing.JPanel JPanel_ThongTinKH;
    private com.toedter.calendar.JDateChooser Jdate_nd_ngaySinh;
    private com.toedter.calendar.JDateChooser Jdate_nd_ngaySua;
    private com.toedter.calendar.JDateChooser Jdate_nd_ngayTao;
    private javax.swing.JPanel Jpanel;
    private javax.swing.JPanel KhachHang;
    private javax.swing.JPanel NhanVien;
    private javax.swing.JPanel PN_BanHang;
    private javax.swing.JPanel PN_KhachHang;
    private javax.swing.JPanel PN_KhuyenMai;
    private javax.swing.JPanel PN_Main;
    private javax.swing.JPanel PN_QLHoaDon;
    private javax.swing.JPanel PN_QLNguoiDung;
    private javax.swing.JPanel PN_QLSanPham;
    private javax.swing.JPanel PN_QLThongKe;
    private javax.swing.JTabbedPane PanelChung;
    private javax.swing.JPanel PanelDatHang;
    private javax.swing.JPanel QL_AnhHai;
    private javax.swing.JPanel QL_BanHang;
    private javax.swing.JPanel QL_HoaDon;
    private javax.swing.JPanel QL_KhachHang;
    private javax.swing.JPanel QL_KhuyenMai;
    private javax.swing.JPanel QL_NguoiDung;
    private javax.swing.JPanel QL_SanPham;
    private javax.swing.JPanel QL_ThongKe;
    private javax.swing.JPanel SanPham;
    private javax.swing.JPanel SanPhamm;
    private javax.swing.JPanel ThoiGian2;
    private javax.swing.JPanel TongQuanNV;
    private javax.swing.JPanel TongQuanSP;
    private javax.swing.JTabbedPane TongQuanSPh;
    private javax.swing.JPanel TongQuanTgian;
    private javax.swing.JLabel banhang;
    private javax.swing.JButton btnChoGiao;
    private javax.swing.JButton btnChonKH;
    private javax.swing.JButton btnDaGiao;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnExist;
    private javax.swing.JButton btnGiaoHang;
    private javax.swing.JButton btnInHD;
    private javax.swing.JButton btnLamMoiKH;
    private javax.swing.JButton btnSuaKH;
    private javax.swing.JButton btnTaoHD;
    private javax.swing.JButton btnTaoHD2;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemKH;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btn_Export_ctsp;
    private javax.swing.JButton btn_TaiMau;
    private javax.swing.JButton btn_ctsp_ChatLieu;
    private javax.swing.JButton btn_ctsp_Clear;
    private javax.swing.JButton btn_ctsp_Clear1;
    private javax.swing.JButton btn_ctsp_Import;
    private javax.swing.JButton btn_ctsp_LoaiSP;
    private javax.swing.JButton btn_ctsp_Mau;
    private javax.swing.JButton btn_ctsp_SanPham;
    private javax.swing.JButton btn_ctsp_Size;
    private javax.swing.JButton btn_ctsp_Sua;
    private javax.swing.JButton btn_ctsp_Sua1;
    private javax.swing.JButton btn_ctsp_Sua2;
    private javax.swing.JButton btn_ctsp_Them;
    private javax.swing.JButton btn_ctsp_Them1;
    private javax.swing.JButton btn_ctsp_Xoa;
    private javax.swing.JButton btn_ctsp_Xoa1;
    private javax.swing.JButton btn_hd_Sua;
    private javax.swing.JButton btn_hd_Xoa;
    private javax.swing.JButton btn_km_Clear;
    private javax.swing.JButton btn_km_Sua;
    private javax.swing.JButton btn_km_Them;
    private javax.swing.JButton btn_km_Xoa;
    private javax.swing.JButton btn_nd_Sua;
    private javax.swing.JButton btn_nd_Them;
    private javax.swing.JButton btn_nd_Xoa;
    private javax.swing.JButton btnrefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cbb_ctsp_ChatLieu;
    private javax.swing.JComboBox<String> cbb_ctsp_LoaiSP;
    private javax.swing.JComboBox<String> cbb_ctsp_Mau;
    private javax.swing.JComboBox<String> cbb_ctsp_SanPham;
    private javax.swing.JComboBox<String> cbb_ctsp_Size;
    private javax.swing.JComboBox<String> cbb_hd_HinhThucTT;
    private javax.swing.JComboBox<String> cbb_hd_TrangThaiThanhToan;
    private javax.swing.JComboBox<String> cbb_nd_ChucVu;
    private javax.swing.JComboBox<String> cbb_ttsp;
    private javax.swing.JComboBox<String> cboKM;
    private javax.swing.JComboBox<String> cboPthuctt;
    private javax.swing.JComboBox<String> cboPthuctt2;
    private javax.swing.JComboBox<String> cboTTTT;
    private javax.swing.JButton chon;
    private javax.swing.JLabel hoadon;
    private javax.swing.JButton inhoadon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel ketqua;
    private javax.swing.JLabel khachhang;
    private javax.swing.JLabel khuyenmai;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblAnhHai;
    private javax.swing.JLabel lblAnhND;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblDoanhThuhnay;
    private javax.swing.JLabel lblHoTenNV;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblMaHD2;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblSLuong;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTenND;
    private javax.swing.JLabel lblTenND2;
    private javax.swing.JLabel lblTym;
    private javax.swing.JLabel mahd;
    private javax.swing.JLabel nhanvien;
    private javax.swing.JLabel nhanvien4;
    private javax.swing.JLabel nv;
    private javax.swing.JPanel panelQR;
    private javax.swing.JPanel panelTaiQuay;
    private javax.swing.JPanel pnDetailND;
    private javax.swing.JRadioButton rdoChoGiao;
    private javax.swing.JRadioButton rdoDaThanhToan;
    private javax.swing.JRadioButton rdoDangGiao;
    private javax.swing.JRadioButton rdoHDCho;
    private javax.swing.JRadioButton rdoTatCa;
    private javax.swing.JRadioButton rdo_ctsp_DangKinhDoanh;
    private javax.swing.JRadioButton rdo_ctsp_DungKinhDoanh;
    private javax.swing.JRadioButton rdo_kh_Nam;
    private javax.swing.JRadioButton rdo_kh_Nu;
    private javax.swing.JRadioButton rdo_km_ConKhuyenMai;
    private javax.swing.JRadioButton rdo_km_DungKhuyenMai;
    private javax.swing.JRadioButton rdo_nd_DangLam;
    private javax.swing.JRadioButton rdo_nd_Nam;
    private javax.swing.JRadioButton rdo_nd_NghiLam;
    private javax.swing.JRadioButton rdo_nd_Nu;
    private javax.swing.JLabel sanpham;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTable tblNhanVienTke;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTable tblSanPhamTke;
    private javax.swing.JTable tbl_HoaDon;
    private javax.swing.JTable tbl_HoaDonChiTiet;
    private javax.swing.JTable tbl_ctsp;
    private javax.swing.JTable tbl_km;
    private javax.swing.JTable tbl_nd_DangLam;
    private javax.swing.JTabbedPane tbl_nd_NghiLam;
    private javax.swing.JTable tbl_ttsp;
    private javax.swing.JButton thaydoi;
    private javax.swing.JLabel thongke;
    private javax.swing.JLabel timkiem;
    private javax.swing.JLabel txtGiamGia;
    private javax.swing.JLabel txtGiamGia2;
    private com.toedter.calendar.JDateChooser txtNgayGuiDi;
    private com.toedter.calendar.JDateChooser txtNgayKhachMuonNhan;
    private com.toedter.calendar.JDateChooser txtNgayNhan;
    private javax.swing.JTable txtNghiLam;
    private javax.swing.JLabel txtThanhToan;
    private javax.swing.JLabel txtThanhToan2;
    private javax.swing.JTextField txtTienKhachCK;
    private javax.swing.JTextField txtTienKhachCK2;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienKhachDua2;
    private javax.swing.JTextField txtTienShip;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTienThua2;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimKiemKHang;
    private javax.swing.JLabel txtTongTien;
    private javax.swing.JLabel txtTongTien2;
    private com.toedter.calendar.JDateChooser txt_NgayBatDauTKe;
    private com.toedter.calendar.JDateChooser txt_NgayKetThucTKe;
    private javax.swing.JTextField txt_ctsp_Gia;
    private javax.swing.JTextArea txt_ctsp_MoTa;
    private com.toedter.calendar.JDateChooser txt_ctsp_NgaySua;
    private com.toedter.calendar.JDateChooser txt_ctsp_NgayTao;
    private javax.swing.JTextField txt_ctsp_SLTon;
    private javax.swing.JTextField txt_ctsp_ThemSL;
    private javax.swing.JTextField txt_ctsp_TimKiem;
    private javax.swing.JTextField txt_hd_NgayBatDau;
    private javax.swing.JTextField txt_hd_NgayKetThuc;
    private javax.swing.JTextField txt_hd_TKTongTienBatDau;
    private javax.swing.JTextField txt_hd_TKTongTienKetThuc;
    private javax.swing.JTextField txt_hd_timKiem;
    private javax.swing.JTextArea txt_kh_DiaChi;
    private javax.swing.JTextField txt_kh_HoTenKH;
    private javax.swing.JTextField txt_kh_MaKh;
    private com.toedter.calendar.JDateChooser txt_kh_NgaySinh;
    private com.toedter.calendar.JDateChooser txt_kh_NgaySua;
    private com.toedter.calendar.JDateChooser txt_kh_NgayTao;
    private javax.swing.JTextField txt_kh_sdt;
    private javax.swing.JTextField txt_km_GiamGia;
    private javax.swing.JTextField txt_km_Ma;
    private javax.swing.JTextArea txt_km_MoTa;
    private com.toedter.calendar.JDateChooser txt_km_NgayBatDau;
    private com.toedter.calendar.JDateChooser txt_km_NgayKetThuc;
    private com.toedter.calendar.JDateChooser txt_km_NgaySua;
    private com.toedter.calendar.JDateChooser txt_km_NgayTao;
    private javax.swing.JTextField txt_km_Ten;
    private javax.swing.JTextField txt_km_TimKiem;
    private javax.swing.JTextField txt_nd_CCCD;
    private javax.swing.JTextField txt_nd_DiaChi;
    private javax.swing.JTextField txt_nd_Email;
    private javax.swing.JTextField txt_nd_HovaTen;
    private javax.swing.JTextField txt_nd_MaND;
    private javax.swing.JTextField txt_nd_MatKhau;
    private javax.swing.JTextField txt_nd_Sdt;
    private javax.swing.JTextField txt_nd_TenTK;
    private javax.swing.JTextField txt_nd_TimKiem;
    private javax.swing.JTextField txt_tt_Ma;
    private javax.swing.JTextField txt_tt_Ten;
    private javax.swing.JButton xoa;
    private javax.swing.JButton xoatatca;
    // End of variables declaration//GEN-END:variables

    // Danh
    private void setIcon() {
        ImageIcon im1 = new ImageIcon("user.png");
        lblAnhND.setIcon(im1);
        ImageIcon imbh = new ImageIcon("banhang.png");
        banhang.setIcon(imbh);
        ImageIcon imnv = new ImageIcon("nhanvien.png");
        nhanvien.setIcon(imnv);
        ImageIcon imkh = new ImageIcon("khachhang.png");
        khachhang.setIcon(imkh);
        ImageIcon imkm = new ImageIcon("khuyenmai.png");
        khuyenmai.setIcon(imkm);
        ImageIcon imtk = new ImageIcon("thongke.png");
        thongke.setIcon(imtk);
        ImageIcon imsp = new ImageIcon("sanpham.png");
        sanpham.setIcon(imsp);
        ImageIcon imhd = new ImageIcon("hoadon.png");
        hoadon.setIcon(imhd);
    }

    private BanhangReponse getFormDataHD() {
        return new BanhangReponse(iBH.getOne_ND(ndRP.getIdND()), iBH.getAll_KH().get(0));
    }

    private BanhangReponse getFormDataHD_UD_KH() {
        return new BanhangReponse(iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString()), iBH.getAll_KH().get(tblKhachHang.getSelectedRow()));
    }

    private BanhangReponse getFormDataHD_UD_TQ() {
        int indexPttt = cboPthuctt.getSelectedIndex();
        int pttt;
        if (indexPttt == 0) {
            pttt = 1;
        } else if (indexPttt == 1) {
            pttt = 0;
        } else {
            pttt = 2;
        }
        if (pttt == 1) {
            if (txtTienKhachDua.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa không được để trống");
                return null;
            }
            int tienKhachDua;
            try {
                tienKhachDua = Integer.parseInt(txtTienKhachDua.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachDua))) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa đang NHỎ HƠN Tiền thanh toán");
                return null;
            }
        } else if (pttt == 0) {
            if (txtTienKhachCK.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống tiền khách chuyển khoản");
                return null;
            }
            int tienKhachCK;
            try {
                tienKhachCK = Integer.parseInt(txtTienKhachCK.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachCK))) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản đang NHỎ HƠN Tiền thanh toán");
                return null;
            }
        } else {
            if (txtTienKhachCK.getText().isEmpty() || txtTienKhachDua.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống tiền khách đưa hoặc tiền khách chuyển khoản");
                return null;
            }
            int tienKhachDua;
            try {
                tienKhachDua = Integer.parseInt(txtTienKhachDua.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa phải là số");
                return null;
            }
            int tienKhachCK;
            try {
                tienKhachCK = Integer.parseInt(txtTienKhachCK.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachCK + tienKhachDua))) {
                JOptionPane.showMessageDialog(this, "Tiền CK + Tiền KĐ NHỎ HƠN Tiền thanh toán");
                return null;
            }
        }
        return new BanhangReponse(iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString()), pttt, txtTienKhachDua.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.parseDouble(txtTienKhachDua.getText())), txtTienKhachCK.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.parseDouble(txtTienKhachCK.getText())), 1);
    }

    private BanhangReponse getFormDataHD_UD_BH(int tt) {
        HoaDon hd = iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString());
        int indexPttt = cboPthuctt2.getSelectedIndex();
        int pttt;
        if (indexPttt == 0) {
            pttt = 1;
        } else if (indexPttt == 1) {
            pttt = 0;
        } else {
            pttt = 2;
        }
        if (pttt == 1) {
            if (txtTienKhachDua2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa không được để trống");
                return null;
            }
            int tienKhachDua;
            try {
                tienKhachDua = Integer.parseInt(txtTienKhachDua2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachDua))) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa đang NHỎ HƠN Tiền thanh toán");
                return null;
            }
        } else if (pttt == 0) {
            if (txtTienKhachCK2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống tiền khách chuyển khoản");
                return null;
            }
            int tienKhachCK;
            try {
                tienKhachCK = Integer.parseInt(txtTienKhachCK2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachCK))) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản đang NHỎ HƠN Tiền thanh toán");
                return null;
            }
        } else {
            if (txtTienKhachCK2.getText().isEmpty() || txtTienKhachDua2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống tiền khách đưa hoặc tiền khách chuyển khoản");
                return null;
            }
            int tienKhachDua;
            try {
                tienKhachDua = Integer.parseInt(txtTienKhachDua2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa phải là số");
                return null;
            }
            int tienKhachCK;
            try {
                tienKhachCK = Integer.parseInt(txtTienKhachCK2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachCK + tienKhachDua))) {
                JOptionPane.showMessageDialog(this, "Tiền CK + Tiền KĐ NHỎ HƠN Tiền thanh toán");
                return null;
            }
        }
        BigDecimal ttmat = BigDecimal.valueOf(txtTienKhachDua2.getText().isEmpty() ? 0.0 : Double.parseDouble(txtTienKhachDua2.getText()));
        BigDecimal ttck = BigDecimal.valueOf(txtTienKhachCK2.getText().isEmpty() ? 0.0 : Double.parseDouble(txtTienKhachCK2.getText()));
        java.util.Date currentDate = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayTT;
        ngayTT = Date.valueOf(sdf.format(currentDate));
        int indexTTTT = cboTTTT.getSelectedIndex();
        int tttt;
        if (indexTTTT == 0) {
            tttt = 1;
        } else {
            tttt = 0;
        }
        Date ngayKhachMuonNhan;
        ngayKhachMuonNhan = txtNgayKhachMuonNhan.getDate() == null ? ngayTT : Date.valueOf(sdf.format(txtNgayKhachMuonNhan.getDate()));
        BigDecimal tShip = BigDecimal.valueOf(txtTienShip.getText().isEmpty() ? 0.0 : Double.parseDouble(txtTienShip.getText()));
        return new BanhangReponse(hd, pttt, ttmat, ttck, tt, ngayTT, tttt, ngayKhachMuonNhan, ngayTT, ngayTT, tShip);
    }

    private BanhangReponse getFormDataHD_UD_BH_GiaoHang(int tt) {
        HoaDon hd = iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString());
        int indexPttt = cboPthuctt2.getSelectedIndex();
        int pttt;
        if (indexPttt == 0) {
            pttt = 1;
        } else if (indexPttt == 1) {
            pttt = 0;
        } else {
            pttt = 2;
        }
        if (pttt == 1) {
            if (txtTienKhachDua2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa không được để trống");
                return null;
            }
            int tienKhachDua;
            try {
                tienKhachDua = Integer.parseInt(txtTienKhachDua2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachDua))) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa đang NHỎ HƠN Tiền thanh toán");
                return null;
            }
        } else if (pttt == 0) {
            if (txtTienKhachCK2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống tiền khách chuyển khoản");
                return null;
            }
            int tienKhachCK;
            try {
                tienKhachCK = Integer.parseInt(txtTienKhachCK2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachCK))) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản đang NHỎ HƠN Tiền thanh toán");
                return null;
            }
        } else {
            if (txtTienKhachCK2.getText().isEmpty() || txtTienKhachDua2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống tiền khách đưa hoặc tiền khách chuyển khoản");
                return null;
            }
            int tienKhachDua;
            try {
                tienKhachDua = Integer.parseInt(txtTienKhachDua2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa phải là số");
                return null;
            }
            int tienKhachCK;
            try {
                tienKhachCK = Integer.parseInt(txtTienKhachCK2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachCK + tienKhachDua))) {
                JOptionPane.showMessageDialog(this, "Tiền CK + Tiền KĐ NHỎ HƠN Tiền thanh toán");
                return null;
            }
        }
        BigDecimal ttmat = BigDecimal.valueOf(txtTienKhachDua2.getText().isEmpty() ? 0.0 : Double.parseDouble(txtTienKhachDua2.getText()));
        BigDecimal ttck = BigDecimal.valueOf(txtTienKhachCK2.getText().isEmpty() ? 0.0 : Double.parseDouble(txtTienKhachCK2.getText()));
        java.util.Date currentDate = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayTT;
        ngayTT = Date.valueOf(sdf.format(currentDate));
        int indexTTTT = cboTTTT.getSelectedIndex();
        int tttt;
        if (indexTTTT == 0) {
            tttt = 1;
        } else {
            tttt = 0;
        }
        if ((txtNgayGuiDi.getDate() == null)) {
            JOptionPane.showMessageDialog(this, "Ngày gửi đi không được để trống");
            return null;
        }
        Date ngayGuiDi;
        ngayGuiDi = Date.valueOf(sdf.format(txtNgayGuiDi.getDate()));
        if (txtTienShip.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tiền ship không được để trống");
            return null;
        }
        int tienship;
        try {
            tienship = Integer.parseInt(txtTienShip.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tiền ship phải là số");
            return null;
        }
        if (tienship <= 0) {
            JOptionPane.showMessageDialog(this, "Tiền ship phải lớn hơn 0");
            return null;
        }
        BigDecimal tShip = BigDecimal.valueOf(Double.parseDouble(txtTienShip.getText()));
        Date ngayKhachMuonNhan;
        ngayKhachMuonNhan = Date.valueOf(sdf.format(txtNgayKhachMuonNhan.getDate()));
        return new BanhangReponse(hd, pttt, ttmat, ttck, tt, ngayTT, tttt, txtNgayKhachMuonNhan.getDate() == null ? hd.getNgayTT() : ngayKhachMuonNhan, ngayGuiDi, ngayTT, tShip);
    }

    private BanhangReponse getFormDataHD_UD_BH_DaGiao(int tt) {
        HoaDon hd = iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString());
        int indexPttt = cboPthuctt2.getSelectedIndex();
        int pttt;
        if (indexPttt == 0) {
            pttt = 1;
        } else if (indexPttt == 1) {
            pttt = 0;
        } else {
            pttt = 2;
        }
        if (pttt == 1) {
            if (txtTienKhachDua2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa không được để trống");
                return null;
            }
            int tienKhachDua;
            try {
                tienKhachDua = Integer.parseInt(txtTienKhachDua2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachDua))) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa đang NHỎ HƠN Tiền thanh toán");
                return null;
            }
        } else if (pttt == 0) {
            if (txtTienKhachCK2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống tiền khách chuyển khoản");
                return null;
            }
            int tienKhachCK;
            try {
                tienKhachCK = Integer.parseInt(txtTienKhachCK2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachCK))) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản đang NHỎ HƠN Tiền thanh toán");
                return null;
            }
        } else {
            if (txtTienKhachCK2.getText().isEmpty() || txtTienKhachDua2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống tiền khách đưa hoặc tiền khách chuyển khoản");
                return null;
            }
            int tienKhachDua;
            try {
                tienKhachDua = Integer.parseInt(txtTienKhachDua2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách đưa phải là số");
                return null;
            }
            int tienKhachCK;
            try {
                tienKhachCK = Integer.parseInt(txtTienKhachCK2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách chuyển khoản phải là số");
                return null;
            }
            if (ttoan > Double.parseDouble(String.valueOf(tienKhachCK + tienKhachDua))) {
                JOptionPane.showMessageDialog(this, "Tiền CK + Tiền KĐ NHỎ HƠN Tiền thanh toán");
                return null;
            }
        }
        BigDecimal ttmat = BigDecimal.valueOf(txtTienKhachDua2.getText().isEmpty() ? 0.0 : Double.parseDouble(txtTienKhachDua2.getText()));
        BigDecimal ttck = BigDecimal.valueOf(txtTienKhachCK2.getText().isEmpty() ? 0.0 : Double.parseDouble(txtTienKhachCK2.getText()));
        int indexTTTT = cboTTTT.getSelectedIndex();
        int tttt;
        if (indexTTTT == 0) {
            tttt = 1;
        } else {
            tttt = 0;
        }
        if (txtNgayNhan.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ban phai nhap ngay nhan");
            return null;
        }
        java.util.Date currentDate = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayTT;
        ngayTT = Date.valueOf(sdf.format(currentDate));
        Date ngayNhan;
        ngayNhan = Date.valueOf(sdf.format(txtNgayNhan.getDate()));
        return new BanhangReponse(hd, pttt, ttmat, ttck, tt, ngayTT, tttt, hd.getNgayMuonNhan(), hd.getNgayGui(), ngayNhan, hd.getTienShip());
    }

    private BanhangReponse getFormDataHDCT(String ipSL) {
        return new BanhangReponse(iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString()), iBH.getAll_CTSP_ByName(txtTimKiem.getText()).get(tblSanPham.getSelectedRow()), ipSL, iBH.getAll_KM().get(cboKM.getSelectedIndex()));
    }

    private BanhangReponse getFormDataHDCT_UD(HoaDonChiTiet HDCT, String ipSL) {
        return new BanhangReponse(HDCT, ipSL);
    }

    private BanhangReponse getFormDataHDCT_DL() {
        return new BanhangReponse(iBH.getAll_HDCTByIDHD(iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString()).getIdHD()).get(tblGioHang.getSelectedRow()));
    }

    private BanhangReponse getFormDataCTSP_UD(String sl) {
        return new BanhangReponse(iBH.getAll_CTSP_ByName(txtTimKiem.getText()).get(tblSanPham.getSelectedRow()), sl);
    }

    private void clearForm() {
        tblHoaDon.setRowSelectionAllowed(false);
        txtTongTien.setText("0");
        txtGiamGia.setText("0");
        txtThanhToan.setText("0");
        lblMaHD.setText("");
        lblMaKH.setText("KH00");
        lblTenKH.setText("Khách bán lẻ");
        txtThanhToan.setText("");
        txtTienKhachDua.setText("");
        txtTienKhachCK.setText("");
        txtTienThua.setText("");
        cboPthuctt.setSelectedIndex(0);
    }

    private void clearFormDH() {
        tblHoaDon.setRowSelectionAllowed(false);
        txtTongTien2.setText("");
        txtGiamGia2.setText("");
        txtThanhToan2.setText("");
        lblMaHD2.setText("");
        lblMaKH.setText("KH00");
        lblTenKH.setText("Khách bán lẻ");
        txtThanhToan2.setText("");
        txtTienKhachDua2.setText("");
        txtTienKhachCK2.setText("");
        txtTienThua2.setText("");
        txtTienShip.setText("");
        txtNgayKhachMuonNhan.setDate(null);
        txtNgayGuiDi.setDate(null);
        txtNgayNhan.setDate(null);
        cboPthuctt2.setSelectedIndex(0);
        cboTTTT.setSelectedIndex(0);
    }

    private void showDetailHD_TQ(HoaDon hd) {
        int pttt;
        if (hd.getPttt() == 1) {
            pttt = 0;
        } else if (hd.getPttt() == 0) {
            pttt = 1;
        } else {
            pttt = 2;
        }
        cboPthuctt.setSelectedIndex(pttt);
        KhachHang kh = iBH.getOne_KH(hd.getKhachHang().getIdKH());
        NguoiDung nd = iBH.getOne_ND(hd.getNguoiDung().getIdND());
        lblMaKH.setText(kh.getMaKH());
        lblTenKH.setText(kh.getHoTen());
        lblMaHD.setText(hd.getMaHD());
        lblTenND.setText(nd.getHoTen());
        txtTienKhachDua.setText(hd.getTongTienMat() + "");
        txtTienKhachCK.setText(hd.getTongTienCK() + "");
        tinhTien_TQ(hd);
    }

    private void showDetailHD_Dh(HoaDon hd) {
        int pttt;
        if (hd.getPttt() == 1) {
            pttt = 0;
        } else if (hd.getPttt() == 0) {
            pttt = 1;
        } else {
            pttt = 2;
        }
        int tttt;
        if (hd.getTttt() == 0) {
            tttt = 1;
        } else {
            tttt = 0;
        }
        cboTTTT.setSelectedIndex(tttt);
        cboPthuctt2.setSelectedIndex(pttt);
        KhachHang kh = iBH.getOne_KH(hd.getKhachHang().getIdKH());
        NguoiDung nd = iBH.getOne_ND(hd.getNguoiDung().getIdND());
        lblMaKH.setText(kh.getMaKH());
        lblTenKH.setText(kh.getHoTen());
        lblMaHD2.setText(hd.getMaHD());
        lblTenND2.setText(nd.getHoTen());
        txtTienShip.setText(hd.getTienShip() + "");
        txtTienKhachDua2.setText(hd.getTongTienMat() + "");
        txtTienKhachCK2.setText(hd.getTongTienCK() + "");
        txtNgayKhachMuonNhan.setDate(hd.getNgayMuonNhan());
        txtNgayGuiDi.setDate(hd.getNgayMuonNhan());
        txtNgayNhan.setDate(hd.getNgayMuonNhan());
        tinhTien_DH(hd);
    }

    private void showDetailHD_Dh_DG(HoaDon hd) {
        int pttt;
        if (hd.getPttt() == 1) {
            pttt = 0;
        } else if (hd.getPttt() == 0) {
            pttt = 1;
        } else {
            pttt = 2;
        }
        int tttt;
        if (hd.getTttt() == 0) {
            tttt = 1;
        } else {
            tttt = 0;
        }
        cboTTTT.setSelectedIndex(tttt);
        cboPthuctt2.setSelectedIndex(pttt);
        KhachHang kh = iBH.getOne_KH(hd.getKhachHang().getIdKH());
        NguoiDung nd = iBH.getOne_ND(hd.getNguoiDung().getIdND());
        lblMaKH.setText(kh.getMaKH());
        lblTenKH.setText(kh.getHoTen());
        lblMaHD2.setText(hd.getMaHD());
        lblTenND2.setText(nd.getHoTen());
        txtTienShip.setText(hd.getTienShip() + "");
        txtTienKhachDua2.setText(hd.getTongTienMat() + "");
        txtTienKhachCK2.setText(hd.getTongTienCK() + "");
        txtNgayKhachMuonNhan.setDate(hd.getNgayMuonNhan());
        txtNgayGuiDi.setDate(hd.getNgayMuonNhan());
        txtNgayNhan.setDate(null);
        tinhTien_DH(hd);
    }

    private void showDetailHD_Dh_CG(HoaDon hd) {
        int pttt;
        if (hd.getPttt() == 1) {
            pttt = 0;
        } else if (hd.getPttt() == 0) {
            pttt = 1;
        } else {
            pttt = 2;
        }
        int tttt;
        if (hd.getTttt() == 0) {
            tttt = 1;
        } else {
            tttt = 0;
        }
        cboTTTT.setSelectedIndex(tttt);
        cboPthuctt2.setSelectedIndex(pttt);
        KhachHang kh = iBH.getOne_KH(hd.getKhachHang().getIdKH());
        NguoiDung nd = iBH.getOne_ND(hd.getNguoiDung().getIdND());
        lblMaKH.setText(kh.getMaKH());
        lblTenKH.setText(kh.getHoTen());
        lblMaHD2.setText(hd.getMaHD());
        lblTenND2.setText(nd.getHoTen());
        txtTienShip.setText(hd.getTienShip() + "");
        txtTienKhachDua2.setText(hd.getTongTienMat() + "");
        txtTienKhachCK2.setText(hd.getTongTienCK() + "");
        txtNgayKhachMuonNhan.setDate(hd.getNgayMuonNhan());
        txtNgayGuiDi.setDate(null);
        txtNgayNhan.setDate(null);
        tinhTien_DH(hd);
    }

    private void showDetailHD_Dh_CTT(HoaDon hd) {
        int pttt;
        if (hd.getPttt() == 1) {
            pttt = 0;
        } else if (hd.getPttt() == 0) {
            pttt = 1;
        } else {
            pttt = 2;
        }
        int tttt;
        if (hd.getTttt() == 0) {
            tttt = 1;
        } else {
            tttt = 0;
        }
        cboTTTT.setSelectedIndex(tttt);
        cboPthuctt2.setSelectedIndex(pttt);
        KhachHang kh = iBH.getOne_KH(hd.getKhachHang().getIdKH());
        NguoiDung nd = iBH.getOne_ND(hd.getNguoiDung().getIdND());
        lblMaKH.setText(kh.getMaKH());
        lblTenKH.setText(kh.getHoTen());
        lblMaHD2.setText(hd.getMaHD());
        lblTenND2.setText(nd.getHoTen());
        txtTienShip.setText(hd.getTienShip() + "");
        txtTienKhachDua2.setText(hd.getTongTienMat() + "");
        txtTienKhachCK2.setText(hd.getTongTienCK() + "");
        txtNgayKhachMuonNhan.setDate(null);
        txtNgayGuiDi.setDate(null);
        txtNgayNhan.setDate(null);
        tinhTien_DH(hd);
    }

    private void tinhTien_TQ(HoaDon hd) {
        List<BigDecimal> lstGia = new ArrayList<>();
        for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(hd.getIdHD())) {
            lstGia.add(x.getGia().multiply(BigDecimal.valueOf(x.getSlMua())));
        }
        sum = 0.0;
        for (BigDecimal bigDecimal : lstGia) {
            sum += Double.parseDouble(bigDecimal.toString());
        }
        DecimalFormat df = new DecimalFormat("#,###");
        txtTongTien.setText(df.format(sum) + " VND");
        List<BigDecimal> lstGiamGia = new ArrayList<>();
        for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(hd.getIdHD())) {
            lstGiamGia.add(x.getGiaKM().multiply(BigDecimal.valueOf(x.getSlMua())));
        }
        giamSum = 0.0;
        for (BigDecimal bigDecimal : lstGiamGia) {
            giamSum += Double.parseDouble(bigDecimal.toString());
        }
        DecimalFormat dfggia = new DecimalFormat("#,###");
        txtGiamGia.setText(dfggia.format(sum - giamSum) + " VND");
        DecimalFormat dfttoan = new DecimalFormat("#,###");
        txtThanhToan.setText(dfttoan.format(giamSum) + " VND");
        ttoan = giamSum;
        txtTienKhachDua.setText(hd.getTongTienMat() + "");
        txtTienKhachCK.setText(hd.getTongTienCK() + "");
    }

    private void tinhTien_DH(HoaDon hd) {
        List<BigDecimal> lstGia = new ArrayList<>();
        for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(hd.getIdHD())) {
            lstGia.add(x.getGia().multiply(BigDecimal.valueOf(x.getSlMua())));
        }
        sum = 0.0;
        for (BigDecimal bigDecimal : lstGia) {
            sum += Double.parseDouble(bigDecimal.toString());
        }
        DecimalFormat df = new DecimalFormat("#,###");
        txtTongTien2.setText(df.format(sum) + " VND");
        List<BigDecimal> lstGiamGia = new ArrayList<>();
        for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(hd.getIdHD())) {
            lstGiamGia.add(x.getGiaKM().multiply(BigDecimal.valueOf(x.getSlMua())));
        }
        giamSum = 0.0;
        for (BigDecimal bigDecimal : lstGiamGia) {
            giamSum += Double.parseDouble(bigDecimal.toString());
        }
        DecimalFormat dfggia = new DecimalFormat("#,###");
        txtGiamGia2.setText(dfggia.format(sum - giamSum) + " VND");
        DecimalFormat dfttoan = new DecimalFormat("#,###");
        txtThanhToan2.setText(dfttoan.format(giamSum) + " VND");
        ttoan = giamSum;
        txtTienKhachDua2.setText(hd.getTongTienMat() + "");
        txtTienKhachCK2.setText(hd.getTongTienCK() + "");
    }

    private void loadDataSP() {
        String Header[] = {"STT", "Ten SP", "Chat Lieu", "SIZE", "Mau Sac", "So Luong", "Don Gia"};
        modelSP = new DefaultTableModel(Header, 0);
        modelSP.setRowCount(0);
        tblSanPham.setModel(modelSP);
        int stt = 1;
        for (ChiTietSanPham x : iBH.getAll_CTSP_ByName(txtTimKiem.getText())) {
            modelSP.addRow(new Object[]{stt++, x.getSanPham().getTenSP(), x.getChatLieu().getTenCL(), x.getSize().getTen(), x.getMauSac().getTenMS(), x.getSlTon(), x.getGia()});
        }
    }

    private void loadDataHD(List<HoaDon> lstHD) {
        String Header[] = {"STT", "Ma HD", "Ma NV", "Ngay Tao", "Tinh Trang"};
        modelHD = new DefaultTableModel(Header, 0);
        modelHD.setRowCount(0);
        tblHoaDon.setModel(modelHD);
        int stt = 1;
        for (HoaDon x : lstHD) {
            String trangThai;
            if (x.getTinhTrang() == 0) {
                trangThai = "Chờ thanh toán";
            } else if (x.getTinhTrang() == 1) {
                trangThai = "Đã thanh toán";
            } else if (x.getTinhTrang() == -1) {
                trangThai = "Chờ giao";
            } else {
                trangThai = "Ðang giao";
            }
            modelHD.addRow(new Object[]{stt++, x.getMaHD(), x.getNguoiDung().getMaND(), x.getNgayTao(), trangThai});
        }
    }

    private void loadDataGH(List<HoaDonChiTiet> lstHDCT) {
        String Header[] = {"STT", "Ma SP", "Ten SP", "SL Mua", "Don Gia", "Giam Gia"};
        modelCTHD = new DefaultTableModel(Header, 0);
        modelCTHD.setRowCount(0);
        tblGioHang.setModel(modelCTHD);
        int stt = 1;
        for (HoaDonChiTiet x : lstHDCT) {
            modelCTHD.addRow(new Object[]{stt++, x.getChiTietSanPham().getSanPham().getMaSP(), x.getChiTietSanPham().getSanPham().getTenSP(), x.getSlMua(), x.getGia(), x.getKhuyenMai().getGiamGia() + " %"});
        }
    }

    private void loadDataGH_Rong() {
        String Header[] = {"STT", "Ma SP", "Ten SP", "SL Mua", "Don Gia", "Giam Gia"};
        modelCTHD = new DefaultTableModel(Header, 0);
        modelCTHD.setRowCount(0);
        tblGioHang.setModel(modelCTHD);
    }

    private void loadDataKM() {
        for (KhuyenMai x : iBH.getAll_KM()) {
            boxKM.addElement(x.getGiamGia());
        }
        cboKM.setModel(boxKM);
    }

    private void nextPN(JPanel pn) {
        PN_Main.removeAll();
        PN_Main.add(pn);
        PN_Main.repaint();
        PN_Main.validate();
    }

    private void effectNav(JPanel pn_goc, JPanel pn1, JPanel pn2, JPanel pn3, JPanel pn4, JPanel pn5, JPanel pn6, String title) {
        pn_goc.setBackground(Color.white);
        pn1.setBackground(new Color(210, 166, 199));
        pn2.setBackground(new Color(210, 166, 199));
        pn3.setBackground(new Color(210, 166, 199));
        pn4.setBackground(new Color(210, 166, 199));
        pn5.setBackground(new Color(210, 166, 199));
        pn6.setBackground(new Color(210, 166, 199));
        setTitle(title);
    }

    public void initWebCam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0);
        webcam.setViewSize(size);
        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);
        panelQR.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 25, 191, 110));
        ex.execute(this);
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }

            Result result = null;
            BufferedImage image = null;

            if (webcam.isOpen()) {
                if ((image = webcam.getImage()) == null) {
                    continue;
                }
            }
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (Exception e) {
            }
            if (result != null) {
                kq = result.getText().substring(7, result.getText().length());
                ketqua.setText(kq);
                int checkQR = 0;
                for (int i = 0; i < iBH.getAll_CTSP_ByName(txtTimKiem.getText()).size(); i++) {
                    if (kq.equalsIgnoreCase(String.valueOf(iBH.getAll_CTSP().get(i).getId()))) {
                        checkQR = 1;
                        tblSanPham.setRowSelectionInterval(i, i);
                        if (PanelChung.getSelectedIndex() == 1 && lblMaKH.getText().equalsIgnoreCase("KH00")) {
                            JOptionPane.showMessageDialog(this, "Ban chua chon khach hang");
                            return;
                        }
                        tblGioHang.setRowSelectionAllowed(false);
                        tblSanPham.setRowSelectionAllowed(true);
                        if (ihd.getAll().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Ban phai tao HD de mua hang");
                            return;
                        }
                        HoaDon HD = iBH.getOne_HD_ByMa(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString());
                        ChiTietSanPham CTSP = iBH.getAll_CTSP_ByName(txtTimKiem.getText()).get(tblSanPham.getSelectedRow());
                        String ipSL = JOptionPane.showInputDialog(this, "Moi nhap so luong");
                        if (ipSL.isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Khong duoc de trong");
                            return;
                        }
                        int sl;
                        try {
                            sl = Integer.parseInt(ipSL);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "So luong phai la so !");
                            return;
                        }
                        if (sl < 0) {
                            JOptionPane.showMessageDialog(this, "So luong phai la so duong");
                            return;
                        }
                        if (sl > Integer.parseInt(tblSanPham.getValueAt(tblSanPham.getSelectedRow(), 6).toString())) {
                            JOptionPane.showMessageDialog(this, "So luong trong kho khong du");
                            return;
                        }
                        int check = 0;
                        for (HoaDonChiTiet HDCT : iBH.getAll_HDCT()) {
                            if (HDCT.getHoaDon().getIdHD().equals(HD.getIdHD()) && HDCT.getChiTietSanPham().getId().equals(CTSP.getId())) {
                                int slMua = Integer.parseInt(ipSL) + HDCT.getSlMua();
                                iBH.updateSL_HDCT(getFormDataHDCT_UD(HDCT, String.valueOf(slMua)));
                                check = 1;
                            }
                        }
                        if (check == 0) {
                            iBH.add_HDCT(getFormDataHDCT(ipSL));
                        }
                        int slTon = CTSP.getSlTon() - Integer.parseInt(ipSL);
                        iBH.updateSL_CTSP(getFormDataCTSP_UD(String.valueOf(slTon)));
                        loadDataSP();
                        loadDataGH(iBH.getAll_HDCTByIDHD(HD.getIdHD()));
                        if (iBH.getAll_HDCTByIDHD(HD.getIdHD()).size() > 0) {
                            if (HD.getKhachHang().getMaKH().equalsIgnoreCase("KH00")) {
                                btnThanhToan.setEnabled(true);
                                xoa.setEnabled(true);
                                xoatatca.setEnabled(true);
                            } else {
                                btnChoGiao.setEnabled(true);
                                btnGiaoHang.setEnabled(true);
                                xoa.setEnabled(true);
                                xoatatca.setEnabled(true);
                            }
                        }
                        if (PanelChung.getSelectedIndex() == 0) {
                            List<BigDecimal> lstGia = new ArrayList<>();
                            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                                lstGia.add(x.getGia().multiply(BigDecimal.valueOf(x.getSlMua())));
                            }
                            sum = 0.0;
                            for (BigDecimal bigDecimal : lstGia) {
                                sum += Double.parseDouble(bigDecimal.toString());
                            }
                            DecimalFormat df = new DecimalFormat("#,###");
                            txtTongTien.setText(df.format(sum) + " VND");
                            List<BigDecimal> lstGiamGia = new ArrayList<>();
                            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                                lstGiamGia.add(x.getGiaKM().multiply(BigDecimal.valueOf(x.getSlMua())));
                            }
                            giamSum = 0.0;
                            for (BigDecimal bigDecimal : lstGiamGia) {
                                giamSum += Double.parseDouble(bigDecimal.toString());
                            }
                            DecimalFormat dfggia = new DecimalFormat("#,###");
                            txtGiamGia.setText(dfggia.format(sum - giamSum) + " VND");
                            DecimalFormat dfttoan = new DecimalFormat("#,###");
                            txtThanhToan.setText(dfttoan.format(giamSum) + " VND");
                            ttoan = giamSum;
                            txtTimKiem.setText("");
                            BigDecimal tienThua = (txtTienKhachDua.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua.getText()))).subtract(BigDecimal.valueOf(ttoan));
                            DecimalFormat dftt = new DecimalFormat("#,###");
                            txtTienThua.setText(dftt.format(tienThua) + " VND");
                        } else {
                            List<BigDecimal> lstGia = new ArrayList<>();
                            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                                lstGia.add(x.getGia().multiply(BigDecimal.valueOf(x.getSlMua())));
                            }
                            sum = 0.0;
                            for (BigDecimal bigDecimal : lstGia) {
                                sum += Double.parseDouble(bigDecimal.toString());
                            }
                            DecimalFormat df = new DecimalFormat("#,###");
                            txtTongTien2.setText(df.format(sum) + " VND");
                            List<BigDecimal> lstGiamGia = new ArrayList<>();
                            for (HoaDonChiTiet x : iBH.getAll_HDCTByIDHD(HD.getIdHD())) {
                                lstGiamGia.add(x.getGiaKM().multiply(BigDecimal.valueOf(x.getSlMua())));
                            }
                            giamSum = 0.0;
                            for (BigDecimal bigDecimal : lstGiamGia) {
                                giamSum += Double.parseDouble(bigDecimal.toString());
                            }
                            DecimalFormat dfggia = new DecimalFormat("#,###");
                            txtGiamGia2.setText(dfggia.format(sum - giamSum) + " VND");
                            DecimalFormat dfttoan = new DecimalFormat("#,###");
                            txtThanhToan2.setText(dfttoan.format(giamSum) + " VND");
                            ttoan = giamSum;
                            txtTimKiem.setText("");
                            BigDecimal tienThua = (txtTienKhachDua2.getText().isEmpty() ? BigDecimal.valueOf(0.0) : BigDecimal.valueOf(Double.valueOf(txtTienKhachDua2.getText()))).subtract(BigDecimal.valueOf(ttoan));
                            DecimalFormat dftt = new DecimalFormat("#,###");
                            txtTienThua2.setText(dftt.format(tienThua) + " VND");
                        }
                    }
                }
                if (checkQR == 0) {
                    JOptionPane.showMessageDialog(this, "SP khong co trong gio hang");
                    ketqua.setText("");
                }
            }
        } while (true);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }
}

class RadioButtonRenderer implements TableCellRenderer {

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        if (value == null) {
            return null;
        }
        return (Component) value;
    }
}

class RadioButtonEditor extends DefaultCellEditor implements ItemListener {

    private JCheckBox button;

    public RadioButtonEditor(JCheckBox checkBox) {
        super(checkBox);
    }

    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        if (value == null) {
            return null;
        }
        button = (JCheckBox) value;
        button.addItemListener(this);
        return (Component) value;
    }

    public Object getCellEditorValue() {
        button.removeItemListener(this);
        return button;
    }

    public void itemStateChanged(ItemEvent e) {
        super.fireEditingStopped();
    }
}
