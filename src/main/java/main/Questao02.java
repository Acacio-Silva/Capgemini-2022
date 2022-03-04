package main;

import java.util.Arrays;

public class Questao02 {

	public Integer encontraPares(int[] n, int valor) {

		Integer acumulador = 0;
		for (int i = n.length - 1; i >= 0; i--) {
			Arrays.sort(n);

			for (int j = 0; j < n.length; j++) {
				if (n[i] - n[j] == valor) {
					System.out.println("----------------------");
					System.out.println(" " + n[i] + " - " + n[j] + " = " + (n[i] - n[j]));
					System.out.println("----------------------");
					acumulador = acumulador + 1;
				}
			}

		}

		System.out.println("Existem " + acumulador + " combinações");

		return acumulador;
	}

}
