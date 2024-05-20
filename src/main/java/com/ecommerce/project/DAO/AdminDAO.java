package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Admin;

public interface AdminDAO {
    Admin getAdminById(int id);

    Admin login (String username, String password);

    Admin updateUsername(Admin admin);

    Admin register(Admin admin);
}
