package br.com.fiap.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public boolean isColetaAgasalhos() {
		return coletaAgasalhos;
	}

	public void setColetaAgasalhos(boolean coletaAgasalhos) {
		this.coletaAgasalhos = coletaAgasalhos;
	}

	public boolean isColetaRacoes() {
		return coletaRacoes;
	}

	public void setColetaRacoes(boolean coletaRacoes) {
		this.coletaRacoes = coletaRacoes;
	}

	public boolean isColetaCobertores() {
		return coletaCobertores;
	}

	public void setColetaCobertores(boolean coletaCobertores) {
		this.coletaCobertores = coletaCobertores;
	}
    
    
}
