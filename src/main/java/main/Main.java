package main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list =  Arrays.asList(9, 2, 1, 4, 6);
		System.out.println("PRIMEIRA QUESTAO");
		Questao01 questao01 = new Questao01();
		questao01.mediana(list);
		System.out.println("--------------------------------------");
		
		System.out.println("SEGUNDA QUESTAO");
		int[] numeros = {1, 5, 3, 4, 2};
		
		Questao02 questao02 = new Questao02();
		questao02.encontraPares(numeros, 2);

		System.out.println("--------------------------------------");
		System.out.println("TERCEIRA QUESTAO");
		Questao03 questao03 = new Questao03();
		questao03.encriptar("Tenha um bom dia");
	}

}
