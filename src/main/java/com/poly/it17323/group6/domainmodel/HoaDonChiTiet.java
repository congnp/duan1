package com.poly.it17323.group6.domainmodel;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "HoaDonCT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HoaDonChiTiet implements Serializable {

    @Id
    @Column(name = "IdHDCT")
    @GeneratedValue
    private UUID idHDCT;

    @Column(name = "Gia")
    private BigDecimal gia;

    @Column(name = "SoLuongMua")
    private Integer slMua;

    @Column(name = "GiaKM")
    private BigDecimal giaKM;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdHD", referencedColumnName = "IdHD")
    private HoaDon hoaDon;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdKM", referencedColumnName = "IdKM")
    private KhuyenMai khuyenMai;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCTSP", referencedColumnName = "IdCTSP")
    private ChiTietSanPham chiTietSanPham;
}
