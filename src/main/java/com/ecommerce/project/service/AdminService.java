package com.ecommerce.project.service;

import com.ecommerce.project.entities.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    Admin getAdminById(int id);

    Admin login (String username, String password);

    Admin updateUsername(int id, String username);

    Admin register(Admin admin);
}
