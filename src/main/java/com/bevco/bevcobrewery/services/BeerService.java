package com.bevco.bevcobrewery.services;

import com.bevco.bevcobrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
