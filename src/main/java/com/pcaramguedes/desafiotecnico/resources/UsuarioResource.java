package com.pcaramguedes.desafiotecnico.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pcaramguedes.desafiotecnico.domains.Usuarios;
import com.pcaramguedes.desafiotecnico.services.UsuarioService;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService usuarioService;
	
    
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	
	public ResponseEntity<?> find(@PathVariable Long id) {
		Usuarios obj = usuarioService.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
