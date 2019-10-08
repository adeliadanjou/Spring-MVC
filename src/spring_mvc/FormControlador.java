package spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 1) Ponemos esta anotacion para decirle que esta clase es un controlador
public class FormControlador {
	
	
@RequestMapping("/muestraForm") // 2) poner RequestMapping para hacer la ruta
	public String muestraForm() { //2.1)haces un metodo que muestra el form y retorna form
		return "form";
	}
@RequestMapping("/procesarForm") 
public String procesarForm() { // 3) Cuando el form submit --> va a /procesarForm
	return "formSubmit"; // 3.1) Vista para la ruta /procesarForm
}
}
