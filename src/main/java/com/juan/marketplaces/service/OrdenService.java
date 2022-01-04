package com.juan.marketplaces.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.juan.marketplaces.Iservices.IOrden;
import com.juan.marketplaces.models.Orden;
import com.juan.marketplaces.repository.OrdenRepository;

public class OrdenService implements IOrden{
	
	@Autowired
	private OrdenRepository ordenrepository;

	@Override
	public Orden save(Orden orden) {
		return ordenrepository.save(orden);
	}

}
