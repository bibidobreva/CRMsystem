package com.crm.CRMsystem.models.entity;

import com.crm.CRMsystem.models.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Table
@Entity
public class Ticket extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(nullable = false)
    private LocalDate date;

    @OneToOne
    @Column
    private Client client;

    @OneToMany
    @Column
    private List<Agent> agents;
    
}
