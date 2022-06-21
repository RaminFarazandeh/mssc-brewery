package com.ramin.msscbrewery.web.service;

import com.ramin.msscbrewery.web.model.BeerDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 * [description]
 *
 * @author Ramin.Farazandeh
 */
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
	}
}
