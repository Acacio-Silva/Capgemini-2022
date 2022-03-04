package main;

import java.util.Collections;
import java.util.List;

public class Questao01 {

	public Integer mediana(List<Integer> numeros) {

		Integer resultado = 0;
		if (numeros.size() % 2 != 0) {
			Collections.sort(numeros);

			int posicaoNumero = ((numeros.size() + 1) / 2) - 1;
			resultado = numeros.get(posicaoNumero);
			System.out.println("A Mediana é " + resultado);

		} else {
			System.out.println("A lista de números deve ser imapar");
		}

		return resultado;
	}

}
