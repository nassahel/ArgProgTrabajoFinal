package com.tulibro.librarymanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tulibro.librarymanager.models.Libro;
import com.tulibro.librarymanager.repositories.ILibroRepository;

@Service
public class LibroServiceImpl implements ILibroService{
	
	@Autowired
	private ILibroRepository libroRepository;

	@Override
	public void saveLibro(Libro libro) {
		libroRepository.save(libro);
	
		
	}

	@Override
	public List<Libro> getAllLibros() {
		List<Libro> allLibros = libroRepository.findAll();
		return allLibros;
	}

	@Override
	public Libro getLibroById(Integer id) {
		Libro libro = libroRepository.findById(id).orElse(null);
		return libro;
	}

	@Override
	public void updateLibro(Libro libro) {
		this.saveLibro(libro);
		
	}

	@Override
	public void deleteLibro(Integer id) {
		libroRepository.deleteById(id);
		
	}

}
