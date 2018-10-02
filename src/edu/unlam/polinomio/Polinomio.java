package edu.unlam.polinomio;

public class Polinomio {
	//usar nros cercanos al 1.. ej: 0.94, 1,04 para que no pinche el tipo de dato
	private int grado;
	private double[] coeficionetes;
	
	/*La posición 0 del arreglo de coeficientes contiene el coeficiente de grado n
	 * y la posición n contiene al termino independiente
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
	

	private double potenciaRecursiva(double x, int n) {
		if (n%2==0)
			return potenciaRecursivaPar(x, n);
		
		return potenciaRecursivaImpar(x, n);
	}
	
	
	private double potenciaRecursivaImpar(double x, int n) {
		
		if(n==0)
			return 1;

		return x*potenciaRecursivaImpar(x, n-1);
	}
	
	private double potenciaRecursivaPar(double x, int n) {
		
		if(n==1)
			return x;

		return potenciaRecursivaPar(x*x, n/2);
	}
	
	
	
	
}
