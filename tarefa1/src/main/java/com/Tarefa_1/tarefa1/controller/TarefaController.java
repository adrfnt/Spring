package com.Tarefa_1.tarefa1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MinhaPrimeiraAplicação")
public class TarefaController {
	
	@GetMapping
	public String MinhaPrimeiraAplicação () {
		return "Habilidades: Atenção aos detalhes, Proatividade, Comunicação, Trabalho em equipe.\n"
		+ "Mentalidades: Orientação ao futuro, mentalidade de crescimento, responsabilidade pessoal, persistência.";
	}
}