package com.empresa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empresa.entity.Modalidad;
import com.empresa.repository.ModalidadRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ModalidadServiceImpl implements ModalidadService{

	private final ModalidadRepository modalidadRepository;
	@Override
	public List<Modalidad> listaModalidad() {
		return modalidadRepository.findAll();
	}

	@Override
	public Modalidad insertaModalidad(Modalidad obj) {
		return modalidadRepository.save(obj);
	}
	
}
