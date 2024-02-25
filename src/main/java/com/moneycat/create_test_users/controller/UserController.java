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
@RequestMapping("/api/v1/account")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService service;


//    @GetMapping("/main")
//    public ModelAndView showCreateForm(Model model) {
//        model.addAttribute("account", new Account());
//        return new ModelAndView("create_user");
//    }

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

//    @PostMapping("/create")
//    public void createUser(@ModelAttribute String username, @ModelAttribute String email, @ModelAttribute String password) {
//        Account newAcccount = Account.builder()
//                .username(username)
//                .email(email)
//                .password(password)
//                .build();
//        service.createAccount(newAcccount);
//    }


}

