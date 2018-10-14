package edu.unlam.polinomio;

import java.util.Arrays;

public class Polinomio {
	// usar nros cercanos al 1.. ej: 0.94, 1,04 para que no pinche el tipo de dato
	private int grado;
	private double[] coeficientes;

	/*
	 * La posición 0 del arreglo de coeficientes contiene el coeficiente de grado n
	 * y la posición n contiene al termino independiente
	 */

	public Polinomio(int grado, double[] coeficientes) {
		this.grado = grado;
		this.coeficientes = coeficientes;
	}

	public double evaluarMSucesivas(double x) { //complejidad N^2

		int i = 0;
		double resultado = 0;

		for (; i < this.grado; i++)
			resultado += coeficientes[i] * potencia(x, grado - i);

		resultado += coeficientes[i];
		return resultado;
	}

	public double evaluarRecursiva(double x) { //Complejidad:

		int i = 0;
		double resultado = 0;

		for (; i < this.grado; i++)
			resultado += coeficientes[i] * potenciaRecursiva(x, grado - i);

		return resultado += coeficientes[i];
	}

	public double evaluarProgDinamica(double x) { //Complejidad:
		double[] potenciasX;
		double res = this.coeficientes[this.coeficientes.length - 1]; // termino independiente

		if (this.grado > 1) {
			potenciasX = new double[this.grado - 1];

			for (int i = 0; i < potenciasX.length; i++) {
				potenciasX[i] = potenciaRecursiva(x, this.grado - i);
			}

			for (int i = 0; i < potenciasX.length; i++) {
				res += potenciasX[i] * this.coeficientes[i];
			}
		}

		if (this.grado > 0)
			res += x * this.coeficientes[this.grado - 1];

		return res;

	}
	
	public double evaluarMejorada(double x) { //Complejidad:
		double[] potenciasX;
		double res = this.coeficientes[this.coeficientes.length - 1]; // termino independiente

		if (this.grado > 1) {
			potenciasX = new double[this.grado - 1];

			for (int i = 0; i < potenciasX.length; i++) {
				potenciasX[i] = potenciaRecursiva(x, this.grado - i);
				res += potenciasX[i] * this.coeficientes[i];
			}
		
		}

		if (this.grado > 0)
			res += x * this.coeficientes[this.grado - 1];	//termino lineal

		return res;

	}
	
	public double evaluarPow(double x) { //complejidad
		//multiplicaciones sucesivas pero con el pow
		int i = 0;
		double resultado = 0;

		for (; i < this.grado; i++)
			resultado += coeficientes[i] * Math.pow(x, grado - i);

		resultado += coeficientes[i];
		return resultado;
	}

	/*
	 * Dado p(x) = a0 + a1*x + a2*x^2 + a3*x^3 + ... + an*x^n
	 *
	 * Realizo los siguientes procedimientos bn = an bsub(n - 1) = asub(n - 1) + bn
	 * * x0; . . . b0 = a0 + b1 * x0; Con b0 siendo el valor de p(x0);
	 * 
	 * Basicamente subdivido el polinomio en binomios p(x) = a0 + x*(a1 + x*(a2 +
	 * ... x*(asub(n - 1) + an*x) ...))
	 */
	public double evaluarHorner(double x) { //complejidad N (lineal)
		double res = coeficientes[0];

		for (int i = 1; i <= grado; i++)
			res = coeficientes[i] + (x * res);

		return res;
	}

	// POTENCIAS

	// Calculo de potencia mediante multiplicaciones sucesivas
	private double potencia(double x, int n) {
		// si la potencia es 0
		double resultadoADevolver = 1;

		for (int i = 0; i < n; i++)
			resultadoADevolver *= x;

		return resultadoADevolver;
	}

	private double potenciaRecursiva(double x, int n) {
		if (n % 2 == 0)
			return potenciaRecursivaPar(x, n);

		return potenciaRecursivaImpar(x, n);
	}

	private double potenciaRecursivaImpar(double x, int n) {

		if (n == 0)
			return 1;

		return x * potenciaRecursivaImpar(x, n - 1);
	}

	private double potenciaRecursivaPar(double x, int n) {

		if (n == 1)
			return x;

		return potenciaRecursivaPar(x * x, n / 2);
	}
	
	//para poder compara si son iguales los polinomios

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(coeficientes);
		result = prime * result + grado;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Polinomio other = (Polinomio) obj;
		if (!Arrays.equals(coeficientes, other.coeficientes))
			return false;
		if (grado != other.grado)
			return false;
		return true;
	}
	
	
}
