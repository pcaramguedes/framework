package com.pcaramguedes.desafiotecnico.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

	@GetMapping("/")
	public String start() {
		return "";
	}
	
}
