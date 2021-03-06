package com.juan.marketplaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juan.marketplaces.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
