package com.poly.it17323.group6.domainmodel;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "NguoiDung")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NguoiDung implements Serializable {

    @Id
    @Column(name = "Id")
    @GeneratedValue
    private UUID idND;

    @Column(name = "MaND")
    private String maND;

    @Column(name = "TenTK")
    private String tenTK;

    @Column(name = "MatKhau")
    private String matKhau;

    @Column(name = "HoVaTen")
    private String hoTen;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "Email")
    private String email;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "[CCCD/CMT]")
    private String cccd;

    @Column(name = "TinhTrang")
    private Integer tinhTrang;

    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "NgaySua")
    private Date ngaySua;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCV", referencedColumnName = "IdCV")
    private ChucVu chucVu;

}
