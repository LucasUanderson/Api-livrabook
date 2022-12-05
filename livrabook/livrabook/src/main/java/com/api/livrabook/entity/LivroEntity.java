package com.api.livrabook.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_LIVROS")
public class LivroEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int livroId;
	
	@Column(name = "livro", length = 200, nullable =false)
	private String nomeLivro;
	
	@Column(name = "autor", length = 200, nullable =false)
	private String autor;
	
	@Column(name = "preco", length = 200, nullable =false)
	private Double preco;
	
	@Column(name = "preco", length = 200, nullable =false)
	private String categoria;
	
	@Column(name = "status", length = 200, nullable =false)
	private String status;
	
	
	
	
	
	

}
