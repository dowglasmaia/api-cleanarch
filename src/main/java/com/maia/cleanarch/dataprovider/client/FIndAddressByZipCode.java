package com.maia.cleanarch.dataprovider.client;

import com.maia.cleanarch.dataprovider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FIndAddressByZipCode",
        url = "${maia.client.address.url}"
)
public interface FIndAddressByZipCode {
    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
