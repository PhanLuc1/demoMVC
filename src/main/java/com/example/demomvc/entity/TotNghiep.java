package com.example.demomvc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TOT_NGHIEP")
@IdClass(TotNghiepId.class) // Composite key
@Data
public class TotNghiep {

    @Id
    @Column(name = "SoCMND", nullable = false)
    private String soCMND;

    @Id
    @Column(name = "MaTruong", nullable = false)
    private Integer maTruong;

    @Id
    @Column(name = "MaNganh", nullable = false)
    private Integer maNganh;

    @ManyToOne
    @JoinColumn(name = "SoCMND", referencedColumnName = "SoCMND", insertable = false, updatable = false)
    private SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "MaTruong", referencedColumnName = "MaTruong", insertable = false, updatable = false)
    private Truong truong;

    @ManyToOne
    @JoinColumn(name = "MaNganh", referencedColumnName = "MaNganh", insertable = false, updatable = false)
    private Nganh nganh;

    @Column(name = "NgayTN")
    private String ngayTN;

    @Column(name = "HeTN")
    private String heTN;

    @Column(name = "LoaiTN")
    private String loaiTN;
}
