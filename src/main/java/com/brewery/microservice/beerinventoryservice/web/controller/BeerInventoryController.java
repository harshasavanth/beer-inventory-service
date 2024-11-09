package com.brewery.microservice.beerinventoryservice.web.controller;

import com.brewery.microservice.beerinventoryservice.service.BeerInventoryService;
import com.brewery.microservice.beerinventoryservice.web.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
public class BeerInventoryController {

    private final BeerInventoryService beerInventoryService;


    @GetMapping("/api/v1/beer/{beerId}/inventory")
    public ResponseEntity<List<BeerInventoryDto>> listBeersById(@PathVariable UUID beerId) {
        System.out.println();
        return new ResponseEntity<List<BeerInventoryDto>>(beerInventoryService.getBeerById(beerId), HttpStatus.OK);

    }
}