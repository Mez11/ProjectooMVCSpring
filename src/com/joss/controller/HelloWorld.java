package com.joss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloWorld {
	//Enlace de la URL con este controlador 
		@RequestMapping("/welcome")
		//Creacion del metodo
		public ModelAndView helloWorld(){
			String message ="<br><div style='text-align:center;'>"
		+"<h3>******Hello World @.@ </h3>";
					return new ModelAndView("welcome","message",message);
				
		}
	
	

}
