package edu.unlam.polinomio;

import org.junit.Assert;
import org.junit.Test;

public class TestPolinomio {

	/*@Test
	public void pruebaSucesivas() {

		// hacer un txt con los coeficientes primero de a 100 y a 1000 y a 10000 y
		// sucesivamente

		double[] coeficientes = { 2, 3, 1, 4, 5 };
		Polinomio polinomio = new Polinomio(4, coeficientes);

		Assert.assertEquals(269, polinomio.evaluarMSucesivas(3), 0.0);
	}

	@Test
	public void pruebaRecursiva() {

		// hacer un txt con los coeficientes primero de a 100 y a 1000 y a 10000 y
		// sucesivamente

		double[] coeficientes = { 2, 3, 1, 4, 5 };
		Polinomio polinomio = new Polinomio(4, coeficientes);

		Assert.assertEquals(269, polinomio.evaluarRecursiva(3), 0.0);
	}

	@Test
	public void pruebaProgDinamica() {

		double[] coeficientes = { 2, 3, 1, 4, 5 };
		Polinomio polinomio = new Polinomio(4, coeficientes);

		Assert.assertEquals(269, polinomio.evaluarProgDinamica(3), 0.0);
	}

	@Test
	public void pruebaProgDinamicaGrado0() {

		double[] coeficientes = { 2 };
		Polinomio polinomio = new Polinomio(0, coeficientes);

		Assert.assertEquals(2, polinomio.evaluarProgDinamica(9), 0.0);
	}
	
	@Test
	public void pruebaProgDinamicaGrado1() {

		double[] coeficientes = { 2,3 };
		Polinomio polinomio = new Polinomio(1, coeficientes);

		Assert.assertEquals(7, polinomio.evaluarProgDinamica(2), 0.0);
	}*/
	
	
	@Test
	public void pruebaMejorada() {

		double[] coeficientes = { 2, 3, 1, 4, 5 };
		Polinomio polinomio = new Polinomio(4, coeficientes);

		Assert.assertEquals(269, polinomio.evaluarPow(3), 0.0);
	}


	/*@Test
	public void pruebaEvaluarHorner() {

		double[] coeficientes = { 2, 3, 1, 4, 5 };
		Polinomio polinomio = new Polinomio(4, coeficientes);
		Assert.assertEquals(269, polinomio.evaluarHorner(3), 0.0);
	}
	
	@Test
	public void pruebaFatiga100() {

		double[] coeficientes = new double[100];
		
		for(int i = 0; i<100;i++)
			coeficientes[i] = i;
		
		Polinomio polinomio = new Polinomio(99, coeficientes);
		Assert.assertEquals(4950, polinomio.evaluarHorner(1), 0.0);
	}
	
	@Test
	public void pruebaFatiga1000() {

		double[] coeficientes = new double[1000];
		
		for(int i = 0; i<1000;i++)
			coeficientes[i] = i;
		
		Polinomio polinomio = new Polinomio(999, coeficientes);
		Assert.assertEquals(499500, polinomio.evaluarHorner(1), 0.0);
	}*/
	
	/*@Test
	public void pruebaFatiga100000() {

		double[] coeficientes = new double[100000];
		
		for(int i = 0; i<100000;i++)
			coeficientes[i] = i;
		
		Polinomio polinomio = new Polinomio(99999, coeficientes);
		Assert.assertEquals(111109.87, polinomio.evaluarProgDinamica(0.1),0.01);
	}*/

}
