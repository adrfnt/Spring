package com.Tarefa_2.tarefa2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/MinhaSegundaAplicação")
public class TarefaController {

		@GetMapping
		public String MinhaSegundaAplicação () {
			return "\nHabilidades para essa semana: Atenção aos detalhes, Proatividade, Comunicação, Trabalho em equipe.\n"
					+ "Mentalidades para essa semana: Orientação ao futuro, mentalidade de crescimento, responsabilidade pessoal, persistência.";
		}
}
