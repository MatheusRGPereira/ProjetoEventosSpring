package com.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class EventoController {

	@RequestMapping("/cadastroEvento")
	public String formulario() {
		return "eventos/formEvento";
	}
	
}
