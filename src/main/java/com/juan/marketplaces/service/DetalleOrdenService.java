package com.juan.marketplaces.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.juan.marketplaces.Iservices.IDetalleOrden;
import com.juan.marketplaces.models.DetalleOrden;
import com.juan.marketplaces.repository.DetalleOrdenRepository;

public class DetalleOrdenService implements IDetalleOrden {
	
	@Autowired
	private DetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}

}
