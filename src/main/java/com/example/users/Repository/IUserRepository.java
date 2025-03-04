package com.example.users.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.users.Entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{

}
