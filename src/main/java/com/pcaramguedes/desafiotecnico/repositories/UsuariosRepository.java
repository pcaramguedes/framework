package com.pcaramguedes.desafiotecnico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcaramguedes.desafiotecnico.domains.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long>{

}
