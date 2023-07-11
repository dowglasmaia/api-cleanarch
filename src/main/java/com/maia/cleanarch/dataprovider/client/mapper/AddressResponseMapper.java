package com.maia.cleanarch.dataprovider.client.mapper;

import com.maia.cleanarch.core.domain.Address;
import com.maia.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
