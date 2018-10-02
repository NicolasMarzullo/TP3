package edu.unlam.polinomio;

public class Polinomio {
	//usar nros cercanos al 1.. ej: 0.94, 1,04 para que no pinche el tipo de dato
	private int grado;
	private double[] coeficientes;
	
	/*La posición 0 del arreglo de coeficientes contiene el coeficiente de grado n
	 * y la posición n contiene al termino independiente
	 */
	
	public Polinomio(int grado, double[] coeficionetes) {
		this.grado = grado;
		this.coeficientes = coeficionetes;
	}
	
	double evaluarMSucesivas(double x) {
		
		int i = 0;
		double resultado = 0;
		
		
		for(;i<this.grado;i++)
			resultado += coeficientes[i] * potencia(x, grado-i);
		
		resultado += coeficientes[i];
		return resultado;
	}
	
	double evaluarRecursiva(double x) {
		
		int i = 0;
		double resultado = 0;
		
		for(; i < this.grado; i ++)
			resultado += coeficientes[i] * potenciaRecursiva(x, grado-i);

		return resultado += coeficientes[i];
	}

	//Calculo de potencia mediante multiplicaciones sucesivas
	private double potencia(double x, int n) {
		//si la potencia es 0
		double resultadoADevolver = 1;
		
		for(int i = 0; i < n;i++)
			resultadoADevolver *= x;
		
		return resultadoADevolver;
	}

	private double potenciaRecursiva(double x, int n) {
		if (n % 2 == 0)
			return potenciaRecursivaPar(x, n);
		
		return potenciaRecursivaImpar(x, n);
	}
		
	private double potenciaRecursivaImpar(double x, int n) {
		
		if(n == 0)
			return 1;

		return x * potenciaRecursivaImpar(x, n-1);
	}
	
	private double potenciaRecursivaPar(double x, int n) {
		
		if(n == 1)
			return x;

		return potenciaRecursivaPar(x * x, n/2);
	}
	
	/*
	 * Dado p(x) = a0 + a1*x + a2*x^2 + a3*x^3 + ... + an*x^n
	 *
	 * Realizo los siguientes procedimientos
	 * bn = an
	 * bsub(n - 1) = asub(n - 1) + bn * x0;
	 * 			.
	 * 			.
	 * 			.
	 * b0 = a0 + b1 * x0;
	 * Con b0 siendo el valor de p(x0);
	 * 
	 * Basicamente subdivido el polinomio en binomios
	 * p(x) = a0 + x*(a1 + x*(a2 + ... x*(asub(n - 1) + an*x) ...))
	 */
	public double evaluarHorner(double x) {
		double res = coeficientes[0];
		
		for(int i = 1; i <= grado; i ++)
			res = coeficientes[i] + (x * res);
		
		return res;
	}
}
