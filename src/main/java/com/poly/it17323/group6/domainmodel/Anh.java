package com.poly.it17323.group6.domainmodel;

import java.io.Serializable;
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
@Table(name = "Anh")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Anh implements Serializable {

    @Id
    @Column(name = "IdAnh")
    @GeneratedValue
    private UUID idAnh;

    @Column(name = "MaAnh")
    private String maAnh;

    @Column(name = "TenAnh")
    private String tenAnh;

    @Column(name = "DuongDanAnh")
    private byte[] linkAnh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCTSP", referencedColumnName = "IdCTSP")
    private ChiTietSanPham chiTietSanPham;
}
