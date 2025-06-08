package br.com.fiap.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PontoApoio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String tipoAbrigo; // "pessoas", "animais", "ambos"

    private int capacidade;

    private String responsavelNome;

    private String responsavelTelefone;

    private String horarioFuncionamento;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
}
