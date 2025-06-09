package br.com.fiap.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    @JoinColumn(name = "endereco_id") 
    private Endereco endereco;

    private boolean possuiDeficiencia;

    private String tipoDeficiencia;

    private int quantidadePessoas;

    private int quantidadeCriancas;

    private boolean possuiAnimais;
    
    @OneToMany(mappedBy = "familia", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Animal> animais;

    private String necessidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public boolean isPossuiDeficiencia() {
		return possuiDeficiencia;
	}

	public void setPossuiDeficiencia(boolean possuiDeficiencia) {
		this.possuiDeficiencia = possuiDeficiencia;
	}

	public String getTipoDeficiencia() {
		return tipoDeficiencia;
	}

	public void setTipoDeficiencia(String tipoDeficiencia) {
		this.tipoDeficiencia = tipoDeficiencia;
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public int getQuantidadeCriancas() {
		return quantidadeCriancas;
	}

	public void setQuantidadeCriancas(int quantidadeCriancas) {
		this.quantidadeCriancas = quantidadeCriancas;
	}

	public boolean isPossuiAnimais() {
		return possuiAnimais;
	}

	public void setPossuiAnimais(boolean possuiAnimais) {
		this.possuiAnimais = possuiAnimais;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public String getNecessidade() {
		return necessidade;
	}

	public void setNecessidade(String necessidade) {
		this.necessidade = necessidade;
	}
    
}


