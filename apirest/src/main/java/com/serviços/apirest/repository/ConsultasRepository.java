package com.serviços.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviços.apirest.models.Consultas;

public interface ConsultasRepository extends JpaRepository<Consultas, Long> {

	Consultas findById(long id);
}
