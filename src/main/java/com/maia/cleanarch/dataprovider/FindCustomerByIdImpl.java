package com.maia.cleanarch.dataprovider;

import com.maia.cleanarch.core.dataprovider.FindCustomerById;
import com.maia.cleanarch.core.domain.Customer;
import com.maia.cleanarch.dataprovider.repository.CustomerRepository;
import com.maia.cleanarch.dataprovider.repository.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {
    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerMapper mapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = repository.findById(id);
        return customerEntity.map(entity -> mapper.toCustomer(entity));
    }
}
