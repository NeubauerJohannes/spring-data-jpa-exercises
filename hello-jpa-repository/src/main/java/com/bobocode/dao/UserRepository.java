package com.bobocode.dao;

import com.bobocode.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * This interface represents a data access object (DAO) for {@link User}.
 * <p>
 * todo: 1. Configure {@link UserRepository} as {@link JpaRepository} for class User
 */


public interface UserRepository extends JpaRepository<User,Long> {


}
