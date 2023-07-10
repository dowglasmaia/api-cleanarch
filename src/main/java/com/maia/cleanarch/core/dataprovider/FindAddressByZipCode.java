package com.maia.cleanarch.core.dataprovider;

import com.maia.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find (final String zipCode);
}
