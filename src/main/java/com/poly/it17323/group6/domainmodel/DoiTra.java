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
@Table(name = "DoiTra")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoiTra implements Serializable {

    @Id
    @Column(name = "IdDoiTra")
    @GeneratedValue
    private UUID idDT;

    @Column(name = "LyDoDoiTra")
    private String lyDoDT;

    @Column(name = "NgayDoiTra")
    private Date ngayDT;

    @Column(name = "HanDoiTra")
    private Date hanDT;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDHD", referencedColumnName = "IdHD")
    private HoaDon hoaDon;
}
