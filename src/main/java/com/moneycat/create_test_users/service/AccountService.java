package com.moneycat.create_test_users.service;

import com.moneycat.create_test_users.entity.Account;
import com.moneycat.create_test_users.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AccountService {

    private final AccountRepository repository;

    public Account createAccount(Account account) {
        Account newAccount = Account.builder()
                .username(account.getUsername())
                .password(account.getPassword())
                .email(account.getEmail())
                .build();
        repository.save(newAccount);
        return newAccount;
    }

}
