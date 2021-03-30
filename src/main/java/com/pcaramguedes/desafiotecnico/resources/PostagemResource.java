package com.pcaramguedes.desafiotecnico.resources;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pcaramguedes.desafiotecnico.domains.Postagem;
import com.pcaramguedes.desafiotecnico.services.PostagemService;

@RestController
@RequestMapping("/postagens")
public class PostagemResource implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private PostagemService postagemService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	
	public ResponseEntity<?> findPost(@PathVariable Long id) {
		Postagem obj = postagemService.buscarPosts(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
