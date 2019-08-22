package darko.test.msscbrewery.services;

import darko.test.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    public BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
