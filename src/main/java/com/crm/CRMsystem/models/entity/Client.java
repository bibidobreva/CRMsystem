package com.crm.CRMsystem.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity
public class Client extends BaseEntity{

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, name = "first_name")
    private String firstName;

    @Column(nullable = true, name = "middle_name")
    private String middleName;

    @Column(nullable = true, name = "last_name")
    private String lastName;

    @Column(nullable = false)
    private String email;


}
