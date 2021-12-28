package com.juan.marketplaces.Iservices;

import java.util.Optional;

import com.juan.marketplaces.models.Producto;

public interface IProducto {
	public Producto save(Producto producto);
	public Optional<Producto> get(Long id);
	public void update(Producto producto);
	public void delete(Long id);

}
