package es.ejercicio.microservicios.autores.service;

import java.util.List;

import es.ejercicio.microservicios.autores.entity.Autor;

public interface AutorService {

    public List<Autor> findAll();
}