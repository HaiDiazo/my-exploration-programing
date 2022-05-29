package com.donatelo.spring.crud.account.service;

import com.donatelo.spring.crud.account.entity.Account;
import com.donatelo.spring.crud.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Login {

    @Autowired
    private AccountRepository repository;

    public Account login(String username, String password)
    {
        Account account = repository.findByUsernameAndPassword(username, password);
        return account;
    }
}
