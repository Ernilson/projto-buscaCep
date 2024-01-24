package br.com.Parte.domain.repository;

import br.com.Parte.domain.entity.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoEntity, Long> {
    Optional<ContatoEntity> findByName(String name);
}
