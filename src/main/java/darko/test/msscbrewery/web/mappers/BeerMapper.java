package darko.test.msscbrewery.web.mappers;

import darko.test.msscbrewery.domain.Beer;
import darko.test.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
