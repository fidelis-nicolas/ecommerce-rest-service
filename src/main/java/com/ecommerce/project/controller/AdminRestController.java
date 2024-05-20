package com.ecommerce.project.controller;

import com.ecommerce.project.entities.Admin;
import com.ecommerce.project.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("api/admin")
public class AdminRestController {


    private final AdminService adminService;

    @Autowired
    public AdminRestController(AdminService adminService){
        this.adminService = adminService;
    }

    @PostMapping("register")
    public Admin registerAdmin(@RequestBody Admin admin){
        return adminService.register(admin);
    }

    @GetMapping("{id}")
    public Admin getAdminById(@PathVariable int id){
        return adminService.getAdminById(id);
    }

    @PostMapping("login")
    public Admin login(@RequestBody Admin admin){
        String username = admin.getUserName();
        String password = admin.getPassword();
        return adminService.login(username, password);
    }

    @PostMapping("update")
    public Admin update(@RequestBody Admin admin){
        int id = admin.getId();
        String username = admin.getUserName();
        return adminService.updateUsername(id, username);
    }



}
