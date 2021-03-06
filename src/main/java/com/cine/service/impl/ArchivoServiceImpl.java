package com.cine.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cine.model.Archivo;
import com.cine.repo.IArchivoRepo;
import com.cine.service.IArchivoService;

@Component
public class ArchivoServiceImpl implements IArchivoService{

	@Autowired
	private IArchivoRepo repo;

	@Override
	public int guardar(Archivo archivo) {
		Archivo ar = repo.save(archivo);
		return ar.getIdArchivo() > 0 ? 1 : 0;
	}

	@Override
	public byte[] leerArchivo(Integer idArchivo) {
		Optional<Archivo> op = repo.findById(idArchivo);
		return op.isPresent() ? op.get().getValue() : new byte[0];
	}
}
