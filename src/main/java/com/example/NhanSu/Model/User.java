package com.example.NhanSu.Model;

import java.util.List;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


import jakarta.persistence.*;


@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name ="role")
    private String role;

    @Fetch(FetchMode.JOIN)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<NhanVien> nhanViens;
}
