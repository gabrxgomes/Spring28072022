package br.org.generation.helloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // diz o endereço que sera acessado, localhost8080/hello
public class helloworld {
	@GetMapping //coloque a informação abaixo no endereço
	public String hello() {
		return "hello world ! hello spring!";
	}
}


// ctrl + shift + o importa tudo