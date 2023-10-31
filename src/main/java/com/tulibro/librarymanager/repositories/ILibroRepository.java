package com.tulibro.librarymanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tulibro.librarymanager.models.Libro;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Integer> {

}
