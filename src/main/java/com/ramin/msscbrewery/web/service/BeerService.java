package com.ramin.msscbrewery.web.service;

import com.ramin.msscbrewery.web.model.BeerDto;
import java.util.UUID;

/**
 * [description]
 *
 * @author Ramin.Farazandeh
 */
public interface BeerService {

	BeerDto getBeerById(UUID beerId);
}
