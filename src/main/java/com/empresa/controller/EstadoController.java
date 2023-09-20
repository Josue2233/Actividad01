package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Concurso;
import com.empresa.service.ConcursoService;
import com.empresa.util.AppSettings;

@RestController
@RequestMapping("/url/estado")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class EstadoController {
	@Autowired
	private ConcursoService  concursoService;

	@GetMapping("/concurso")
	@ResponseBody
	public ResponseEntity<List<Concurso>> listaConcurso(){
		List<Concurso> lista = concursoService.listaConcurso();
		return ResponseEntity.ok(lista);
	}
}
