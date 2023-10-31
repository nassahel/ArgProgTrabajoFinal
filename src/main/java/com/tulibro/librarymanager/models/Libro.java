package com.tulibro.librarymanager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Long isbn;
	private String titulo;
	private Integer anio;
	private Integer ejemplares;
	private Integer ejemplaresPrestados;
	private Integer ejemplaresRestantes;
	private Boolean alta;
	
	
	public Libro() {
		super();
	}
	public Libro(Integer id, Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados,
			Integer ejemplaresRestantes, Boolean alta) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.anio = anio;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
		this.ejemplaresRestantes = ejemplaresRestantes;
		this.alta = alta;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public Integer getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(Integer ejemplares) {
		this.ejemplares = ejemplares;
	}
	public Integer getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}
	public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	public Integer getEjemplaresRestantes() {
		return ejemplaresRestantes;
	}
	public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
		this.ejemplaresRestantes = ejemplaresRestantes;
	}
	public Boolean getAlta() {
		return alta;
	}
	public void setAlta(Boolean alta) {
		this.alta = alta;
	}
	
	
	
	
}

