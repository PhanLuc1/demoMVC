package com.example.demomvc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TRUONG")
@Data
public class Truong {

    @Id
    @Column(name = "MaTruong", nullable = false)
    private Integer maTruong;

    @Column(name = "TenTruong", nullable = false)
    private String tenTruong;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "SoDT")
    private String soDT;
}
