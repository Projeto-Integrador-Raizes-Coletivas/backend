package com.generation.raizescoletivas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento
	private Long id;

	@Column(length = 48)
	@NotBlank(message = "O nome é obrigatório")
	@Size(min = 5, max = 48, message = "O nome deve conter entre 5 e 48 caracteres")
	private String nome;

	@Column(length = 48)
	@NotBlank(message = "O preço é obrigatório")
	@DecimalMin(value = "0.0", inclusive = false)
	@DecimalMax(value = "9999999999.0", inclusive = true)
	private Double preco;

	@Column(length = 255)
	@NotBlank(message = "Opcional - Insira um url de uma foto")
	private String foto;

	@Column(length = 1000)
	@NotBlank(message = "O atributo descrição é obrigatório")
	@Size(min = 10, max = 1000, message = "O atributo descrição deve conter entre 10 e 1000 letras")
	private String descricao;

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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
