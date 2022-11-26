package com.poly.it17323.group6.domainmodel;

import java.io.Serializable;
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
@Table(name = "ChatLieu")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChatLieu implements Serializable {

    @Id
    @Column(name = "IdCL")
    @GeneratedValue
    private UUID idCL;

    @Column(name = "MaCL")
    private String maCL;

    @Column(name = "TenCL")
    private String tenCL;
}
