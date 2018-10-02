package edu.unlam.polinomio;

import org.junit.Assert;
import org.junit.Test;



public class TestPolinomio {
	
	@Test
	public void pruebaSucesivas() {
		
	//hacer un txt con los coeficientes primero de a 100 y a 1000 y a 10000 y sucesivamente
		
		double[] coeficientes = {2,3,1,4,5};
		Polinomio polinomio = new Polinomio(4, coeficientes);
		
		Assert.assertEquals(269, polinomio.evaluarMSucesivas(3),0.0);
		
	}

}
