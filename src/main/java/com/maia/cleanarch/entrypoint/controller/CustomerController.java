package com.maia.cleanarch.entrypoint.controller;

import com.maia.cleanarch.core.usecase.InsertCustomerUseCase;
import com.maia.cleanarch.entrypoint.controller.mapper.CustomerRequestMapper;
import com.maia.cleanarch.entrypoint.controller.request.CustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {


    private final InsertCustomerUseCase insertCustomerUseCase;
    private final CustomerRequestMapper mapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request) {
        var customer = mapper.toCustomer(request);
        insertCustomerUseCase.insert(customer, request.getZipCode());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
