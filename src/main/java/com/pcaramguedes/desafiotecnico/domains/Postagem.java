package com.pcaramguedes.desafiotecnico.domains;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "postagem")

public class Postagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "post_id")
	private Long id;
	
	@Column(name = "post_titulo")
	private String titulo;
	
	@Column(name = "post_conteudo")
	private String conteudo;
	
	@Column(name = "post_data")
	private Date data;
	
	@Lob  // Necessário informar para Hibernate
	@Column(name = "post_foto")
	private byte[] foto;
	
	@Column(name = "fk_id")
	private Integer fkid;
	

	public Postagem() {

	}


	public Postagem(Long id, String titulo, String conteudo, Date data, byte[] foto, Integer fkid) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.data = data;
		this.foto = foto;
		this.fkid = fkid;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public byte[] getFoto() {
		return foto;
	}


	public void setFoto(byte[] foto) {
		this.foto = foto;
	}


	public Integer getFkid() {
		return fkid;
	}


	public void setFkid(Integer fkid) {
		this.fkid = fkid;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
