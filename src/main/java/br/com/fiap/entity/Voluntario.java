package br.com.fiap.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Voluntario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;

    private String telefone;

    private String tipoAjuda; 

    private String disponibilidade; // ex: "Seg a Sex - Tarde", "Fins de semana - manhã"

    private String cidade;

    @OneToMany(mappedBy = "voluntario", cascade = CascadeType.ALL)
    private List<RelatorioAjuda> relatorios;
}
