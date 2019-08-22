package darko.test.msscbrewery.web.mappers;

import darko.test.msscbrewery.domain.Customer;
import darko.test.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerToCustomerDto(CustomerDto customerDto);
}
