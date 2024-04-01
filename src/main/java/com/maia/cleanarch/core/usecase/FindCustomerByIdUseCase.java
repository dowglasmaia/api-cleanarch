package com.maia.cleanarch.core.usecase;

import com.maia.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String Id);
}
