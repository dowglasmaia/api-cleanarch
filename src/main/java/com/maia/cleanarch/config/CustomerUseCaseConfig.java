package com.maia.cleanarch.config;

import com.maia.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.maia.cleanarch.core.dataprovider.FindCustomerById;
import com.maia.cleanarch.core.dataprovider.InsertCustomer;
import com.maia.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.maia.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerUseCaseConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCode findAddressByZipCode,
            InsertCustomer insertCustomer
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);
    }

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerById findCustomerById
    ) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }

}
