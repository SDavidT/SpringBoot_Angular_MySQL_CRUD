package com.example.backend.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.backend.dto.LibroDto;
import com.example.backend.dto.Mensaje;
import com.example.backend.entity.Libro;
import com.example.backend.service.LibroService;

//mport antlr.StringUtils;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "http://localhost:4200")

public class LibroController {

    @Autowired
    LibroService libroService;

    @GetMapping("/lista")
    public ResponseEntity<List<Libro>> list(){
        List<Libro> list = libroService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Libro> getById(@PathVariable("id") int id){
        if(!libroService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Libro libro = libroService.getOne(id).get();
        return new ResponseEntity(libro, HttpStatus.OK);
    }

    @GetMapping("/detailname/{nombre}")
    public ResponseEntity<Libro> getByNombre(@PathVariable("nombre") String nombre){
        if(!libroService.existsByNombre(nombre))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Libro libro = libroService.getByNombre(nombre).get();
        return new ResponseEntity(libro, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody LibroDto libroDto){
        // if(StringUtils.isBlank(libroDto.getNombre()))
        //     return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(libroDto.getPrecio()==null || libroDto.getPrecio()<0 )
            return new ResponseEntity(new Mensaje("El precio debe ser mayor que 0"), HttpStatus.BAD_REQUEST);
        if(libroService.existsByNombre(libroDto.getNombre()))
            return new ResponseEntity(new Mensaje("EL libro ya existe"), HttpStatus.BAD_REQUEST);
        Libro libro = new Libro(libroDto.getNombre(), libroDto.getDescripcion(), libroDto.getAutor(), libroDto.getFecha(), libroDto.getEjemplares(),  libroDto.getPrecio());
        libroService.save(libro);
        return new ResponseEntity(new Mensaje("Libro creado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody LibroDto libroDto){
        if(!libroService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        if(libroService.existsByNombre(libroDto.getNombre()) && libroService.getByNombre(libroDto.getNombre()).get().getId() != id)
            return new ResponseEntity(new Mensaje("El libro ya existe"), HttpStatus.BAD_REQUEST);
        // if(StringUtils.isBlank(libroDto.getNombre()))
        //     return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(libroDto.getPrecio()==null || libroDto.getPrecio()<0 )
            return new ResponseEntity(new Mensaje("El precio debe ser mayor que 0"), HttpStatus.BAD_REQUEST);

        Libro libro = libroService.getOne(id).get();
        libro.setNombre(libroDto.getNombre());
        libro.setDescripcion(libroDto.getDescripcion());
        libro.setAutor(libroDto.getAutor());
        libro.setFecha(libroDto.getFecha());
        libro.setEjemplares(libroDto.getEjemplares());
        libro.setPrecio(libroDto.getPrecio());
        libroService.save(libro);
        return new ResponseEntity(new Mensaje("Libro actualizado"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!libroService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        libroService.delete(id);
        return new ResponseEntity(new Mensaje("Libro eliminado"), HttpStatus.OK);
    }
    
}
