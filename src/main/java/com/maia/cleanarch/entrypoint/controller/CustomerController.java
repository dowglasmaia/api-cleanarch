package com.maia.cleanarch.entrypoint.controller;

import com.maia.cleanarch.core.usecase.InsertCustomerUseCase;
import com.maia.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.maia.cleanarch.entrypoint.controller.request.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request) {
        var customer = customerMapper.toCustomer(request);
        insertCustomerUseCase.insert(customer, request.getZipCode());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
