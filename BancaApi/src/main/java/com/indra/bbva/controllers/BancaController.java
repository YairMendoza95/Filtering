package com.indra.bbva.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.indra.bbva.models.Banca;
import com.indra.bbva.service.BancaService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/banca")
public class BancaController {
	@Autowired
	BancaService bancaService;

	@GetMapping(path = { "/", "" })
	public List<Banca> index() {
		return bancaService.getAllBanca();
	}

	@GetMapping("/{id}")
	public Banca banca(@PathVariable int id) {
		Integer idBanca = Integer.valueOf(id);
		return bancaService.findBancaById(new Banca(idBanca));
	}

	// @GetMapping("?")

	@PostMapping("/add")
	public Banca add(@RequestBody Banca banca) {
		return null;
	}
}
