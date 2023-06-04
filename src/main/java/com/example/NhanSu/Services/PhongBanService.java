package com.example.NhanSu.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NhanSu.Model.PhongBan;
import com.example.NhanSu.Repository.IPhongBanRepository;


@Service
public class PhongBanService {
    @Autowired
    private IPhongBanRepository phongBanRepository;

    public List<PhongBan> getAllPhongBans(){
        return phongBanRepository.findAll();    
    }
}
