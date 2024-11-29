package com.example.demomvc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class CongViecId implements Serializable {
    private String soCMND;
    private Date ngayVaoCongTy;

    public CongViecId() {}

    public CongViecId(String soCMND, Date ngayVaoCongTy) {
        this.soCMND = soCMND;
        this.ngayVaoCongTy = ngayVaoCongTy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CongViecId that = (CongViecId) o;
        return Objects.equals(soCMND, that.soCMND) &&
                Objects.equals(ngayVaoCongTy, that.ngayVaoCongTy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soCMND, ngayVaoCongTy);
    }
}
