package com.moneycat.create_test_users.controller;

import com.moneycat.create_test_users.dto.UserCreateRequest;
import com.moneycat.create_test_users.entity.User;
import com.moneycat.create_test_users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserService service;
    @GetMapping("/main")
    public String showCreateForm(Model model) {
        User newAccount = new User();
        model.addAttribute("account", newAccount);
        return "create_user";
    }
    @PostMapping("/create")
    public String createUser(@ModelAttribute("name") String name, @ModelAttribute("email") String email, @ModelAttribute("password") String password) {
        service.createUser(new UserCreateRequest(name, email, password));
        return "redirect:/main";
    }

}

