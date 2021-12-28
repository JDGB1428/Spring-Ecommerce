package com.juan.marketplaces.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.marketplaces.Iservices.IProducto;
import com.juan.marketplaces.models.Producto;
import com.juan.marketplaces.repository.ProductoRepository;

@Service
public class ProductoService implements IProducto {
	
	@Autowired
	private ProductoRepository productorepository;

	@Override
	public Producto save(Producto producto) {
		return productorepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Long id) {
		return productorepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		productorepository.save(producto);
		
	}

	@Override
	public void delete(Long id) {
		productorepository.deleteById(id);
		
	}

}
