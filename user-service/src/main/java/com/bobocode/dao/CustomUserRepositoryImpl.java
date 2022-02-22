package com.bobocode.dao;


import com.bobocode.model.Role;
import com.bobocode.model.RoleType;
import com.bobocode.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
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
        //query? oder ähnliches, um alle User zu bekommen, dann .addRoleType
        javax.persistence.Query q = entityManager.createQuery("SELECT u from User u");
        List<User> users = q.getResultList();
        for (User u : users) {
            u.addRole(Role.valueOf(roleType));
        }

    }

    /*@Query("select u from User u")
    public Optional<ArrayList<User> > users(){

    }
    */

}
