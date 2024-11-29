package com.example.demomvc.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultDTO {
    private String soCMND;
    private String hoTen;
    private String maNganhTotNghiep;
    private String maTruongTotNghiep;
    private String maNganhCongTy;
    private String tenCongTy;
    private String thoiGianLamViec;
}