package com.bevco.bevcobrewery.services.impl;

import com.bevco.bevcobrewery.services.BeerService;
import com.bevco.bevcobrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static java.util.UUID.randomUUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .beerId(randomUUID())
                .beerName("Amstel")
                .beerStyle("Pale Ale")
                .build();
    }
}
