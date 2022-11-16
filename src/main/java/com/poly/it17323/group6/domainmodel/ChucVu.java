package com.poly.it17323.group6.domainmodel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "ChucVu")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChucVu implements Serializable {
    
    @Id
    @Column(name = "IdCV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idCV;

    @Column(name = "MaCV")
    private String maCV;

    @Column(name = "TenCV")
    private String tenCV;
}
