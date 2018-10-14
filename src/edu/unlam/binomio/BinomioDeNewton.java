package edu.unlam.binomio;

import edu.unlam.polinomio.Polinomio;

public class BinomioDeNewton {
	
	private double a;
	private double b;
	private int n;
	private Polinomio polinomio;
	
	public BinomioDeNewton(double a, double b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}
	
	
	//formula para hallar termino k del binomio de newton. Nota: (n   k) es el analisis combinatorio
	//(n  k) * a^(n-k)*b^k
	
	public double hallarCoeficienteK(int k) {
		return combinatorio(this.n, k)*Math.pow(this.a, n-k)*Math.pow(this.b, k);
	}
	
	
	public static double factorial(double x) {
		if(x==0)
			return 1;
		
		return(x*factorial(x-1));
	}
	
	public static double combinatorio(double n, double m) {
		return factorial(n)/(factorial(m)*factorial(n-m));
	}
	
	public void desarrollar() {
		double[] coeficientes = new double[(this.n+1)];
		
		for(int i =0; i<=this.n;i++) {
			coeficientes[i]=this.hallarCoeficienteK(i);
		}
		
		this.polinomio = new Polinomio(this.n, coeficientes);
	}


	public Polinomio getPolinomio() {
		return polinomio;
	}

	public double evaluar(double x) {
		return this.polinomio.evaluarHorner(x);
	}

	
	
}
