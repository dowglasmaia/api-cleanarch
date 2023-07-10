package com.maia.cleanarch.core.usecase;

import com.maia.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipCode);
}
