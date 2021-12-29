package com.juan.marketplaces.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.marketplaces.Iservices.IUsuario;
import com.juan.marketplaces.models.Usuario;
import com.juan.marketplaces.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuario {
	
	@Autowired
	private UsuarioRepository uRepository;

	@Override
	public Optional<Usuario> findById(Long id) {
		return uRepository.findById(id);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return uRepository.save(usuario);
	}

	@Override
	public List<Usuario> findAll() {
		return uRepository.findAll();
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		return uRepository.findByEmail(email);
	}

}
