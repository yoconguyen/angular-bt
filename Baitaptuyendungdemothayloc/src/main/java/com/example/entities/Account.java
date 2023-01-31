package com.example.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Account")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "account")
    private String account;

    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private String role;
}
