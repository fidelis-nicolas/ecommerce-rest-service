package com.ecommerce.project.DAO;

import com.ecommerce.project.entities.Admin;
import com.ecommerce.project.service.AdminService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public Admin updateUsername(int id, String username) {
        entityManager.createQuery("UPDATE Admin a SET a.userName = :username WHERE a.id = :id")
                .setParameter("username", username)
                .setParameter("id", id)
                .executeUpdate();
        return entityManager.find(Admin.class, id);
    }

    @Override
    public Admin register(Admin admin) {
        Admin newAdmin = entityManager.merge(admin);
        return newAdmin;
    }
}
