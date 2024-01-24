package br.com.Parte.domain.service;

import br.com.Parte.domain.entity.ContatoEntity;
import br.com.Parte.domain.repository.ContatoRepository;
import br.com.Parte.domain.service.interfaces.ContatoServiceInterface;
import br.com.Parte.domain.service.interfaces.ViaCepClient;
import br.com.Parte.domain.service.response.AddressResponse;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
@AllArgsConstructor
public class ContatoServiceImpl implements ContatoServiceInterface {

    private final ContatoRepository contatoRepository;
    private final ViaCepClient viaCepClient;

    @Override
    public ContatoEntity save(ContatoEntity contato) {
        log.info("M save, contato = {}, NEW", contato);
        try {
            AddressResponse addressResponse = viaCepClient.getAddress(contato.getCep());
            log.info("M getAddres, address = {}, NEW", addressResponse);
            contato.setAddress((addressResponse));
            log.info("M save, contato = {}, SAVING", contato );
            return contatoRepository.save(contato);
        }catch (Exception ex){
            log.info("Cannot find the address with cep={}, ERROR={}.", contato.getCep(), ex.getMessage());
            throw new IllegalArgumentException("Cannot find the address with cep: " + contato.getCep());
        }

    }

    @Override
    public List<ContatoEntity> getAll() {
        return contatoRepository.findAll();
    }

    @Override
    public Optional<ContatoEntity> getByName(String name) {
        return contatoRepository.findByName(name);
    }
}
