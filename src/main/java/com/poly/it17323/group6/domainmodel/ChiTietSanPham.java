package com.poly.it17323.group6.domainmodel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author pdanh
 */
@Entity
@Table(name = "ChiTietSP")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChiTietSanPham implements Serializable {

    @Id
    @Column(name = "IdCTSP")
    @GeneratedValue
    private UUID id;

    @Column(name = "SoLuongTon")
    private Integer slTon;

    @Column(name = "Gia")
    private BigDecimal gia;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "TinhTrang")
    private Integer tinhTrang;

    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "NgaySua")
    private Date ngaySua;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdSP", referencedColumnName = "IdSP")
    private SanPham sanPham;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdLoaiSP", referencedColumnName = "IdLoaiSP")
    private LoaiSP loaiSP;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCL", referencedColumnName = "IdCL")
    private ChatLieu chatLieu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdSize", referencedColumnName = "IdSize")
    private Size size;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdMau", referencedColumnName = "IdMau")
    private MauSac mauSac;
}
