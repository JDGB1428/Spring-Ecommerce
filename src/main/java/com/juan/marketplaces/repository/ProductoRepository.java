package com.juan.marketplaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.marketplaces.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
