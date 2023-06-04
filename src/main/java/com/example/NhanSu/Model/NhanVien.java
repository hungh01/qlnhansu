package com.example.NhanSu.Model;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "NhanVien")
public class NhanVien{
    @Id
    private String Ma_NV;

    @Column(name= "Ten_NV")
    private String Ten_NV;

    @Column(name= "Phai")
    private String Phai;

    @Column(name= "Noi_Sinh")
    private String Noi_Sinh;

    @Column(name= "Luong")
    private Integer Luong;

    @Fetch(FetchMode.JOIN)
    @ManyToOne
    @JoinColumn(name="MaPhong")
    private PhongBan phongBan;

    @Fetch(FetchMode.JOIN)
    @ManyToOne
    @JoinColumn(name="Id")
    private User user;

    public NhanVien() {
    }

    public NhanVien(String Ma_NV, String Ten_NV, String Phai, String Noi_Sinh, Integer Luong, PhongBan phongBan) {
        this.Ma_NV = Ma_NV;
        this.Ten_NV = Ten_NV;
        this.Phai = Phai;
        this.Noi_Sinh = Noi_Sinh;
        this.Luong = Luong;
        this.phongBan = phongBan;
    }

    public String getMa_NV() {
        return this.Ma_NV;
    }

    public void setMa_NV(String Ma_NV) {
        this.Ma_NV = Ma_NV;
    }

    public String getTen_NV() {
        return this.Ten_NV;
    }

    public void setTen_NV(String Ten_NV) {
        this.Ten_NV = Ten_NV;
    }

    public String getPhai() {
        return this.Phai;
    }

    public void setPhai(String Phai) {
        this.Phai = Phai;
    }

    public String getNoi_Sinh() {
        return this.Noi_Sinh;
    }

    public void setNoi_Sinh(String Noi_Sinh) {
        this.Noi_Sinh = Noi_Sinh;
    }

    public Integer getLuong() {
        return this.Luong;
    }

    public void setLuong(Integer Luong) {
        this.Luong = Luong;
    }

    public PhongBan getPhongBan() {
        return this.phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public NhanVien Ma_NV(String Ma_NV) {
        setMa_NV(Ma_NV);
        return this;
    }

    public NhanVien Ten_NV(String Ten_NV) {
        setTen_NV(Ten_NV);
        return this;
    }

    public NhanVien Phai(String Phai) {
        setPhai(Phai);
        return this;
    }

    public NhanVien Noi_Sinh(String Noi_Sinh) {
        setNoi_Sinh(Noi_Sinh);
        return this;
    }

    public NhanVien Luong(Integer Luong) {
        setLuong(Luong);
        return this;
    }

    public NhanVien phongBan(PhongBan phongBan) {
        setPhongBan(phongBan);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NhanVien)) {
            return false;
        }
        NhanVien nhanVien = (NhanVien) o;
        return Objects.equals(Ma_NV, nhanVien.Ma_NV) && Objects.equals(Ten_NV, nhanVien.Ten_NV) && Objects.equals(Phai, nhanVien.Phai) && Objects.equals(Noi_Sinh, nhanVien.Noi_Sinh) && Objects.equals(Luong, nhanVien.Luong) && Objects.equals(phongBan, nhanVien.phongBan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Ma_NV, Ten_NV, Phai, Noi_Sinh, Luong, phongBan);
    }

    @Override
    public String toString() {
        return "{" +
            " Ma_NV='" + getMa_NV() + "'" +
            ", Ten_NV='" + getTen_NV() + "'" +
            ", Phai='" + getPhai() + "'" +
            ", Noi_Sinh='" + getNoi_Sinh() + "'" +
            ", Luong='" + getLuong() + "'" +
            ", phongBan='" + getPhongBan() + "'" +
            "}";
    }
    
}