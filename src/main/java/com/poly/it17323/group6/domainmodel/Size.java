package com.poly.it17323.group6.domainmodel;

import java.io.Serializable;
import java.util.UUID;
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
@Table(name = "Size")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Size implements Serializable {

    @Id
    @Column(name = "IdSize")
    @GeneratedValue
    private UUID id;

    @Column(name = "MaSize")
    private String ma;

    @Column(name = "TenSize")
    private String ten;
}
