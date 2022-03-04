package main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println("PRIMEIRA QUESTAO"); // Segunda  questão
		List<Integer> list =  Arrays.asList(9, 2, 1, 4, 6); // Lista com os valores 
		Questao01 questao01 = new Questao01();
		questao01.mediana(list); // Metodo mediana da classe questão01
		System.out.println("--------------------------------------");
		
		System.out.println("SEGUNDA QUESTAO"); //segunda questão
		int[] numeros = {1, 5, 3, 4, 2}; //array com os valoeres 
		
		Questao02 questao02 = new Questao02(); 
		questao02.encontraPares(numeros, 2); // Metodo encontraPares da classe questão02

		System.out.println("--------------------------------------");
		System.out.println("TERCEIRA QUESTAO"); //Terceira questão
		Questao03 questao03 = new Questao03();
		questao03.encriptar("Tenha um bom dia"); // frase para ser encriptada 
	}

}
