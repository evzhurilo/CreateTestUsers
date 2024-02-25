package com.moneycat.create_test_users.service;

import com.moneycat.create_test_users.dto.UserCreateRequest;
import com.moneycat.create_test_users.entity.User;
import com.moneycat.create_test_users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserRepository repository;

    public User createUser(UserCreateRequest request) {
        User newUser = User.builder()
                .name(request.name())
                .email(request.email())
                .password(request.password())
                .build();
        repository.save(newUser);
        return newUser;
    }

}
