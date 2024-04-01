package com.maia.cleanarch.dataprovider.repository.mapper;

import com.maia.cleanarch.core.domain.Customer;
import com.maia.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity entity);

}
