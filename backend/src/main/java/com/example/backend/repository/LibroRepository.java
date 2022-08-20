package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend.entity.Libro;

import java.util.Optional;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>  {

    Optional<Libro> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
    
}
