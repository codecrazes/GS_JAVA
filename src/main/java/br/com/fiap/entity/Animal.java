package br.com.fiap.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    
    

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getEspecie() {
		return especie;
	}



	public void setEspecie(String especie) {
		this.especie = especie;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public boolean isPrecisaAjudaVeterinaria() {
		return precisaAjudaVeterinaria;
	}



	public void setPrecisaAjudaVeterinaria(boolean precisaAjudaVeterinaria) {
		this.precisaAjudaVeterinaria = precisaAjudaVeterinaria;
	}



	public FormularioFamilia getFamilia() {
		return familia;
	}



	public void setFamilia(FormularioFamilia familia) {
		this.familia = familia;
	}



	@ManyToOne
	@JsonBackReference
    private FormularioFamilia familia;
}
