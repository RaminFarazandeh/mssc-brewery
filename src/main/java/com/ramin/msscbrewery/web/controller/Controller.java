package com.ramin.msscbrewery.web.controller;

import com.ramin.msscbrewery.web.model.BeerDto;
import com.ramin.msscbrewery.web.service.BeerService;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [description]
 *
 * @author Ramin.Farazandeh
 */
@RequestMapping("/api/v1/beer")
@RestController
public class Controller {

	private final BeerService beerService;

	public Controller(BeerService beerService) {
		this.beerService = beerService;
	}

	@GetMapping("/beerId")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {

		return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
	}

}
