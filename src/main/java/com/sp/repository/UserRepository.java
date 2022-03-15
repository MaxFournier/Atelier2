package com.sp.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sp.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByName (String name);
}
