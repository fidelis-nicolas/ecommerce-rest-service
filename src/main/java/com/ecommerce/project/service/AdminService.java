package com.ecommerce.project.service;

import com.ecommerce.project.entities.Admin;
import com.ecommerce.project.errors.AdminErrors;
import com.ecommerce.project.errors.CustomerErrors;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    Admin getAdminById(int id) throws AdminErrors;

    Admin login (String username, String password);

    Admin updateUsername(Admin admin);

    Admin register(Admin admin);

    List<Admin> getAllAdmins();
}
