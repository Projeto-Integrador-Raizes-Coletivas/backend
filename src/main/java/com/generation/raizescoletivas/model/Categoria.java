package com.generation.raizescoletivas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank (message = "O Atributo nome é obrigatório!")
	@Size (min = 5, message = "O Atributo nome deve conter no mínimo 5 caracteres.")
	private String nome;
	
	@Size (min = 5, message = "O Atributo classificação deve conter no mínimo 5 caracteres.")
	private String classificacao;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	

}
