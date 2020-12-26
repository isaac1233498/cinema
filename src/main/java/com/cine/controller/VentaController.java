package com.cine.controller;
/*
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cine.dto.VentaDTO;
import com.cine.exception.ModeloNotFoundException;
import com.cine.model.Venta;
import com.cine.service.IArchivoService;
import com.cine.service.IVentaService;


*/
//@RestController
//@RequestMapping("/venta")
public class VentaController {

	/*	
	@Autowired
	private IVentaService service;
	
	@Autowired
	private IArchivoService serviceArchivo;
	

	@GetMapping
	public ResponseEntity<List<Venta>> listar() {
		List<Venta> lista = service.listar();
		return new ResponseEntity<List<Venta>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Venta> listarPorId(@PathVariable("id") Integer id) {
		Venta obj = service.leerPorId(id);
		if (obj.getIdVenta() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		return new ResponseEntity<Venta>(obj, HttpStatus.OK);
	}
	
	// tercer nivel de respuesta
	@GetMapping(value = "/hateoas", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VentaDTO> listarHateoas() {
		List<Venta> ventas = new ArrayList<>();
		List<VentaDTO> ventaDTO = new ArrayList<>();
		ventas = service.listar();
		
		for (Venta v : ventas) {
			VentaDTO d = new VentaDTO();
			d.setIdVenta(v.getIdVenta());
			d.setEmpleado(v.getEmpleado());
			d.setCliente(v.getCliente());
			
			// localhost:8090/ventas/1
			ControllerLinkBuilder linkTo = linkTo(methodOn(VentaController.class).listarPorId((v.getIdVenta())));
			d.add(linkTo.withSelfRel());
			consultasDTO.add(d);
			
			ControllerLinkBuilder linkTo1 = linkTo(methodOn(PacienteController.class).listarPorId((c.getPaciente().getIdPaciente())));
			d.add(linkTo1.withSelfRel());
			consultasDTO.add(d);
			
			ControllerLinkBuilder linkTo2 = linkTo(methodOn(MedicoController.class).listarPorId((c.getMedico().getIdMedico())));
			d.add(linkTo2.withSelfRel());
			consultasDTO.add(d);
		}
		return consultasDTO;
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody ConsultaListaExamenDTO consultaDTO) {
		Consulta obj = service.registrarTransaccional(consultaDTO);
		//consultas/2
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdConsulta()).toUri();
		return ResponseEntity.created(location).build();
	}*/
}
