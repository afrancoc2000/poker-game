package com.flacom.jpa.hibernate.example.domain.user;

public class Operador {
	private int operador1;
	private int operador2;
	private int operador3;
	private int operador4;
	private int operador5;
	private double resultado;
    
	public int getOperador1() {
    	return operador1;
    }
    
	public void setOperador1(int operador1) {
    	this.operador1 = operador1;
    }
    
	public int getOperador2() {
    	return operador2;
    }
    
	public void setOperador2(int operador2) {
    	this.operador2 = operador2;
    }
	
	public int getOperador3(){
		return operador3;
	}

	public void setOperador3(int operador3){
		this.operador3 = operador3;
	}

	public int getOperador4(){
		return operador4;
	}

	public void setOperador4(int operador4){
		this.operador4 = operador4;
	}

	public int getOperador5(){
		return operador5;
	}

	public void setOperador5(int operador5){
		this.operador5 = operador5;
	}

    public double getResultado() {
    	return resultado;
    }
    
    public void setResultado(double resultado) {
    	this.resultado = resultado;
    }
}
