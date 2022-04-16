package com.serviços.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviços.apirest.models.Consultas;
import com.serviços.apirest.repository.ConsultasRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Consultas")
public class ConsultasResource {

	@Autowired
	ConsultasRepository consultasRepository;
	
	@GetMapping("/consultas")
	@ApiOperation(value="Retorna uma lista de consultas")
	public List<Consultas> listaConsultas(){
		return consultasRepository.findAll();
	}
	
	@GetMapping("/consultas/{id}")
	@ApiOperation(value="Retorna uma unica consulta")
	public Consultas listaConsultasUnico(@PathVariable(value="id")long id){
		return consultasRepository.findById(id);
	}
	
	@PostMapping("/consultas")
	@ApiOperation(value="salva uma consulta")
	public Consultas salvaConsultas(@RequestBody Consultas consultas) {
		return consultasRepository.save(consultas);
	}
	@DeleteMapping("/consultas")
	@ApiOperation(value="deleta uma consulta")
	public void deletaConsultas(@RequestBody Consultas consultas) {
		consultasRepository.delete(consultas);
	}
	@PutMapping("/consultas")
	@ApiOperation(value="atualiza uma consulta")
	public Consultas atualizaConsultas(@RequestBody Consultas consultas) {
		return consultasRepository.save(consultas);
	}
}
