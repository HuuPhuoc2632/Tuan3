package com.example.Tuan3;

import com.example.Tuan3.Model.KhoaHoc;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/khoahoc")
public class KhoaHocController {
    @GetMapping("/{id}")
    public KhoaHoc getKhoaHoc(@PathVariable String id) {
        KhoaHoc khoaHoc = new KhoaHoc("KH01","Lập trình React Native", "Khóa học chuyên sâu về React Native", 100000.0, 80000.0, null, "Huỳnh Hữu Phước");
        return khoaHoc;
    }

    @PostMapping("/")
    public KhoaHoc createKhoaHoc(@RequestBody KhoaHoc khoaHoc) {
        System.out.println(khoaHoc);
        return khoaHoc;
    }
}
