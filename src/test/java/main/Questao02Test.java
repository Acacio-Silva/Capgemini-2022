package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Questao02Test {

	@Test
	void testEncontraPares() {
		int[] numeros = {1, 5, 3, 4, 2};
		Questao02 questao02 = new Questao02();
		Integer n = questao02.encontraPares(numeros, 2);
		assertEquals(3, n);
	}

}
