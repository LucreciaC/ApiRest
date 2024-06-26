package com.uch.apirest.controller;

import com.uch.apirest.models.Libro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apiLibros")
public class LibroController {
    @GetMapping("/Hola")
    public String holaMundo(){
        return "Hola mundo en api rest";
    }
    @GetMapping("/Libros")
    public List<Libro> obtenerLibros() {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 123456789, 1605));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 987654321, 1967));
        libros.add(new Libro("1984", "George Orwell", 123123123, 1949));

        libros.forEach(libro -> {
            libro.setNombre("Modificado - " + libro.getNombre());
            libro.setAñoPublicacion(libro.getAñoPublicacion() + 10);
        });


        return libros;

    }
}
