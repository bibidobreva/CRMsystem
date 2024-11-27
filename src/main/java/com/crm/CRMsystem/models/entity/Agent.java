package com.crm.CRMsystem.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity
public class Agent extends BaseEntity{
    @Column(nullable = false, name = "first_name")
    private String firstName;

    @Column(nullable = false, name = "last_name")
    private String lastName;

    @Column
    private boolean isAvailable;

    @Column(name = "agent_id")
    private Long agentID;


}
