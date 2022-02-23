package com.bobocode.dao;

import com.bobocode.model.RoleType;
import com.bobocode.service.UserService;
import org.springframework.stereotype.Repository;

/**
 * This class declares custom {@link UserRepository} methods
 * <p>
 * todo: 0. PLEASE NOTE, THAT SOME REQUIRED STEPS ARE OMITTED IN THE TODO LIST AND YOU HAVE TO DO IT ON YOUR OWN
 * <p>
 * todo: 1. Create class called "CustomUserRepositoryImpl"                                          x
 * todo: 2. Mark that class {@link org.springframework.stereotype.Repository}                       x
 * todo: 3. Mark that class {@link org.springframework.transaction.annotation.Transactional}        x
 * todo: 4. Implement method {@link CustomUserRepository#addRoleToAllUsers(RoleType)}               x
 */

public interface CustomUserRepository {
    void addRoleToAllUsers(RoleType roleType);

}
