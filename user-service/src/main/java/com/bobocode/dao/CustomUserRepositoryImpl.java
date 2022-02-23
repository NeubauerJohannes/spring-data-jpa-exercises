package com.bobocode.dao;


import com.bobocode.model.Role;
import com.bobocode.model.RoleType;
import com.bobocode.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository

public class CustomUserRepositoryImpl implements CustomUserRepository {
    @PersistenceContext
    private EntityManager entityManager;


    public void addRoleToAllUsers(RoleType roleType) {
        javax.persistence.Query q = entityManager.createQuery("SELECT u from User u");
        List<User> users = q.getResultList();
        for (User u : users) {
           if(!hasRole(u, roleType)){
               u.addRole(Role.valueOf(roleType));
           }
        }
    }

    private boolean hasRole(User u, RoleType roleType){
        for (Role r : u.getRoles()) {
            if (r.getRoleType().equals(roleType)) {
                return true;
            }
        }
        return false;
    }


}
