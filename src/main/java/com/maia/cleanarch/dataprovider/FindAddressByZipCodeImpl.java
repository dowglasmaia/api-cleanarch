package com.maia.cleanarch.dataprovider;

import com.maia.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.maia.cleanarch.core.domain.Address;
import com.maia.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.maia.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {
    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}

