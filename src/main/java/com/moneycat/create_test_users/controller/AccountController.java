package com.moneycat.create_test_users.controller;

import com.moneycat.create_test_users.entity.Account;
import com.moneycat.create_test_users.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api/v1/account")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AccountController {

    private final AccountService service;


    @GetMapping("/create")
    public ModelAndView showCreateForm(Model model) {
        model.addAttribute("account", new Account());
        return new ModelAndView("create_user");
    }
//
//    @PostMapping("/create")
//    public String createUser(Model model) {
//        model.addAttribute("createdUser",service.createAccount())
//        return "redirect:/create";
//    }


}

