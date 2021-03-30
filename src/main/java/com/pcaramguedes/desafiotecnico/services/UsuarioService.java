package com.pcaramguedes.desafiotecnico.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcaramguedes.desafiotecnico.domains.Usuarios;
import com.pcaramguedes.desafiotecnico.repositories.UsuariosRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	public Usuarios buscar(Long id) {
		Optional<Usuarios> obj = usuariosRepository.findById(id);
		return obj.orElse(null);
		
	}
	

}
