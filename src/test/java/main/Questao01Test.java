package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Questao01Test {

	@Test
	void testMediana() {
		List<Integer> list =  Arrays.asList(9, 2, 1, 4, 6);
		Questao01 questao01 = new Questao01();
		Integer n = questao01.mediana(list);
		System.out.println(n);
		assertEquals(4, n);
	}

}
