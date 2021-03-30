package com.pcaramguedes.desafiotecnico.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcaramguedes.desafiotecnico.domains.Postagem;
import com.pcaramguedes.desafiotecnico.repositories.PostagemRepository;

@Service
public class PostagemService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	public Postagem buscarPosts(Long id) {
		Optional<Postagem> obj = postagemRepository.findById(id);
		return obj.orElse(null);
		
	}
	
}
