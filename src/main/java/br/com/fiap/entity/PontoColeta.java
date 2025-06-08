package br.com.fiap.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PontoColeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    private boolean coletaAgasalhos;

    private boolean coletaRacoes;

    private boolean coletaCobertores;
}
