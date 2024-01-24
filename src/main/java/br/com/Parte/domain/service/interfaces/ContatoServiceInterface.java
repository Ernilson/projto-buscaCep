package br.com.Parte.domain.service.interfaces;


import br.com.Parte.domain.entity.ContatoEntity;

import java.util.List;
import java.util.Optional;

public interface ContatoServiceInterface {
    ContatoEntity save(ContatoEntity contato);
    List<ContatoEntity> getAll();
    Optional<ContatoEntity> getByName(String name);
}
