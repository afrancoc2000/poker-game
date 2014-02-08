package com.flacom.jpa.hibernate.example.service.implementation.user;

import java.util.*;

import org.springframework.stereotype.Service;

import com.flacom.jpa.hibernate.example.domain.user.Operador;
import com.flacom.jpa.hibernate.example.service.user.ICalculadora;

@Service
public class CalculadoraImpl implements ICalculadora {

	@Override
	public Operador calcularEstimacion(Operador operador) {
		double resultado = 0;

		ArrayList<Integer> operadores = new ArrayList<Integer>();
		operadores.add(operador.getOperador1());
		operadores.add(operador.getOperador2());
		operadores.add(operador.getOperador3());
		operadores.add(operador.getOperador4());
		operadores.add(operador.getOperador5());
		
		Collections.sort(operadores);
		
		operadores.remove(4);
		operadores.remove(0);
		
		for(int oper : operadores){
			resultado += oper;
		}
		resultado = resultado/3;
		
		operador.setResultado(resultado);

		return operador;
	}

}
