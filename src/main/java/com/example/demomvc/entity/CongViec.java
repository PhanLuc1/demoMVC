package com.example.demomvc.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "CONG_VIEC")
@IdClass(CongViecId.class) // Composite key
@Data
public class CongViec {

    @Id
    @Column(name = "SoCMND", nullable = false)
    private String soCMND;

    @Id
    @Column(name = "NgayVaoCongTy", nullable = false)
    private Date ngayVaoCongTy;

    @ManyToOne
    @JoinColumn(name = "SoCMND", referencedColumnName = "SoCMND", insertable = false, updatable = false)
    private SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "MaNganh", referencedColumnName = "MaNganh", nullable = false)
    private Nganh nganh;

    @Column(name = "TenCongTy")
    private String tenCongTy;

    @Column(name = "DiaChiCongTy")
    private String diaChiCongTy;

    @Column(name = "ThoiGianLamViec")
    private String thoiGianLamViec;
}
