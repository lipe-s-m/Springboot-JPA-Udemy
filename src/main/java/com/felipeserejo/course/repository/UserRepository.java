package com.felipeserejo.course.repository;

import com.felipeserejo.course.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


}
