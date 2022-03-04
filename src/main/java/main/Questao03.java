package main;

public class Questao03 {

	public String encriptar(String s) {
		String n = "";
		System.out.println("Sua frase encriptada é: ");

		String result = s.replaceAll("\\s+", "");

		int tamanho = (int) Math.round(Math.sqrt(result.length()));

		String m[][] = new String[tamanho][tamanho];

		int k = 0;

		String[] ab = result.split("");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {

				if (k < ab.length) {
					m[i][j] = ab[k];
					k = k + 1;

				}

			}

		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[j][i] != null) {

					n += m[j][i];
				}

			}
			n += " ";

		}
		System.out.println(n.trim());
		return n.trim();
	}

}
