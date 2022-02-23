package com.bobocode.service;

import com.bobocode.dao.CustomUserRepository;
import com.bobocode.dao.CustomUserRepositoryImpl;
import com.bobocode.dao.UserRepository;
import com.bobocode.exception.EntityNotFoundException;
import com.bobocode.model.RoleType;
import com.bobocode.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This class provides service logic for {@link User}.
 * <p>
 * todo: 0. PLEASE NOTE, THAT SOME REQUIRED STEPS ARE OMITTED IN THE TODO LIST AND YOU HAVE TO DO IT ON YOUR OWN
 * <p>
 * todo: 1. Implement {@link UserService#findByCity(String)} using {@link UserRepository}, make method read only        x
 * todo: 2. Implement {@link UserService#getByEmail(String)} using {@link UserRepository}, make method read only        x
 * todo: 3. In case user is not found by email, throw {@link EntityNotFoundException} with message "Cannot find user by email ${email}" x
 * todo: 4. Implement {@link UserService#addRoleToAllUsers(RoleType)} using {@link UserRepository} x
 */


@Transactional
@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;

    }

    @Transactional(readOnly = true)
    public List<User> findByCity(String city) {
        return userRepository.findAllByAddressCity(city);
    }

    @Transactional(readOnly = true)
    public User getByEmail(String email) throws EntityNotFoundException{

           Optional<User> u = userRepository.userGetByEmail(email);
           if(u.isEmpty()){
               throw new EntityNotFoundException(String.format("Cannot find user by email %s", email));
           }
            return u.get();
        }


        public void addRoleToAllUsers (RoleType roleType){
           userRepository.addRoleToAllUsers(roleType);
        }
    }
