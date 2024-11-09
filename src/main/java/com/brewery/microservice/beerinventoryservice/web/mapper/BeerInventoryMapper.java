package com.brewery.microservice.beerinventoryservice.web.mapper;

import com.brewery.microservice.beerinventoryservice.domain.BeerInventory;
import com.brewery.microservice.beerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}