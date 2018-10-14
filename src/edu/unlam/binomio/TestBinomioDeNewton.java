package edu.unlam.binomio;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.polinomio.Polinomio;

public class TestBinomioDeNewton {

	
	@Test
	public void testHallarK() {
		BinomioDeNewton binomio = new BinomioDeNewton(1, 2, 4);
		
		Assert.assertEquals(1, binomio.hallarCoeficienteK(0),0.0);
	}
	
	
	@Test
	public void testFactorial() {
		
		Assert.assertEquals(24, BinomioDeNewton.factorial(4),0.0);
	}
	
	@Test
	public void testCombinatorio() {
		
		Assert.assertEquals(252, BinomioDeNewton.combinatorio(10,5),0.0);
	}
	
	@Test
	public void testDesarrollar() {
		BinomioDeNewton binomio = new BinomioDeNewton(1, 2, 4);
		double[] coeficientesEsperados = {1,8,24,32,16};
		
		Polinomio polinomioEsperado = new Polinomio(4, coeficientesEsperados);
		binomio.desarrollar();
		Assert.assertEquals(polinomioEsperado, binomio.getPolinomio());
	}
	
	@Test
	public void testEvaluar() {
		BinomioDeNewton binomio = new BinomioDeNewton(1, 2, 4);
		binomio.desarrollar();
		
		Assert.assertEquals(625, binomio.evaluar(3),0.0);
	}
	
	
	
}
