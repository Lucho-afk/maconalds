package com.PS.maconalds.repositories;






import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PS.maconalds.models.HamburguesaModel;

@Repository
public interface HamburguesaRepository extends CrudRepository<HamburguesaModel, Long>  {
	
	public HamburguesaModel findBynombre(String nombre);
	
}
