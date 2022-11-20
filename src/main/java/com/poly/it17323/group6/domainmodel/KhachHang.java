package com.poly.it17323.group6.domainmodel;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name = "KhachHang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KhachHang implements Serializable {

    @Id
    @Column(name = "IdKH")
    @GeneratedValue
    private UUID idKH;

    @Column(name = "MaKH")
    private String maKH;

    @Column(name = "HoVaTen")
    private String hoTen;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "NgaySua")
    private Date ngaySua;

}
