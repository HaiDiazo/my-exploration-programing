package com.donatelo.spring.crud.account.service;

import com.donatelo.spring.crud.account.entity.Account;
import com.donatelo.spring.crud.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceMe {

    @Autowired
    private AccountRepository repository;


    public Account signUp(Account account)
    {
        return repository.save(account);
    }

    public List<Account> getAllAccount()
    {
        return repository.findAll();
    }

    public Account getProfileById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public Account getProfileByName(String username)
    {
        return repository.findByUsername(username);
    }

    public Account updateProfile(Account account)
    {
        Account existAccount = repository.findById(account.getId()).orElse(null);
        existAccount.setEmail(account.getEmail());
        existAccount.setUsername((account.getUsername()));
        existAccount.setPassword(account.getPassword());
        return repository.save(existAccount);
    }

    public String deleteAccount(int id)
    {
        repository.deleteById(id);
        return "Delete Account Success Id:" + id;
    }
}
