package com.example.NhanSu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NhanSu.Model.PhongBan;

@Repository
public interface IPhongBanRepository extends JpaRepository<PhongBan, String>{
    
}
