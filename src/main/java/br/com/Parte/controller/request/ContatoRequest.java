package br.com.Parte.controller.request;

import br.com.Parte.domain.entity.ContatoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class ContatoRequest {

    private String name;
    private String phone;
    private String cep;
    private Integer numero;

    public ContatoEntity toEntity(){
        return ContatoEntity.builder()
                .name(name)
                .phone(phone)
                .cep(cep.contains("-")? cep.replace("-", ""): cep)
                .numero(numero)
                .build();
    }
}
