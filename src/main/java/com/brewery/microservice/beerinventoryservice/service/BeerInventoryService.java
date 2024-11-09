package com.brewery.microservice.beerinventoryservice.service;

import com.brewery.microservice.beerinventoryservice.web.model.BeerInventoryDto;

import java.util.List;
import java.util.UUID;

public interface BeerInventoryService {
    List<BeerInventoryDto> getBeerById(UUID beerId);
}
