package br.com.fiap.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String especie; // Ex: cachorro, gato
    private String nome;
    private int idade;

    private boolean precisaAjudaVeterinaria;

    @ManyToOne
    private FormularioFamilia familia;
}
