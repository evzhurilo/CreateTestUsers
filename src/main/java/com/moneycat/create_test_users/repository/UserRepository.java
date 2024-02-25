package com.moneycat.create_test_users.repository;

import com.moneycat.create_test_users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
