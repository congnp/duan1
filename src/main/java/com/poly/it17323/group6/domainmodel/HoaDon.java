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
import javax.persistence.OneToOne;
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
@Table(name = "HoaDon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HoaDon implements Serializable {

    @Id
    @Column(name = "IdHD")
    @GeneratedValue
    private UUID idHD;

    @Column(name = "MaHD")
    private String maHD;

    @Column(name = "PhuongThucTT")
    private Integer pttt;

    @Column(name = "TongTienMat")
    private BigDecimal tongTienMat;

    @Column(name = "TongTienCk")
    private BigDecimal tongTienCK;

    @Column(name = "TinhTrang")
    private Integer tinhTrang;

    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "NgayThanhToan")
    private Date ngayTT;

    @Column(name = "TTTT")
    private Integer tttt;

    @Column(name = "NgayMuonNhan")
    private Date ngayMuonNhan;

    @Column(name = "NgayGui")
    private Date ngayGui;

    @Column(name = "NgayNhan")
    private Date ngayNhan;

    @Column(name = "TienShip")
    private BigDecimal tienShip;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdND", referencedColumnName = "Id")
    private NguoiDung nguoiDung;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdKH", referencedColumnName = "IdKH")
    private KhachHang khachHang;

}
