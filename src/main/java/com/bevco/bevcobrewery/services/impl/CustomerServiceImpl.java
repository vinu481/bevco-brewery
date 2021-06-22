package com.bevco.bevcobrewery.services.impl;

import com.bevco.bevcobrewery.services.CustomerService;
import com.bevco.bevcobrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static java.util.UUID.randomUUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(randomUUID())
                .name("Vinu")
                .build();
    }
}
