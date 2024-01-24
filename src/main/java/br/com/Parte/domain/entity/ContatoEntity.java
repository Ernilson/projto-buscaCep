package br.com.Parte.domain.entity;

import br.com.Parte.domain.service.response.AddressResponse;
import jakarta.persistence.*;

import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "tb_contato")
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ContatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String phone;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;

    public void setAddress(AddressResponse address){
        this.logradouro = address.getLogradouro();
        this.bairro = address.getBairro();
        this.cidade = address.getCidade();
        this.estado = address.getEstado();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ContatoEntity contact = (ContatoEntity) o;
        return id != null && Objects.equals(id, contact.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
