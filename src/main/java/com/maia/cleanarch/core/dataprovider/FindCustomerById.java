package com.maia.cleanarch.core.dataprovider;

import com.maia.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final String id);
}
