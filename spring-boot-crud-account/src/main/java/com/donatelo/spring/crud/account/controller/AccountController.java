package com.donatelo.spring.crud.account.controller;

import com.donatelo.spring.crud.account.entity.Account;
import com.donatelo.spring.crud.account.service.AccountServiceMe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountServiceMe service;

    @PostMapping("/signUp")
    public Account signUp(@RequestBody Account account)
    {
        return service.signUp(account);
    }

    @GetMapping("/allAccount")
    public List<Account> getAllAccount()
    {
        return service.getAllAccount();
    }

    @PutMapping("/updateProfile")
    public Account updateProfile(@RequestBody Account account)
    {
        return service.updateProfile(account);
    }

    @GetMapping("/profile/{id}")
    public Account getProfile(@PathVariable int id)
    {
        return service.getProfileById(id);
    }

    @GetMapping("/search/{name}")
    public Account getProfileName(@PathVariable String name)
    {
        return service.getProfileByName(name);
    }

    @DeleteMapping("/deleteAccount/{id}")
    public String deleteAccount(@PathVariable int id)
    {
        return service.deleteAccount(id);
    }
}
