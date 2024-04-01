package com.maia.cleanarch.entrypoint.controller.mapper;

import com.maia.cleanarch.core.domain.Customer;
import com.maia.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.maia.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerRequestMapper {

    Customer toCustomer(CustomerRequest request);
    CustomerResponse toCustomerResponse(Customer response);
}
