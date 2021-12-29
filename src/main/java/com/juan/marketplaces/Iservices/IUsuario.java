package com.juan.marketplaces.Iservices;

import java.util.List;
import java.util.Optional;

import com.juan.marketplaces.models.Usuario;

public interface IUsuario {
	List<Usuario> findAll();
	Optional<Usuario> findById(Long id);
	Usuario save (Usuario usuario);
	Optional<Usuario> findByEmail(String email);
	
}
