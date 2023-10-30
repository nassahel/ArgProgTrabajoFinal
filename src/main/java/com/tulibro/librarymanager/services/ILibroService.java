package com.tulibro.librarymanager.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tulibro.librarymanager.models.Libro;

@Service
public interface ILibroService {
	
	public void saveLibro(Libro libro);
	
	public List<Libro> getAllLibros();
	
	public Libro getLibroById(String id);
	
	public void updateLibro(Libro libro);
	
	public void deleteLibro(String id);
	

}
