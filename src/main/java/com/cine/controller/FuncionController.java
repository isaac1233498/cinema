package com.cine.controller;

import java.net.URI;
import java.util.List;

import javax.persistence.MappedSuperclass;
import javax.validation.Valid;

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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cine.exception.ModeloNotFoundException;
import com.cine.model.Funcion;
import com.cine.service.IFuncionService;



@RestController
@RequestMapping("/funcion")
public class FuncionController {
/*
	@Autowired
	private IFuncionService service;
	
	@GetMapping
	public ResponseEntity<List<Funcion>> listar() {
		List<Funcion> lista = service.listar();
		return new ResponseEntity<List<Funcion>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Funcion> listarPorId(@PathVariable("id") Integer id) {
		Funcion obj = service.leerPorId(id);
		if (obj.getIdFuncion() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		return new ResponseEntity<Funcion>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Funcion funcion) {
		Funcion obj = service.registrar(funcion);
		//funciones/1
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(funcion.getIdFuncion()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<Funcion> modificar(@Valid @RequestBody Funcion examen) {
		Funcion obj = service.modificar(examen);
		return new ResponseEntity<Funcion>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {
		Funcion obj = service.leerPorId(id);
		if (obj.getIdFuncion() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}*/
}


