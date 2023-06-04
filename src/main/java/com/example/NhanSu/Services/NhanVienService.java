package com.example.NhanSu.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NhanSu.Model.NhanVien;
import com.example.NhanSu.Repository.INhanVienRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienService {
    @Autowired
    private INhanVienRepository nhanVienRepository;

    public List<NhanVien> getAllNhanViens(){
        return nhanVienRepository.findAll();
    }

    public NhanVien getNhanVienById(String id) {
        Optional<NhanVien> optional = nhanVienRepository.findById(id);
        return optional.orElse(null);
    }
    public void save(NhanVien nhanVien) {
        nhanVienRepository.save(nhanVien);
    }
    public void deleteNhanVien(String id){
        nhanVienRepository.deleteById(id);
    }
}
