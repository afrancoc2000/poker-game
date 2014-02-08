package com.flacom.jpa.hibernate.example.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.flacom.jpa.hibernate.example.domain.user.*;
import com.flacom.jpa.hibernate.example.service.user.*;

@Controller
@RequestMapping(value={""})
public class HomeController {

	@Autowired
	private ICalculadora calculadoraService;
	
	@RequestMapping(value={"","/"})
	public ModelAndView home(){
		Map<String, Object> params = new HashMap<String, Object>();

		params.put("operador", new Operador());
		return new ModelAndView("home", params);
	}
	
	@RequestMapping("/estimar")
	public ModelAndView estimar(@ModelAttribute("operador") Operador operador){
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		/**if(!Util.isNumeric(operador.getOperador1()){
			
			params.put("usernameMessage", "Input required");
			
			return new ModelAndView("home", params);
			
		} **/

		calculadoraService.calcularEstimacion(operador);
		params.put("operador", operador);
		return new ModelAndView("home", params);
	}
}
