package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Questao03Test {

	@Test
	void testEncriptar() {
		Questao03 questao03 = new Questao03();
		String valor = questao03.encriptar("tenha um bom dia");
		assertEquals("taoa eum nmd hbi", valor);
	}

}
