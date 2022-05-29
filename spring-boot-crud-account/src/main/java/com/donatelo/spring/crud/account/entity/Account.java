package com.donatelo.spring.crud.account.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ACCOUNT_TB")
public class Account {

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    private String email;

}
