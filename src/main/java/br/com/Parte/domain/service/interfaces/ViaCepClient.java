package br.com.Parte.domain.service.interfaces;

import br.com.Parte.domain.service.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "viaCep", url = "${viaCep.endpoint}")
public interface ViaCepClient {

    @GetMapping(value = "/{cep}/json")
    public AddressResponse getAddress(@PathVariable(value = "cep") String cep);
}
