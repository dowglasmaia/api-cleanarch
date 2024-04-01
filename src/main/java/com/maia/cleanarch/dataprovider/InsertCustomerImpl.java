package com.maia.cleanarch.dataprovider;

import com.maia.cleanarch.core.dataprovider.InsertCustomer;
import com.maia.cleanarch.core.domain.Customer;
import com.maia.cleanarch.dataprovider.repository.CustomerRepository;
import com.maia.cleanarch.dataprovider.repository.mapper.CustomerMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class InsertCustomerImpl implements InsertCustomer {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerMapper.toCustomerEntity(customer);
        try {
            customerRepository.save(customerEntity);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Failed to save Customer. {}", customer);
        }
    }
}

