package com.tulibro.librarymanager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	
	private long isbn;
	private String titulo;
	private Integer anio;
	private Integer ejemplares;
	private Integer ejeplaresPrestados;
	private Integer ejeplaresRestantes;
	private boolean alta;
	
	
	

}
