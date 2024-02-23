package com.moneycat.create_test_users.repository;

import com.moneycat.create_test_users.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
