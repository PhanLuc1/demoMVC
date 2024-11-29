package com.example.demomvc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "NGANH")
@Data
public class Nganh {

    @Id
    @Column(name = "MaNganh", nullable = false)
    private Integer maNganh;

    @Column(name = "TenNganh", nullable = false)
    private String tenNganh;

    @Column(name = "LoaiNganh")
    private String loaiNganh;
}
