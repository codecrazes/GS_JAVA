package br.com.fiap.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class FormularioFamilia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeResponsavel;

    private String cpf;

    private String telefone;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    private boolean possuiDeficiencia;

    private String tipoDeficiencia;

    private int quantidadePessoas;

    private int quantidadeCriancas;

    private boolean possuiAnimais;

    @OneToMany(mappedBy = "familia", cascade = CascadeType.ALL)
    private List<Animal> animais;

    private String necessidade;
}
