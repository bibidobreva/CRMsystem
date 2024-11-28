package com.crm.CRMsystem.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity
public class Department extends BaseEntity{

    @Column
    private String name;

    @Column
    private String description;
}
