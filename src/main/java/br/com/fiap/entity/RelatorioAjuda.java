package br.com.fiap.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class RelatorioAjuda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoAjuda;
    private String descricao;
    private LocalDate data;

    @ManyToOne
    private Voluntario voluntario;
}
