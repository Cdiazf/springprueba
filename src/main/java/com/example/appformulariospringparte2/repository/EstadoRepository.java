package com.example.appformulariospringparte2.repository;


import com.example.appformulariospringparte2.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstadoRepository 
	extends JpaRepository<Estado, Integer> {
		
}
