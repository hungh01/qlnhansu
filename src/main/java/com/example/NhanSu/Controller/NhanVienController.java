package com.example.NhanSu.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.NhanSu.Model.NhanVien;
import com.example.NhanSu.Services.NhanVienService;
import com.example.NhanSu.Services.PhongBanService;

@Controller
@RequestMapping
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private PhongBanService phongBanService;

    @GetMapping
    public String ShowAllNhanViens(Model model){
        List<NhanVien> nhanViens = nhanVienService.getAllNhanViens();
        model.addAttribute("nhanViens", nhanViens);
        return "nhanvien/list";
    }

    @GetMapping("/add")
    public String addNhanVienForm(Model model){
        model.addAttribute("nhanVien", new NhanVien());
        model.addAttribute("phongBans", phongBanService.getAllPhongBans());
        return "nhanvien/add";
    }
    @PostMapping("/add")
    public String addNhanVien(@ModelAttribute("nhanVien") NhanVien nhanVien){
        nhanVienService.save(nhanVien);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editNhanVienForm(@PathVariable("id") String id,Model model){
        NhanVien editnhanVien = null;
        for (NhanVien nhanVien: nhanVienService.getAllNhanViens())
            if(nhanVien.getMa_NV().equals(id))
                editnhanVien = nhanVien;
        if(editnhanVien!= null){
            model.addAttribute("nhanVien", editnhanVien);
            model.addAttribute("phongBans", phongBanService.getAllPhongBans());
            return "nhanvien/edit";
        }else
            return "not-found!";
    }
    @PostMapping("/edit/{id}")
    public String editNhanVien(@PathVariable("id") String id, @ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienService.save(nhanVien);
        return "redirect:/";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteNhanVien(@PathVariable("id") String id){
        nhanVienService.deleteNhanVien(id);
        return "redirect:/";
    }
}
