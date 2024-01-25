
package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {	
		return "Hola," + nom + ".Estàs executant un projecte Gradle";
		
	}
	@GetMapping(value ={"/HelloWorld2/{nom}","/HelloWorld2"})
	public String saluda2 (@PathVariable(value = "nom" , required = false) String nom) {	
		if(nom == null){
			nom = "UNKNOWN";			
		}
		return "Hola," + nom + ".Estàs executant un projecte Gradle";		
	}
}
