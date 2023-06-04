package com.example.NhanSu.Model;

import java.util.List;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "PhongBan")
public class PhongBan {
    @Id
    private String MaPhong;

    @Column(name = "TenPhong")
    private String TenPhong;

    @Fetch(FetchMode.JOIN)
    @OneToMany(mappedBy = "phongBan", cascade = CascadeType.ALL)
    private List<NhanVien> nhanViens;

    public PhongBan() {
    }

    public PhongBan(String MaPhong, String TenPhong, List<NhanVien> nhanViens) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.nhanViens = nhanViens;
    }

    public String getMaPhong() {
        return this.MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return this.TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public List<NhanVien> getNhanViens() {
        return this.nhanViens;
    }

    public void setNhanViens(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public PhongBan MaPhong(String MaPhong) {
        setMaPhong(MaPhong);
        return this;
    }

    public PhongBan TenPhong(String TenPhong) {
        setTenPhong(TenPhong);
        return this;
    }

    public PhongBan nhanViens(List<NhanVien> nhanViens) {
        setNhanViens(nhanViens);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhongBan)) {
            return false;
        }
        PhongBan phongBan = (PhongBan) o;
        return Objects.equals(MaPhong, phongBan.MaPhong) && Objects.equals(TenPhong, phongBan.TenPhong) && Objects.equals(nhanViens, phongBan.nhanViens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MaPhong, TenPhong, nhanViens);
    }

    @Override
    public String toString() {
        return "{" +
            " MaPhong='" + getMaPhong() + "'" +
            ", TenPhong='" + getTenPhong() + "'" +
            ", nhanViens='" + getNhanViens() + "'" +
            "}";
    }

    
}
