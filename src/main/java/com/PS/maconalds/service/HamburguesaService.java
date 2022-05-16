package com.PS.maconalds.service;

import java.util.ArrayList;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PS.maconalds.models.HamburguesaModel;
import com.PS.maconalds.repositories.HamburguesaRepository;

@Service
public class HamburguesaService {

	@Autowired
	HamburguesaRepository hamburguesaRepository;
	
	public ArrayList<HamburguesaModel> listaDeHamburguesas(){
		return (ArrayList<HamburguesaModel>)hamburguesaRepository.findAll();
	}
	
	
	public Optional<HamburguesaModel> TraerPorId(Long id){
		return hamburguesaRepository.findById(id);
	}
	

	public HamburguesaModel getRandomElement(){
        Random rand = new Random();
        return this.listaDeHamburguesas().get(rand.nextInt(this.listaDeHamburguesas().size()));
    }
	
	public HamburguesaModel traerPorNombre(String nombre) {
		return hamburguesaRepository.findBynombre(nombre);
	}
	
}
