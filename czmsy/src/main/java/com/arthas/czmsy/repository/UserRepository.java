package com.arthas.czmsy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthas.czmsy.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
