package controle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControleInformacoesOuvinteTest {

	/**
	 * Testa os métodos implementados na Classe ControleInformacoesOuvinte
	 */
	@Test
	void testCheckEmailOuvinte() {
		String emailErrado = "sjajd@@@gmail.com.";
		String emailCerto = "cleiton@gmail.com";
		assertTrue(ControleInformacoesOuvinte.checkEmailOuvinte(emailCerto));
		assertFalse(ControleInformacoesOuvinte.checkEmailOuvinte(emailErrado));
	}

	@Test
	void testCheckName() {
		String nomeErrado = "123Cleiton";
		String nomeCerto = "Cleiton";
		assertTrue(ControleInformacoesOuvinte.checkName(nomeCerto));
		assertFalse(ControleInformacoesOuvinte.checkName(nomeErrado));
	}

}
