/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.hibernateconfig;

import com.poly.it17323.group6.repository.ThongKeRepository;
import com.poly.it17323.group6.response.ThongKeResponse;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Admin
 */
public class BieuDoThongKe {
   
    //List<HoaDon> lst = new ArrayList<>();
    private ThongKeRepository tkeRepo = null;
    public BieuDoThongKe() {

        tkeRepo = new ThongKeRepository();
    }
    
    public void Char1(JPanel jpanelItem1){
        List<Object[]> lst = tkeRepo.DoanhThuChart();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (lst != null) {
            for (Object[] hd : lst) {
                ThongKeResponse tke = new ThongKeResponse();
                tke.setNgayTao((Date)hd[0]);
                BigDecimal big = (BigDecimal) hd[1];
                tke.setTong(big);
                Double d = tke.getTong().doubleValue();
                dataset.addValue(d, "Doanh Thu", tke.getNgayTao());
            }
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
        List<Object[]> lst = tkeRepo.NhanVienChart();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (lst != null) {
            for (Object[] hd : lst) {
                ThongKeResponse tke = new ThongKeResponse();
                tke.setTenNV((String) hd[0]);
                BigDecimal big = (BigDecimal) hd[1];
                tke.setTong(big);
                Double d = tke.getTong().doubleValue();
                dataset.addValue(d, "Doanh Thu", tke.getTenNV());
            }
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
        List<Object[]> lst = tkeRepo.SanPhamChart();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (lst != null) {
            for (Object[] hd : lst) {
                ThongKeResponse tke = new ThongKeResponse();
                tke.setTenSP((String) hd[0]);
                BigDecimal big = (BigDecimal) hd[1];
                tke.setTong(big);
                Double d = tke.getTong().doubleValue();
                dataset.addValue(d, "Doanh Thu", tke.getTenSP());
            }
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
}
