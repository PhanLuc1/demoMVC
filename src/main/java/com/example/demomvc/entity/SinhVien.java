package com.example.demomvc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SINHVIEN")
@Data
public class SinhVien {

    @Id
    @Column(name = "SoCMND", nullable = false)
    private String soCMND;

    @Column(name = "HoTen", nullable = false)
    private String hoTen;

    @Column(name = "Email")
    private String email;

    @Column(name = "SoDT")
    private String soDT;

    @Column(name = "DiaChi")
    private String diaChi;
}
