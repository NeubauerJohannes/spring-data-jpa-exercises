package com.bobocode.dao;


import com.bobocode.model.RoleType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository

public class CustomUserRepositoryImpl {

    void addRoleToAllUsers(RoleType roleType){
        //query? oder ähnliches, um alle User zu bekommen, dann .setRoleType
    }
}
