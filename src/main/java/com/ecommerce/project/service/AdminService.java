package com.ecommerce.project.service;

import com.ecommerce.project.entities.Admin;
import com.ecommerce.project.errors.CustomerErrors;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    Admin getAdminById(int id) throws CustomerErrors;

    Admin login (String username, String password);

    Admin updateUsername(Admin admin);

    Admin register(Admin admin);
}
