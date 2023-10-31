package com.tulibro.librarymanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tulibro.librarymanager.models.Libro;
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
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
