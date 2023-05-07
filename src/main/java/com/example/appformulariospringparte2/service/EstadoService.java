package com.example.appformulariospringparte2.service;

import java.util.List;

import com.example.appformulariospringparte2.model.Estado;
import com.example.appformulariospringparte2.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 
@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> listarEstados(){
		return estadoRepository.findAll();
	}
	
	public void registrarEstado(Estado estado) {
		estadoRepository.save(estado);
	}
	

}
