package com.example.mobileappws.com.example.mobileappws.io.repositories;

import com.example.mobileappws.com.example.mobileappws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
