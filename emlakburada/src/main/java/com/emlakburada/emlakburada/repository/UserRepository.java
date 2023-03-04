package com.emlakburada.emlakburada.repository;

import com.emlakburada.emlakburada.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}