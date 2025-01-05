package com.crm.CRMsystem.service;

import com.crm.CRMsystem.repositories.AgentRepository;
import com.crm.CRMsystem.util.PasswordUtils;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AgentService {
    private final AgentRepository agentRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public AgentService(AgentRepository agentRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.agentRepository = agentRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }

    private String generatePassword(){

        return PasswordUtils.generatePassword();
    }

}
