package com.donatelo.spring.crud.account.repository;

import com.donatelo.spring.crud.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByUsername(String username);

    Account findByUsernameAndPassword(String username, String password);
}
