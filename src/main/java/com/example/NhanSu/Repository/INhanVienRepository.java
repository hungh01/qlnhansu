package com.example.NhanSu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NhanSu.Model.NhanVien;

@Repository
public interface INhanVienRepository extends JpaRepository<NhanVien, String>{
    
}
