package com.emlakburada.emlakburadaemail.repository;

import com.emlakburada.emlakburadaemail.domain.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {

}