package com.PS.maconalds.controllers;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.PS.maconalds.models.HamburguesaModel;
import com.PS.maconalds.service.HamburguesaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/hamburguesa")
public class HamburguesaControllers {
	
	
	@GetMapping(value="status")
	public String checkStatus() {
		return "ok";
	}
	
	@Autowired
	HamburguesaService hamburguesaService;
	
	@GetMapping()
	public ArrayList<HamburguesaModel> lstHamburguesas(){
		return hamburguesaService.listaDeHamburguesas();
	}
	
	@GetMapping(path="/{id}")
	public Optional<HamburguesaModel> traerPorId(@PathVariable("id") Long id) {
		return hamburguesaService.TraerPorId(id);
	}
	
	@GetMapping("/query")//sacar query  nombre=big mac 
	public	HamburguesaModel traerPorNombre(@RequestParam("nombre") String nombre) throws Exception {
		if(hamburguesaService.traerPorNombre(nombre)==null) {
			throw new Exception();
			
		}else {
			return hamburguesaService.traerPorNombre(nombre);
		}
	}
	
	
	@PostMapping()
	public HamburguesaModel agregarHamburguesa (@RequestBody HamburguesaModel hamburguesa) {
		return hamburguesaService.agregarHamburguesa(hamburguesa);
	}
	
	
	
}
