package com.juan.marketplaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.marketplaces.models.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Long> {

}
