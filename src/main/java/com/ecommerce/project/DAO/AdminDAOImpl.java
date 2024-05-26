package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Admin;
import com.ecommerce.project.service.AdminService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AdminDAOImpl implements AdminDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public Admin getAdminById(int id) {
        Admin admin = entityManager.find(Admin.class, id);
        return admin;
    }

    @Override
    public Admin login(String username, String password) {
        Admin adminUser = (Admin) entityManager.createQuery("SELECT a FROM Admin a WHERE a.userName = :username and a.password = :password")
                .setParameter("username", username)
                .setParameter("password", password)
                .getSingleResult();
        return adminUser;
    }

    @Override
    public Admin updateUsername(Admin admin) {
       Admin updateAmin = entityManager.merge(admin);
       return updateAmin;
    }

    @Override
    public Admin register(Admin admin) {
        Admin newAdmin = entityManager.merge(admin);
        return newAdmin;
    }

    @Override
    public List<Admin> getAllAdmins() {
        TypedQuery<Admin> allAdmins = entityManager.createQuery("FROM Admin", Admin.class);
        List<Admin> adminList = allAdmins.getResultList();
        return adminList;
    }
}
