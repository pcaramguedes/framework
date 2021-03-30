package com.pcaramguedes.desafiotecnico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcaramguedes.desafiotecnico.domains.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
