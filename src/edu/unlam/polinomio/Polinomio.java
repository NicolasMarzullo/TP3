package edu.unlam.polinomio;

public class Polinomio {
	//usar nros cercanos al 1.. ej: 0.94, 1,04 para que no pinche el tipo de dato
	private int grado;
	private double[] coeficionetes;
	
	/*La posici�n 0 del arreglo de coeficientes contiene el coeficiente de grado n
	 * y la posici�n n contiene al termino independiente
	 */
	
	public Polinomio(int grado, double[] coeficionetes) {
		this.grado = grado;
		this.coeficionetes = coeficionetes;
	}
	
	double evaluarMSucesivas(double x) {
		
		int i = 0;
		double resultado = 0;
		
		
		for(;i<this.grado;i++)
			resultado += coeficionetes[i] * potencia(x, grado-i);
		
		resultado += coeficionetes[i];
		return resultado;
	}
	
	double evaluarRecursiva(double x) {
		
		int i = 0;
		double resultado = 0;
		
		
		for(;i<this.grado;i++)
			resultado += coeficionetes[i] * potenciaRecursiva(x, grado-i);

			
		
		return resultado += coeficionetes[i];
	}
	
	
	//Calculo de potencia mediante multiplicaciones sucesivas
	private double potencia(double x, int n) {
		//si la potencia es 0
		double resultadoADevolver = 1;
		
		for(int i = 0; i < n;i++)
			resultadoADevolver *= x;
		
		return resultadoADevolver;
	}
	
	//Calculo de potencia considerando si es par o impar
	private double potenciaRecursiva(double x, int n) {
		
		if(n==0)
			return 1;
		
		return x*potenciaRecursiva(x, n-1);
	}
	
	
}
