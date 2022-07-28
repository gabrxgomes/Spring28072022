package br.org.generation.helloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class bsm {
	@GetMapping //coloque a informação abaixo no endereço
	public String BSM() {
		return "Mentalidade: Orientação ao futuro, Responsabilidade pessoal, Mentalidade de Crescimento, Persistência. "
				+ " || Habilidades: Trabalho em Equipe, Orientação aos Detalhes, Proatividade e Comunicação"; 
	}
}
