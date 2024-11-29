package com.example.demomvc.repository;

import com.example.demomvc.entity.TotNghiep;
import com.example.demomvc.entity.TotNghiepId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TotNghiepRepository extends JpaRepository<TotNghiep, TotNghiepId> {
}
