package com.ecommerce.project.service;

import com.ecommerce.project.DAO.AdminDAO;
import com.ecommerce.project.entities.Admin;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminDAO adminDAO;

    @Autowired
    AdminServiceImpl(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }
    @Override
    public Admin getAdminById(int id) {
        return adminDAO.getAdminById(id);
    }

    @Override
    @Transactional
    public Admin login(String username, String password) {
        return adminDAO.login(username, password);
    }

    @Override
    @Transactional
    public Admin updateUsername(int id, String username) {
        return adminDAO.updateUsername(id, username);
    }

    @Override
    @Transactional
    public Admin register(Admin admin) {
        return adminDAO.register(admin);
    }
}
