package com.example.demomvc.repository;

import com.example.demomvc.entity.CongViec;
import com.example.demomvc.entity.CongViecId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CongViecRepository extends JpaRepository<CongViec, CongViecId> {
}
