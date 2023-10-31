package com.tulibro.librarymanager.controllers;

import java.util.List;

import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tulibro.librarymanager.models.Libro;
import com.tulibro.librarymanager.services.ILibroService;
import com.tulibro.librarymanager.services.LibroServiceImpl;

@RestController
@RequestMapping("/libros")
public class LibroController {

	@Autowired
	private LibroServiceImpl libroService;

	@GetMapping("")
	public ResponseEntity<List<Libro>> getAllLibros() {
		List<Libro> allLibros = libroService.getAllLibros();

		if (!allLibros.isEmpty()) {
			return new ResponseEntity<>(allLibros, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

	}

	@PostMapping("/create")
	public ResponseEntity<String> createLibro(@RequestBody Libro libro) {

		try {
			libroService.saveLibro(libro);
			return new ResponseEntity<>("Libro Creado", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{libro_id}")
	public ResponseEntity<Libro> getLibroById(@PathVariable Integer libro_id) {
		Libro libro = libroService.getLibroById(libro_id);

		if (libro != null) {
			return new ResponseEntity<>(libro, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<Libro> updateLibro(@RequestBody Libro libro) {

		try {
			libroService.updateLibro(libro);
			Libro libroUpdated = libroService.getLibroById(libro.getId());

			if (libroUpdated != null) {
				return new ResponseEntity<>(libroUpdated, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/delete/{libro_id}")
	public ResponseEntity<String> deleteLibroById(@PathVariable Integer libro_id) {
		try {
			Libro libro = libroService.getLibroById(libro_id);

			if (libro != null) {
				libroService.deleteLibro(libro_id);
				return new ResponseEntity<>("Libro Borrado", HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Libro no encontrado", HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
