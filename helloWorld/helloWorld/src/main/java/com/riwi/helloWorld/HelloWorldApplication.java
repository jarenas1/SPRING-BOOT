package com.riwi.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/controller") //INDICAMOS A DONDE HAY QUE ACCEDER PARA PODER ACCEDER A TODOS LOS METODOS
public class HelloWorldApplication {
	//usamos el metodo main para poder correr el servidor
	public static void main(String[] args) {

		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@GetMapping("/helloWorld")//INDICAMOS LA DIRECCION DE ESTA PETICION
	public String holaMundo(){
		return "Hola Mundo!";
	}

	//http://localhost:8080/controller/helloJuan
	@GetMapping("/helloJuan")//INDICAMOS LA DIRECCION PARA PODER ACCEDER
	public  String holaJuan(){
		return "Hola Juan!";
	}

	//TAMIEN PODEMOS CREAR UN METODO POR DEFECTO AL ENTRAR A localhost:8080/controller, la unica diferencia es no darle una direccion
	//con el getmapping

	@GetMapping
	public String defaut(){
		return "Default message";
	}


}
