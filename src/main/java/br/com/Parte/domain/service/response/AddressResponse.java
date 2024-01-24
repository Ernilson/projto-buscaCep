package br.com.Parte.domain.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressResponse {

    private String cep;
    private String logradouro;
    private String bairro;
    @JsonProperty(value = "localidade")
    private String cidade;
    @JsonProperty(value = "uf")
    private String estado;
}
