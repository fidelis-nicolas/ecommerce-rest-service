package com.ecommerce.project.service;

import com.ecommerce.project.DAO.AdminDAO;
import com.ecommerce.project.entities.Admin;
import com.ecommerce.project.errors.CustomerErrors;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Logger;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminDAO adminDAO;

    @Autowired
    AdminServiceImpl(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }
    @Override
    public Admin getAdminById(int id) throws CustomerErrors {
        Admin admin = adminDAO.getAdminById(id);
        if(admin==null) {
            throw new CustomerErrors("Admin with " + id + " does not exist");

        }
        return admin;
    }

    @Override
    @Transactional
    public Admin login(String username, String password) {
        return adminDAO.login(username, password);
    }

    @Override
    @Transactional
    public Admin updateUsername(Admin admin) {
        return adminDAO.updateUsername(admin);
    }

    @Override
    @Transactional
    public Admin register(Admin admin) {
        return adminDAO.register(admin);
    }
}
